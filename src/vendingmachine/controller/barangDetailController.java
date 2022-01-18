package vendingmachine.controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import vendingmachine.Koneksi;
import vendingmachine.frameAdmin.barangDetailFrame;
import vendingmachine.models.minumanModel;

/**
 *
 * @author RZ
 */
public class barangDetailController {

	private minumanModel model;
	private String kode;

	private Koneksi koneksi = new Koneksi();
	private Connection con = koneksi.getKoneksi();

	private Statement stmt;
	private ResultSet rs;

	public barangDetailController(String kode) {
		this.kode = kode;
		loadData();
	}

	public minumanModel getModel() {
		return model;
	}

	public int updateStock(int stockNew) {
		String query = "UPDATE barang SET stock = stock+%s WHERE kode = '%s'";
		query = String.format(query, stockNew, kode);

		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);

			loadData();
		} catch (SQLException ex) {
			Logger.getLogger(barangDetailFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
		return model.getStock();
	}

	public void loadData() {
		String query = "SELECT * FROM barang WHERE kode = '%s'";
		query = String.format(query, kode);

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				String kode = rs.getString("kode");
				String nama = rs.getString("nama");
				String slug = rs.getString("slug");
				int harga = rs.getInt("harga");
				int stock = rs.getInt("stock");
				model = new minumanModel(kode, nama, slug, harga, stock);
			}
		} catch (SQLException ex) {
			Logger.getLogger(barangDetailFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
