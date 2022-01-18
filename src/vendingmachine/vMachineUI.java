package vendingmachine;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import vendingmachine.controller.vMachineController;

/**
 *
 * @author RZ
 */
public class vMachineUI extends javax.swing.JFrame {

	private vMachineController controller;

	public vMachineUI() {
		controller = new vMachineController();

		initComponents();
		getItemLabel.setVisible(false);
		getStockBarang(false);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelBackgroundMinuman = new javax.swing.JPanel();
        panelCocaCola = new javax.swing.JPanel();
        cocaColaImg = new javax.swing.JLabel();
        panelKodeCocaCola = new javax.swing.JPanel();
        kodeCocaCola = new javax.swing.JLabel();
        panelHargaCocaCola = new javax.swing.JPanel();
        hargaCocaCola = new javax.swing.JLabel();
        panelStockCocaCola = new javax.swing.JPanel();
        stockCocaCola = new javax.swing.JLabel();
        panelCocaColaZero = new javax.swing.JPanel();
        cocaColaZeroImg = new javax.swing.JLabel();
        panelKodeCocaColaZero = new javax.swing.JPanel();
        kodeCocaColaZero = new javax.swing.JLabel();
        panelHargaCocaColaZero = new javax.swing.JPanel();
        hargaCocaColaZero = new javax.swing.JLabel();
        panelStockCocaColaZero = new javax.swing.JPanel();
        stockCocaColaZero = new javax.swing.JLabel();
        panelSprite = new javax.swing.JPanel();
        spriteImg = new javax.swing.JLabel();
        panelKodeSprite = new javax.swing.JPanel();
        kodeSprite = new javax.swing.JLabel();
        panelHargaSprite = new javax.swing.JPanel();
        hargaSprite = new javax.swing.JLabel();
        panelStockSprite = new javax.swing.JPanel();
        stockSprite = new javax.swing.JLabel();
        panelSpriteLight = new javax.swing.JPanel();
        spriteLightImg = new javax.swing.JLabel();
        panelKodeSpriteLight = new javax.swing.JPanel();
        kodeSpriteLight = new javax.swing.JLabel();
        panelHargaSpriteLight = new javax.swing.JPanel();
        hargaSpriteLight = new javax.swing.JLabel();
        panelStockSpriteLight = new javax.swing.JPanel();
        stockSpriteLight = new javax.swing.JLabel();
        panelFantaStrawberry = new javax.swing.JPanel();
        fantaStrawberryImg = new javax.swing.JLabel();
        panelKodeFantaStrawberry = new javax.swing.JPanel();
        kodeFantaStrawberry = new javax.swing.JLabel();
        panelHargaFantaStrawberry = new javax.swing.JPanel();
        hargaFantaStrawberry = new javax.swing.JLabel();
        panelStockFantaStrawberry = new javax.swing.JPanel();
        stockFantaStrawberry = new javax.swing.JLabel();
        panelFantaOrange = new javax.swing.JPanel();
        fantaOrangeImg = new javax.swing.JLabel();
        panelKodeFantaOrange = new javax.swing.JPanel();
        kodeFantaOrange = new javax.swing.JLabel();
        panelHargaFantaOrange = new javax.swing.JPanel();
        hargaFantaOrange = new javax.swing.JLabel();
        panelStockFantaOrange = new javax.swing.JPanel();
        stockFantaOrange = new javax.swing.JLabel();
        panelPocariSweat = new javax.swing.JPanel();
        PocariSweatImg = new javax.swing.JLabel();
        panelKodePocariSweat = new javax.swing.JPanel();
        kodePocariSweat = new javax.swing.JLabel();
        panelHargaPocariSweat = new javax.swing.JPanel();
        hargaPocariSweat = new javax.swing.JLabel();
        panelStockPocariSweat = new javax.swing.JPanel();
        stockPocariSweat = new javax.swing.JLabel();
        panelCapPanda = new javax.swing.JPanel();
        capPandaImg = new javax.swing.JLabel();
        panelKodeCapPanda = new javax.swing.JPanel();
        kodeCapPanda = new javax.swing.JLabel();
        panelHargaCapPanda = new javax.swing.JPanel();
        hargaCapPanda = new javax.swing.JLabel();
        panelStockCapPanda = new javax.swing.JPanel();
        stockCapPanda = new javax.swing.JLabel();
        panelGreenSands = new javax.swing.JPanel();
        greenSandsImg = new javax.swing.JLabel();
        panelKodeGreenSands = new javax.swing.JPanel();
        kodeGreenSands = new javax.swing.JLabel();
        panelHargaGreenSands = new javax.swing.JPanel();
        hargaGreenSands = new javax.swing.JLabel();
        panelStockGreenSands = new javax.swing.JPanel();
        stockGreenSands = new javax.swing.JLabel();
        panelNescafeOriginal = new javax.swing.JPanel();
        nescafeOriginalImg = new javax.swing.JLabel();
        panelKodeNescafeOriginal = new javax.swing.JPanel();
        kodeNescafeOriginal = new javax.swing.JLabel();
        panelHargaNescafeOriginal = new javax.swing.JPanel();
        hargaNescafeOriginal = new javax.swing.JLabel();
        panelStockNescafeOriginal = new javax.swing.JPanel();
        stockNescafeOriginal = new javax.swing.JLabel();
        panelNescafeLatte = new javax.swing.JPanel();
        nescafeLatteImg = new javax.swing.JLabel();
        panelKodeNescafeLatte = new javax.swing.JPanel();
        kodeNescafeLatte = new javax.swing.JLabel();
        panelHargaNescafeLatte = new javax.swing.JPanel();
        hargaNescafeLatte = new javax.swing.JLabel();
        panelStockNescafeLatte = new javax.swing.JPanel();
        stockNescafeLatte = new javax.swing.JLabel();
        panelNescafeMocha = new javax.swing.JPanel();
        nescafeMochaImg = new javax.swing.JLabel();
        panelKodeNescafeMocha = new javax.swing.JPanel();
        kodeNescafeMocha = new javax.swing.JLabel();
        panelHargaNescafeMocha = new javax.swing.JPanel();
        hargaNescafeMocha = new javax.swing.JLabel();
        panelStockNescafeMocha = new javax.swing.JPanel();
        stockNescafeMocha = new javax.swing.JLabel();
        panelOutput = new javax.swing.JPanel();
        panelgetItem = new javax.swing.JPanel();
        labelOutput = new javax.swing.JLabel();
        getItemLabel = new javax.swing.JLabel();
        panelEnterMoney = new javax.swing.JPanel();
        btEnterMoney = new javax.swing.JPanel();
        enterMoneyLabel = new javax.swing.JLabel();
        enterMoneyIcon = new javax.swing.JLabel();
        panelInformation = new javax.swing.JPanel();
        saldoLabel = new javax.swing.JLabel();
        labelCurrentSaldo = new javax.swing.JLabel();
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

        panelBackgroundMinuman.setBackground(new java.awt.Color(60, 255, 138));
        panelBackgroundMinuman.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCocaCola.setBackground(new java.awt.Color(234, 234, 234));
        panelCocaCola.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cocaColaImg.setForeground(new java.awt.Color(255, 255, 255));
        cocaColaImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocaColaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/coca-cola.png"))); // NOI18N
        panelCocaCola.add(cocaColaImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, -1, 68));

