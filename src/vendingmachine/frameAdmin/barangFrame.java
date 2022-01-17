package vendingmachine.frameAdmin;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.JTableHeader;
import vendingmachine.controller.barangController;

/**
 *
 * @author RZ
 */
public class barangFrame extends javax.swing.JInternalFrame {

	barangController controller = new barangController();
	JLabel breadCrumb;

	public barangFrame(JLabel breadCrumb) {
		this.breadCrumb = breadCrumb;
		this.breadCrumb.setText("History");
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
        jLabel1 = new javax.swing.JLabel();

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
                {"1", "Coca-Cola",  new Integer(6)},
                {"2", "Pepsi Strawberry",  new Integer(3)}
            },
            new String [] {
                "No", "Barang", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 42, 52));
        jLabel1.setText("Stock");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 26, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		controller.loadBarang(table, "all");
    }//GEN-LAST:event_formInternalFrameOpened

    private void stockBarangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_stockBarangItemStateChanged
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			int index = stockBarang.getSelectedIndex();
			if (index == 0) {
				controller.loadBarang(table, "all");
			} else if (index == 1) {
				controller.loadBarang(table, "available");
			} else if (index == 2) {
				controller.loadBarang(table, "not available");
			}
		}
    }//GEN-LAST:event_stockBarangItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JComboBox<String> stockBarang;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
