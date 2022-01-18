package vendingmachine.controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import org.apache.commons.text.WordUtils;
import vendingmachine.CurrencyID;
import vendingmachine.Koneksi;
import vendingmachine.frameAdmin.barangDetailFrame;

/**
 *
 * @author RZ
 */
public class barangDetailController {

	String nama;

	Koneksi koneksi = new Koneksi();
	Connection con = koneksi.getKoneksi();

	Statement stmt;
	ResultSet rs;

	public barangDetailController(String nama) {
		this.nama = nama;
	}

	public void updateStock(JSpinner spStockNew, JTextField tfStockNow) {
		int stockNew = (int) spStockNew.getValue();

		int stockNow = Integer.parseInt(tfStockNow.getText());

		if (stockNew >= 1) {

			if (stockNew + stockNow <= 10) {
				String query = "UPDATE barang SET stock = stock+%s WHERE nama = '%s'";
				query = String.format(query, stockNew, nama);

				try {
					stmt = con.createStatement();
					stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Stock berhasil ditambahkan.");
				} catch (SQLException ex) {
					Logger.getLogger(barangDetailFrame.class.getName()).log(Level.SEVERE, null, ex);
					JOptionPane.showMessageDialog(null, "Stock gagal ditambahkan.", null, JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Batas stock maksimal adalah 10.");
			}
		}
	}


	public void loadData(JTextField tfNamaBarang, JTextField tfStockNow, JTextField tfPrice) {
		String query = "SELECT * FROM barang WHERE nama = '%s'";
		query = String.format(query, nama);

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				String namaDB = WordUtils.capitalize(rs.getString("nama").replace("-", " "));
				tfNamaBarang.setText(namaDB);
				tfStockNow.setText(String.valueOf(rs.getInt("stock")));
				tfPrice.setText(String.valueOf(new CurrencyID(rs.getInt("harga"))));
			}
		} catch (SQLException ex) {
			Logger.getLogger(barangDetailFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
