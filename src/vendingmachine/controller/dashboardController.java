package vendingmachine.controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import vendingmachine.Koneksi;

/**
 *
 * @author RZ
 */
public class dashboardController {

	Koneksi koneksi = new Koneksi();
	Connection con = koneksi.getKoneksi();

	Statement stmt;
	ResultSet rs;

	public String loadTodaySelling() {
		try {
			String query = "SELECT COUNT(*) AS TOTAL FROM transaksi WHERE DATE(tanggal) = CURDATE()";

			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			if (rs.next()) {
				return rs.getString("TOTAL");
			}
		} catch (SQLException ex) {
			Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return "0";
	}

	public String loadTotalSelling() {
		try {
			String query = "SELECT COUNT(*) AS TOTAL FROM transaksi";

			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			if (rs.next()) {
				return rs.getString("TOTAL");
			}
		} catch (SQLException ex) {
			Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return "0";
	}

	public String loadItemEmptyStock() {
		try {
			String query = "SELECT COUNT(*) AS TOTAL FROM barang WHERE stock = 0";

			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			if (rs.next()) {
				return rs.getString("TOTAL");
			}
		} catch (SQLException ex) {
			Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return "0";
	}
}
