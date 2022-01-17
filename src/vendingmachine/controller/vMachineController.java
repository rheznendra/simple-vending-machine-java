package vendingmachine.controller;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import vendingmachine.CurrencyID;
import vendingmachine.Koneksi;
import vendingmachine.models.minumanModel;
import vendingmachine.models.vMachineModel;
import vendingmachine.vMachineUI;

/**
 *
 * @author RZ
 */
public class vMachineController {

	Koneksi koneksi = new Koneksi();
	Connection con = koneksi.getKoneksi();
	Statement stmt;
	ResultSet rs;

	vMachineModel model = new vMachineModel();

	public void setSaldo(JLabel label, int saldo) {
		model.setSaldo(saldo);
		label.setText(String.valueOf(new CurrencyID(model.getSaldo())));
	}

	public void typingKode(JLabel label, String text) {
		if (model.getSaldo() >= 1) {
			String kode = model.getKode();
			if (kode.length() < 2) {
				kode = kode + text;
				model.setKode(kode);
				label.setText(kode);
			}
		}
	}

	public void deleteKode(JLabel label) {
		String kode = model.getKode();
		if (kode.length() >= 1) {
			kode = kode.substring(0, kode.length() - 1);
			model.setKode(kode);
			label.setText(kode);
		}
	}

	public void selectItem(JLabel labelSaldo, JLabel labelKode, JLabel labelOutput, JLabel getItemLabel) {

		if (model.getKode().length() >= 1) {

			String loopKode, loopNama, kode = model.getKode();
			int loopHarga, loopStock;
			int i = 0;

			for (minumanModel minuman : model.getKodeMinuman()) {
				loopKode = minuman.getKode();
				loopHarga = minuman.getHarga();
				loopNama = minuman.getNama();
				loopStock = minuman.getStock();
				if (loopKode.equalsIgnoreCase(kode)) {
					if (loopStock >= 1) {
						if (model.getSaldo() >= loopHarga) {
							model.setSaldo(-loopHarga);
							model.setKode("");
							labelSaldo.setText(String.valueOf(new CurrencyID(model.getSaldo())));
							labelKode.setText("");
							getItemLabel.setVisible(true);
							rotate(labelOutput, loopNama);
							insertTransaksi(loopKode);
						} else {
							JOptionPane.showMessageDialog(null, "Saldo Tidak Mencukupi.");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Stock Habis.");
					}
					break;
				}

				if (i == model.getKodeMinuman().size() - 1) {
					JOptionPane.showMessageDialog(null, "Kode Minuman Tidak Tersedia.");
				}
				i++;
			}
		}
	}

	public void resetOutput(JLabel getItemLabel, JLabel labelOutput) {
		getItemLabel.setVisible(false);
		labelOutput.setIcon(null);
	}

	public void loadBarang() {
		ArrayList<minumanModel> listMinuman = new ArrayList();
		int hargaDB, stockDB;
		String kodeDB, namaDB;
		String query = "SELECT * FROM barang";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				kodeDB = rs.getString("kode");
				namaDB = rs.getString("nama");
				hargaDB = rs.getInt("harga");
				stockDB = rs.getInt("stock");
				listMinuman.add(new minumanModel(kodeDB, namaDB, hargaDB, stockDB));
				model.setKodeMinuman(listMinuman);
			}
		} catch (SQLException ex) {
			Logger.getLogger(vMachineModel.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void setStockBarang(JLabel... labelItem) {
		loadBarang();
		for (JLabel label : labelItem) {
			for(minumanModel minuman : model.getKodeMinuman()) {
				if (label.getName().equalsIgnoreCase(minuman.getNama())) {
					label.setText(String.valueOf(minuman.getStock()));
					break;
				}
			}
		}
	}

	public void insertTransaksi(String kode) {
		try {
			String query = "INSERT INTO TRANSAKSI (kode_barang) VALUES ('%s')";
			query = String.format(query, kode);

			stmt = con.createStatement();
			stmt.execute(query);
		} catch (SQLException ex) {
			Logger.getLogger(vMachineController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void rotate(JLabel label, String nama) {
		try {
			BufferedImage original = ImageIO.read(getClass().getResource("/vendingmachine/images/" + nama + ".png"));
			BufferedImage rotate = rotateImg(original, -90.0d);
			label.setIcon(new ImageIcon(rotate));
		} catch (IOException ex) {
			Logger.getLogger(vMachineUI.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	//https://stackoverflow.com/questions/50883802/how-to-rotate-an-imageicon-in-java
	private BufferedImage rotateImg(BufferedImage image, Double degrees) {
		// Calculate the new size of the image based on the angle of rotaion
		double radians = Math.toRadians(degrees);
		double sin = Math.abs(Math.sin(radians));
		double cos = Math.abs(Math.cos(radians));
		int newWidth = (int) Math.round(image.getWidth() * cos + image.getHeight() * sin);
		int newHeight = (int) Math.round(image.getWidth() * sin + image.getHeight() * cos);

		// Create a new image
		BufferedImage rotate = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = rotate.createGraphics();
		// Calculate the "anchor" point around which the image will be rotated
		int x = (newWidth - image.getWidth()) / 2;
		int y = (newHeight - image.getHeight()) / 2;
		// Transform the origin point around the anchor point
		AffineTransform at = new AffineTransform();
		at.setToRotation(radians, x + (image.getWidth() / 2), y + (image.getHeight() / 2));
		at.translate(x, y);
		g2d.setTransform(at);
		// Paint the originl image
		g2d.drawImage(image, 0, 0, null);
		g2d.dispose();
		return rotate;
	}
}
