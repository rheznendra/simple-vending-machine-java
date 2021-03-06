package vendingmachine.frameAdmin;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import vendingmachine.CurrencyID;
import vendingmachine.controller.barangController;
import vendingmachine.models.listBarangModel;
import vendingmachine.models.minumanModel;

/**
 *
 * @author RZ
 */
public class barangFrame extends javax.swing.JInternalFrame {

	barangController controller = new barangController();

	JDesktopPane mainPanel;
	JLabel breadCrumb;

	DefaultTableModel tableModel;

	public barangFrame(JDesktopPane mainPanel, JLabel breadCrumb) {
		this.mainPanel = mainPanel;
		this.breadCrumb = breadCrumb;
		this.breadCrumb.setText("Barang");
		this.breadCrumb.setIcon(new ImageIcon(getClass().getResource("/vendingmachine/icon/vending_machine_black.png")));
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
        stockBarang = new javax.swing.JComboBox<>();
        lbFilter = new javax.swing.JLabel();

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
                {"1", "A1", "Coca-Cola",  new Integer(6)},
                {"2", "B2", "Fanta Strawberry",  new Integer(3)}
            },
            new String [] {
                "No", "Kode", "Barang", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(5);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 630, 360));

        stockBarang.setBackground(new java.awt.Color(37, 42, 52));
        stockBarang.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        stockBarang.setForeground(new java.awt.Color(234, 234, 234));
        stockBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----PILIH----", "Tersedia", "Tidak Tersedia" }));
        stockBarang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                stockBarangItemStateChanged(evt);
            }
        });
        getContentPane().add(stockBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 130, 30));

        lbFilter.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lbFilter.setForeground(new java.awt.Color(37, 42, 52));
        lbFilter.setText("Stock");
        getContentPane().add(lbFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 26, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		initTable();
		setDataBarang();
    }//GEN-LAST:event_formInternalFrameOpened

    private void stockBarangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_stockBarangItemStateChanged
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			int index = stockBarang.getSelectedIndex();
			if (index == 0) {
				controller.loadBarang("all");
			} else if (index == 1) {
				controller.loadBarang("available");
			} else if (index == 2) {
				controller.loadBarang("not available");
			}
			setDataBarang();
		}
    }//GEN-LAST:event_stockBarangItemStateChanged

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
		int index = table.rowAtPoint(evt.getPoint());

		if (evt.getClickCount() == 2) {
			String kode = String.valueOf(table.getValueAt(index, 1));
			try {
				barangDetailFrame barangDetail = new barangDetailFrame(mainPanel, breadCrumb, kode);
				this.dispose();
				mainPanel.add(barangDetail);
				barangDetail.setVisible(true);
				barangDetail.setMaximum(true);
			} catch (PropertyVetoException ex) {
				Logger.getLogger(barangFrame.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
    }//GEN-LAST:event_tableMouseClicked

	private void setDataBarang() {
		int i = 1;
		tableModel.setRowCount(0);

		listBarangModel model = controller.getModel();

		for (minumanModel data : model.getListBarang()) {
			Object[] row = {i + ".", data.getKode(), data.getNama(), new CurrencyID(data.getHarga()), data.getStock()};
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
		colModel.getColumn(3).setCellRenderer(centerRenderer);
		colModel.getColumn(4).setCellRenderer(centerRenderer);
	}

	private void initTable() {

		String[] columsName = {"No", "Kode", "Barang", "Harga", "Stock"};
		tableModel = new DefaultTableModel(columsName, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbFilter;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JComboBox<String> stockBarang;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
