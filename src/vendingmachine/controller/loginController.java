package vendingmachine.controller;

import at.favre.lib.crypto.bcrypt.BCrypt;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vendingmachine.Koneksi;
import vendingmachine.models.adminModel;

/**
 *
 * @author RZ
 */
public class loginController {

	private Koneksi koneksi = new Koneksi();
	private Connection con = koneksi.getKoneksi();

	private Statement stmt;
	private ResultSet rs;

	boolean anyError;

	adminModel model;

	public loginController(adminModel model) {
		this.model = model;
	}

	public boolean checkLogin(String username, String password) {
		anyError = false;

		if (username.isBlank()) {
			anyError = true;
			showAlert("Username tidak boleh kosong.", "error");
		}

		if (!anyError && password.isBlank()) {
			anyError = true;
			showAlert("Password tidak boleh kosong.", "error");
		}

		if (!anyError) {
			doLogin(username, password, model);
		}

		return !anyError;
	}

	private void doLogin(String username, String password, adminModel model) {
		String query = "SELECT * FROM users WHERE username = '%s'";
		query = String.format(query, username);

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			if (rs.next()) {

				BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), rs.getString("password"));
				if (result.verified) {
					model.setUsername(username);
				} else {
					anyError = true;
					showAlert("Password yang dimasukkan salah.", "error");
				}

			} else {
				anyError = true;
				showAlert("Username tidak terdaftar.", "error");
			}
		} catch (SQLException ex) {
			Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void showAlert(String message, String type) {
		int tp;
		if (type.equalsIgnoreCase("error")) {
			tp = JOptionPane.ERROR_MESSAGE;
		} else {
			tp = JOptionPane.INFORMATION_MESSAGE;
		}
		JOptionPane.showMessageDialog(null, message, null, tp);
	}
}
