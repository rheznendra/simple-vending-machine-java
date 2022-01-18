package vendingmachine.controller;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.ArrayUtils;
import vendingmachine.CurrencyID;
import vendingmachine.Koneksi;
import vendingmachine.models.minumanModel;
import vendingmachine.models.vMachineModel;

/**
 *
 * @author RZ
 */
public class vMachineController {

	private Koneksi koneksi = new Koneksi();
	private Connection con = koneksi.getKoneksi();
	private Statement stmt;
	private ResultSet rs;

	public vMachineModel model = new vMachineModel();

	private boolean anyError;
	private String slug;

	public vMachineController() {
		loadBarang();
	}

	public vMachineModel getModel() {
		return model;
	}

	public void setSaldo(int saldo) {
		model.setSaldo(saldo);
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String typingKode(String text) {
		if (model.getSaldo() >= 1) {
			String kode = model.getKode();
			if (kode.length() < 2) {
				kode = kode + text;
				model.setKode(kode);
			}
			return model.getKode();
		}
		return null;
	}

	public String deleteKode() {
		String kode = model.getKode();
		if (kode.length() >= 1) {
			kode = kode.substring(0, kode.length() - 1);
			model.setKode(kode);
			return model.getKode();
		}
		return null;
	}

	public boolean checkMinumanExists() {
		String kode = model.getKode();
		for (minumanModel data : model.getKodeMinuman()) {
			if (data.getKode().equalsIgnoreCase(kode)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkStockExists() {
		String kode = model.getKode();
		for (minumanModel data : model.getKodeMinuman()) {
			if (data.getStock() >= 1) {
				return true;
			}
		}
		return false;
	}

	public boolean checkSaldoValid() {
		String kode = model.getKode();
		for (minumanModel data : model.getKodeMinuman()) {
			if (model.getSaldo() >= data.getHarga()) {
				return true;
			}
		}
		return false;
	}

	public boolean selectItem() {
		anyError = false;

		//Check Panjang Kode Input User = 2
		if (model.getKode().length() >= 2) {

			//Check Kode Minuman
			if (!anyError && !checkMinumanExists()) {
				anyError = true;
				JOptionPane.showMessageDialog(null, "Kode Minuman Tidak Tersedia.");
			}

			//Check Ketersediaan Stock
			if (!anyError && !checkStockExists()) {
				anyError = true;
				JOptionPane.showMessageDialog(null, "Stock Habis.");
			}

			//Check Saldo Mencukupi atau Tidak
			if (!anyError && !checkSaldoValid()) {
				anyError = true;
				JOptionPane.showMessageDialog(null, "Saldo Tidak Mencukupi.");
			}

			//Jika Tidak Ada Error
			if (!anyError) {
				int harga = 0;
				for (minumanModel data : model.getKodeMinuman()) {
					if (data.getKode().equalsIgnoreCase(model.getKode())) {
						harga = data.getHarga();
						setSlug(data.getSlug());
						break;
					}
				}
				model.setSaldo(-harga); //kurangi saldo user
				insertTransaksi(); //insert transaksi ke database
				model.setKode("");	//reset input kode di model
			}
		}
		return !anyError;
	}

	public void enterMoney() {
		anyError = false;
		int inputNominal = 0;
		int[] nominal = new int[]{2000, 5000, 10000}; //allowed nominal

		//Dialog masukkan nominal
		String dialog = JOptionPane.showInputDialog(null, "Masukkan Nominal", "Vending Machine", JOptionPane.INFORMATION_MESSAGE);

		//Check Input Kosong
		if (dialog == null || dialog.isBlank()) {
			anyError = true;
		}

		//Check Input Hanya Boleh Angka
		if (!anyError && !dialog.matches("^[0-9]*$")) {
			anyError = true;
			JOptionPane.showMessageDialog(null, "Nominal Tidak Valid.", "Terjadi Kesalahan!", JOptionPane.ERROR_MESSAGE);
		}

		//Check Nominal Uang
		if (!anyError) {
			inputNominal = Integer.parseInt(dialog);
			if (!ArrayUtils.contains(nominal, inputNominal)) {
				anyError = true;
				JOptionPane.showMessageDialog(null, "Hanya Menerima Uang Nominal Rp. 2000, Rp. 5000, Rp. 10.000");
			}
		}

		if (!anyError) {
			setSaldo(inputNominal);
		}
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

	private void insertTransaksi() {
		try {
			String query = "INSERT INTO TRANSAKSI (kode_barang) VALUES ('%s')";
			query = String.format(query, model.getKode());

			stmt = con.createStatement();
			stmt.execute(query);
		} catch (SQLException ex) {
			Logger.getLogger(vMachineController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public String currentSaldo() {
		return String.valueOf(new CurrencyID(model.getSaldo()));
	}

	//https://stackoverflow.com/questions/50883802/how-to-rotate-an-imageicon-in-java
	public BufferedImage rotateImg(BufferedImage image, Double degrees) {
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
