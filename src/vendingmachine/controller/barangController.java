package vendingmachine.controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vendingmachine.Koneksi;
import vendingmachine.models.listBarangModel;
import vendingmachine.models.minumanModel;

/**
 *
 * @author RZ
 */
public class barangController {

	private listBarangModel model;

	private Koneksi koneksi = new Koneksi();
	private Connection con = koneksi.getKoneksi();

	private Statement stmt;
	private ResultSet rs;

	public barangController() {
		loadBarang("all");
	}

	public listBarangModel getModel() {
		return model;
	}

	public void loadBarang(String filter) {

		String query = "SELECT * FROM barang";
		if(filter.equalsIgnoreCase("available")) {
			query = query + " WHERE stock >= 1";
		} else if (filter.equalsIgnoreCase("not available")) {
			query = query + " WHERE stock = 0";
		}
		ArrayList<minumanModel> listMinuman = new ArrayList();

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String kode = rs.getString("kode");
				String nama = rs.getString("nama");
				String slug = rs.getString("slug");
				int harga = rs.getInt("harga");
				int stock = rs.getInt("stock");
				listMinuman.add(new minumanModel(kode, nama, slug, harga, stock));
			}
			model = new listBarangModel(listMinuman);
		} catch (SQLException ex) {
			Logger.getLogger(historyController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
