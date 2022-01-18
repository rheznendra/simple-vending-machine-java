package vendingmachine.frameAdmin;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import org.apache.commons.text.WordUtils;
import vendingmachine.controller.barangDetailController;

/**
 *
 * @author RZ
 */
public class barangDetailFrame extends javax.swing.JInternalFrame {

	barangDetailController controller;
	JDesktopPane mainPanel;
	JLabel breadCrumb;
	String nama;

	public barangDetailFrame(JDesktopPane mainPanel, JLabel breadCrumb, String nama) {
		this.mainPanel = mainPanel;
		this.breadCrumb = breadCrumb;
		this.breadCrumb.setText("Barang > Detail");
		this.breadCrumb.setIcon(new ImageIcon(getClass().getResource("/vendingmachine/icon/vending_machine_black.png")));
		this.nama = WordUtils.uncapitalize(nama).replace(" ", "-");
		controller = new barangDetailController(this.nama);

		initComponents();
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btBack = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        lbNamaBarang = new javax.swing.JLabel();
        tfNamaBarang = new javax.swing.JTextField();
        lbStockNow = new javax.swing.JLabel();
        tfStockNow = new javax.swing.JTextField();
        lbStockNew = new javax.swing.JLabel();
        spStockNew = new javax.swing.JSpinner();
        lbPrice = new javax.swing.JLabel();
        tfPrice = new javax.swing.JTextField();
        btSubmit = new javax.swing.JButton();

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

        btBack.setBackground(new java.awt.Color(37, 42, 52));
        btBack.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btBack.setForeground(new java.awt.Color(234, 234, 234));
        btBack.setText("Kembali");
        btBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBack.setFocusable(false);
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        getContentPane().add(btBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 30));
        getContentPane().add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 670, 10));

        lbNamaBarang.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lbNamaBarang.setForeground(new java.awt.Color(37, 42, 52));
        lbNamaBarang.setText("Nama Barang");
        getContentPane().add(lbNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        tfNamaBarang.setDisabledTextColor(new java.awt.Color(37, 42, 52));
        tfNamaBarang.setEnabled(false);
        getContentPane().add(tfNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 350, 30));

        lbStockNow.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lbStockNow.setForeground(new java.awt.Color(37, 42, 52));
        lbStockNow.setText("Stock Sekarang");
        getContentPane().add(lbStockNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        tfStockNow.setDisabledTextColor(new java.awt.Color(37, 42, 52));
        tfStockNow.setEnabled(false);
        getContentPane().add(tfStockNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 350, 30));

        lbStockNew.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lbStockNew.setForeground(new java.awt.Color(37, 42, 52));
        lbStockNew.setText("Stock Tambahan");
        getContentPane().add(lbStockNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        getContentPane().add(spStockNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 350, 30));

        lbPrice.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lbPrice.setForeground(new java.awt.Color(37, 42, 52));
        lbPrice.setText("Harga");
        getContentPane().add(lbPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        tfPrice.setDisabledTextColor(new java.awt.Color(37, 42, 52));
        tfPrice.setEnabled(false);
        getContentPane().add(tfPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 350, 30));

        btSubmit.setBackground(new java.awt.Color(37, 42, 52));
        btSubmit.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btSubmit.setForeground(new java.awt.Color(234, 234, 234));
        btSubmit.setText("Kirim");
        btSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSubmit.setFocusPainted(false);
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		controller.loadData(tfNamaBarang, tfStockNow, tfPrice);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
		try {
			barangFrame barang = new barangFrame(mainPanel, breadCrumb);
			this.dispose();
			mainPanel.add(barang);
			barang.setVisible(true);
			barang.setMaximum(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(barangFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btBackActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
		controller.updateStock(spStockNew, tfStockNow);
		controller.loadData(tfNamaBarang, tfStockNow, tfPrice);
    }//GEN-LAST:event_btSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btSubmit;
    private javax.swing.JLabel lbNamaBarang;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbStockNew;
    private javax.swing.JLabel lbStockNow;
    private javax.swing.JSeparator separator;
    private javax.swing.JSpinner spStockNew;
    private javax.swing.JTextField tfNamaBarang;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfStockNow;
    // End of variables declaration//GEN-END:variables
}
