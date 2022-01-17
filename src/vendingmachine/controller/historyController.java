package vendingmachine.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class historyController {

	Koneksi koneksi = new Koneksi();
	Connection con = koneksi.getKoneksi();

	Statement stmt;
	ResultSet rs;

	public void loadHistory(JTable table) {

		int i = 0;
		DefaultTableModel tableModel;
		String query = "SELECT b.nama, DATE_FORMAT(t.tanggal, '%a, %d %M %Y - %k:%i') AS tanggal_formatted FROM transaksi t INNER JOIN barang b ON t.kode_barang = b.kode ORDER BY tanggal DESC";

		String[] columsName = {"No", "Barang", "Tanggal"};
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
				Object[] data = {i + ".", WordUtils.capitalize(rs.getString("nama").replace("-", " ")), rs.getString("tanggal_formatted")};
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
