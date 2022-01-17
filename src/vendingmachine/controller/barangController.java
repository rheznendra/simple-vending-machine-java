package vendingmachine.controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.apache.commons.text.WordUtils;
import vendingmachine.Koneksi;

/**
 *
 * @author RZ
 */
public class barangController {

	Koneksi koneksi = new Koneksi();
	Connection con = koneksi.getKoneksi();

	Statement stmt;
	ResultSet rs;

	public void loadBarang(JTable table, String stock) {

		int i = 0;
		DefaultTableModel tableModel;
		String query = "SELECT * FROM barang";
		if(stock.equalsIgnoreCase("available")) {
			query = query + " WHERE stock >= 1";
		} else if (stock.equalsIgnoreCase("not available")) {
			query = query + " WHERE stock = 0";
		}

		String[] columsName = {"No", "Barang", "Stock"};
		tableModel = new DefaultTableModel(columsName, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}

		};

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				i++;
				Object[] data = {i + ".", WordUtils.capitalize(rs.getString("nama").replace("-", " ")), rs.getInt("stock")};
				tableModel.addRow(data);
			}
		} catch (SQLException ex) {
			Logger.getLogger(historyController.class.getName()).log(Level.SEVERE, null, ex);
		}

		table.setModel(tableModel);

		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);

		TableColumnModel colModel = table.getColumnModel();
		colModel.getColumn(0).setPreferredWidth(50);
		colModel.getColumn(0).setMaxWidth(50);
		colModel.getColumn(0).setCellRenderer(centerRenderer);
		colModel.getColumn(1).setCellRenderer(centerRenderer);
		colModel.getColumn(2).setCellRenderer(centerRenderer);
	}
}
