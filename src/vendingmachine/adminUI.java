package vendingmachine;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vendingmachine.controller.adminController;
import vendingmachine.frameAdmin.barangFrame;
import vendingmachine.frameAdmin.dashboardFrame;
import vendingmachine.frameAdmin.historyFrame;
import vendingmachine.models.adminModel;

/**
 *
 * @author RZ
 */
public class adminUI extends javax.swing.JFrame {

	static adminController controller = new adminController();
	static adminModel model = controller.getModel();

	public adminUI() {
		initComponents();
		openDashboard();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSidebar = new javax.swing.JPanel();
        panelSidebarTitle = new javax.swing.JPanel();
        appTitle = new javax.swing.JLabel();
        panelSidebarItem1 = new javax.swing.JPanel();
        sidebarIcon1 = new javax.swing.JLabel();
        sidebarItem1 = new javax.swing.JLabel();
        panelSidebarItem2 = new javax.swing.JPanel();
        sidebarIcon2 = new javax.swing.JLabel();
        sidebarItem2 = new javax.swing.JLabel();
        panelSidebarItem3 = new javax.swing.JPanel();
        sidebarIcon3 = new javax.swing.JLabel();
        sidebarItem3 = new javax.swing.JLabel();
        panelSidebarItem4 = new javax.swing.JPanel();
        sidebarIcon4 = new javax.swing.JLabel();
        sidebarItem4 = new javax.swing.JLabel();
        panelHeader = new javax.swing.JPanel();
        breadCrumb = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Vending Machine");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSidebar.setBackground(new java.awt.Color(31, 171, 137));
        panelSidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSidebarTitle.setBackground(new java.awt.Color(37, 42, 52));

        appTitle.setFont(new java.awt.Font("Montserrat", 1, 32)); // NOI18N
        appTitle.setForeground(new java.awt.Color(240, 240, 240));
        appTitle.setText("ADMIN");

        javax.swing.GroupLayout panelSidebarTitleLayout = new javax.swing.GroupLayout(panelSidebarTitle);
        panelSidebarTitle.setLayout(panelSidebarTitleLayout);
        panelSidebarTitleLayout.setHorizontalGroup(
            panelSidebarTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarTitleLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(appTitle)
                .addGap(13, 13, 13))
        );
        panelSidebarTitleLayout.setVerticalGroup(
            panelSidebarTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSidebarTitleLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(appTitle)
                .addGap(30, 30, 30))
        );

        panelSidebar.add(panelSidebarTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelSidebarItem1.setBackground(new java.awt.Color(37, 42, 52));
        panelSidebarItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSidebarItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSidebarItem1MouseClicked(evt);
            }
        });
        panelSidebarItem1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebarIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/icon/home_white.png"))); // NOI18N
        panelSidebarItem1.add(sidebarIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        sidebarItem1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sidebarItem1.setForeground(new java.awt.Color(240, 240, 240));
        sidebarItem1.setText("Dashboard");
        panelSidebarItem1.add(sidebarItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, -1, -1));

        panelSidebar.add(panelSidebarItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 145, 40));

        panelSidebarItem2.setBackground(new java.awt.Color(37, 42, 52));
        panelSidebarItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSidebarItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSidebarItem2MouseClicked(evt);
            }
        });
        panelSidebarItem2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebarIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/icon/vending_machine_white.png"))); // NOI18N
        panelSidebarItem2.add(sidebarIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        sidebarItem2.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sidebarItem2.setForeground(new java.awt.Color(240, 240, 240));
        sidebarItem2.setText("Barang");
        panelSidebarItem2.add(sidebarItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, -1, -1));

        panelSidebar.add(panelSidebarItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 145, 40));

        panelSidebarItem3.setBackground(new java.awt.Color(37, 42, 52));
        panelSidebarItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSidebarItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSidebarItem3MouseClicked(evt);
            }
        });
        panelSidebarItem3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebarIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/icon/history_white.png"))); // NOI18N
        panelSidebarItem3.add(sidebarIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        sidebarItem3.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sidebarItem3.setForeground(new java.awt.Color(240, 240, 240));
        sidebarItem3.setText("History");
        panelSidebarItem3.add(sidebarItem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, -1, -1));

        panelSidebar.add(panelSidebarItem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 195, 145, 40));

        panelSidebarItem4.setBackground(new java.awt.Color(37, 42, 52));
        panelSidebarItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSidebarItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSidebarItem4MouseClicked(evt);
            }
        });
        panelSidebarItem4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebarIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/icon/logout_white.png"))); // NOI18N
        panelSidebarItem4.add(sidebarIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        sidebarItem4.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sidebarItem4.setForeground(new java.awt.Color(240, 240, 240));
        sidebarItem4.setText("Logout");
        panelSidebarItem4.add(sidebarItem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, -1, -1));

        panelSidebar.add(panelSidebarItem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 145, 40));

        getContentPane().add(panelSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        panelHeader.setBackground(new java.awt.Color(157, 243, 196));
        panelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        breadCrumb.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        breadCrumb.setForeground(new java.awt.Color(37, 42, 52));
        panelHeader.add(breadCrumb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        getContentPane().add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 0, 670, 100));

        desktopPane.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 100, 670, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelSidebarItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSidebarItem1MouseClicked
		openDashboard();
    }//GEN-LAST:event_panelSidebarItem1MouseClicked

    private void panelSidebarItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSidebarItem2MouseClicked
		try {
			barangFrame barang = new barangFrame(desktopPane, breadCrumb);
			desktopPane.add(barang);
			barang.setMaximum(true);
			barang.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(adminUI.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_panelSidebarItem2MouseClicked

    private void panelSidebarItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSidebarItem3MouseClicked
		try {
			historyFrame history = new historyFrame(breadCrumb);
			desktopPane.add(history);
			history.setMaximum(true);
			history.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(adminUI.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_panelSidebarItem3MouseClicked

    private void panelSidebarItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSidebarItem4MouseClicked
		controller.logout(this);
    }//GEN-LAST:event_panelSidebarItem4MouseClicked

	private void openDashboard() {
		try {
			dashboardFrame dashboard = new dashboardFrame(breadCrumb);
			desktopPane.add(dashboard);
			dashboard.setMaximum(true);
			dashboard.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(adminUI.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
//				if (model.getUsername() == null) {
//					new loginUI(model).setVisible(true);
//				} else {
				new adminUI().setVisible(true);
//				}
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JLabel breadCrumb;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelSidebar;
    private javax.swing.JPanel panelSidebarItem1;
    private javax.swing.JPanel panelSidebarItem2;
    private javax.swing.JPanel panelSidebarItem3;
    private javax.swing.JPanel panelSidebarItem4;
    private javax.swing.JPanel panelSidebarTitle;
    private javax.swing.JLabel sidebarIcon1;
    private javax.swing.JLabel sidebarIcon2;
    private javax.swing.JLabel sidebarIcon3;
    private javax.swing.JLabel sidebarIcon4;
    private javax.swing.JLabel sidebarItem1;
    private javax.swing.JLabel sidebarItem2;
    private javax.swing.JLabel sidebarItem3;
    private javax.swing.JLabel sidebarItem4;
    // End of variables declaration//GEN-END:variables
}
