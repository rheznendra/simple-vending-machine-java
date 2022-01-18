package vendingmachine;

import vendingmachine.controller.loginController;
import vendingmachine.models.adminModel;

/**
 *
 * @author RZ
 */
public class loginUI extends javax.swing.JFrame {

	private loginController controller;
	public adminModel model;

	public loginUI(adminModel model) {
		this.model = model;
		controller = new loginController(model);
		initComponents();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbUsername = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        inputPassword = new javax.swing.JPasswordField();
        btSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Admin");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(234, 234, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbUsername.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(37, 42, 52));
        lbUsername.setText("Username");
        jPanel1.add(lbUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        lbPassword.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(37, 42, 52));
        lbPassword.setText("Password");
        jPanel1.add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));
        jPanel1.add(inputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 210, 30));
        jPanel1.add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 210, 30));

        btSubmit.setBackground(new java.awt.Color(37, 42, 52));
        btSubmit.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btSubmit.setForeground(new java.awt.Color(234, 234, 234));
        btSubmit.setText("Login");
        btSubmit.setBorder(null);
        btSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSubmit.setFocusable(false);
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed

		String username = inputUsername.getText();
		String password = new String(inputPassword.getPassword());

		if (controller.checkLogin(username, password)) {
			this.dispose();
			new adminUI().setVisible(true);
		}
    }//GEN-LAST:event_btSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSubmit;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUsername;
    // End of variables declaration//GEN-END:variables
}
