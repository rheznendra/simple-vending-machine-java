package vendingmachine.frameAdmin;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import vendingmachine.controller.dashboardController;

/**
 *
 * @author RZ
 */
public class dashboardFrame extends javax.swing.JInternalFrame {

	JLabel breadCrumb;
	dashboardController controller = new dashboardController();

	public dashboardFrame(JLabel breadCrumb) {
		this.breadCrumb = breadCrumb;
		this.breadCrumb.setText("Dashboard");
        this.breadCrumb.setIcon(new ImageIcon(getClass().getResource("/vendingmachine/icon/home_black.png")));
		initComponents();
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        todaySellingPanel = new javax.swing.JPanel();
        todaySellingLabel = new javax.swing.JLabel();
        todaySellingCount = new javax.swing.JLabel();
        totalSellingPanel = new javax.swing.JPanel();
        totalSellingLabel = new javax.swing.JLabel();
        totalSellingCount = new javax.swing.JLabel();
        itemEmptyStockPanel = new javax.swing.JPanel();
        itemEmptyStockLabel = new javax.swing.JLabel();
        itemEmptyStockCount = new javax.swing.JLabel();

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

        todaySellingPanel.setBackground(new java.awt.Color(37, 42, 52));
        todaySellingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        todaySellingLabel.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        todaySellingLabel.setForeground(new java.awt.Color(234, 234, 234));
        todaySellingLabel.setText("Jumlah Terjual Hari Ini");
        todaySellingPanel.add(todaySellingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        todaySellingCount.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        todaySellingCount.setForeground(new java.awt.Color(234, 234, 234));
        todaySellingCount.setText("0");
        todaySellingPanel.add(todaySellingCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        getContentPane().add(todaySellingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, 120));

        totalSellingPanel.setBackground(new java.awt.Color(37, 42, 52));
        totalSellingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalSellingLabel.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        totalSellingLabel.setForeground(new java.awt.Color(234, 234, 234));
        totalSellingLabel.setText("Total Terjual");
        totalSellingPanel.add(totalSellingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        totalSellingCount.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        totalSellingCount.setForeground(new java.awt.Color(234, 234, 234));
        totalSellingCount.setText("0");
        totalSellingPanel.add(totalSellingCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        getContentPane().add(totalSellingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 190, 120));

        itemEmptyStockPanel.setBackground(new java.awt.Color(37, 42, 52));
        itemEmptyStockPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemEmptyStockLabel.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        itemEmptyStockLabel.setForeground(new java.awt.Color(234, 234, 234));
        itemEmptyStockLabel.setText("Barang Stock Kosong");
        itemEmptyStockPanel.add(itemEmptyStockLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, -1, -1));

        itemEmptyStockCount.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        itemEmptyStockCount.setForeground(new java.awt.Color(234, 234, 234));
        itemEmptyStockCount.setText("0");
        itemEmptyStockPanel.add(itemEmptyStockCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        getContentPane().add(itemEmptyStockPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 190, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        todaySellingCount.setText(controller.loadTodaySelling());
		totalSellingCount.setText(controller.loadTotalSelling());
		itemEmptyStockCount.setText(controller.loadItemEmptyStock());
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel itemEmptyStockCount;
    private javax.swing.JLabel itemEmptyStockLabel;
    private javax.swing.JPanel itemEmptyStockPanel;
    private javax.swing.JLabel todaySellingCount;
    private javax.swing.JLabel todaySellingLabel;
    private javax.swing.JPanel todaySellingPanel;
    private javax.swing.JLabel totalSellingCount;
    private javax.swing.JLabel totalSellingLabel;
    private javax.swing.JPanel totalSellingPanel;
    // End of variables declaration//GEN-END:variables
}
