package vendingmachine;

import javax.swing.JOptionPane;
import vendingmachine.controller.vMachineController;
import vendingmachine.models.vMachineModel;

/**
 *
 * @author RZ
 */
public class mainFrame extends javax.swing.JFrame {

	vMachineModel model;
	vMachineController controller;

	int saldo;

	public mainFrame() {
		controller = new vMachineController();
		model = controller.getModel();

		initComponents();
		getItemLabel.setVisible(false);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        panelCocaCola = new javax.swing.JPanel();
        cocaColaImg = new javax.swing.JLabel();
        panelKode1 = new javax.swing.JPanel();
        kodeA1 = new javax.swing.JLabel();
        panelHarga = new javax.swing.JPanel();
        hargaA1 = new javax.swing.JLabel();
        panelCocaColaZero = new javax.swing.JPanel();
        cocaColaImg1 = new javax.swing.JLabel();
        panelKode4 = new javax.swing.JPanel();
        kodeA4 = new javax.swing.JLabel();
        panelHarga3 = new javax.swing.JPanel();
        hargaA4 = new javax.swing.JLabel();
        panelSprite = new javax.swing.JPanel();
        cocaColaImg2 = new javax.swing.JLabel();
        panelKode3 = new javax.swing.JPanel();
        kodeA3 = new javax.swing.JLabel();
        panelHarga2 = new javax.swing.JPanel();
        hargaA3 = new javax.swing.JLabel();
        panelSpriteLight = new javax.swing.JPanel();
        spriteLightImg = new javax.swing.JLabel();
        panelKode5 = new javax.swing.JPanel();
        kodeA5 = new javax.swing.JLabel();
        panelHarga4 = new javax.swing.JPanel();
        hargaA5 = new javax.swing.JLabel();
        panelFantaStrawberry = new javax.swing.JPanel();
        cocaColaImg3 = new javax.swing.JLabel();
        panelKode6 = new javax.swing.JPanel();
        kodeA6 = new javax.swing.JLabel();
        panelHarga5 = new javax.swing.JPanel();
        hargaA6 = new javax.swing.JLabel();
        panelFantaOrange = new javax.swing.JPanel();
        cocaColaImg4 = new javax.swing.JLabel();
        panelKode7 = new javax.swing.JPanel();
        kodeA7 = new javax.swing.JLabel();
        panelHarga6 = new javax.swing.JPanel();
        hargaA7 = new javax.swing.JLabel();
        panelPocariSweat = new javax.swing.JPanel();
        cocaColaImg5 = new javax.swing.JLabel();
        panelKode8 = new javax.swing.JPanel();
        kodeA8 = new javax.swing.JLabel();
        panelHarga7 = new javax.swing.JPanel();
        hargaA8 = new javax.swing.JLabel();
        panelCapPanda = new javax.swing.JPanel();
        capPandaImg = new javax.swing.JLabel();
        panelKode9 = new javax.swing.JPanel();
        kodeA9 = new javax.swing.JLabel();
        panelHarga8 = new javax.swing.JPanel();
        hargaA9 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        cocaColaImg7 = new javax.swing.JLabel();
        panelKode10 = new javax.swing.JPanel();
        kodeA10 = new javax.swing.JLabel();
        panelHarga9 = new javax.swing.JPanel();
        hargaA10 = new javax.swing.JLabel();
        panelNescafeOriginal = new javax.swing.JPanel();
        cocaColaImg9 = new javax.swing.JLabel();
        panelKode11 = new javax.swing.JPanel();
        kodeA11 = new javax.swing.JLabel();
        panelHarga10 = new javax.swing.JPanel();
        hargaA11 = new javax.swing.JLabel();
        panelNescafeMocha = new javax.swing.JPanel();
        cocaColaImg8 = new javax.swing.JLabel();
        panelKode13 = new javax.swing.JPanel();
        kodeA13 = new javax.swing.JLabel();
        panelHarga12 = new javax.swing.JPanel();
        hargaA13 = new javax.swing.JLabel();
        panelNescafeLatte = new javax.swing.JPanel();
        cocaColaImg6 = new javax.swing.JLabel();
        panelKode12 = new javax.swing.JPanel();
        kodeA12 = new javax.swing.JLabel();
        panelHarga11 = new javax.swing.JPanel();
        hargaA12 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        getItemLabel = new javax.swing.JLabel();
        panelEnterMoney = new javax.swing.JPanel();
        btEnterMoney = new javax.swing.JPanel();
        enterMoneyLabel = new javax.swing.JLabel();
        enterMoneyIcon = new javax.swing.JLabel();
        panelInformation = new javax.swing.JPanel();
        saldoLabel = new javax.swing.JLabel();
        currentSaldo = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        itemLabel = new javax.swing.JLabel();
        kodeMinumanLabel = new javax.swing.JLabel();
        panelButton = new javax.swing.JPanel();
        btA = new javax.swing.JButton();
        btB = new javax.swing.JButton();
        btC = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        btEnter = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(48, 56, 65));

