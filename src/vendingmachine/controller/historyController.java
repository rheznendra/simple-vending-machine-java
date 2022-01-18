package vendingmachine.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vendingmachine.Koneksi;
import vendingmachine.models.historyModel;
import vendingmachine.models.listHistoryModel;

/**
 *
 * @author RZ
 */
public class historyController {

	private listHistoryModel model;

	private Koneksi koneksi = new Koneksi();
	private Connection con = koneksi.getKoneksi();

	private Statement stmt;
	private ResultSet rs;

	public historyController() {
		loadHistory();
	}

	public listHistoryModel getModel() {
		return model;
	}

	public void loadHistory() {

		String query = "SELECT b.nama, DATE_FORMAT(t.tanggal, '%a, %d %M %Y - %k:%i') AS tanggal_formatted FROM transaksi t INNER JOIN barang b ON t.kode_barang = b.kode ORDER BY tanggal DESC";

		ArrayList<historyModel> listHistory = new ArrayList();

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String nama = rs.getString("nama");
				String tanggal = rs.getString("tanggal_formatted");
				listHistory.add(new historyModel(nama, tanggal));
			}
			model = new listHistoryModel(listHistory);
		} catch (SQLException ex) {
			Logger.getLogger(historyController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
