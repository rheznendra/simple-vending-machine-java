package vendingmachine;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RZ
 */
public class Koneksi {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String dbName = "vendingMachine";
	private String url = "jdbc:mysql://localhost/" + dbName;
	private String user = "root";
	private String password = "";

	public Connection getKoneksi() {
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

}
