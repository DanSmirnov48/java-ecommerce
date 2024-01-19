package views;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executors;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import models.DBManager;
import models.Enums.ProductType;
import models.Product;
import models.RoundedPanel;
import models.SortMap;
import models.User;

public final class VisitorView extends javax.swing.JFrame {

    private final HashMap<Integer, Product> products;
    private final CardLayout cardLayout;
    private User loggedInUser = null;
    int xy, xx;
    
    public VisitorView(User user) {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        products = new DBManager().loadProducts();
        cardLayout = (CardLayout) pnlRight.getLayout();
        jScrollPane2.setBorder(null);
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(10);
        
        loggedInUser = user;
        jLabel33.setText(greetTimeMsg() + user.getFirstName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTop = new javax.swing.JPanel();
        pnlActions = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMaximize = new javax.swing.JLabel();
        pnlParent = new javax.swing.JPanel();
        pnlRight = new javax.swing.JPanel();
        pnlMain = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnlShop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlProducts = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ProductsTableSearchTxt = new javax.swing.JTextField();
        ProductsTableSearchBtn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        pnlLoading = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nice Cock");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        pnlTop.setBackground(new java.awt.Color(11, 7, 17));
        pnlTop.setPreferredSize(new java.awt.Dimension(800, 30));
        pnlTop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlTopMouseDragged(evt);
            }
        });
        pnlTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTopMousePressed(evt);
            }
        });
        pnlTop.setLayout(new java.awt.BorderLayout());

        pnlActions.setBackground(new java.awt.Color(11, 7, 17));
        pnlActions.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_minus_18px_1.png"))); // NOI18N
        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMinimizeMousePressed(evt);
            }
        });
        pnlActions.add(lblMinimize);

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_multiply_18px_1.png"))); // NOI18N
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
        });
        pnlActions.add(lblClose);

        lblMaximize.setPreferredSize(new java.awt.Dimension(10, 10));
        lblMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMaximizeMousePressed(evt);
            }
        });
        pnlActions.add(lblMaximize);

        pnlTop.add(pnlActions, java.awt.BorderLayout.LINE_END);

        getContentPane().add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlParent.setLayout(new java.awt.BorderLayout());

        pnlRight.setLayout(new java.awt.CardLayout());

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profilePic.png"))); // NOI18N
        pnlMain.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, 180));

        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 0, 25)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlMain.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 620, 70));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/viewShop.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlMain.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 370, 90));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginPage.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnlMain.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 370, 90));

        pnlRight.add(pnlMain, "Main");

        pnlShop.setBackground(new java.awt.Color(11, 7, 17));
        pnlShop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_left_25px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        pnlShop.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 53, 40));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlProducts.setBackground(new java.awt.Color(255, 255, 255));
        pnlProducts.setPreferredSize(new java.awt.Dimension(800, 400));

        javax.swing.GroupLayout pnlProductsLayout = new javax.swing.GroupLayout(pnlProducts);
        pnlProducts.setLayout(pnlProductsLayout);
        pnlProductsLayout.setHorizontalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1268, Short.MAX_VALUE)
        );
        pnlProductsLayout.setVerticalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(pnlProducts);

        pnlShop.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 1270, 620));

        jComboBox1.setBackground(new java.awt.Color(11, 7, 17));
        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(11, 7, 17));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Clothing", "Footwear" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        pnlShop.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 5, 130, 40));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Product Name...");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlShop.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 100, 30));

        ProductsTableSearchTxt.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        ProductsTableSearchTxt.setBorder(null);
        ProductsTableSearchTxt.setOpaque(false);
        ProductsTableSearchTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProductsTableSearchTxtFocusLost(evt);
            }
        });
        ProductsTableSearchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProductsTableSearchTxtKeyPressed(evt);
            }
        });
        pnlShop.add(ProductsTableSearchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 220, 30));

        ProductsTableSearchBtn.setBorder(null);
        ProductsTableSearchBtn.setBorderPainted(false);
        ProductsTableSearchBtn.setContentAreaFilled(false);
        ProductsTableSearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProductsTableSearchBtn.setFocusable(false);
        ProductsTableSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsTableSearchBtnActionPerformed(evt);
            }
        });
        pnlShop.add(ProductsTableSearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 50, 30));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        pnlShop.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 330, 60));

        jComboBox2.setBackground(new java.awt.Color(11, 7, 17));
        jComboBox2.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(11, 7, 17));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name: A-Z", "Name: Z-A", "Price: Low - High", "Price: High - Low" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        pnlShop.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 5, 190, 40));

        pnlRight.add(pnlShop, "Shop");

        pnlLoading.setBackground(new java.awt.Color(0, 0, 0));
        pnlLoading.setLayout(new java.awt.BorderLayout());

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/7bf2e8ab8f412385a637ba3d22d4c00e.gif"))); // NOI18N
        pnlLoading.add(jLabel34, java.awt.BorderLayout.CENTER);

        pnlRight.add(pnlLoading, "Loading");

        pnlParent.add(pnlRight, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlParent, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMaximizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaximizeMousePressed
        if (VisitorView.this.getExtendedState() == MAXIMIZED_BOTH) 
            VisitorView.this.setExtendedState(JFrame.NORMAL);
        else
            VisitorView.this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_lblMaximizeMousePressed

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        System.exit(0);
    }//GEN-LAST:event_lblCloseMousePressed

    private void lblMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMousePressed
        VisitorView.this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMousePressed

    private void pnlTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTopMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnlTopMousePressed

    private void pnlTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTopMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnlTopMouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pnlTop.setBackground(new Color(0,0,0));
        pnlActions.setBackground(new Color(0,0,0));
        cardLayout.show(pnlRight, "Loading");
        Executors.newSingleThreadExecutor().execute(() -> {
            showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.ALL, products);
            pnlProducts.validate();
            cardLayout.show(pnlRight, "Shop");
            pnlTop.setBackground(new Color(11,7,17));
            pnlActions.setBackground(new Color(11,7,17));
        });
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        cardLayout.show(pnlRight, "Main");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new LoginView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex() == 0){
            pnlTop.setBackground(new Color(0,0,0));
            pnlActions.setBackground(new Color(0,0,0));
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox2.getSelectedIndex() == 0)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.ALL, SortMap.sortProductsByName(products, true));
                if(jComboBox2.getSelectedIndex() == 1)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.ALL, SortMap.sortProductsByName(products, false));
                if(jComboBox2.getSelectedIndex() == 2)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.ALL, SortMap.sortProductsByPrice(products, true));
                if(jComboBox2.getSelectedIndex() == 3)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.ALL, SortMap.sortProductsByPrice(products, false));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
                pnlTop.setBackground(new Color(11,7,17));
                pnlActions.setBackground(new Color(11,7,17));
            });
        }
        if(jComboBox1.getSelectedIndex() == 1){
            pnlTop.setBackground(new Color(0,0,0));
            pnlActions.setBackground(new Color(0,0,0));
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox2.getSelectedIndex() == 0)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.CLOTHING, SortMap.sortProductsByName(products, true));
                if(jComboBox2.getSelectedIndex() == 1)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.CLOTHING, SortMap.sortProductsByName(products, false));
                if(jComboBox2.getSelectedIndex() == 2)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.CLOTHING, SortMap.sortProductsByPrice(products, true));
                if(jComboBox2.getSelectedIndex() == 3)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.CLOTHING, SortMap.sortProductsByPrice(products, false));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
                pnlTop.setBackground(new Color(11,7,17));
                pnlActions.setBackground(new Color(11,7,17));
            });
        }
        if(jComboBox1.getSelectedIndex() == 2){
            pnlTop.setBackground(new Color(0,0,0));
            pnlActions.setBackground(new Color(0,0,0));
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox2.getSelectedIndex() == 0)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.FOOTWEAR, SortMap.sortProductsByName(products, true));
                if(jComboBox2.getSelectedIndex() == 1)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.FOOTWEAR, SortMap.sortProductsByName(products, false));
                if(jComboBox2.getSelectedIndex() == 2)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.FOOTWEAR, SortMap.sortProductsByPrice(products, true));
                if(jComboBox2.getSelectedIndex() == 3)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.FOOTWEAR, SortMap.sortProductsByPrice(products, false));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
                pnlTop.setBackground(new Color(11,7,17));
                pnlActions.setBackground(new Color(11,7,17));
            });
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void ProductsTableSearchTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductsTableSearchTxtFocusLost
        jLabel7.setText("Product Name...");
        jLabel7.setVisible(true);
    }//GEN-LAST:event_ProductsTableSearchTxtFocusLost

    private void ProductsTableSearchTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductsTableSearchTxtKeyPressed
        jLabel7.setVisible(false);
    }//GEN-LAST:event_ProductsTableSearchTxtKeyPressed

    private void ProductsTableSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsTableSearchBtnActionPerformed
        if(!ProductsTableSearchTxt.getText().isEmpty()){
            searchProduct(ProductsTableSearchTxt.getText());
            ProductsTableSearchTxt.setText(null);
            requestFocusInWindow();
            jLabel7.setVisible(true);
        }
    }//GEN-LAST:event_ProductsTableSearchBtnActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedIndex() == 0){
            pnlTop.setBackground(new Color(0,0,0));
            pnlActions.setBackground(new Color(0,0,0));
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox1.getSelectedIndex() == 0)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.ALL, SortMap.sortProductsByName(products, true));
                if(jComboBox1.getSelectedIndex() == 1)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.CLOTHING, SortMap.sortProductsByName(products, true));
                if(jComboBox1.getSelectedIndex() == 2)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.FOOTWEAR, SortMap.sortProductsByName(products, true));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
                pnlTop.setBackground(new Color(11,7,17));
                pnlActions.setBackground(new Color(11,7,17));
            });
        }
        if(jComboBox2.getSelectedIndex() == 1){
            pnlTop.setBackground(new Color(0,0,0));
            pnlActions.setBackground(new Color(0,0,0));
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox1.getSelectedIndex() == 0)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.ALL, SortMap.sortProductsByName(products, false));
                if(jComboBox1.getSelectedIndex() == 1)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.CLOTHING, SortMap.sortProductsByName(products, false));
                if(jComboBox1.getSelectedIndex() == 2)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.FOOTWEAR, SortMap.sortProductsByName(products, false));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
                pnlTop.setBackground(new Color(11,7,17));
                pnlActions.setBackground(new Color(11,7,17));
            });
        }
        if(jComboBox2.getSelectedIndex() == 2){
            pnlTop.setBackground(new Color(0,0,0));
            pnlActions.setBackground(new Color(0,0,0));
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox1.getSelectedIndex() == 0)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.ALL, SortMap.sortProductsByPrice(products, true));
                if(jComboBox1.getSelectedIndex() == 1)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.CLOTHING, SortMap.sortProductsByPrice(products, true));
                if(jComboBox1.getSelectedIndex() == 2)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.FOOTWEAR, SortMap.sortProductsByPrice(products, true));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
                pnlTop.setBackground(new Color(11,7,17));
                pnlActions.setBackground(new Color(11,7,17));
            });
        }
        if(jComboBox2.getSelectedIndex() == 3){
            pnlTop.setBackground(new Color(0,0,0));
            pnlActions.setBackground(new Color(0,0,0));
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox1.getSelectedIndex() == 0)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.ALL, SortMap.sortProductsByPrice(products, false));
                if(jComboBox1.getSelectedIndex() == 1)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.CLOTHING, SortMap.sortProductsByPrice(products, false));
                if(jComboBox1.getSelectedIndex() == 2)
                    showAllProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), ProductType.FOOTWEAR, SortMap.sortProductsByPrice(products, false));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
                pnlTop.setBackground(new Color(11,7,17));
                pnlActions.setBackground(new Color(11,7,17));
            });
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed
       
    private void searchProduct(String Value) {
        pnlTop.setBackground(new Color(0,0,0));
        pnlActions.setBackground(new Color(0,0,0));
        cardLayout.show(pnlRight, "Loading");
        Executors.newSingleThreadExecutor().execute(() -> {
            ArrayList<Product> pList = new DBManager().SearchProductList(Value);
            HashMap<Integer, Product> productsMap = new HashMap<>();
            if(pList.isEmpty()){
                cardLayout.show(pnlRight, "Shop");
                pnlTop.setBackground(new Color(11,7,17));
                pnlActions.setBackground(new Color(11,7,17));
                JOptionPane.showMessageDialog(null, "No Products Found");
            }else{
                for(int i = 0; i < pList.size(); i ++){
                    int pId = pList.get(i).getProductId();
                    productsMap.put(pId, Product.getProductById(pId));
                }
                showSearchedProducts(new Color(11,7,17), Color.WHITE, new Color(11,7,17), productsMap);
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
                pnlTop.setBackground(new Color(11,7,17));
                pnlActions.setBackground(new Color(11,7,17));
            }
        });
    }
    
    private void showAllProducts(Color bg, Color mainPnlColor, Color textColor, ProductType type, Map<Integer, Product> productsMap){
        var panel = pnlProducts;
        panel.removeAll();
        
        panel.setLayout(new FlowLayout(0, 65, 40));
        panel.setOpaque(true);
        panel.setBackground(bg);
        
        switch(type){
            case ALL:
                for(Entry<Integer, Product> productEntry : productsMap.entrySet()){
                    var product = productEntry.getValue();
                    ImageIcon img = new ImageIcon(new ImageIcon(product.getProductImage()).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));

                    JPanel pnl = new RoundedPanel(50, mainPnlColor);
                    pnl.setLayout(null);
                    pnl.setOpaque(false);
                    pnl.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    pnl.setPreferredSize(new Dimension(230, 260));
                    pnl.setBounds(0, 0, 230, 260);

                    JLabel lbl = new JLabel(img);
                    lbl.setOpaque(false);
                    lbl.setBounds(40, 30, 150, 150);

                    JLabel namelbl = new JLabel(product.getProductName());
                    namelbl.setForeground(textColor);
                    namelbl.setHorizontalAlignment(SwingConstants.CENTER);
                    namelbl.setVerticalAlignment(SwingConstants.CENTER);
                    namelbl.setFont(new Font("Comic Sans MS", Font.ITALIC, 16)); 
                    namelbl.setOpaque(false); 
                    namelbl.setBounds(25, 190, 180, 30);

                    JLabel pricebl = null;
                    if(product.getStockLevel() > 0)
                        pricebl = new JLabel("£"+String.valueOf(product.getPrice()));
                    else
                        pricebl = new JLabel("Out of Stock");
                    pricebl.setForeground(textColor);
                    pricebl.setHorizontalAlignment(SwingConstants.CENTER);
                    pricebl.setVerticalAlignment(SwingConstants.CENTER);
                    pricebl.setFont(new Font("Comic Sans MS", Font.ITALIC, 14)); 
                    pricebl.setOpaque(false);
                    pricebl.setBounds(25, 215, 180, 30);

                    pnl.add(lbl, BorderLayout.NORTH);
                    pnl.add(namelbl, BorderLayout.CENTER);
                    pnl.add(pricebl, BorderLayout.SOUTH);
                    panel.add(pnl);
                }
                break;
            case CLOTHING:
                for(Map.Entry<Integer, Product> productEntry : productsMap.entrySet()){
                    var product = productEntry.getValue();
                    if(product.getClass().getName().equals("models.Clothing")){
                        ImageIcon img = new ImageIcon(new ImageIcon(product.getProductImage()).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                        JPanel pnl = new RoundedPanel(50, mainPnlColor);
                        pnl.setLayout(null);
                        pnl.setOpaque(false);
                        pnl.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        pnl.setPreferredSize(new Dimension(230, 260));
                        pnl.setBounds(0, 0, 230, 260);

                        JLabel lbl = new JLabel(img);
                        lbl.setOpaque(false);
                        lbl.setBounds(40, 30, 150, 150);

                        JLabel namelbl = new JLabel(product.getProductName());
                        namelbl.setForeground(textColor);
                        namelbl.setHorizontalAlignment(SwingConstants.CENTER);
                        namelbl.setVerticalAlignment(SwingConstants.CENTER);
                        namelbl.setFont(new Font("Comic Sans MS", Font.ITALIC, 16)); 
                        namelbl.setOpaque(false); 
                        namelbl.setBounds(25, 190, 180, 30);

                        JLabel pricebl = null;
                        if(product.getStockLevel() > 0)
                            pricebl = new JLabel("£"+String.valueOf(product.getPrice()));
                        else
                            pricebl = new JLabel("Out of Stock");
                        pricebl.setForeground(textColor);
                        pricebl.setHorizontalAlignment(SwingConstants.CENTER);
                        pricebl.setVerticalAlignment(SwingConstants.CENTER);
                        pricebl.setFont(new Font("Comic Sans MS", Font.ITALIC, 14)); 
                        pricebl.setOpaque(false);
                        pricebl.setBounds(25, 215, 180, 30);

                        pnl.add(lbl, BorderLayout.NORTH);
                        pnl.add(namelbl, BorderLayout.CENTER);
                        pnl.add(pricebl, BorderLayout.SOUTH);
                        panel.add(pnl);
                    }
                }
                break;
            case FOOTWEAR:
                for(Map.Entry<Integer, Product> productEntry : productsMap.entrySet()){
                    var product = productEntry.getValue();
                    if(product.getClass().getName().equals("models.Footwear")){
                        ImageIcon img = new ImageIcon(new ImageIcon(product.getProductImage()).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));

                        JPanel pnl = new RoundedPanel(50, mainPnlColor);
                        pnl.setLayout(null);
                        pnl.setOpaque(false);
                        pnl.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        pnl.setPreferredSize(new Dimension(230, 260));
                        pnl.setBounds(0, 0, 230, 260);

                        JLabel lbl = new JLabel(img);
                        lbl.setOpaque(false);
                        lbl.setBounds(40, 30, 150, 150);

                        JLabel namelbl = new JLabel(product.getProductName());
                        namelbl.setForeground(textColor);
                        namelbl.setHorizontalAlignment(SwingConstants.CENTER);
                        namelbl.setVerticalAlignment(SwingConstants.CENTER);
                        namelbl.setFont(new Font("Comic Sans MS", Font.ITALIC, 16)); 
                        namelbl.setOpaque(false); 
                        namelbl.setBounds(25, 190, 180, 30);

                        JLabel pricebl = null;
                        if(product.getStockLevel() > 0)
                            pricebl = new JLabel("£"+String.valueOf(product.getPrice()));
                        else
                            pricebl = new JLabel("Out of Stock");
                        pricebl.setForeground(textColor);
                        pricebl.setHorizontalAlignment(SwingConstants.CENTER);
                        pricebl.setVerticalAlignment(SwingConstants.CENTER);
                        pricebl.setFont(new Font("Comic Sans MS", Font.ITALIC, 14)); 
                        pricebl.setOpaque(false);
                        pricebl.setBounds(25, 215, 180, 30);

                        pnl.add(lbl, BorderLayout.NORTH);
                        pnl.add(namelbl, BorderLayout.CENTER);
                        pnl.add(pricebl, BorderLayout.SOUTH);
                        panel.add(pnl);
                    }
                }
                break;
        }
        
        int height = 0;
        
        switch(type){
            case ALL:
                if(products.size() % 4 == 0)
                    height = (products.size() * 310) / 4;
                else
                    height = ((products.size() * 310) + 300) / 4;
                break;
            case CLOTHING:
                int num = Product.countProductType(type);
                if(num % 4 == 0)
                    height = (num * 310) / 4;
                else
                    height = ((num * 310) + 300) / 4;
                break;
            case FOOTWEAR:
                num = Product.countProductType(type);
                if(num % 4 == 0)
                    height = (num * 310) / 4;
                else
                    height = ((num * 310) + 300) / 4;
                break;
        }
        panel.setPreferredSize(new Dimension(800, height));
    }

    private void showSearchedProducts(Color bg, Color mainPnlColor, Color textColor, HashMap<Integer, Product> productsList){
        
        var panel = pnlProducts;
        panel.removeAll();
        
        panel.setLayout(new FlowLayout(0, 65, 40));
        panel.setOpaque(true);
        panel.setBackground(bg);
        
        for(Map.Entry<Integer, Product> productEntry : productsList.entrySet()){
            var product = productEntry.getValue();
            ImageIcon img = new ImageIcon(new ImageIcon(product.getProductImage()).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));

            JPanel pnl = new RoundedPanel(50, mainPnlColor);
            pnl.setLayout(null);
            pnl.setOpaque(false);
            pnl.setCursor(new Cursor(Cursor.HAND_CURSOR));
            pnl.setPreferredSize(new Dimension(230, 260));
            pnl.setBounds(0, 0, 230, 260);

            JLabel lbl = new JLabel(img);
            lbl.setOpaque(false);
            lbl.setBounds(40, 30, 150, 150);

            JLabel namelbl = new JLabel(product.getProductName());
            namelbl.setForeground(textColor);
            namelbl.setHorizontalAlignment(SwingConstants.CENTER);
            namelbl.setVerticalAlignment(SwingConstants.CENTER);
            namelbl.setFont(new Font("Comic Sans MS", Font.ITALIC, 16)); 
            namelbl.setOpaque(false); 
            namelbl.setBounds(25, 190, 180, 30);

            JLabel pricebl = null;
            if(product.getStockLevel() > 0)
                pricebl = new JLabel("£"+String.valueOf(product.getPrice()));
            else
                pricebl = new JLabel("Out of Stock");
            pricebl.setForeground(textColor);
            pricebl.setHorizontalAlignment(SwingConstants.CENTER);
            pricebl.setVerticalAlignment(SwingConstants.CENTER);
            pricebl.setFont(new Font("Comic Sans MS", Font.ITALIC, 14)); 
            pricebl.setOpaque(false);
            pricebl.setBounds(25, 215, 180, 30);

            pnl.add(lbl, BorderLayout.NORTH);
            pnl.add(namelbl, BorderLayout.CENTER);
            pnl.add(pricebl, BorderLayout.SOUTH);
            panel.add(pnl);
            int height = 0;
            if(productsList.size() % 4 == 0)
                height = (productsList.size() * 310) / 4;
            else
                height = ((productsList.size() * 310) + 300) / 4;
            
            panel.setPreferredSize(new Dimension(800, height));
        }
    }
    
    private String greetTimeMsg(){
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        if(timeOfDay >= 0 && timeOfDay < 12)
            return "Good Morning";
        else if(timeOfDay >= 12 && timeOfDay < 16)
            return "Good Afternoon";
        else if(timeOfDay >= 16 && timeOfDay < 21)
           return "Good Evening";
        else if(timeOfDay >= 21 && timeOfDay < 24)
            return "Good Night";
        return "";
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisitorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            //new CustomerView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ProductsTableSearchBtn;
    private javax.swing.JTextField ProductsTableSearchTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMaximize;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JPanel pnlActions;
    private javax.swing.JPanel pnlLoading;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlParent;
    private javax.swing.JPanel pnlProducts;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlShop;
    private javax.swing.JPanel pnlTop;
    // End of variables declaration//GEN-END:variables


}
