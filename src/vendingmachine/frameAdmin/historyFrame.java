package vendingmachine.frameAdmin;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import vendingmachine.controller.historyController;
import vendingmachine.models.historyModel;
import vendingmachine.models.listHistoryModel;

/**
 *
 * @author RZ
 */
public class historyFrame extends javax.swing.JInternalFrame {

	historyController controller = new historyController();
	listHistoryModel model = controller.getModel();
	JLabel breadCrumb;

	DefaultTableModel tableModel;

	public historyFrame(JLabel breadCrumb) {
		this.breadCrumb = breadCrumb;
		this.breadCrumb.setText("History");
		this.breadCrumb.setIcon(new ImageIcon(getClass().getResource("/vendingmachine/icon/history_black.png")));
		initComponents();
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setOpaque(false);
		tableHeader.setBackground(new Color(37, 42, 52));
		tableHeader.setForeground(new Color(240, 240, 240));
		tableHeader.setFont(new Font("Montserrat", 1, 14));

		table.setFillsViewportHeight(true);
		table.setBackground(new Color(37, 42, 52));
		table.setShowGrid(true);
		table.setShowVerticalLines(false);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(234, 234, 234));
        setBorder(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPane.setBorder(null);

        table.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Coca-Cola", "Senin, 17 Januari 2022 - 23:12"},
                {"2", "Pepsi Strawberry", "Senin, 17 Januari 2022 - 23:15"}
            },
            new String [] {
                "No", "Barang", "Tanggal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setRowHeight(35);
        table.setShowGrid(false);
        scrollPane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(5);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 630, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		initTable();
		setDataHistory();
    }//GEN-LAST:event_formInternalFrameOpened

	private void setDataHistory() {
		int i = 1;
		tableModel.setRowCount(0);

		for (historyModel data : model.getListHistory()) {
			Object[] row = {i + ".", data.getNama(), data.getTanggal()};
			tableModel.addRow(row);
			i++;
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

	private void initTable() {
		String[] columsName = {"No", "Barang", "Tanggal"};
		tableModel = new DefaultTableModel(columsName, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