        jPanel17.setBackground(new java.awt.Color(60, 255, 138));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCocaCola.setBackground(new java.awt.Color(234, 234, 234));

        cocaColaImg.setForeground(new java.awt.Color(255, 255, 255));
        cocaColaImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocaColaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/coca-cola.png"))); // NOI18N

        panelKode1.setBackground(new java.awt.Color(37, 42, 52));

        kodeA1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeA1.setForeground(new java.awt.Color(234, 234, 234));
        kodeA1.setText("A1");

        javax.swing.GroupLayout panelKode1Layout = new javax.swing.GroupLayout(panelKode1);
        panelKode1.setLayout(panelKode1Layout);
        panelKode1Layout.setHorizontalGroup(
            panelKode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeA1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKode1Layout.setVerticalGroup(
            panelKode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode1Layout.createSequentialGroup()
                .addComponent(kodeA1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelHarga.setBackground(new java.awt.Color(37, 42, 52));

        hargaA1.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaA1.setForeground(new java.awt.Color(255, 255, 255));
        hargaA1.setText("Rp. 6.000");

        javax.swing.GroupLayout panelHargaLayout = new javax.swing.GroupLayout(panelHarga);
        panelHarga.setLayout(panelHargaLayout);
        panelHargaLayout.setHorizontalGroup(
            panelHargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHargaLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(hargaA1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHargaLayout.setVerticalGroup(
            panelHargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCocaColaLayout = new javax.swing.GroupLayout(panelCocaCola);
        panelCocaCola.setLayout(panelCocaColaLayout);
        panelCocaColaLayout.setHorizontalGroup(
            panelCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCocaColaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cocaColaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelCocaColaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        panelCocaColaLayout.setVerticalGroup(
            panelCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCocaColaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cocaColaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKode1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.add(panelCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 100));

        panelCocaColaZero.setBackground(new java.awt.Color(234, 234, 234));

        cocaColaImg1.setForeground(new java.awt.Color(255, 255, 255));
        cocaColaImg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocaColaImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/coca-cola-zero.png"))); // NOI18N

        panelKode4.setBackground(new java.awt.Color(37, 42, 52));

        kodeA4.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeA4.setForeground(new java.awt.Color(234, 234, 234));
        kodeA4.setText("B1");

        javax.swing.GroupLayout panelKode4Layout = new javax.swing.GroupLayout(panelKode4);
        panelKode4.setLayout(panelKode4Layout);
        panelKode4Layout.setHorizontalGroup(
            panelKode4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeA4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKode4Layout.setVerticalGroup(
            panelKode4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode4Layout.createSequentialGroup()
                .addComponent(kodeA4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelHarga3.setBackground(new java.awt.Color(37, 42, 52));

        hargaA4.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaA4.setForeground(new java.awt.Color(255, 255, 255));
        hargaA4.setText("Rp. 6.000");

        javax.swing.GroupLayout panelHarga3Layout = new javax.swing.GroupLayout(panelHarga3);
        panelHarga3.setLayout(panelHarga3Layout);
        panelHarga3Layout.setHorizontalGroup(
            panelHarga3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHarga3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaA4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHarga3Layout.setVerticalGroup(
            panelHarga3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaA4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCocaColaZeroLayout = new javax.swing.GroupLayout(panelCocaColaZero);
        panelCocaColaZero.setLayout(panelCocaColaZeroLayout);
        panelCocaColaZeroLayout.setHorizontalGroup(
            panelCocaColaZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCocaColaZeroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cocaColaImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCocaColaZeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKode4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHarga3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        panelCocaColaZeroLayout.setVerticalGroup(
            panelCocaColaZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCocaColaZeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cocaColaImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCocaColaZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHarga3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKode4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.add(panelCocaColaZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, -1));

        panelSprite.setBackground(new java.awt.Color(234, 234, 234));

        cocaColaImg2.setForeground(new java.awt.Color(255, 255, 255));
        cocaColaImg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocaColaImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/sprite.png"))); // NOI18N

        panelKode3.setBackground(new java.awt.Color(37, 42, 52));

        kodeA3.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeA3.setForeground(new java.awt.Color(234, 234, 234));
        kodeA3.setText("C1");

        javax.swing.GroupLayout panelKode3Layout = new javax.swing.GroupLayout(panelKode3);
        panelKode3.setLayout(panelKode3Layout);
        panelKode3Layout.setHorizontalGroup(
            panelKode3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeA3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKode3Layout.setVerticalGroup(
            panelKode3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode3Layout.createSequentialGroup()
                .addComponent(kodeA3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelHarga2.setBackground(new java.awt.Color(37, 42, 52));

        hargaA3.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaA3.setForeground(new java.awt.Color(255, 255, 255));
        hargaA3.setText("Rp. 6.000");

        javax.swing.GroupLayout panelHarga2Layout = new javax.swing.GroupLayout(panelHarga2);
        panelHarga2.setLayout(panelHarga2Layout);
        panelHarga2Layout.setHorizontalGroup(
            panelHarga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHarga2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaA3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHarga2Layout.setVerticalGroup(
            panelHarga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaA3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelSpriteLayout = new javax.swing.GroupLayout(panelSprite);
        panelSprite.setLayout(panelSpriteLayout);
        panelSpriteLayout.setHorizontalGroup(
            panelSpriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSpriteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cocaColaImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSpriteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKode3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHarga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        panelSpriteLayout.setVerticalGroup(
            panelSpriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSpriteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cocaColaImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSpriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHarga2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKode3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.add(panelSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 100, 100));

        panelSpriteLight.setBackground(new java.awt.Color(234, 234, 234));

        spriteLightImg.setForeground(new java.awt.Color(255, 255, 255));
        spriteLightImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spriteLightImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/sprite-light.png"))); // NOI18N

        panelKode5.setBackground(new java.awt.Color(37, 42, 52));

        kodeA5.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeA5.setForeground(new java.awt.Color(234, 234, 234));
        kodeA5.setText("A2");

        javax.swing.GroupLayout panelKode5Layout = new javax.swing.GroupLayout(panelKode5);
        panelKode5.setLayout(panelKode5Layout);
        panelKode5Layout.setHorizontalGroup(
            panelKode5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeA5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKode5Layout.setVerticalGroup(
            panelKode5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode5Layout.createSequentialGroup()
                .addComponent(kodeA5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelHarga4.setBackground(new java.awt.Color(37, 42, 52));

        hargaA5.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaA5.setForeground(new java.awt.Color(255, 255, 255));
        hargaA5.setText("Rp. 6.000");

        javax.swing.GroupLayout panelHarga4Layout = new javax.swing.GroupLayout(panelHarga4);
        panelHarga4.setLayout(panelHarga4Layout);
        panelHarga4Layout.setHorizontalGroup(
            panelHarga4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHarga4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaA5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHarga4Layout.setVerticalGroup(
            panelHarga4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaA5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelSpriteLightLayout = new javax.swing.GroupLayout(panelSpriteLight);
        panelSpriteLight.setLayout(panelSpriteLightLayout);
        panelSpriteLightLayout.setHorizontalGroup(
            panelSpriteLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSpriteLightLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(spriteLightImg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelSpriteLightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKode5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHarga4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSpriteLightLayout.setVerticalGroup(
            panelSpriteLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSpriteLightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spriteLightImg, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSpriteLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHarga4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKode5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.add(panelSpriteLight, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 100));

        panelFantaStrawberry.setBackground(new java.awt.Color(234, 234, 234));

        cocaColaImg3.setForeground(new java.awt.Color(255, 255, 255));
        cocaColaImg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocaColaImg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/fanta-strawberry.png"))); // NOI18N

        panelKode6.setBackground(new java.awt.Color(37, 42, 52));

        kodeA6.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeA6.setForeground(new java.awt.Color(234, 234, 234));
        kodeA6.setText("B2");

        javax.swing.GroupLayout panelKode6Layout = new javax.swing.GroupLayout(panelKode6);
        panelKode6.setLayout(panelKode6Layout);
        panelKode6Layout.setHorizontalGroup(
            panelKode6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeA6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKode6Layout.setVerticalGroup(
            panelKode6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode6Layout.createSequentialGroup()
                .addComponent(kodeA6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelHarga5.setBackground(new java.awt.Color(37, 42, 52));

        hargaA6.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaA6.setForeground(new java.awt.Color(255, 255, 255));
        hargaA6.setText("Rp. 6.000");

        javax.swing.GroupLayout panelHarga5Layout = new javax.swing.GroupLayout(panelHarga5);
        panelHarga5.setLayout(panelHarga5Layout);
        panelHarga5Layout.setHorizontalGroup(
            panelHarga5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHarga5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaA6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHarga5Layout.setVerticalGroup(
            panelHarga5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaA6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFantaStrawberryLayout = new javax.swing.GroupLayout(panelFantaStrawberry);
        panelFantaStrawberry.setLayout(panelFantaStrawberryLayout);
        panelFantaStrawberryLayout.setHorizontalGroup(
            panelFantaStrawberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFantaStrawberryLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cocaColaImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelFantaStrawberryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKode6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHarga5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFantaStrawberryLayout.setVerticalGroup(
            panelFantaStrawberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFantaStrawberryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cocaColaImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFantaStrawberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHarga5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKode6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.add(panelFantaStrawberry, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, 100));

        panelFantaOrange.setBackground(new java.awt.Color(234, 234, 234));

        cocaColaImg4.setForeground(new java.awt.Color(255, 255, 255));
        cocaColaImg4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocaColaImg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/fanta-orange.png"))); // NOI18N

        panelKode7.setBackground(new java.awt.Color(37, 42, 52));

        kodeA7.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeA7.setForeground(new java.awt.Color(234, 234, 234));
        kodeA7.setText("C2");

        javax.swing.GroupLayout panelKode7Layout = new javax.swing.GroupLayout(panelKode7);
        panelKode7.setLayout(panelKode7Layout);
        panelKode7Layout.setHorizontalGroup(
            panelKode7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeA7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKode7Layout.setVerticalGroup(
            panelKode7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode7Layout.createSequentialGroup()
                .addComponent(kodeA7)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelHarga6.setBackground(new java.awt.Color(37, 42, 52));

        hargaA7.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaA7.setForeground(new java.awt.Color(255, 255, 255));
        hargaA7.setText("Rp. 6.000");

        javax.swing.GroupLayout panelHarga6Layout = new javax.swing.GroupLayout(panelHarga6);
        panelHarga6.setLayout(panelHarga6Layout);
        panelHarga6Layout.setHorizontalGroup(
            panelHarga6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHarga6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaA7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHarga6Layout.setVerticalGroup(
            panelHarga6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaA7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFantaOrangeLayout = new javax.swing.GroupLayout(panelFantaOrange);
        panelFantaOrange.setLayout(panelFantaOrangeLayout);
        panelFantaOrangeLayout.setHorizontalGroup(
            panelFantaOrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFantaOrangeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cocaColaImg4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelFantaOrangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKode7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHarga6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFantaOrangeLayout.setVerticalGroup(
            panelFantaOrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFantaOrangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cocaColaImg4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFantaOrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHarga6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKode7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.add(panelFantaOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        panelPocariSweat.setBackground(new java.awt.Color(234, 234, 234));

        cocaColaImg5.setForeground(new java.awt.Color(255, 255, 255));
        cocaColaImg5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocaColaImg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/pocari-sweat.png"))); // NOI18N

        panelKode8.setBackground(new java.awt.Color(37, 42, 52));

        kodeA8.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeA8.setForeground(new java.awt.Color(234, 234, 234));
        kodeA8.setText("A3");

        javax.swing.GroupLayout panelKode8Layout = new javax.swing.GroupLayout(panelKode8);
        panelKode8.setLayout(panelKode8Layout);
        panelKode8Layout.setHorizontalGroup(
            panelKode8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeA8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKode8Layout.setVerticalGroup(
            panelKode8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode8Layout.createSequentialGroup()
                .addComponent(kodeA8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelHarga7.setBackground(new java.awt.Color(37, 42, 52));

        hargaA8.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaA8.setForeground(new java.awt.Color(255, 255, 255));
        hargaA8.setText("Rp. 7.000");

        javax.swing.GroupLayout panelHarga7Layout = new javax.swing.GroupLayout(panelHarga7);
        panelHarga7.setLayout(panelHarga7Layout);
        panelHarga7Layout.setHorizontalGroup(
            panelHarga7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHarga7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaA8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHarga7Layout.setVerticalGroup(
            panelHarga7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaA8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPocariSweatLayout = new javax.swing.GroupLayout(panelPocariSweat);
        panelPocariSweat.setLayout(panelPocariSweatLayout);
        panelPocariSweatLayout.setHorizontalGroup(
            panelPocariSweatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPocariSweatLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cocaColaImg5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPocariSweatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKode8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHarga7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPocariSweatLayout.setVerticalGroup(
            panelPocariSweatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPocariSweatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cocaColaImg5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPocariSweatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHarga7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKode8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.add(panelPocariSweat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 100));

        panelCapPanda.setBackground(new java.awt.Color(234, 234, 234));

        capPandaImg.setForeground(new java.awt.Color(255, 255, 255));
        capPandaImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        capPandaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/cap-panda.png"))); // NOI18N

        panelKode9.setBackground(new java.awt.Color(37, 42, 52));

        kodeA9.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeA9.setForeground(new java.awt.Color(234, 234, 234));
        kodeA9.setText("B3");

        javax.swing.GroupLayout panelKode9Layout = new javax.swing.GroupLayout(panelKode9);
        panelKode9.setLayout(panelKode9Layout);
        panelKode9Layout.setHorizontalGroup(
            panelKode9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeA9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKode9Layout.setVerticalGroup(
            panelKode9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode9Layout.createSequentialGroup()
                .addComponent(kodeA9)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelHarga8.setBackground(new java.awt.Color(37, 42, 52));

        hargaA9.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaA9.setForeground(new java.awt.Color(255, 255, 255));
        hargaA9.setText("Rp. 7.000");

        javax.swing.GroupLayout panelHarga8Layout = new javax.swing.GroupLayout(panelHarga8);
        panelHarga8.setLayout(panelHarga8Layout);
        panelHarga8Layout.setHorizontalGroup(
            panelHarga8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHarga8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaA9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHarga8Layout.setVerticalGroup(
            panelHarga8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaA9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCapPandaLayout = new javax.swing.GroupLayout(panelCapPanda);
        panelCapPanda.setLayout(panelCapPandaLayout);
        panelCapPandaLayout.setHorizontalGroup(
            panelCapPandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCapPandaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(capPandaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelCapPandaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKode9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHarga8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCapPandaLayout.setVerticalGroup(
            panelCapPandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCapPandaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(capPandaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCapPandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHarga8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKode9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.add(panelCapPanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 100, 100));

        jPanel14.setBackground(new java.awt.Color(234, 234, 234));

        cocaColaImg7.setForeground(new java.awt.Color(255, 255, 255));
        cocaColaImg7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocaColaImg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/green-sands.png"))); // NOI18N

        panelKode10.setBackground(new java.awt.Color(37, 42, 52));

        kodeA10.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeA10.setForeground(new java.awt.Color(234, 234, 234));
        kodeA10.setText("C3");

        javax.swing.GroupLayout panelKode10Layout = new javax.swing.GroupLayout(panelKode10);
        panelKode10.setLayout(panelKode10Layout);
        panelKode10Layout.setHorizontalGroup(
            panelKode10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeA10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKode10Layout.setVerticalGroup(
            panelKode10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode10Layout.createSequentialGroup()
                .addComponent(kodeA10)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelHarga9.setBackground(new java.awt.Color(37, 42, 52));

        hargaA10.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaA10.setForeground(new java.awt.Color(255, 255, 255));
        hargaA10.setText("Rp. 7.000");

        javax.swing.GroupLayout panelHarga9Layout = new javax.swing.GroupLayout(panelHarga9);
        panelHarga9.setLayout(panelHarga9Layout);
        panelHarga9Layout.setHorizontalGroup(
            panelHarga9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHarga9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaA10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHarga9Layout.setVerticalGroup(
            panelHarga9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaA10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cocaColaImg7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKode10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHarga9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cocaColaImg7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHarga9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKode10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 100, 100));

        panelNescafeOriginal.setBackground(new java.awt.Color(234, 234, 234));

        cocaColaImg9.setForeground(new java.awt.Color(255, 255, 255));
        cocaColaImg9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocaColaImg9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/nescafe-original.png"))); // NOI18N

        panelKode11.setBackground(new java.awt.Color(37, 42, 52));

        kodeA11.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeA11.setForeground(new java.awt.Color(234, 234, 234));
        kodeA11.setText("A4");

        javax.swing.GroupLayout panelKode11Layout = new javax.swing.GroupLayout(panelKode11);
        panelKode11.setLayout(panelKode11Layout);
        panelKode11Layout.setHorizontalGroup(
            panelKode11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeA11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKode11Layout.setVerticalGroup(
            panelKode11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode11Layout.createSequentialGroup()
                .addComponent(kodeA11)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelHarga10.setBackground(new java.awt.Color(37, 42, 52));

        hargaA11.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaA11.setForeground(new java.awt.Color(255, 255, 255));
        hargaA11.setText("Rp. 8.000");

        javax.swing.GroupLayout panelHarga10Layout = new javax.swing.GroupLayout(panelHarga10);
        panelHarga10.setLayout(panelHarga10Layout);
        panelHarga10Layout.setHorizontalGroup(
            panelHarga10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHarga10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaA11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHarga10Layout.setVerticalGroup(
            panelHarga10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaA11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelNescafeOriginalLayout = new javax.swing.GroupLayout(panelNescafeOriginal);
        panelNescafeOriginal.setLayout(panelNescafeOriginalLayout);
        panelNescafeOriginalLayout.setHorizontalGroup(
            panelNescafeOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNescafeOriginalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cocaColaImg9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelNescafeOriginalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKode11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHarga10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelNescafeOriginalLayout.setVerticalGroup(
            panelNescafeOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNescafeOriginalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cocaColaImg9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNescafeOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHarga10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKode11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.add(panelNescafeOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        panelNescafeMocha.setBackground(new java.awt.Color(234, 234, 234));

        cocaColaImg8.setForeground(new java.awt.Color(255, 255, 255));
        cocaColaImg8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocaColaImg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/nescafe-mocha.png"))); // NOI18N

        panelKode13.setBackground(new java.awt.Color(37, 42, 52));

        kodeA13.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeA13.setForeground(new java.awt.Color(234, 234, 234));
        kodeA13.setText("C4");

        javax.swing.GroupLayout panelKode13Layout = new javax.swing.GroupLayout(panelKode13);
        panelKode13.setLayout(panelKode13Layout);
        panelKode13Layout.setHorizontalGroup(
            panelKode13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeA13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKode13Layout.setVerticalGroup(
            panelKode13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode13Layout.createSequentialGroup()
                .addComponent(kodeA13)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelHarga12.setBackground(new java.awt.Color(37, 42, 52));

        hargaA13.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaA13.setForeground(new java.awt.Color(255, 255, 255));
        hargaA13.setText("Rp. 8.000");

        javax.swing.GroupLayout panelHarga12Layout = new javax.swing.GroupLayout(panelHarga12);
        panelHarga12.setLayout(panelHarga12Layout);
        panelHarga12Layout.setHorizontalGroup(
            panelHarga12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHarga12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaA13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHarga12Layout.setVerticalGroup(
            panelHarga12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaA13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelNescafeMochaLayout = new javax.swing.GroupLayout(panelNescafeMocha);
        panelNescafeMocha.setLayout(panelNescafeMochaLayout);
        panelNescafeMochaLayout.setHorizontalGroup(
            panelNescafeMochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNescafeMochaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cocaColaImg8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelNescafeMochaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKode13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHarga12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelNescafeMochaLayout.setVerticalGroup(
            panelNescafeMochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNescafeMochaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cocaColaImg8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNescafeMochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHarga12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKode13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.add(panelNescafeMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 100, 100));

        panelNescafeLatte.setBackground(new java.awt.Color(234, 234, 234));

        cocaColaImg6.setForeground(new java.awt.Color(255, 255, 255));
        cocaColaImg6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocaColaImg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/nescafe-latte.png"))); // NOI18N

        panelKode12.setBackground(new java.awt.Color(37, 42, 52));

        kodeA12.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeA12.setForeground(new java.awt.Color(234, 234, 234));
        kodeA12.setText("B4");

        javax.swing.GroupLayout panelKode12Layout = new javax.swing.GroupLayout(panelKode12);
        panelKode12.setLayout(panelKode12Layout);
        panelKode12Layout.setHorizontalGroup(
            panelKode12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeA12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKode12Layout.setVerticalGroup(
            panelKode12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKode12Layout.createSequentialGroup()
                .addComponent(kodeA12)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelHarga11.setBackground(new java.awt.Color(37, 42, 52));

        hargaA12.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaA12.setForeground(new java.awt.Color(255, 255, 255));
        hargaA12.setText("Rp. 8.000");

        javax.swing.GroupLayout panelHarga11Layout = new javax.swing.GroupLayout(panelHarga11);
        panelHarga11.setLayout(panelHarga11Layout);
        panelHarga11Layout.setHorizontalGroup(
            panelHarga11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHarga11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaA12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHarga11Layout.setVerticalGroup(
            panelHarga11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaA12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelNescafeLatteLayout = new javax.swing.GroupLayout(panelNescafeLatte);
        panelNescafeLatte.setLayout(panelNescafeLatteLayout);
        panelNescafeLatteLayout.setHorizontalGroup(
            panelNescafeLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNescafeLatteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cocaColaImg6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelNescafeLatteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKode12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHarga11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelNescafeLatteLayout.setVerticalGroup(
            panelNescafeLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNescafeLatteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cocaColaImg6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNescafeLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHarga11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKode12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.add(panelNescafeLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 100, 100));

        jPanel15.setBackground(new java.awt.Color(234, 234, 234));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(37, 42, 52));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 30));

        getItemLabel.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        getItemLabel.setForeground(new java.awt.Color(37, 42, 52));
        getItemLabel.setText("Ambil Disini");
        jPanel15.add(getItemLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        panelEnterMoney.setBackground(new java.awt.Color(234, 234, 234));
        panelEnterMoney.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEnterMoney.setPreferredSize(new java.awt.Dimension(125, 30));
        panelEnterMoney.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEnterMoneyMouseClicked(evt);
            }
        });

        btEnterMoney.setBackground(new java.awt.Color(37, 42, 52));

        javax.swing.GroupLayout btEnterMoneyLayout = new javax.swing.GroupLayout(btEnterMoney);
        btEnterMoney.setLayout(btEnterMoneyLayout);
        btEnterMoneyLayout.setHorizontalGroup(
            btEnterMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        btEnterMoneyLayout.setVerticalGroup(
            btEnterMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelEnterMoneyLayout = new javax.swing.GroupLayout(panelEnterMoney);
        panelEnterMoney.setLayout(panelEnterMoneyLayout);
        panelEnterMoneyLayout.setHorizontalGroup(
            panelEnterMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnterMoneyLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btEnterMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelEnterMoneyLayout.setVerticalGroup(
            panelEnterMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnterMoneyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btEnterMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        enterMoneyLabel.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        enterMoneyLabel.setForeground(new java.awt.Color(234, 234, 234));
        enterMoneyLabel.setText("Masukkan Uang");

        enterMoneyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/icon/icons8_collapse_arrow_16px.png"))); // NOI18N

        panelInformation.setBackground(new java.awt.Color(255, 255, 255));
        panelInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saldoLabel.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        saldoLabel.setForeground(new java.awt.Color(37, 42, 52));
        saldoLabel.setText("Saldo :");
        panelInformation.add(saldoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, -1, -1));

        currentSaldo.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        currentSaldo.setForeground(new java.awt.Color(37, 42, 52));
        currentSaldo.setText("Rp. 0");
        panelInformation.add(currentSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 12, -1, -1));
        panelInformation.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 136, 10));

        itemLabel.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        itemLabel.setForeground(new java.awt.Color(37, 42, 52));
        panelInformation.add(itemLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        kodeMinumanLabel.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeMinumanLabel.setForeground(new java.awt.Color(37, 42, 52));
        kodeMinumanLabel.setText("Kode Minuman :");
        panelInformation.add(kodeMinumanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, -1, -1));

        panelButton.setBackground(new java.awt.Color(234, 234, 234));
        panelButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btA.setBackground(new java.awt.Color(37, 42, 52));
        btA.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        btA.setForeground(new java.awt.Color(255, 255, 255));
        btA.setText("A");
        btA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAActionPerformed(evt);
            }
        });
        panelButton.add(btA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 35, 35));

        btB.setBackground(new java.awt.Color(37, 42, 52));
        btB.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        btB.setForeground(new java.awt.Color(255, 255, 255));
        btB.setText("B");
        btB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBActionPerformed(evt);
            }
        });
        panelButton.add(btB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 35, 35));

        btC.setBackground(new java.awt.Color(37, 42, 52));
        btC.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        btC.setForeground(new java.awt.Color(255, 255, 255));
        btC.setText("C");
        btC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCActionPerformed(evt);
            }
        });
        panelButton.add(btC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 35, 35));

        bt1.setBackground(new java.awt.Color(37, 42, 52));
        bt1.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        bt1.setForeground(new java.awt.Color(255, 255, 255));
        bt1.setText("1");
        bt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        panelButton.add(bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 35, 35));

        bt2.setBackground(new java.awt.Color(37, 42, 52));
        bt2.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        bt2.setForeground(new java.awt.Color(255, 255, 255));
        bt2.setText("2");
        bt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        panelButton.add(bt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 35, 35));

        bt3.setBackground(new java.awt.Color(37, 42, 52));
        bt3.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        bt3.setForeground(new java.awt.Color(255, 255, 255));
        bt3.setText("3");
        bt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        panelButton.add(bt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 35, 35));

        bt4.setBackground(new java.awt.Color(37, 42, 52));
        bt4.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        bt4.setForeground(new java.awt.Color(255, 255, 255));
        bt4.setText("4");
        bt4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        panelButton.add(bt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 35, 35));

        btEnter.setBackground(new java.awt.Color(37, 42, 52));
        btEnter.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        btEnter.setForeground(new java.awt.Color(255, 255, 255));
        btEnter.setText("ENTER");
        btEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnterActionPerformed(evt);
            }
        });
        panelButton.add(btEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 115, 35));

        btDelete.setBackground(new java.awt.Color(37, 42, 52));
        btDelete.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        btDelete.setForeground(new java.awt.Color(255, 255, 255));
        btDelete.setText("DELETE");
        btDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDelete.setPreferredSize(new java.awt.Dimension(80, 22));
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        panelButton.add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 75, 35));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelInformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(panelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelEnterMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(enterMoneyIcon))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(enterMoneyLabel)))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(panelInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelEnterMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(enterMoneyIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterMoneyLabel))
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelEnterMoneyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEnterMoneyMouseClicked
		//Dialog masukkan nominal
		String dialog = JOptionPane.showInputDialog(this, "Masukkan Nominal", "Vending Machine", JOptionPane.INFORMATION_MESSAGE);
		//Check Input Kosong
		if (dialog != null && !dialog.isBlank()) {
			//Check Input Hanya Boleh Angka
			if (!dialog.matches("^[0-9]*$")) {
				JOptionPane.showMessageDialog(this, "Nominal Tidak Valid.", "Terjadi Kesalahan!", JOptionPane.ERROR_MESSAGE);
			} else {

				//Convert Input ke dalam Integer
				int nominal = Integer.parseInt(dialog);

				//Check Nominal Uang
				if (nominal == 2000 || nominal == 5000 || nominal == 10000) {
					controller.changeSaldo(currentSaldo, nominal);
				} else {
					JOptionPane.showMessageDialog(this, "Hanya Menerima Uang Nominal Rp. 2000, Rp. 5000, Rp. 10.000");
				}
			}
		}
    }//GEN-LAST:event_panelEnterMoneyMouseClicked

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
		controller.typingKode(itemLabel, "4");
    }//GEN-LAST:event_bt4ActionPerformed

    private void btBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBActionPerformed
		controller.typingKode(itemLabel, "B");
    }//GEN-LAST:event_btBActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
		controller.typingKode(itemLabel, "2");
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
		controller.typingKode(itemLabel, "3");
    }//GEN-LAST:event_bt3ActionPerformed

    private void btEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnterActionPerformed
		controller.selectItem(currentSaldo, itemLabel, getItemLabel);
    }//GEN-LAST:event_btEnterActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
		controller.deleteKode(itemLabel);
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAActionPerformed
		controller.typingKode(itemLabel, "A");
    }//GEN-LAST:event_btAActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
		controller.typingKode(itemLabel, "1");
    }//GEN-LAST:event_bt1ActionPerformed

    private void btCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCActionPerformed
		controller.typingKode(itemLabel, "C");
    }//GEN-LAST:event_btCActionPerformed

	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new mainFrame().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton btA;
    private javax.swing.JButton btB;
    private javax.swing.JButton btC;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEnter;
    private javax.swing.JPanel btEnterMoney;
    private javax.swing.JLabel capPandaImg;
    private javax.swing.JLabel cocaColaImg;
    private javax.swing.JLabel cocaColaImg1;
    private javax.swing.JLabel cocaColaImg2;
    private javax.swing.JLabel cocaColaImg3;
    private javax.swing.JLabel cocaColaImg4;
    private javax.swing.JLabel cocaColaImg5;
    private javax.swing.JLabel cocaColaImg6;
    private javax.swing.JLabel cocaColaImg7;
    private javax.swing.JLabel cocaColaImg8;
    private javax.swing.JLabel cocaColaImg9;
    private javax.swing.JLabel currentSaldo;
    private javax.swing.JLabel enterMoneyIcon;
    private javax.swing.JLabel enterMoneyLabel;
    private javax.swing.JLabel getItemLabel;
    private javax.swing.JLabel hargaA1;
    private javax.swing.JLabel hargaA10;
    private javax.swing.JLabel hargaA11;
    private javax.swing.JLabel hargaA12;
    private javax.swing.JLabel hargaA13;
    private javax.swing.JLabel hargaA3;
    private javax.swing.JLabel hargaA4;
    private javax.swing.JLabel hargaA5;
    private javax.swing.JLabel hargaA6;
    private javax.swing.JLabel hargaA7;
    private javax.swing.JLabel hargaA8;
    private javax.swing.JLabel hargaA9;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JLabel kodeA1;
    private javax.swing.JLabel kodeA10;
    private javax.swing.JLabel kodeA11;
    private javax.swing.JLabel kodeA12;
    private javax.swing.JLabel kodeA13;
    private javax.swing.JLabel kodeA3;
    private javax.swing.JLabel kodeA4;
    private javax.swing.JLabel kodeA5;
    private javax.swing.JLabel kodeA6;
    private javax.swing.JLabel kodeA7;
    private javax.swing.JLabel kodeA8;
    private javax.swing.JLabel kodeA9;
    private javax.swing.JLabel kodeMinumanLabel;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel panelCapPanda;
    private javax.swing.JPanel panelCocaCola;
    private javax.swing.JPanel panelCocaColaZero;
    private javax.swing.JPanel panelEnterMoney;
    private javax.swing.JPanel panelFantaOrange;
    private javax.swing.JPanel panelFantaStrawberry;
    private javax.swing.JPanel panelHarga;
    private javax.swing.JPanel panelHarga10;
    private javax.swing.JPanel panelHarga11;
    private javax.swing.JPanel panelHarga12;
    private javax.swing.JPanel panelHarga2;
    private javax.swing.JPanel panelHarga3;
    private javax.swing.JPanel panelHarga4;
    private javax.swing.JPanel panelHarga5;
    private javax.swing.JPanel panelHarga6;
    private javax.swing.JPanel panelHarga7;
    private javax.swing.JPanel panelHarga8;
    private javax.swing.JPanel panelHarga9;
    private javax.swing.JPanel panelInformation;
    private javax.swing.JPanel panelKode1;
    private javax.swing.JPanel panelKode10;
    private javax.swing.JPanel panelKode11;
    private javax.swing.JPanel panelKode12;
    private javax.swing.JPanel panelKode13;
    private javax.swing.JPanel panelKode3;
    private javax.swing.JPanel panelKode4;
    private javax.swing.JPanel panelKode5;
    private javax.swing.JPanel panelKode6;
    private javax.swing.JPanel panelKode7;
    private javax.swing.JPanel panelKode8;
    private javax.swing.JPanel panelKode9;
    private javax.swing.JPanel panelNescafeLatte;
    private javax.swing.JPanel panelNescafeMocha;
    private javax.swing.JPanel panelNescafeOriginal;
    private javax.swing.JPanel panelPocariSweat;
    private javax.swing.JPanel panelSprite;
    private javax.swing.JPanel panelSpriteLight;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel spriteLightImg;
    // End of variables declaration//GEN-END:variables
}
