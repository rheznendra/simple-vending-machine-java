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

	public vMachineController() {
		loadBarang();
	}

	public void setSaldo(JLabel label, int saldo) {
		model.setSaldo(saldo);
		label.setText(currentSaldo());
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

		//Cek jika input kode adalah 2 huruf
		if (model.getKode().length() == 2) {

			String loopKode, loopNama, kode = model.getKode();
			int loopHarga, loopStock;
			int i = 0;

			for (minumanModel data : model.getKodeMinuman()) {
				loopKode = data.getKode();
				loopHarga = data.getHarga();
				loopNama = data.getNama();
				loopStock = data.getStock();

				//Jika looping sesuai dengan input kode user
				if (loopKode.equalsIgnoreCase(kode)) {

					//Jika stock lebih dari sama dengan 1
					if (loopStock >= 1) {

						//Jika saldo user mencukupi
						if (model.getSaldo() >= loopHarga) {

							model.setSaldo(-loopHarga); //kurangi saldo user
							labelSaldo.setText(currentSaldo());

							model.setKode("");	//reset input kode di model
							labelKode.setText("");	//reset label input kode

							insertTransaksi(loopKode); //insert transaksi ke database

							getItemLabel.setVisible(true); //tampilkan label "Ambil Disini"
							showImageOutput(labelOutput, data.getSlug());	//tampilkan gambar di output
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

	private void loadBarang() {
		ArrayList<minumanModel> listMinuman = new ArrayList();
		int hargaDB, stockDB;
		String kodeDB, namaDB, slugDB;

		String query = "SELECT * FROM barang";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				kodeDB = rs.getString("kode");
				namaDB = rs.getString("nama");
				slugDB = rs.getString("slug");
				hargaDB = rs.getInt("harga");
				stockDB = rs.getInt("stock");
				listMinuman.add(new minumanModel(kodeDB, namaDB, slugDB, hargaDB, stockDB));
				model.setKodeMinuman(listMinuman);
			}
		} catch (SQLException ex) {
			Logger.getLogger(vMachineModel.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void setStockBarang(boolean refreshBarang, JLabel... labelItem) {
		if (refreshBarang) {
			loadBarang();
		}
		for (JLabel label : labelItem) {
			for (minumanModel minuman : model.getKodeMinuman()) {
				if (label.getName().equalsIgnoreCase(minuman.getSlug())) {
					label.setText(String.valueOf(minuman.getStock()));
					break;
				}
			}
		}
	}

	private void insertTransaksi(String kode) {
		try {
			String query = "INSERT INTO TRANSAKSI (kode_barang) VALUES ('%s')";
			query = String.format(query, kode);

			stmt = con.createStatement();
			stmt.execute(query);
		} catch (SQLException ex) {
			Logger.getLogger(vMachineController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private String currentSaldo() {
		return String.valueOf(new CurrencyID(model.getSaldo()));
	}

	private void showImageOutput(JLabel label, String slug) {
		try {
			BufferedImage original = ImageIO.read(getClass().getResource("/vendingmachine/images/" + slug + ".png"));
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