        panelKodeCocaCola.setBackground(new java.awt.Color(37, 42, 52));

        kodeCocaCola.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeCocaCola.setForeground(new java.awt.Color(234, 234, 234));
        kodeCocaCola.setText("A1");

        javax.swing.GroupLayout panelKodeCocaColaLayout = new javax.swing.GroupLayout(panelKodeCocaCola);
        panelKodeCocaCola.setLayout(panelKodeCocaColaLayout);
        panelKodeCocaColaLayout.setHorizontalGroup(
            panelKodeCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeCocaColaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeCocaCola)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKodeCocaColaLayout.setVerticalGroup(
            panelKodeCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeCocaColaLayout.createSequentialGroup()
                .addComponent(kodeCocaCola)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelCocaCola.add(panelKodeCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        panelHargaCocaCola.setBackground(new java.awt.Color(37, 42, 52));

        hargaCocaCola.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaCocaCola.setForeground(new java.awt.Color(255, 255, 255));
        hargaCocaCola.setText("Rp. 6.000");

        javax.swing.GroupLayout panelHargaCocaColaLayout = new javax.swing.GroupLayout(panelHargaCocaCola);
        panelHargaCocaCola.setLayout(panelHargaCocaColaLayout);
        panelHargaCocaColaLayout.setHorizontalGroup(
            panelHargaCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHargaCocaColaLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(hargaCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHargaCocaColaLayout.setVerticalGroup(
            panelHargaCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaCocaCola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelCocaCola.add(panelHargaCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 80, -1, 15));

        panelStockCocaCola.setBackground(new java.awt.Color(37, 42, 52));

        stockCocaCola.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        stockCocaCola.setForeground(new java.awt.Color(234, 234, 234));
        stockCocaCola.setText("0");
        stockCocaCola.setName("coca-cola"); // NOI18N

        javax.swing.GroupLayout panelStockCocaColaLayout = new javax.swing.GroupLayout(panelStockCocaCola);
        panelStockCocaCola.setLayout(panelStockCocaColaLayout);
        panelStockCocaColaLayout.setHorizontalGroup(
            panelStockCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockCocaColaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockCocaCola)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStockCocaColaLayout.setVerticalGroup(
            panelStockCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockCocaColaLayout.createSequentialGroup()
                .addComponent(stockCocaCola)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelCocaCola.add(panelStockCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 3, -1, -1));

        panelBackgroundMinuman.add(panelCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 100));

        panelCocaColaZero.setBackground(new java.awt.Color(234, 234, 234));
        panelCocaColaZero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cocaColaZeroImg.setForeground(new java.awt.Color(255, 255, 255));
        cocaColaZeroImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocaColaZeroImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/coca-cola-zero.png"))); // NOI18N
        panelCocaColaZero.add(cocaColaZeroImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, 48, 68));

        panelKodeCocaColaZero.setBackground(new java.awt.Color(37, 42, 52));

        kodeCocaColaZero.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeCocaColaZero.setForeground(new java.awt.Color(234, 234, 234));
        kodeCocaColaZero.setText("B1");

        javax.swing.GroupLayout panelKodeCocaColaZeroLayout = new javax.swing.GroupLayout(panelKodeCocaColaZero);
        panelKodeCocaColaZero.setLayout(panelKodeCocaColaZeroLayout);
        panelKodeCocaColaZeroLayout.setHorizontalGroup(
            panelKodeCocaColaZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeCocaColaZeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeCocaColaZero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKodeCocaColaZeroLayout.setVerticalGroup(
            panelKodeCocaColaZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeCocaColaZeroLayout.createSequentialGroup()
                .addComponent(kodeCocaColaZero)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelCocaColaZero.add(panelKodeCocaColaZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        panelHargaCocaColaZero.setBackground(new java.awt.Color(37, 42, 52));

        hargaCocaColaZero.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaCocaColaZero.setForeground(new java.awt.Color(255, 255, 255));
        hargaCocaColaZero.setText("Rp. 6.000");

        javax.swing.GroupLayout panelHargaCocaColaZeroLayout = new javax.swing.GroupLayout(panelHargaCocaColaZero);
        panelHargaCocaColaZero.setLayout(panelHargaCocaColaZeroLayout);
        panelHargaCocaColaZeroLayout.setHorizontalGroup(
            panelHargaCocaColaZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHargaCocaColaZeroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaCocaColaZero, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHargaCocaColaZeroLayout.setVerticalGroup(
            panelHargaCocaColaZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaCocaColaZero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelCocaColaZero.add(panelHargaCocaColaZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 80, -1, 15));

        panelStockCocaColaZero.setBackground(new java.awt.Color(37, 42, 52));

        stockCocaColaZero.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        stockCocaColaZero.setForeground(new java.awt.Color(234, 234, 234));
        stockCocaColaZero.setText("0");
        stockCocaColaZero.setName("coca-cola-zero"); // NOI18N

        javax.swing.GroupLayout panelStockCocaColaZeroLayout = new javax.swing.GroupLayout(panelStockCocaColaZero);
        panelStockCocaColaZero.setLayout(panelStockCocaColaZeroLayout);
        panelStockCocaColaZeroLayout.setHorizontalGroup(
            panelStockCocaColaZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockCocaColaZeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockCocaColaZero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStockCocaColaZeroLayout.setVerticalGroup(
            panelStockCocaColaZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockCocaColaZeroLayout.createSequentialGroup()
                .addComponent(stockCocaColaZero)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelCocaColaZero.add(panelStockCocaColaZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 3, -1, -1));

        panelBackgroundMinuman.add(panelCocaColaZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, 100));

        panelSprite.setBackground(new java.awt.Color(234, 234, 234));
        panelSprite.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spriteImg.setForeground(new java.awt.Color(255, 255, 255));
        spriteImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spriteImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/sprite.png"))); // NOI18N
        panelSprite.add(spriteImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, 48, 68));

        panelKodeSprite.setBackground(new java.awt.Color(37, 42, 52));

        kodeSprite.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeSprite.setForeground(new java.awt.Color(234, 234, 234));
        kodeSprite.setText("C1");

        javax.swing.GroupLayout panelKodeSpriteLayout = new javax.swing.GroupLayout(panelKodeSprite);
        panelKodeSprite.setLayout(panelKodeSpriteLayout);
        panelKodeSpriteLayout.setHorizontalGroup(
            panelKodeSpriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeSpriteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeSprite)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKodeSpriteLayout.setVerticalGroup(
            panelKodeSpriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeSpriteLayout.createSequentialGroup()
                .addComponent(kodeSprite)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelSprite.add(panelKodeSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        panelHargaSprite.setBackground(new java.awt.Color(37, 42, 52));

        hargaSprite.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaSprite.setForeground(new java.awt.Color(255, 255, 255));
        hargaSprite.setText("Rp. 6.000");

        javax.swing.GroupLayout panelHargaSpriteLayout = new javax.swing.GroupLayout(panelHargaSprite);
        panelHargaSprite.setLayout(panelHargaSpriteLayout);
        panelHargaSpriteLayout.setHorizontalGroup(
            panelHargaSpriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHargaSpriteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHargaSpriteLayout.setVerticalGroup(
            panelHargaSpriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaSprite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelSprite.add(panelHargaSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 80, -1, 15));

        panelStockSprite.setBackground(new java.awt.Color(37, 42, 52));

        stockSprite.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        stockSprite.setForeground(new java.awt.Color(234, 234, 234));
        stockSprite.setText("0");
        stockSprite.setName("sprite"); // NOI18N

        javax.swing.GroupLayout panelStockSpriteLayout = new javax.swing.GroupLayout(panelStockSprite);
        panelStockSprite.setLayout(panelStockSpriteLayout);
        panelStockSpriteLayout.setHorizontalGroup(
            panelStockSpriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockSpriteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockSprite)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStockSpriteLayout.setVerticalGroup(
            panelStockSpriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockSpriteLayout.createSequentialGroup()
                .addComponent(stockSprite)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelSprite.add(panelStockSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 3, -1, -1));

        panelBackgroundMinuman.add(panelSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 100, 100));

        panelSpriteLight.setBackground(new java.awt.Color(234, 234, 234));
        panelSpriteLight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spriteLightImg.setForeground(new java.awt.Color(255, 255, 255));
        spriteLightImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spriteLightImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/sprite-light.png"))); // NOI18N
        panelSpriteLight.add(spriteLightImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, -1, 68));

        panelKodeSpriteLight.setBackground(new java.awt.Color(37, 42, 52));

        kodeSpriteLight.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeSpriteLight.setForeground(new java.awt.Color(234, 234, 234));
        kodeSpriteLight.setText("A2");

        javax.swing.GroupLayout panelKodeSpriteLightLayout = new javax.swing.GroupLayout(panelKodeSpriteLight);
        panelKodeSpriteLight.setLayout(panelKodeSpriteLightLayout);
        panelKodeSpriteLightLayout.setHorizontalGroup(
            panelKodeSpriteLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeSpriteLightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeSpriteLight)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKodeSpriteLightLayout.setVerticalGroup(
            panelKodeSpriteLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeSpriteLightLayout.createSequentialGroup()
                .addComponent(kodeSpriteLight)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelSpriteLight.add(panelKodeSpriteLight, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        panelHargaSpriteLight.setBackground(new java.awt.Color(37, 42, 52));

        hargaSpriteLight.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaSpriteLight.setForeground(new java.awt.Color(255, 255, 255));
        hargaSpriteLight.setText("Rp. 6.000");

        javax.swing.GroupLayout panelHargaSpriteLightLayout = new javax.swing.GroupLayout(panelHargaSpriteLight);
        panelHargaSpriteLight.setLayout(panelHargaSpriteLightLayout);
        panelHargaSpriteLightLayout.setHorizontalGroup(
            panelHargaSpriteLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHargaSpriteLightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaSpriteLight, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHargaSpriteLightLayout.setVerticalGroup(
            panelHargaSpriteLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaSpriteLight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelSpriteLight.add(panelHargaSpriteLight, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 15));

        panelStockSpriteLight.setBackground(new java.awt.Color(37, 42, 52));

        stockSpriteLight.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        stockSpriteLight.setForeground(new java.awt.Color(234, 234, 234));
        stockSpriteLight.setText("0");
        stockSpriteLight.setName("sprite-light"); // NOI18N

        javax.swing.GroupLayout panelStockSpriteLightLayout = new javax.swing.GroupLayout(panelStockSpriteLight);
        panelStockSpriteLight.setLayout(panelStockSpriteLightLayout);
        panelStockSpriteLightLayout.setHorizontalGroup(
            panelStockSpriteLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockSpriteLightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockSpriteLight)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStockSpriteLightLayout.setVerticalGroup(
            panelStockSpriteLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockSpriteLightLayout.createSequentialGroup()
                .addComponent(stockSpriteLight)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelSpriteLight.add(panelStockSpriteLight, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 3, -1, -1));

        panelBackgroundMinuman.add(panelSpriteLight, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 100));

        panelFantaStrawberry.setBackground(new java.awt.Color(234, 234, 234));
        panelFantaStrawberry.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fantaStrawberryImg.setForeground(new java.awt.Color(255, 255, 255));
        fantaStrawberryImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fantaStrawberryImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/fanta-strawberry.png"))); // NOI18N
        panelFantaStrawberry.add(fantaStrawberryImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, 48, 68));

        panelKodeFantaStrawberry.setBackground(new java.awt.Color(37, 42, 52));

        kodeFantaStrawberry.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeFantaStrawberry.setForeground(new java.awt.Color(234, 234, 234));
        kodeFantaStrawberry.setText("B2");

        javax.swing.GroupLayout panelKodeFantaStrawberryLayout = new javax.swing.GroupLayout(panelKodeFantaStrawberry);
        panelKodeFantaStrawberry.setLayout(panelKodeFantaStrawberryLayout);
        panelKodeFantaStrawberryLayout.setHorizontalGroup(
            panelKodeFantaStrawberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeFantaStrawberryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeFantaStrawberry)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKodeFantaStrawberryLayout.setVerticalGroup(
            panelKodeFantaStrawberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeFantaStrawberryLayout.createSequentialGroup()
                .addComponent(kodeFantaStrawberry)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelFantaStrawberry.add(panelKodeFantaStrawberry, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        panelHargaFantaStrawberry.setBackground(new java.awt.Color(37, 42, 52));

        hargaFantaStrawberry.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaFantaStrawberry.setForeground(new java.awt.Color(255, 255, 255));
        hargaFantaStrawberry.setText("Rp. 6.000");

        javax.swing.GroupLayout panelHargaFantaStrawberryLayout = new javax.swing.GroupLayout(panelHargaFantaStrawberry);
        panelHargaFantaStrawberry.setLayout(panelHargaFantaStrawberryLayout);
        panelHargaFantaStrawberryLayout.setHorizontalGroup(
            panelHargaFantaStrawberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHargaFantaStrawberryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaFantaStrawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHargaFantaStrawberryLayout.setVerticalGroup(
            panelHargaFantaStrawberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaFantaStrawberry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelFantaStrawberry.add(panelHargaFantaStrawberry, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 15));

        panelStockFantaStrawberry.setBackground(new java.awt.Color(37, 42, 52));

        stockFantaStrawberry.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        stockFantaStrawberry.setForeground(new java.awt.Color(234, 234, 234));
        stockFantaStrawberry.setText("0");
        stockFantaStrawberry.setName("fanta-strawberry"); // NOI18N

        javax.swing.GroupLayout panelStockFantaStrawberryLayout = new javax.swing.GroupLayout(panelStockFantaStrawberry);
        panelStockFantaStrawberry.setLayout(panelStockFantaStrawberryLayout);
        panelStockFantaStrawberryLayout.setHorizontalGroup(
            panelStockFantaStrawberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockFantaStrawberryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockFantaStrawberry)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStockFantaStrawberryLayout.setVerticalGroup(
            panelStockFantaStrawberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockFantaStrawberryLayout.createSequentialGroup()
                .addComponent(stockFantaStrawberry)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelFantaStrawberry.add(panelStockFantaStrawberry, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 3, -1, -1));

        panelBackgroundMinuman.add(panelFantaStrawberry, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 100, 100));

        panelFantaOrange.setBackground(new java.awt.Color(234, 234, 234));
        panelFantaOrange.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fantaOrangeImg.setForeground(new java.awt.Color(255, 255, 255));
        fantaOrangeImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fantaOrangeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/fanta-orange.png"))); // NOI18N
        panelFantaOrange.add(fantaOrangeImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, 48, 68));

        panelKodeFantaOrange.setBackground(new java.awt.Color(37, 42, 52));

        kodeFantaOrange.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeFantaOrange.setForeground(new java.awt.Color(234, 234, 234));
        kodeFantaOrange.setText("C2");

        javax.swing.GroupLayout panelKodeFantaOrangeLayout = new javax.swing.GroupLayout(panelKodeFantaOrange);
        panelKodeFantaOrange.setLayout(panelKodeFantaOrangeLayout);
        panelKodeFantaOrangeLayout.setHorizontalGroup(
            panelKodeFantaOrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeFantaOrangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeFantaOrange)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKodeFantaOrangeLayout.setVerticalGroup(
            panelKodeFantaOrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeFantaOrangeLayout.createSequentialGroup()
                .addComponent(kodeFantaOrange)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelFantaOrange.add(panelKodeFantaOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        panelHargaFantaOrange.setBackground(new java.awt.Color(37, 42, 52));

        hargaFantaOrange.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaFantaOrange.setForeground(new java.awt.Color(255, 255, 255));
        hargaFantaOrange.setText("Rp. 6.000");

        javax.swing.GroupLayout panelHargaFantaOrangeLayout = new javax.swing.GroupLayout(panelHargaFantaOrange);
        panelHargaFantaOrange.setLayout(panelHargaFantaOrangeLayout);
        panelHargaFantaOrangeLayout.setHorizontalGroup(
            panelHargaFantaOrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHargaFantaOrangeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaFantaOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHargaFantaOrangeLayout.setVerticalGroup(
            panelHargaFantaOrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaFantaOrange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelFantaOrange.add(panelHargaFantaOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 15));

        panelStockFantaOrange.setBackground(new java.awt.Color(37, 42, 52));

        stockFantaOrange.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        stockFantaOrange.setForeground(new java.awt.Color(234, 234, 234));
        stockFantaOrange.setText("0");
        stockFantaOrange.setName("fanta-orange"); // NOI18N

        javax.swing.GroupLayout panelStockFantaOrangeLayout = new javax.swing.GroupLayout(panelStockFantaOrange);
        panelStockFantaOrange.setLayout(panelStockFantaOrangeLayout);
        panelStockFantaOrangeLayout.setHorizontalGroup(
            panelStockFantaOrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockFantaOrangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockFantaOrange)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStockFantaOrangeLayout.setVerticalGroup(
            panelStockFantaOrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockFantaOrangeLayout.createSequentialGroup()
                .addComponent(stockFantaOrange)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelFantaOrange.add(panelStockFantaOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 3, -1, -1));

        panelBackgroundMinuman.add(panelFantaOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 100, 100));

        panelPocariSweat.setBackground(new java.awt.Color(234, 234, 234));
        panelPocariSweat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PocariSweatImg.setForeground(new java.awt.Color(255, 255, 255));
        PocariSweatImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PocariSweatImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/pocari-sweat.png"))); // NOI18N
        panelPocariSweat.add(PocariSweatImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, 48, 68));

        panelKodePocariSweat.setBackground(new java.awt.Color(37, 42, 52));

        kodePocariSweat.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodePocariSweat.setForeground(new java.awt.Color(234, 234, 234));
        kodePocariSweat.setText("A3");

        javax.swing.GroupLayout panelKodePocariSweatLayout = new javax.swing.GroupLayout(panelKodePocariSweat);
        panelKodePocariSweat.setLayout(panelKodePocariSweatLayout);
        panelKodePocariSweatLayout.setHorizontalGroup(
            panelKodePocariSweatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodePocariSweatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodePocariSweat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKodePocariSweatLayout.setVerticalGroup(
            panelKodePocariSweatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodePocariSweatLayout.createSequentialGroup()
                .addComponent(kodePocariSweat)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelPocariSweat.add(panelKodePocariSweat, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        panelHargaPocariSweat.setBackground(new java.awt.Color(37, 42, 52));

        hargaPocariSweat.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaPocariSweat.setForeground(new java.awt.Color(255, 255, 255));
        hargaPocariSweat.setText("Rp. 7.000");

        javax.swing.GroupLayout panelHargaPocariSweatLayout = new javax.swing.GroupLayout(panelHargaPocariSweat);
        panelHargaPocariSweat.setLayout(panelHargaPocariSweatLayout);
        panelHargaPocariSweatLayout.setHorizontalGroup(
            panelHargaPocariSweatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHargaPocariSweatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaPocariSweat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHargaPocariSweatLayout.setVerticalGroup(
            panelHargaPocariSweatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaPocariSweat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelPocariSweat.add(panelHargaPocariSweat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 15));

        panelStockPocariSweat.setBackground(new java.awt.Color(37, 42, 52));

        stockPocariSweat.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        stockPocariSweat.setForeground(new java.awt.Color(234, 234, 234));
        stockPocariSweat.setText("0");
        stockPocariSweat.setName("pocari-sweat"); // NOI18N

        javax.swing.GroupLayout panelStockPocariSweatLayout = new javax.swing.GroupLayout(panelStockPocariSweat);
        panelStockPocariSweat.setLayout(panelStockPocariSweatLayout);
        panelStockPocariSweatLayout.setHorizontalGroup(
            panelStockPocariSweatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockPocariSweatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockPocariSweat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStockPocariSweatLayout.setVerticalGroup(
            panelStockPocariSweatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockPocariSweatLayout.createSequentialGroup()
                .addComponent(stockPocariSweat)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelPocariSweat.add(panelStockPocariSweat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 3, -1, -1));

        panelBackgroundMinuman.add(panelPocariSweat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 100));

        panelCapPanda.setBackground(new java.awt.Color(234, 234, 234));
        panelCapPanda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        capPandaImg.setForeground(new java.awt.Color(255, 255, 255));
        capPandaImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        capPandaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/cap-panda.png"))); // NOI18N
        panelCapPanda.add(capPandaImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, -1, 68));

        panelKodeCapPanda.setBackground(new java.awt.Color(37, 42, 52));

        kodeCapPanda.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeCapPanda.setForeground(new java.awt.Color(234, 234, 234));
        kodeCapPanda.setText("B3");

        javax.swing.GroupLayout panelKodeCapPandaLayout = new javax.swing.GroupLayout(panelKodeCapPanda);
        panelKodeCapPanda.setLayout(panelKodeCapPandaLayout);
        panelKodeCapPandaLayout.setHorizontalGroup(
            panelKodeCapPandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeCapPandaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeCapPanda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKodeCapPandaLayout.setVerticalGroup(
            panelKodeCapPandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeCapPandaLayout.createSequentialGroup()
                .addComponent(kodeCapPanda)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelCapPanda.add(panelKodeCapPanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        panelHargaCapPanda.setBackground(new java.awt.Color(37, 42, 52));

        hargaCapPanda.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaCapPanda.setForeground(new java.awt.Color(255, 255, 255));
        hargaCapPanda.setText("Rp. 7.000");

        javax.swing.GroupLayout panelHargaCapPandaLayout = new javax.swing.GroupLayout(panelHargaCapPanda);
        panelHargaCapPanda.setLayout(panelHargaCapPandaLayout);
        panelHargaCapPandaLayout.setHorizontalGroup(
            panelHargaCapPandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHargaCapPandaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaCapPanda, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHargaCapPandaLayout.setVerticalGroup(
            panelHargaCapPandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaCapPanda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelCapPanda.add(panelHargaCapPanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 15));

        panelStockCapPanda.setBackground(new java.awt.Color(37, 42, 52));

        stockCapPanda.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        stockCapPanda.setForeground(new java.awt.Color(234, 234, 234));
        stockCapPanda.setText("0");
        stockCapPanda.setName("cap-panda"); // NOI18N

        javax.swing.GroupLayout panelStockCapPandaLayout = new javax.swing.GroupLayout(panelStockCapPanda);
        panelStockCapPanda.setLayout(panelStockCapPandaLayout);
        panelStockCapPandaLayout.setHorizontalGroup(
            panelStockCapPandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockCapPandaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockCapPanda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStockCapPandaLayout.setVerticalGroup(
            panelStockCapPandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockCapPandaLayout.createSequentialGroup()
                .addComponent(stockCapPanda)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelCapPanda.add(panelStockCapPanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 3, -1, -1));

        panelBackgroundMinuman.add(panelCapPanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 100, 100));

        panelGreenSands.setBackground(new java.awt.Color(234, 234, 234));
        panelGreenSands.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        greenSandsImg.setForeground(new java.awt.Color(255, 255, 255));
        greenSandsImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greenSandsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/green-sands.png"))); // NOI18N
        panelGreenSands.add(greenSandsImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, 48, 68));

        panelKodeGreenSands.setBackground(new java.awt.Color(37, 42, 52));

        kodeGreenSands.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeGreenSands.setForeground(new java.awt.Color(234, 234, 234));
        kodeGreenSands.setText("C3");

        javax.swing.GroupLayout panelKodeGreenSandsLayout = new javax.swing.GroupLayout(panelKodeGreenSands);
        panelKodeGreenSands.setLayout(panelKodeGreenSandsLayout);
        panelKodeGreenSandsLayout.setHorizontalGroup(
            panelKodeGreenSandsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeGreenSandsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeGreenSands)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKodeGreenSandsLayout.setVerticalGroup(
            panelKodeGreenSandsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeGreenSandsLayout.createSequentialGroup()
                .addComponent(kodeGreenSands)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelGreenSands.add(panelKodeGreenSands, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        panelHargaGreenSands.setBackground(new java.awt.Color(37, 42, 52));

        hargaGreenSands.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaGreenSands.setForeground(new java.awt.Color(255, 255, 255));
        hargaGreenSands.setText("Rp. 7.000");

        javax.swing.GroupLayout panelHargaGreenSandsLayout = new javax.swing.GroupLayout(panelHargaGreenSands);
        panelHargaGreenSands.setLayout(panelHargaGreenSandsLayout);
        panelHargaGreenSandsLayout.setHorizontalGroup(
            panelHargaGreenSandsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHargaGreenSandsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaGreenSands, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHargaGreenSandsLayout.setVerticalGroup(
            panelHargaGreenSandsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaGreenSands, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelGreenSands.add(panelHargaGreenSands, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 15));

        panelStockGreenSands.setBackground(new java.awt.Color(37, 42, 52));

        stockGreenSands.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        stockGreenSands.setForeground(new java.awt.Color(234, 234, 234));
        stockGreenSands.setText("0");
        stockGreenSands.setName("green-sands"); // NOI18N

        javax.swing.GroupLayout panelStockGreenSandsLayout = new javax.swing.GroupLayout(panelStockGreenSands);
        panelStockGreenSands.setLayout(panelStockGreenSandsLayout);
        panelStockGreenSandsLayout.setHorizontalGroup(
            panelStockGreenSandsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockGreenSandsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockGreenSands)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStockGreenSandsLayout.setVerticalGroup(
            panelStockGreenSandsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockGreenSandsLayout.createSequentialGroup()
                .addComponent(stockGreenSands)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelGreenSands.add(panelStockGreenSands, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 3, -1, -1));

        panelBackgroundMinuman.add(panelGreenSands, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 100, 100));

        panelNescafeOriginal.setBackground(new java.awt.Color(234, 234, 234));
        panelNescafeOriginal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nescafeOriginalImg.setForeground(new java.awt.Color(255, 255, 255));
        nescafeOriginalImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nescafeOriginalImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/nescafe-original.png"))); // NOI18N
        panelNescafeOriginal.add(nescafeOriginalImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, 48, 68));

        panelKodeNescafeOriginal.setBackground(new java.awt.Color(37, 42, 52));

        kodeNescafeOriginal.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeNescafeOriginal.setForeground(new java.awt.Color(234, 234, 234));
        kodeNescafeOriginal.setText("A4");

        javax.swing.GroupLayout panelKodeNescafeOriginalLayout = new javax.swing.GroupLayout(panelKodeNescafeOriginal);
        panelKodeNescafeOriginal.setLayout(panelKodeNescafeOriginalLayout);
        panelKodeNescafeOriginalLayout.setHorizontalGroup(
            panelKodeNescafeOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeNescafeOriginalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeNescafeOriginal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKodeNescafeOriginalLayout.setVerticalGroup(
            panelKodeNescafeOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeNescafeOriginalLayout.createSequentialGroup()
                .addComponent(kodeNescafeOriginal)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelNescafeOriginal.add(panelKodeNescafeOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        panelHargaNescafeOriginal.setBackground(new java.awt.Color(37, 42, 52));

        hargaNescafeOriginal.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaNescafeOriginal.setForeground(new java.awt.Color(255, 255, 255));
        hargaNescafeOriginal.setText("Rp. 8.000");

        javax.swing.GroupLayout panelHargaNescafeOriginalLayout = new javax.swing.GroupLayout(panelHargaNescafeOriginal);
        panelHargaNescafeOriginal.setLayout(panelHargaNescafeOriginalLayout);
        panelHargaNescafeOriginalLayout.setHorizontalGroup(
            panelHargaNescafeOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHargaNescafeOriginalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaNescafeOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHargaNescafeOriginalLayout.setVerticalGroup(
            panelHargaNescafeOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaNescafeOriginal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelNescafeOriginal.add(panelHargaNescafeOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 80, -1, 15));

        panelStockNescafeOriginal.setBackground(new java.awt.Color(37, 42, 52));

        stockNescafeOriginal.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        stockNescafeOriginal.setForeground(new java.awt.Color(234, 234, 234));
        stockNescafeOriginal.setText("0");
        stockNescafeOriginal.setName("nescafe-original"); // NOI18N

        javax.swing.GroupLayout panelStockNescafeOriginalLayout = new javax.swing.GroupLayout(panelStockNescafeOriginal);
        panelStockNescafeOriginal.setLayout(panelStockNescafeOriginalLayout);
        panelStockNescafeOriginalLayout.setHorizontalGroup(
            panelStockNescafeOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockNescafeOriginalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockNescafeOriginal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStockNescafeOriginalLayout.setVerticalGroup(
            panelStockNescafeOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockNescafeOriginalLayout.createSequentialGroup()
                .addComponent(stockNescafeOriginal)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelNescafeOriginal.add(panelStockNescafeOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 3, -1, -1));

        panelBackgroundMinuman.add(panelNescafeOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, 100));

        panelNescafeLatte.setBackground(new java.awt.Color(234, 234, 234));
        panelNescafeLatte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nescafeLatteImg.setForeground(new java.awt.Color(255, 255, 255));
        nescafeLatteImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nescafeLatteImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/nescafe-latte.png"))); // NOI18N
        panelNescafeLatte.add(nescafeLatteImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, 48, 68));

        panelKodeNescafeLatte.setBackground(new java.awt.Color(37, 42, 52));

        kodeNescafeLatte.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeNescafeLatte.setForeground(new java.awt.Color(234, 234, 234));
        kodeNescafeLatte.setText("B4");

        javax.swing.GroupLayout panelKodeNescafeLatteLayout = new javax.swing.GroupLayout(panelKodeNescafeLatte);
        panelKodeNescafeLatte.setLayout(panelKodeNescafeLatteLayout);
        panelKodeNescafeLatteLayout.setHorizontalGroup(
            panelKodeNescafeLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeNescafeLatteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeNescafeLatte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKodeNescafeLatteLayout.setVerticalGroup(
            panelKodeNescafeLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeNescafeLatteLayout.createSequentialGroup()
                .addComponent(kodeNescafeLatte)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelNescafeLatte.add(panelKodeNescafeLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        panelHargaNescafeLatte.setBackground(new java.awt.Color(37, 42, 52));

        hargaNescafeLatte.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaNescafeLatte.setForeground(new java.awt.Color(255, 255, 255));
        hargaNescafeLatte.setText("Rp. 8.000");

        javax.swing.GroupLayout panelHargaNescafeLatteLayout = new javax.swing.GroupLayout(panelHargaNescafeLatte);
        panelHargaNescafeLatte.setLayout(panelHargaNescafeLatteLayout);
        panelHargaNescafeLatteLayout.setHorizontalGroup(
            panelHargaNescafeLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHargaNescafeLatteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaNescafeLatte, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHargaNescafeLatteLayout.setVerticalGroup(
            panelHargaNescafeLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaNescafeLatte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelNescafeLatte.add(panelHargaNescafeLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 80, -1, 15));

        panelStockNescafeLatte.setBackground(new java.awt.Color(37, 42, 52));

        stockNescafeLatte.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        stockNescafeLatte.setForeground(new java.awt.Color(234, 234, 234));
        stockNescafeLatte.setText("0");
        stockNescafeLatte.setName("nescafe-latte"); // NOI18N

        javax.swing.GroupLayout panelStockNescafeLatteLayout = new javax.swing.GroupLayout(panelStockNescafeLatte);
        panelStockNescafeLatte.setLayout(panelStockNescafeLatteLayout);
        panelStockNescafeLatteLayout.setHorizontalGroup(
            panelStockNescafeLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockNescafeLatteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockNescafeLatte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStockNescafeLatteLayout.setVerticalGroup(
            panelStockNescafeLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockNescafeLatteLayout.createSequentialGroup()
                .addComponent(stockNescafeLatte)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelNescafeLatte.add(panelStockNescafeLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 3, -1, -1));

        panelBackgroundMinuman.add(panelNescafeLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 100, 100));

        panelNescafeMocha.setBackground(new java.awt.Color(234, 234, 234));
        panelNescafeMocha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nescafeMochaImg.setForeground(new java.awt.Color(255, 255, 255));
        nescafeMochaImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nescafeMochaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/images/nescafe-mocha.png"))); // NOI18N
        panelNescafeMocha.add(nescafeMochaImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, 48, 68));

        panelKodeNescafeMocha.setBackground(new java.awt.Color(37, 42, 52));

        kodeNescafeMocha.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        kodeNescafeMocha.setForeground(new java.awt.Color(234, 234, 234));
        kodeNescafeMocha.setText("C4");

        javax.swing.GroupLayout panelKodeNescafeMochaLayout = new javax.swing.GroupLayout(panelKodeNescafeMocha);
        panelKodeNescafeMocha.setLayout(panelKodeNescafeMochaLayout);
        panelKodeNescafeMochaLayout.setHorizontalGroup(
            panelKodeNescafeMochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeNescafeMochaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeNescafeMocha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKodeNescafeMochaLayout.setVerticalGroup(
            panelKodeNescafeMochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKodeNescafeMochaLayout.createSequentialGroup()
                .addComponent(kodeNescafeMocha)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelNescafeMocha.add(panelKodeNescafeMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        panelHargaNescafeMocha.setBackground(new java.awt.Color(37, 42, 52));

        hargaNescafeMocha.setFont(new java.awt.Font("Montserrat", 1, 8)); // NOI18N
        hargaNescafeMocha.setForeground(new java.awt.Color(255, 255, 255));
        hargaNescafeMocha.setText("Rp. 8.000");

        javax.swing.GroupLayout panelHargaNescafeMochaLayout = new javax.swing.GroupLayout(panelHargaNescafeMocha);
        panelHargaNescafeMocha.setLayout(panelHargaNescafeMochaLayout);
        panelHargaNescafeMochaLayout.setHorizontalGroup(
            panelHargaNescafeMochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHargaNescafeMochaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hargaNescafeMocha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHargaNescafeMochaLayout.setVerticalGroup(
            panelHargaNescafeMochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hargaNescafeMocha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelNescafeMocha.add(panelHargaNescafeMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 80, -1, 15));

        panelStockNescafeMocha.setBackground(new java.awt.Color(37, 42, 52));

        stockNescafeMocha.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        stockNescafeMocha.setForeground(new java.awt.Color(234, 234, 234));
        stockNescafeMocha.setText("0");
        stockNescafeMocha.setName("nescafe-mocha"); // NOI18N

        javax.swing.GroupLayout panelStockNescafeMochaLayout = new javax.swing.GroupLayout(panelStockNescafeMocha);
        panelStockNescafeMocha.setLayout(panelStockNescafeMochaLayout);
        panelStockNescafeMochaLayout.setHorizontalGroup(
            panelStockNescafeMochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockNescafeMochaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockNescafeMocha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStockNescafeMochaLayout.setVerticalGroup(
            panelStockNescafeMochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockNescafeMochaLayout.createSequentialGroup()
                .addComponent(stockNescafeMocha)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelNescafeMocha.add(panelStockNescafeMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 3, -1, -1));

        panelBackgroundMinuman.add(panelNescafeMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 100, 100));

        panelOutput.setBackground(new java.awt.Color(60, 255, 138));
        panelOutput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelOutput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelOutputMouseClicked(evt);
            }
        });
        panelOutput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelgetItem.setBackground(new java.awt.Color(234, 234, 234));
        panelgetItem.setForeground(new java.awt.Color(0, 0, 0));
        panelgetItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelgetItemLayout = new javax.swing.GroupLayout(panelgetItem);
        panelgetItem.setLayout(panelgetItemLayout);
        panelgetItemLayout.setHorizontalGroup(
            panelgetItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelgetItemLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(labelOutput)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        panelgetItemLayout.setVerticalGroup(
            panelgetItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelgetItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelOutput)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelOutput.add(panelgetItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 30));

        getItemLabel.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        getItemLabel.setForeground(new java.awt.Color(37, 42, 52));
        getItemLabel.setText("Ambil Disini");
        panelOutput.add(getItemLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

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

        panelInformation.setBackground(new java.awt.Color(234, 234, 234));
        panelInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saldoLabel.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        saldoLabel.setForeground(new java.awt.Color(37, 42, 52));
        saldoLabel.setText("Saldo :");
        panelInformation.add(saldoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, -1, -1));

        labelCurrentSaldo.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        labelCurrentSaldo.setForeground(new java.awt.Color(37, 42, 52));
        labelCurrentSaldo.setText("Rp. 0");
        panelInformation.add(labelCurrentSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 12, -1, -1));
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
                        .addComponent(panelBackgroundMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(panelOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(panelBackgroundMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(panelOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void panelEnterMoneyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEnterMoneyMouseClicked
		controller.enterMoney();
		labelCurrentSaldo.setText(controller.currentSaldo());
    }//GEN-LAST:event_panelEnterMoneyMouseClicked

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
		itemLabel.setText(controller.typingKode("4"));
    }//GEN-LAST:event_bt4ActionPerformed

    private void btBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBActionPerformed
		itemLabel.setText(controller.typingKode("B"));
    }//GEN-LAST:event_btBActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
		itemLabel.setText(controller.typingKode("2"));
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
		itemLabel.setText(controller.typingKode("3"));
    }//GEN-LAST:event_bt3ActionPerformed

    private void btEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnterActionPerformed
		//Jika Tidak Ada Error
		if (controller.selectItem()) {
			itemLabel.setText("");	//reset label input kode
			getItemLabel.setVisible(true); //tampilkan label "Ambil Disini"
			showImageOutput(controller.getSlug()); //tampilkan gambar di output
			labelCurrentSaldo.setText(controller.currentSaldo()); //refresh saldo user
			getStockBarang(true);
		}
    }//GEN-LAST:event_btEnterActionPerformed

	private void showImageOutput(String slug) {
		try {
			BufferedImage original = ImageIO.read(getClass().getResource("/vendingmachine/images/" + slug + ".png"));
			BufferedImage rotate = controller.rotateImg(original, -90.0d);
			labelOutput.setIcon(new ImageIcon(rotate));
		} catch (IOException ex) {
			Logger.getLogger(vMachineUI.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
		itemLabel.setText(controller.deleteKode());
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAActionPerformed
		itemLabel.setText(controller.typingKode("A"));
    }//GEN-LAST:event_btAActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
		itemLabel.setText(controller.typingKode("1"));
    }//GEN-LAST:event_bt1ActionPerformed

    private void btCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCActionPerformed
		itemLabel.setText(controller.typingKode("C"));
    }//GEN-LAST:event_btCActionPerformed

    private void panelOutputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutputMouseClicked
		getItemLabel.setVisible(false);
		labelOutput.setIcon(null);
    }//GEN-LAST:event_panelOutputMouseClicked

	private void getStockBarang(boolean refreshBarang) {
		controller.setStockBarang(refreshBarang, stockCocaCola, stockCocaColaZero, stockSprite, stockSpriteLight, stockFantaStrawberry, stockFantaOrange, stockPocariSweat, stockCapPanda, stockGreenSands, stockNescafeOriginal, stockNescafeLatte, stockNescafeMocha);
	}

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
			java.util.logging.Logger.getLogger(vMachineUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(vMachineUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(vMachineUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(vMachineUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new vMachineUI().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PocariSweatImg;
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
    private javax.swing.JLabel cocaColaZeroImg;
    private javax.swing.JLabel enterMoneyIcon;
    private javax.swing.JLabel enterMoneyLabel;
    private javax.swing.JLabel fantaOrangeImg;
    private javax.swing.JLabel fantaStrawberryImg;
    private javax.swing.JLabel getItemLabel;
    private javax.swing.JLabel greenSandsImg;
    private javax.swing.JLabel hargaCapPanda;
    private javax.swing.JLabel hargaCocaCola;
    private javax.swing.JLabel hargaCocaColaZero;
    private javax.swing.JLabel hargaFantaOrange;
    private javax.swing.JLabel hargaFantaStrawberry;
    private javax.swing.JLabel hargaGreenSands;
    private javax.swing.JLabel hargaNescafeLatte;
    private javax.swing.JLabel hargaNescafeMocha;
    private javax.swing.JLabel hargaNescafeOriginal;
    private javax.swing.JLabel hargaPocariSweat;
    private javax.swing.JLabel hargaSprite;
    private javax.swing.JLabel hargaSpriteLight;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JLabel kodeCapPanda;
    private javax.swing.JLabel kodeCocaCola;
    private javax.swing.JLabel kodeCocaColaZero;
    private javax.swing.JLabel kodeFantaOrange;
    private javax.swing.JLabel kodeFantaStrawberry;
    private javax.swing.JLabel kodeGreenSands;
    private javax.swing.JLabel kodeMinumanLabel;
    private javax.swing.JLabel kodeNescafeLatte;
    private javax.swing.JLabel kodeNescafeMocha;
    private javax.swing.JLabel kodeNescafeOriginal;
    private javax.swing.JLabel kodePocariSweat;
    private javax.swing.JLabel kodeSprite;
    private javax.swing.JLabel kodeSpriteLight;
    private javax.swing.JLabel labelCurrentSaldo;
    private javax.swing.JLabel labelOutput;
    private javax.swing.JLabel nescafeLatteImg;
    private javax.swing.JLabel nescafeMochaImg;
    private javax.swing.JLabel nescafeOriginalImg;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelBackgroundMinuman;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel panelCapPanda;
    private javax.swing.JPanel panelCocaCola;
    private javax.swing.JPanel panelCocaColaZero;
    private javax.swing.JPanel panelEnterMoney;
    private javax.swing.JPanel panelFantaOrange;
    private javax.swing.JPanel panelFantaStrawberry;
    private javax.swing.JPanel panelGreenSands;
    private javax.swing.JPanel panelHargaCapPanda;
    private javax.swing.JPanel panelHargaCocaCola;
    private javax.swing.JPanel panelHargaCocaColaZero;
    private javax.swing.JPanel panelHargaFantaOrange;
    private javax.swing.JPanel panelHargaFantaStrawberry;
    private javax.swing.JPanel panelHargaGreenSands;
    private javax.swing.JPanel panelHargaNescafeLatte;
    private javax.swing.JPanel panelHargaNescafeMocha;
    private javax.swing.JPanel panelHargaNescafeOriginal;
    private javax.swing.JPanel panelHargaPocariSweat;
    private javax.swing.JPanel panelHargaSprite;
    private javax.swing.JPanel panelHargaSpriteLight;
    private javax.swing.JPanel panelInformation;
    private javax.swing.JPanel panelKodeCapPanda;
    private javax.swing.JPanel panelKodeCocaCola;
    private javax.swing.JPanel panelKodeCocaColaZero;
    private javax.swing.JPanel panelKodeFantaOrange;
    private javax.swing.JPanel panelKodeFantaStrawberry;
    private javax.swing.JPanel panelKodeGreenSands;
    private javax.swing.JPanel panelKodeNescafeLatte;
    private javax.swing.JPanel panelKodeNescafeMocha;
    private javax.swing.JPanel panelKodeNescafeOriginal;
    private javax.swing.JPanel panelKodePocariSweat;
    private javax.swing.JPanel panelKodeSprite;
    private javax.swing.JPanel panelKodeSpriteLight;
    private javax.swing.JPanel panelNescafeLatte;
    private javax.swing.JPanel panelNescafeMocha;
    private javax.swing.JPanel panelNescafeOriginal;
    private javax.swing.JPanel panelOutput;
    private javax.swing.JPanel panelPocariSweat;
    private javax.swing.JPanel panelSprite;
    private javax.swing.JPanel panelSpriteLight;
    private javax.swing.JPanel panelStockCapPanda;
    private javax.swing.JPanel panelStockCocaCola;
    private javax.swing.JPanel panelStockCocaColaZero;
    private javax.swing.JPanel panelStockFantaOrange;
    private javax.swing.JPanel panelStockFantaStrawberry;
    private javax.swing.JPanel panelStockGreenSands;
    private javax.swing.JPanel panelStockNescafeLatte;
    private javax.swing.JPanel panelStockNescafeMocha;
    private javax.swing.JPanel panelStockNescafeOriginal;
    private javax.swing.JPanel panelStockPocariSweat;
    private javax.swing.JPanel panelStockSprite;
    private javax.swing.JPanel panelStockSpriteLight;
    private javax.swing.JPanel panelgetItem;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel spriteImg;
    private javax.swing.JLabel spriteLightImg;
    private javax.swing.JLabel stockCapPanda;
    private javax.swing.JLabel stockCocaCola;
    private javax.swing.JLabel stockCocaColaZero;
    private javax.swing.JLabel stockFantaOrange;
    private javax.swing.JLabel stockFantaStrawberry;
    private javax.swing.JLabel stockGreenSands;
    private javax.swing.JLabel stockNescafeLatte;
    private javax.swing.JLabel stockNescafeMocha;
    private javax.swing.JLabel stockNescafeOriginal;
    private javax.swing.JLabel stockPocariSweat;
    private javax.swing.JLabel stockSprite;
    private javax.swing.JLabel stockSpriteLight;
    // End of variables declaration//GEN-END:variables
}
