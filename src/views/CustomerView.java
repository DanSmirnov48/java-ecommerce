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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static java.lang.Thread.sleep;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import java.util.prefs.BackingStoreException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import models.Clothing;
import models.Customer;
import models.DBManager;
import models.Enums;
import models.Enums.CustomerFileOperation;
import models.Enums.ProductType;
import models.Events;
import models.Footwear;
import models.Order;
import models.OrderLine;
import models.Product;
import models.RoundedPanel;
import models.SortMap;

public final class CustomerView extends javax.swing.JFrame {

    private final DecimalFormat df = new DecimalFormat("#.##");
    private final HashMap<Integer, Product> products;
    private Customer loggedInCustomer;
    private final CardLayout cardLayout;
    public static Order currentOrder;
    Events evts = new Events();
    int xy, xx;
    
    public CustomerView(Customer customer, Order order) {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

        products = new DBManager().loadProducts();
        loggedInCustomer = customer;
        currentOrder = order;
        cardLayout = (CardLayout) pnlRight.getLayout();
        
        jScrollPane1.setBorder(null);
        jScrollPane2.setBorder(null);
        jScrollPane3.setBorder(null);
        jScrollPane4.setBorder(null);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(5);
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPane3.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPane4.getVerticalScrollBar().setUnitIncrement(10);
        jLabel33.setText(greetTimeMsg()+" " + loggedInCustomer.getFirstName());

        panelHover();
        callHoverOnTextField();
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
        sidepane = new javax.swing.JPanel();
        MyDetailsBtn = new javax.swing.JPanel();
        ind_Panel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        ViewAllOrdersBtn = new javax.swing.JPanel();
        ind_Panel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        ViewOrderLinesBtn = new javax.swing.JPanel();
        ind_Panel10 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        ViewShopBtn = new javax.swing.JPanel();
        ind_Panel11 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        ViewBasketBtn = new javax.swing.JPanel();
        ind_Panel12 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JPanel();
        ind_Panel13 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        pnlMain = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        pnlMyDetails = new javax.swing.JPanel();
        CustomerMyDetailsHide = new javax.swing.JLabel();
        CustomerMyDetailsShow = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();
        pnlAllOrdersTable = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        pnlShop = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlProducts = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        pnlOrderLines = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pnlOrders = new javax.swing.JPanel();
        pnlBasket = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlBasketPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        totalOrderlbl = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pnlEmptyOrders = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        pnlEmptyCart = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        pnlConfirmationPage = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        pnlLoading = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        pnlProfileUpdated = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();

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

        sidepane.setBackground(new java.awt.Color(11, 7, 17));
        sidepane.setForeground(new java.awt.Color(51, 51, 51));
        sidepane.setPreferredSize(new java.awt.Dimension(250, 200));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MyDetailsBtn.setBackground(new java.awt.Color(11, 7, 17));
        MyDetailsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MyDetailsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MyDetailsBtnMousePressed(evt);
            }
        });
        MyDetailsBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_Panel9.setBackground(new java.awt.Color(235, 42, 83));
        ind_Panel9.setOpaque(false);
        ind_Panel9.setPreferredSize(new java.awt.Dimension(4, 40));

        javax.swing.GroupLayout ind_Panel9Layout = new javax.swing.GroupLayout(ind_Panel9);
        ind_Panel9.setLayout(ind_Panel9Layout);
        ind_Panel9Layout.setHorizontalGroup(
            ind_Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        ind_Panel9Layout.setVerticalGroup(
            ind_Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        MyDetailsBtn.add(ind_Panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 6, 40));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("My Details");
        MyDetailsBtn.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 160, -1));

        sidepane.add(MyDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, -1));

        ViewAllOrdersBtn.setBackground(new java.awt.Color(11, 7, 17));
        ViewAllOrdersBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewAllOrdersBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewAllOrdersBtnMousePressed(evt);
            }
        });
        ViewAllOrdersBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_Panel8.setBackground(new java.awt.Color(235, 42, 83));
        ind_Panel8.setOpaque(false);
        ind_Panel8.setPreferredSize(new java.awt.Dimension(8, 40));

        javax.swing.GroupLayout ind_Panel8Layout = new javax.swing.GroupLayout(ind_Panel8);
        ind_Panel8.setLayout(ind_Panel8Layout);
        ind_Panel8Layout.setHorizontalGroup(
            ind_Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        ind_Panel8Layout.setVerticalGroup(
            ind_Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        ViewAllOrdersBtn.add(ind_Panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 6, 40));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("View Orders");
        ViewAllOrdersBtn.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        sidepane.add(ViewAllOrdersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 250, -1));

        ViewOrderLinesBtn.setBackground(new java.awt.Color(11, 7, 17));
        ViewOrderLinesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewOrderLinesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewOrderLinesBtnMousePressed(evt);
            }
        });
        ViewOrderLinesBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_Panel10.setBackground(new java.awt.Color(235, 42, 83));
        ind_Panel10.setOpaque(false);
        ind_Panel10.setPreferredSize(new java.awt.Dimension(4, 40));

        javax.swing.GroupLayout ind_Panel10Layout = new javax.swing.GroupLayout(ind_Panel10);
        ind_Panel10.setLayout(ind_Panel10Layout);
        ind_Panel10Layout.setHorizontalGroup(
            ind_Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        ind_Panel10Layout.setVerticalGroup(
            ind_Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        ViewOrderLinesBtn.add(ind_Panel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 6, 40));

        jLabel45.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Home Page");
        ViewOrderLinesBtn.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, -1));

        sidepane.add(ViewOrderLinesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, -1));

        ViewShopBtn.setBackground(new java.awt.Color(11, 7, 17));
        ViewShopBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewShopBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewShopBtnMousePressed(evt);
            }
        });
        ViewShopBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_Panel11.setBackground(new java.awt.Color(235, 42, 83));
        ind_Panel11.setOpaque(false);
        ind_Panel11.setPreferredSize(new java.awt.Dimension(4, 40));

        javax.swing.GroupLayout ind_Panel11Layout = new javax.swing.GroupLayout(ind_Panel11);
        ind_Panel11.setLayout(ind_Panel11Layout);
        ind_Panel11Layout.setHorizontalGroup(
            ind_Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        ind_Panel11Layout.setVerticalGroup(
            ind_Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        ViewShopBtn.add(ind_Panel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 6, 40));

        jLabel46.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("View Shop");
        ViewShopBtn.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, -1));

        sidepane.add(ViewShopBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, -1));

        ViewBasketBtn.setBackground(new java.awt.Color(11, 7, 17));
        ViewBasketBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewBasketBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewBasketBtnMousePressed(evt);
            }
        });
        ViewBasketBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_Panel12.setBackground(new java.awt.Color(235, 42, 83));
        ind_Panel12.setOpaque(false);
        ind_Panel12.setPreferredSize(new java.awt.Dimension(4, 40));

        javax.swing.GroupLayout ind_Panel12Layout = new javax.swing.GroupLayout(ind_Panel12);
        ind_Panel12.setLayout(ind_Panel12Layout);
        ind_Panel12Layout.setHorizontalGroup(
            ind_Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        ind_Panel12Layout.setVerticalGroup(
            ind_Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        ViewBasketBtn.add(ind_Panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 6, 40));

        jLabel47.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("View Basket");
        ViewBasketBtn.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, -1));

        sidepane.add(ViewBasketBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 250, -1));

        LogoutBtn.setBackground(new java.awt.Color(41, 37, 37));
        LogoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoutBtnMousePressed(evt);
            }
        });
        LogoutBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_Panel13.setBackground(new java.awt.Color(235, 42, 83));
        ind_Panel13.setOpaque(false);
        ind_Panel13.setPreferredSize(new java.awt.Dimension(4, 40));

        javax.swing.GroupLayout ind_Panel13Layout = new javax.swing.GroupLayout(ind_Panel13);
        ind_Panel13.setLayout(ind_Panel13Layout);
        ind_Panel13Layout.setHorizontalGroup(
            ind_Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        ind_Panel13Layout.setVerticalGroup(
            ind_Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        LogoutBtn.add(ind_Panel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 6, 40));

        jLabel48.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Log out");
        LogoutBtn.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, -1));

        sidepane.add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 250, -1));

        pnlParent.add(sidepane, java.awt.BorderLayout.LINE_START);

        pnlRight.setLayout(new java.awt.CardLayout());

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lastOrderBtn.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteAccount.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profilePic.png"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel32))
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6)
                            .addComponent(jButton5))))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(26, 26, 26)
                .addComponent(jButton6)
                .addGap(49, 49, 49))
        );

        pnlRight.add(pnlMain, "Main");

        pnlMyDetails.setBackground(new java.awt.Color(255, 255, 255));
        pnlMyDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerMyDetailsHide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerMyDetailsHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_hide_20px.png"))); // NOI18N
        CustomerMyDetailsHide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CustomerMyDetailsHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerMyDetailsHideMouseClicked(evt);
            }
        });
        pnlMyDetails.add(CustomerMyDetailsHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 467, 30, 30));

        CustomerMyDetailsShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerMyDetailsShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_eye_20px.png"))); // NOI18N
        CustomerMyDetailsShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CustomerMyDetailsShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerMyDetailsShowMouseClicked(evt);
            }
        });
        pnlMyDetails.add(CustomerMyDetailsShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 467, 30, 30));

        jTextField10.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField10.setBorder(null);
        pnlMyDetails.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 139, 290, 39));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        pnlMyDetails.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 180, 250, 20));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 135, 330, 48));

        jTextField11.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField11.setBorder(null);
        pnlMyDetails.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 247, 290, 39));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 102, 0));
        pnlMyDetails.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 290, 250, 20));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 243, 330, 48));

        jTextField12.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField12.setBorder(null);
        pnlMyDetails.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 355, 290, 39));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 0));
        pnlMyDetails.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 398, 250, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 351, 330, 48));

        jPasswordField1.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jPasswordField1.setBorder(null);
        pnlMyDetails.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 463, 270, 39));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 0));
        pnlMyDetails.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 507, 250, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 459, 330, 48));

        jTextField14.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField14.setBorder(null);
        pnlMyDetails.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 139, 290, 39));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 102, 0));
        pnlMyDetails.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 180, 250, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 135, 330, 48));

        jTextField15.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField15.setBorder(null);
        pnlMyDetails.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 247, 290, 39));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 102, 0));
        pnlMyDetails.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 290, 250, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 243, 330, 48));

        jTextField16.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField16.setBorder(null);
        pnlMyDetails.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 355, 290, 39));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 102, 0));
        pnlMyDetails.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 398, 250, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 351, 330, 48));

        jTextField17.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField17.setBorder(null);
        pnlMyDetails.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 463, 290, 39));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 102, 0));
        pnlMyDetails.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 507, 250, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 459, 330, 48));

        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setFocusPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        pnlMyDetails.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 568, 330, 41));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MyDetails.png"))); // NOI18N
        pnlMyDetails.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pnlRight.add(pnlMyDetails, "MyDetails");

        pnlAllOrdersTable.setBackground(new java.awt.Color(255, 255, 255));
        pnlAllOrdersTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/viewOrderBtn.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnlAllOrdersTable.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 350, 60));

        tblOrders.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        tblOrders.setForeground(new java.awt.Color(102, 102, 102));
        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ordered", "Arrival", "Total", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblOrders.setGridColor(new java.awt.Color(84, 73, 253));
        tblOrders.setSelectionBackground(new java.awt.Color(84, 73, 253));
        tblOrders.setShowHorizontalLines(false);
        tblOrders.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblOrders);
        if (tblOrders.getColumnModel().getColumnCount() > 0) {
            tblOrders.getColumnModel().getColumn(0).setResizable(false);
            tblOrders.getColumnModel().getColumn(1).setResizable(false);
            tblOrders.getColumnModel().getColumn(2).setResizable(false);
            tblOrders.getColumnModel().getColumn(3).setResizable(false);
            tblOrders.getColumnModel().getColumn(4).setResizable(false);
        }

        pnlAllOrdersTable.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 550));

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New First", "Old First" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        pnlAllOrdersTable.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 250, 40));

        pnlRight.add(pnlAllOrdersTable, "AllOrdersTable");

        pnlShop.setBackground(new java.awt.Color(255, 255, 255));
        pnlShop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlProducts.setBackground(new java.awt.Color(255, 255, 255));
        pnlProducts.setPreferredSize(new java.awt.Dimension(800, 400));

        javax.swing.GroupLayout pnlProductsLayout = new javax.swing.GroupLayout(pnlProducts);
        pnlProducts.setLayout(pnlProductsLayout);
        pnlProductsLayout.setHorizontalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        pnlProductsLayout.setVerticalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(pnlProducts);

        pnlShop.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 590));

        jComboBox2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Clothing", "Footwear" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        pnlShop.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 150, 30));

        jComboBox3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name: A- Z", "Name: Z - A", "Price: Low - High", "Price: High -  Low" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        pnlShop.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 15, 150, 30));

        pnlRight.add(pnlShop, "Shop");

        pnlOrderLines.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlOrders.setBackground(new java.awt.Color(255, 255, 255));
        pnlOrders.setPreferredSize(new java.awt.Dimension(800, 400));

        javax.swing.GroupLayout pnlOrdersLayout = new javax.swing.GroupLayout(pnlOrders);
        pnlOrders.setLayout(pnlOrdersLayout);
        pnlOrdersLayout.setHorizontalGroup(
            pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        pnlOrdersLayout.setVerticalGroup(
            pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(pnlOrders);

        javax.swing.GroupLayout pnlOrderLinesLayout = new javax.swing.GroupLayout(pnlOrderLines);
        pnlOrderLines.setLayout(pnlOrderLinesLayout);
        pnlOrderLinesLayout.setHorizontalGroup(
            pnlOrderLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        pnlOrderLinesLayout.setVerticalGroup(
            pnlOrderLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pnlRight.add(pnlOrderLines, "orderLines");

        pnlBasket.setBackground(new java.awt.Color(255, 255, 255));
        pnlBasket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/title1.png"))); // NOI18N
        pnlBasket.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 980, 70));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlBasketPanel.setBackground(new java.awt.Color(255, 255, 255));
        pnlBasketPanel.setPreferredSize(new java.awt.Dimension(800, 400));

        javax.swing.GroupLayout pnlBasketPanelLayout = new javax.swing.GroupLayout(pnlBasketPanel);
        pnlBasketPanel.setLayout(pnlBasketPanelLayout);
        pnlBasketPanelLayout.setHorizontalGroup(
            pnlBasketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        pnlBasketPanelLayout.setVerticalGroup(
            pnlBasketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(pnlBasketPanel);

        pnlBasket.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 1000, 460));

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
        pnlBasket.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, 330, 45));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/purchaseBtn.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlBasket.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 350, 88));

        totalOrderlbl.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        totalOrderlbl.setForeground(new java.awt.Color(51, 51, 51));
        totalOrderlbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlBasket.add(totalOrderlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 330, 45));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        pnlBasket.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 250, 30));

        pnlRight.add(pnlBasket, "Basket");

        pnlEmptyOrders.setBackground(new java.awt.Color(255, 255, 255));
        pnlEmptyOrders.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setRequestFocusEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        pnlEmptyOrders.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 330, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyOrders.png"))); // NOI18N
        pnlEmptyOrders.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pnlRight.add(pnlEmptyOrders, "EmptyOrders");

        pnlEmptyCart.setBackground(new java.awt.Color(255, 255, 255));
        pnlEmptyCart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setRequestFocusEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pnlEmptyCart.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 330, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cartEmpty.png"))); // NOI18N
        pnlEmptyCart.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pnlRight.add(pnlEmptyCart, "EmptyCart");

        pnlConfirmationPage.setBackground(new java.awt.Color(255, 255, 255));
        pnlConfirmationPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 37)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlConfirmationPage.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 700, 50));

        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnlConfirmationPage.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 559, 330, 40));

        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRequestFocusEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnlConfirmationPage.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 559, 330, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/confirmationPage1.png"))); // NOI18N
        pnlConfirmationPage.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pnlRight.add(pnlConfirmationPage, "ConfirmationPage");

        pnlLoading.setBackground(new java.awt.Color(255, 255, 255));
        pnlLoading.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logingif.gif"))); // NOI18N
        pnlLoading.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pnlRight.add(pnlLoading, "Loading");

        pnlProfileUpdated.setBackground(new java.awt.Color(255, 255, 255));
        pnlProfileUpdated.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        pnlProfileUpdated.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 340, 50));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profileUpdated.png"))); // NOI18N
        pnlProfileUpdated.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        pnlRight.add(pnlProfileUpdated, "ProfileUpdated");

        pnlParent.add(pnlRight, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlParent, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMaximizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaximizeMousePressed
        if (CustomerView.this.getExtendedState() == MAXIMIZED_BOTH) 
            CustomerView.this.setExtendedState(JFrame.NORMAL);
        else
            CustomerView.this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_lblMaximizeMousePressed

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        serialiseOrder();
        System.exit(0);
    }//GEN-LAST:event_lblCloseMousePressed

    private void lblMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMousePressed
        CustomerView.this.setState(Frame.ICONIFIED);
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

    private void ViewAllOrdersBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAllOrdersBtnMousePressed
        resetTextHover(jLabel20);
        textHover(jLabel13);
        resetTextHover(jLabel45);
        resetTextHover(jLabel46);
        resetTextHover(jLabel47);
        
        if(loggedInCustomer.getOrders().isEmpty()){
            cardLayout.show(pnlRight, "EmptyOrders");
        }else{
            Executors.newSingleThreadExecutor().execute(() -> {
                Order.updateOrderStatus(loggedInCustomer);
            });
            
            cardLayout.show(pnlRight, "AllOrdersTable");
            DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
            model.setRowCount(0);
            populateTableWithOrders(false);
        }
    }//GEN-LAST:event_ViewAllOrdersBtnMousePressed

    private void MyDetailsBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyDetailsBtnMousePressed
        CustomerMyDetailsShow.hide();
        showMyDetailsPage();
        callCustomerUpdateEvenst();
    }//GEN-LAST:event_MyDetailsBtnMousePressed
   
    private void ViewOrderLinesBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrderLinesBtnMousePressed
        resetTextHover(jLabel20);
        resetTextHover(jLabel13);
        textHover(jLabel45);
        resetTextHover(jLabel46);
        resetTextHover(jLabel47);
        cardLayout.show(pnlRight, "Main");
        jLabel33.setText(greetTimeMsg()+" " + loggedInCustomer.getFirstName());
    }//GEN-LAST:event_ViewOrderLinesBtnMousePressed

    private void ViewShopBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewShopBtnMousePressed
        resetTextHover(jLabel20);
        resetTextHover(jLabel13);
        resetTextHover(jLabel45);
        textHover(jLabel46);
        resetTextHover(jLabel47);
        cardLayout.show(pnlRight, "Loading");
        Executors.newSingleThreadExecutor().execute(() -> {
            showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.ALL, products);
            pnlProducts.validate();
            cardLayout.show(pnlRight, "Shop");
        });
        
        //showAllProducts(new Color(97,89,98), Color.WHITE, new Color(11,7,17)); 
    }//GEN-LAST:event_ViewShopBtnMousePressed

    private void ViewBasketBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewBasketBtnMousePressed
        resetTextHover(jLabel20);
        resetTextHover(jLabel13);
        resetTextHover(jLabel45);
        resetTextHover(jLabel46);
        textHover(jLabel47);
        
        if(currentOrder.getOrderLines().isEmpty()){
            cardLayout.show(pnlRight, "EmptyCart");
        }else{
            String fileName = "files\\"+loggedInCustomer.getUserName()+".ser";
            File f = new File(fileName);
            if(f.exists() && !f.isDirectory()) {
                var lastModifiedDate = new SimpleDateFormat("dd/MMM/yyyy HH:mm").format(Order.customersBasketFile(loggedInCustomer.getUserName(), CustomerFileOperation.LAST_MODIFIED));
                jLabel25.setText("Last Modified: " + lastModifiedDate);
            }
            cardLayout.show(pnlRight, "Basket");
            pnlBasketPanel.revalidate();
            pnlBasketPanel.repaint();
            basket(new Color(11,7,17), Color.WHITE);
        }
    }//GEN-LAST:event_ViewBasketBtnMousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(tblOrders.getSelectedRow() != -1){
            int orderId = Integer.parseInt(String.valueOf(tblOrders.getValueAt(tblOrders.getSelectedRow(), 0))); 
            showOrderLineOrders(orderId, new Color(11,7,17), Color.WHITE);
            cardLayout.show(pnlRight, "orderLines");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cardLayout.show(pnlRight, "Main");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cardLayout.show(pnlRight, "AllOrdersTable");
        var model = (DefaultTableModel)tblOrders.getModel();
        model.setRowCount(0);
        populateTableWithOrders(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(loggedInCustomer.getOrders().isEmpty()){
            cardLayout.show(pnlRight, "EmptyOrders");
        }else{
            HashMap<String, Customer> customers = new HashMap();
            customers.put(loggedInCustomer.getUserName(), loggedInCustomer);
            customers = new DBManager().loadCustomerOrders(customers);
            loggedInCustomer = customers.get(loggedInCustomer.getUserName());

            Map<Integer, Order> sortedMap = SortMap.sortByComparator(loggedInCustomer.getOrders(), true);
            
            NavigableMap<Integer, Order> map = new TreeMap<>(sortedMap);
            Entry<Integer, Order> lastEntry = map.lastEntry();
            
            showOrderLineOrders(lastEntry.getKey(), new Color(11,7,17), Color.WHITE);
            cardLayout.show(pnlRight, "orderLines");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void LogoutBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMousePressed
        serialiseOrder();
        new LoginView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnMousePressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        cardLayout.show(pnlRight, "Main");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        cardLayout.show(pnlRight, "Main");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        cardLayout.show(pnlRight, "Main");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String username = jTextField10.getText();
        String fisrtName = jTextField11.getText();
        String lastName = jTextField12.getText();
        String password = jPasswordField1.getText();
        String address1 = jTextField14.getText();
        String address2 = jTextField15.getText();
        String town = jTextField16.getText();
        String postcode = jTextField17.getText();
        
        if(!username.isEmpty() && !password.isEmpty() &&  !fisrtName.isEmpty() && 
                !lastName.isEmpty() &&  !address1.isEmpty() &&  !town.isEmpty() &&  !postcode.isEmpty()){
            try{
                var customer = new Customer(username, password, fisrtName, lastName, address1, address2, town, postcode);
                loggedInCustomer = (Customer)Customer.editUser(customer, loggedInCustomer.getUserName()); 
                HashMap<String, Customer> customers = new HashMap();
                customers.put(loggedInCustomer.getUserName(), loggedInCustomer);
                customers = new DBManager().loadCustomerOrders(customers);
                loggedInCustomer = customers.get(loggedInCustomer.getUserName());
                cardLayout.show(pnlRight, "ProfileUpdated"); 
            }catch(NullPointerException ex){ System.out.println(ex.getLocalizedMessage()); }
        }else verifyData();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(currentOrder.getOrderLines().size() > 0){
            currentOrder.setOrderDate(new Date());
            currentOrder.setStstus("Processing");
            Integer orderID = new DBManager().writeOrder(currentOrder, loggedInCustomer.getUserName());
            for(Map.Entry<Integer, OrderLine> olEntry : currentOrder.getOrderLines().entrySet()){
                var actualOrderLine = olEntry.getValue();
                new DBManager().writeOrderLine(actualOrderLine, orderID);
                Order.decrementQuantity(actualOrderLine.getProduct(), actualOrderLine.getQuantity());
            }
            
            deleteFile(loggedInCustomer.getUserName());
            currentOrder.getOrderLines().clear();
            pnlBasketPanel.revalidate();
            pnlBasketPanel.repaint();
            jLabel24.setText("and will arrive on: " + Order.findArivialTime(currentOrder.getOrderDate(), 7));
            cardLayout.show(pnlRight, "ConfirmationPage");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CustomerMyDetailsHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMyDetailsHideMouseClicked
        jPasswordField1.setEchoChar((char)0);
        CustomerMyDetailsShow.show();
        CustomerMyDetailsHide.hide();
    }//GEN-LAST:event_CustomerMyDetailsHideMouseClicked

    private void CustomerMyDetailsShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMyDetailsShowMouseClicked
        jPasswordField1.setEchoChar('\u2022');
        CustomerMyDetailsHide.show();
        CustomerMyDetailsShow.hide();
    }//GEN-LAST:event_CustomerMyDetailsShowMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete my Account",
        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("Images/account.png"));
        if(input == 0){
            loggedInCustomer.getOrders().clear();
            Customer.deleteCustomer(loggedInCustomer.getUserName());
            new LoginView().setVisible(true);
            this.dispose();
            try { LoginView.preference.clear(); } catch (BackingStoreException ex) { System.err.println(ex.getLocalizedMessage()); }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedIndex() == 0){
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox3.getSelectedIndex() == 0)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.ALL, SortMap.sortProductsByName(products, true));
                if(jComboBox3.getSelectedIndex() == 1)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.ALL, SortMap.sortProductsByName(products, false));
                if(jComboBox3.getSelectedIndex() == 2)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.ALL, SortMap.sortProductsByPrice(products, true));
                if(jComboBox3.getSelectedIndex() == 3)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.ALL, SortMap.sortProductsByPrice(products, false));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
            });
        }
        if(jComboBox2.getSelectedIndex() == 1){
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox3.getSelectedIndex() == 0)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.CLOTHING, SortMap.sortProductsByName(products, true));
                if(jComboBox3.getSelectedIndex() == 1)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.CLOTHING, SortMap.sortProductsByName(products, false));
                if(jComboBox3.getSelectedIndex() == 2)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.CLOTHING, SortMap.sortProductsByPrice(products, true));
                if(jComboBox3.getSelectedIndex() == 3)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.CLOTHING, SortMap.sortProductsByPrice(products, false));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
            });
        }
        if(jComboBox2.getSelectedIndex() == 2){
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox3.getSelectedIndex() == 0)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.FOOTWEAR, SortMap.sortProductsByName(products, true));
                if(jComboBox3.getSelectedIndex() == 1)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.FOOTWEAR, SortMap.sortProductsByName(products, false));
                if(jComboBox3.getSelectedIndex() == 2)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.FOOTWEAR, SortMap.sortProductsByPrice(products, true));
                if(jComboBox3.getSelectedIndex() == 3)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.FOOTWEAR, SortMap.sortProductsByPrice(products, false));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
            });
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if(jComboBox3.getSelectedIndex() == 0){
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox2.getSelectedIndex() == 0)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.ALL, SortMap.sortProductsByName(products, true));
                if(jComboBox2.getSelectedIndex() == 1)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.CLOTHING, SortMap.sortProductsByName(products, true));
                if(jComboBox2.getSelectedIndex() == 2)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.FOOTWEAR, SortMap.sortProductsByName(products, true));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
            });
        }
        if(jComboBox3.getSelectedIndex() == 1){
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox2.getSelectedIndex() == 0)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.ALL, SortMap.sortProductsByName(products, false));
                if(jComboBox2.getSelectedIndex() == 1)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.CLOTHING, SortMap.sortProductsByName(products, false));
                if(jComboBox2.getSelectedIndex() == 2)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.FOOTWEAR, SortMap.sortProductsByName(products, false));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
            });
        }
        if(jComboBox3.getSelectedIndex() == 2){
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox2.getSelectedIndex() == 0)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.ALL, SortMap.sortProductsByPrice(products, true));
                if(jComboBox2.getSelectedIndex() == 1)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.CLOTHING, SortMap.sortProductsByPrice(products, true));
                if(jComboBox2.getSelectedIndex() == 2)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.FOOTWEAR, SortMap.sortProductsByPrice(products, true));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
            }); 
        }
        if(jComboBox3.getSelectedIndex() == 3){
            cardLayout.show(pnlRight, "Loading");
            Executors.newSingleThreadExecutor().execute(() -> {
                if(jComboBox2.getSelectedIndex() == 0)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.ALL, SortMap.sortProductsByPrice(products, false));
                if(jComboBox2.getSelectedIndex() == 1)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.CLOTHING, SortMap.sortProductsByPrice(products, false));
                if(jComboBox2.getSelectedIndex() == 2)
                    showAllProducts(Color.WHITE, new Color(11,7,17), Color.WHITE, ProductType.FOOTWEAR, SortMap.sortProductsByPrice(products, false));
                pnlProducts.validate();
                cardLayout.show(pnlRight, "Shop");
            });  
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex() == 0){
            if(loggedInCustomer.getOrders().isEmpty()){
                cardLayout.show(pnlRight, "EmptyOrders");
            }else{
                cardLayout.show(pnlRight, "AllOrdersTable");
                DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
                model.setRowCount(0);
                populateTableWithOrders(false);
            }
        }else if(jComboBox1.getSelectedIndex() == 1){
            if(loggedInCustomer.getOrders().isEmpty()){
                cardLayout.show(pnlRight, "EmptyOrders");
            }else{
                cardLayout.show(pnlRight, "AllOrdersTable");
                DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
                model.setRowCount(0);
                populateTableWithOrders(true);
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    private void showAllProducts(Color bg, Color mainPnlColor, Color textColor, Enums.ProductType type, Map<Integer, Product> productsMap){
        var panel = pnlProducts;
        panel.removeAll();

        panel.setLayout(new FlowLayout(0, 75, 30));
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
                    
                    if(product.getStockLevel() > 0)
                        new Events().showOverlay(pnl, product, lbl, namelbl, pricebl);
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
                    
                        if(product.getStockLevel() > 0)
                            new Events().showOverlay(pnl, product, lbl, namelbl, pricebl);
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
                    
                        if(product.getStockLevel() > 0)
                            new Events().showOverlay(pnl, product, lbl, namelbl, pricebl);
                    }
                }
                break;
        }
        
        int height = 0;
        switch(type){
            case ALL:
                if(products.size() % 4 == 0)
                    height = (products.size() * 310) / 3;
                else
                    height = ((products.size() * 310) + 300) / 3;
                break;
            case CLOTHING:
                int clothing = Product.countProductType(type);
                if(clothing % 4 == 0)
                    height = (clothing * 340) / 3;
                else
                    height = ((clothing * 310) + 300) / 3;
                break;
            case FOOTWEAR:
                int footwear = Product.countProductType(type);
                if(footwear % 4 == 0)
                    height = (footwear * 340) / 3;
                else
                    height = ((footwear * 310) + 310) / 3;
                break;
        }
        panel.setPreferredSize(new Dimension(800, height));
    }
    
    private void basket(Color panelColor, Color txtColor){
        var panel = pnlBasketPanel;
        panel.removeAll();

        panel.setLayout(new FlowLayout(0, 50, 5));
        panel.setOpaque(true);
        panel.setBackground(Color.WHITE);

        Executors.newSingleThreadExecutor().execute(() -> {
            for(Map.Entry<Integer, OrderLine> olEntry : currentOrder.getOrderLines().entrySet()){
                var orderLine = olEntry.getValue();
                
                var mainPanel = new RoundedPanel(30, panelColor);
                mainPanel.setLayout(null);
                mainPanel.setOpaque(false);
                mainPanel.setPreferredSize(new Dimension(900, 140));
                //-------------------------------------------------------------//
                var img = new ImageIcon(new ImageIcon(orderLine.getProduct().getProductImage()).getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH));
                var lbl = new JLabel(img);
                lbl.setOpaque(false);
                lbl.setBounds(30,0,140,140);
                //-------------------------------------------------------------//
                String pName = "<html>"+ orderLine.getProduct().getProductName() +"</html>";
                var namelbl = new JLabel(pName);
                namelbl.setBounds(200,0,100, 140);
                namelbl.setForeground(txtColor);
                namelbl.setHorizontalAlignment(SwingConstants.LEFT);
                namelbl.setVerticalAlignment(SwingConstants.CENTER);
                namelbl.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
                namelbl.setOpaque(false);
                //-------------------------------------------------------------//
                JLabel sizelbl;
                if(orderLine.getProduct().getClass().getName().equals("models.Footwear")){
                    var footwear = (Footwear)orderLine.getProduct();
                    sizelbl = new JLabel(String.valueOf(footwear.getSize()));
                }else{
                    var clothing = (Clothing)orderLine.getProduct();
                    sizelbl = new JLabel(clothing.getMeasurement());
                }
                sizelbl.setBounds(350,0,100,140);
                sizelbl.setForeground(txtColor);
                sizelbl.setHorizontalAlignment(SwingConstants.LEFT);
                sizelbl.setVerticalAlignment(SwingConstants.CENTER);
                sizelbl.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
                sizelbl.setOpaque(false);
                //-------------------------------------------------------------//
                String price = Double.toString(orderLine.getProduct().getPrice());
                var pricelbl = new JLabel("£"+price);
                pricelbl.setBounds(450,0,70,140);
                pricelbl.setForeground(txtColor);
                pricelbl.setHorizontalAlignment(SwingConstants.LEFT);
                pricelbl.setVerticalAlignment(SwingConstants.CENTER);
                pricelbl.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
                pricelbl.setOpaque(false);
                //-------------------------------------------------------------//
                String qty = String.valueOf(orderLine.getQuantity());
                var quantitylbl = new JLabel(qty);
                quantitylbl.setBounds(560,0,20,140);
                quantitylbl.setForeground(txtColor);
                quantitylbl.setHorizontalAlignment(SwingConstants.LEFT);
                quantitylbl.setVerticalAlignment(SwingConstants.CENTER);
                quantitylbl.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
                quantitylbl.setOpaque(false);
                //-------------------------------------------------------------//
                var quantityimg = new JLabel(new ImageIcon("Images\\10.png"));
                quantityimg.setBounds(575,0,100,140);
                quantityimg.setOpaque(false);
                quantityimg.setBorder(null);
                //-------------------------------------------------------------//
                var sub = new JButton();
                sub.setBounds(575,0,50,140);
                sub.setBorder(null);
                sub.setOpaque(true);
                sub.setFocusable(false);
                sub.setContentAreaFilled(false);
                sub.setCursor(new Cursor(Cursor.HAND_CURSOR));
                //-------------------------------------------------------------//
                var add = new JButton();
                add.setBounds(625,0,50,140);
                add.setBorder(null);
                add.setOpaque(true);
                add.setFocusable(false);
                add.setContentAreaFilled(false);
                add.setCursor(new Cursor(Cursor.HAND_CURSOR));
                //-------------------------------------------------------------//
                String totalPrice = df.format(orderLine.getLineTotal());
                var totalPricelbl = new JLabel("£"+totalPrice);
                totalPricelbl.setBounds(720,0,90,140);
                totalPricelbl.setForeground(txtColor);
                totalPricelbl.setHorizontalAlignment(SwingConstants.LEFT);
                totalPricelbl.setVerticalAlignment(SwingConstants.CENTER);
                totalPricelbl.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
                totalPricelbl.setOpaque(false);
                //-------------------------------------------------------------//
                var removelbl = new JLabel(new ImageIcon("Images\\11.png"));
                removelbl.setBounds(790,0,100,140);
                removelbl.setOpaque(false);
                removelbl.setBorder(null);
                
                evts.decrementQty(sub, orderLine, quantitylbl, totalPricelbl, totalOrderlbl);
                evts.incrementQty(add, orderLine, quantitylbl, totalPricelbl, totalOrderlbl);
                
                removelbl.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        currentOrder.removeOrderLine(orderLine.getProduct().getProductId());
                        currentOrder.calculateTotal();
                        totalOrderlbl.setText("Total   £"+df.format(currentOrder.getOrderTotal()));
                        basket(new Color(11,7,17), Color.WHITE);
                        panel.revalidate();
                        panel.repaint();
                        
                        if(currentOrder.getOrderLines().isEmpty())
                            cardLayout.show(pnlRight, "EmptyCart");
                    }
                });
                
                mainPanel.add(lbl);
                mainPanel.add(namelbl);
                mainPanel.add(sizelbl);
                mainPanel.add(pricelbl);
                mainPanel.add(quantitylbl);
                mainPanel.add(quantityimg);
                mainPanel.add(sub);
                mainPanel.add(add);
                mainPanel.add(totalPricelbl);
                mainPanel.add(removelbl);
                panel.add(mainPanel);
            }
        });
        
        int height = currentOrder.getOrderLines().size() * 145;
        panel.setPreferredSize(new Dimension(800, height));
        totalOrderlbl.setText(String.valueOf("Total   £"+df.format(currentOrder.getOrderTotal())));
    }
    
    private void showOrderLineOrders(int orderId, Color panelColor, Color txtColor){
        var panel = pnlOrders;
        
        panel.setLayout(new FlowLayout(0, 175, 35));
        panel.setOpaque(true);
        panel.setBackground(Color.WHITE);
        panel.removeAll();
        
        var order = loggedInCustomer.getOrders().get(orderId);
        Executors.newSingleThreadExecutor().execute(() -> {
            for(Map.Entry<Integer, OrderLine> olEntry : order.getOrderLines().entrySet()){
                var orderLine = olEntry.getValue();
                
                var mainPanel = new RoundedPanel(30, panelColor);
                mainPanel.setLayout(null);
                mainPanel.setOpaque(false);
                mainPanel.setBackground(panelColor);
                mainPanel.setPreferredSize(new Dimension(600, 290));
                if(orderLine.getProduct() != null){
                    //-------------------------------------------------------------//
                    var img = new ImageIcon(new ImageIcon(orderLine.getProduct().getProductImage()).getImage().getScaledInstance(140, 140, Image.SCALE_SMOOTH));
                    var lblImg = new JLabel(img);
                    lblImg.setOpaque(false);
                    lblImg.setBounds(50,70,140,140);
                    //-------------------------------------------------------------//
                    String pName = "<html>"+ orderLine.getProduct().getProductName() +"</html>";
                    var namelbl = new JLabel(pName);
                    namelbl.setBounds(70,210,140,50);
                    namelbl.setForeground(txtColor);
                    namelbl.setHorizontalAlignment(SwingConstants.LEFT);
                    namelbl.setVerticalAlignment(SwingConstants.CENTER);
                    namelbl.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
                    namelbl.setOpaque(false);
                    //-------------------------------------------------------------//
                    String pDate = String.valueOf("<html>Order Placed: "+String.valueOf(new SimpleDateFormat("dd MMMM yyyy").format(order.getOrderDate()))+"</html>");
                    var datelbl = new JLabel(pDate);
                    datelbl.setBounds(250,50,300,25);
                    datelbl.setForeground(txtColor);
                    datelbl.setHorizontalAlignment(SwingConstants.LEFT);
                    datelbl.setVerticalAlignment(SwingConstants.CENTER);
                    datelbl.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
                    datelbl.setOpaque(false);

                    String pQuantity = "<html> Quantity: "+ orderLine.getQuantity() +"</html>";
                    var qiantitylbl = new JLabel(pQuantity);
                    qiantitylbl.setBounds(250,75,140,50);
                    qiantitylbl.setForeground(txtColor);
                    qiantitylbl.setHorizontalAlignment(SwingConstants.LEFT);
                    qiantitylbl.setVerticalAlignment(SwingConstants.CENTER);
                    qiantitylbl.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
                    qiantitylbl.setOpaque(false);

                    String pTotal = "<html>Total: £"+orderLine.getProduct().getPrice() * orderLine.getQuantity()+"</html>";
                    var totallbl = new JLabel(pTotal);
                    totallbl.setBounds(250,100,300,75);
                    totallbl.setForeground(txtColor);
                    totallbl.setHorizontalAlignment(SwingConstants.LEFT);
                    totallbl.setVerticalAlignment(SwingConstants.CENTER);
                    totallbl.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
                    totallbl.setOpaque(false);

                    String pStatus = String.valueOf("<html>Status: "+order.getStstus()+"</html>");
                    var statuslbl = new JLabel(pStatus);
                    statuslbl.setBounds(250,125,300,100);
                    statuslbl.setForeground(txtColor);
                    statuslbl.setHorizontalAlignment(SwingConstants.LEFT);
                    statuslbl.setVerticalAlignment(SwingConstants.CENTER);
                    statuslbl.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
                    statuslbl.setOpaque(false);

                    String pUser = "<html>Dispatched To: " + loggedInCustomer.getFirstName() + " " + loggedInCustomer.getLastName() +"</html>";
                    var userlbl = new JLabel(pUser);
                    userlbl.setBounds(250,150,300,125);
                    userlbl.setForeground(txtColor);
                    userlbl.setHorizontalAlignment(SwingConstants.LEFT);
                    userlbl.setVerticalAlignment(SwingConstants.CENTER);
                    userlbl.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
                    userlbl.setOpaque(false);

                    mainPanel.add(lblImg);
                    mainPanel.add(namelbl);
                    mainPanel.add(datelbl);
                    mainPanel.add(qiantitylbl);
                    mainPanel.add(totallbl);
                    mainPanel.add(statuslbl);
                    mainPanel.add(userlbl);
                    panel.add(mainPanel);
                }else{
                    String productErrMsg = "<html>The product is not availible.\nPlease try again later</html>";
                    var productErr = new JLabel(productErrMsg);
                    productErr.setBounds(100,10,400,250);
                    productErr.setForeground(txtColor);
                    productErr.setHorizontalAlignment(SwingConstants.LEFT);
                    productErr.setVerticalAlignment(SwingConstants.CENTER);
                    productErr.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
                    productErr.setOpaque(false);
                    
                    mainPanel.add(productErr);
                    panel.add(mainPanel);
                }
            }
        });

        int height = order.getOrderLines().size() * 340;
        panel.setPreferredSize(new Dimension(800, height));
    }
    
    private void populateTableWithOrders(final boolean sortOrder){
        Executors.newSingleThreadExecutor().execute(() -> {
            HashMap<String, Customer> customers = new HashMap();
            customers.put(loggedInCustomer.getUserName(), loggedInCustomer);
            customers = new DBManager().loadCustomerOrders(customers);
            loggedInCustomer = customers.get(loggedInCustomer.getUserName());
            
            Map<Integer, Order> sortedMap = SortMap.sortByComparator(loggedInCustomer.getOrders(), sortOrder);
            var previousOrdersModel = (DefaultTableModel)tblOrders.getModel();
            for(Map.Entry<Integer, Order> oEntry : sortedMap.entrySet()){
                Order order = oEntry.getValue();
                previousOrdersModel.addRow(new Object[] {
                    order.getOrderId(),
                    new SimpleDateFormat("dd MMMM yyyy").format(order.getOrderDate()),
                    Order.findArivialTime(order.getOrderDate(), 7),
                    "£" + df.format(order.getOrderTotal()),
                    order.getStstus()
                });
            }
            tblOrders.setRowHeight(80);
            
            TableColumnModel columnModel = tblOrders.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(70);
            columnModel.getColumn(1).setPreferredWidth(100);
            columnModel.getColumn(2).setPreferredWidth(100);
            columnModel.getColumn(3).setPreferredWidth(100);
            columnModel.getColumn(4).setPreferredWidth(100);
            
            JTableHeader datTable = tblOrders.getTableHeader();
            ((DefaultTableCellRenderer)datTable.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            tblOrders.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            tblOrders.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            tblOrders.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            tblOrders.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
            tblOrders.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
            tableHeaderSettings(tblOrders);
        });

    }
    
    private void tableHeaderSettings(JTable table){
        JTableHeader datTable = table.getTableHeader();
        ((DefaultTableCellRenderer)datTable.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(255, 255, 255));
        table.getTableHeader().setForeground(new Color(84,73,253));
        datTable.setFont(new Font("Comic Sans MS", Font.BOLD, 19)); 
        datTable.setPreferredSize(new Dimension(70,70));
    }
    
    private void panelHover(){
        evts.setPanelHover(MyDetailsBtn, ind_Panel9);
        evts.setPanelHover(ViewAllOrdersBtn, ind_Panel8);
        evts.setPanelHover(ViewOrderLinesBtn, ind_Panel10);
        evts.setPanelHover(ViewShopBtn, ind_Panel11);
        evts.setPanelHover(ViewBasketBtn, ind_Panel12);
        
        evts.resetPanelHower(MyDetailsBtn, ind_Panel9);
        evts.resetPanelHower(ViewAllOrdersBtn, ind_Panel8);
        evts.resetPanelHower(ViewOrderLinesBtn, ind_Panel10);
        evts.resetPanelHower(ViewShopBtn, ind_Panel11);
        evts.resetPanelHower(ViewBasketBtn, ind_Panel12); 
    }
    
    private void callHoverOnTextField(){
        evts.focusGained(jTextField10, jLabel1);
        evts.focusLost(jTextField10, jLabel1);
        
        evts.focusGained(jTextField11, jLabel2);
        evts.focusLost(jTextField11, jLabel2);
        
        evts.focusGained(jTextField12, jLabel3);
        evts.focusLost(jTextField12, jLabel3);
        
        evts.focusGained(jPasswordField1, jLabel4);
        evts.focusLost(jPasswordField1, jLabel4);
        
        evts.focusGained(jTextField14, jLabel5);
        evts.focusLost(jTextField14, jLabel5);
        
        evts.focusGained(jTextField15, jLabel6);
        evts.focusLost(jTextField15, jLabel6);
        
        evts.focusGained(jTextField16, jLabel7);
        evts.focusLost(jTextField16, jLabel7);
        
        evts.focusGained(jTextField17, jLabel8);
        evts.focusLost(jTextField17, jLabel8);
    }
    
    private void serialiseOrder(){
        try {
            if(!currentOrder.getOrderLines().isEmpty()){
                FileOutputStream fos = new FileOutputStream("files\\"+loggedInCustomer.getUserName()+".ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(currentOrder);
                oos.close();
                fos.close();
            }else
                deleteFile(loggedInCustomer.getUserName());
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());;
        } 
    }
    
    private void deleteFile(String filename){
        File myFile = new File("files\\"+filename+".ser");
        if(myFile.exists()){
            if (myFile.delete())
                System.out.println("Deleted the file: " + myFile.getName());
            else 
                System.out.println("Failed to delete the file.");
        }
        else
            System.out.println("File does not exist");
    }
    
    private void callCustomerUpdateEvenst(){
        evts.limitedMinInput(jTextField10, jLabel15, 3, "Must contain at least 3 characters!", "Can't be empty");
        evts.limitedMaxInput(jTextField10, jLabel15,  14, false);
        
        evts.limitedMinInputPassword(jPasswordField1, jLabel17);
        evts.limitedMaxInput(jPasswordField1, jLabel17, 20, true);
        
        evts.limitedMinInput(jTextField11, jLabel23, 3, "Must contain at least 3 characters!", "Can't be empty");
        evts.limitedMaxInput(jTextField11, jLabel23,  14, false);
        
        evts.limitedMinInput(jTextField12, jLabel16, 3, "Must contain at least 3 characters!", "Can't be empty");
        evts.limitedMaxInput(jTextField12, jLabel16,  14, false);
        
        evts.limitedMinInput(jTextField14, jLabel19, 5, "Must contain at least 5 characters!", "Can't be empty");
        evts.limitedMaxInput(jTextField14, jLabel19, 20, true);
        
        evts.limitedMinInput(jTextField15, jLabel18, 5, "Must contain at least 5 characters!", "");
        evts.limitedMaxInput(jTextField15, jLabel18, 20, true);
        
        evts.limitedMinInput(jTextField16, jLabel21, 4, "Must contain at least 4 characters!", "Can't be empty");
        evts.limitedMaxInput(jTextField16, jLabel21, 15, false);
        
        evts.limitedMinInput(jTextField17, jLabel22, 4, "Must contain at least 4 characters!", "Can't be empty");
        evts.limitedMaxInput(jTextField17, jLabel22, 7, true);
    }
    
    public void verifyData(){
        Thread clock = new Thread(){
            @Override
            public void run(){
                for(;;){
                    try {
                        validateUpdateCustomer1();
                        sleep(500);
                    } catch (InterruptedException ex) {}
                }
            }
        };
        clock.start();
    }
    
    private void validateUpdateCustomer1(){
        if(jTextField10.getText().isEmpty() && jPasswordField1.getText().isEmpty() &&
                jTextField11.getText().isEmpty() && jTextField12.getText().isEmpty() &&
                    jTextField14.getText().isEmpty() && jTextField16.getText().isEmpty() && 
                        jTextField17.getText().isEmpty()){
        }if(jTextField10.getText().isEmpty())
            jLabel15.setText("Can't be Empty");
        if(jPasswordField1.getText().isEmpty())
            jLabel17.setText("Can't be Empty");
        if(jTextField11.getText().isEmpty())
            jLabel23.setText("Can't be Empty");
        if(jTextField12.getText().isEmpty())
            jLabel16.setText("Can't be Empty");
        if(jTextField14.getText().isEmpty())
            jLabel19.setText("Can't be Empty");
        if(jTextField16.getText().isEmpty())
            jLabel21.setText("Can't be Empty");
        if(jTextField17.getText().isEmpty())
            jLabel22.setText("Can't be Empty");
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
        return null;
    }
    
    private void isCustomerFullyRegistered(){
        if(!loggedInCustomer.isIsFullyRegistered()){
            JOptionPane.showMessageDialog(null, "Please complete the registration fully. \n"
                    + "You can't make any purchases otherwise.\n");
            showMyDetailsPage();
        }
    }
    
    private void showMyDetailsPage(){
        textHover(jLabel20);
        resetTextHover(jLabel13);
        resetTextHover(jLabel45);
        resetTextHover(jLabel46);
        resetTextHover(jLabel47);

        cardLayout.show(pnlRight, "MyDetails");
        jTextField10.setText(loggedInCustomer.getUserName());
        jTextField11.setText(loggedInCustomer.getFirstName());
        jTextField12.setText(loggedInCustomer.getLastName());
        jPasswordField1.setText(loggedInCustomer.getPassword());
        jTextField14.setText(loggedInCustomer.getAddressLine1());
        jTextField15.setText(loggedInCustomer.getAddressLine2());
        jTextField16.setText(loggedInCustomer.getTown());
        jTextField17.setText(loggedInCustomer.getPostCode());
    }
    
    private static void setTimeout(Runnable runnable, int delay){
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            }
            catch (InterruptedException e){ System.err.println(e); }
        }).start();
        //setTimeout(() -> System.out.println("test"), 1000);
    }
    
    private void textHover(JLabel label){
        label.setForeground(new Color(235, 42, 83));
    }
    
    private void resetTextHover(JLabel label){
        label.setForeground(new Color(255, 255, 255));
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
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            //new CustomerView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerMyDetailsHide;
    private javax.swing.JLabel CustomerMyDetailsShow;
    private javax.swing.JPanel LogoutBtn;
    private javax.swing.JPanel MyDetailsBtn;
    private javax.swing.JPanel ViewAllOrdersBtn;
    private javax.swing.JPanel ViewBasketBtn;
    private javax.swing.JPanel ViewOrderLinesBtn;
    private javax.swing.JPanel ViewShopBtn;
    private javax.swing.JLabel bg;
    private javax.swing.JPanel ind_Panel10;
    private javax.swing.JPanel ind_Panel11;
    private javax.swing.JPanel ind_Panel12;
    private javax.swing.JPanel ind_Panel13;
    private javax.swing.JPanel ind_Panel8;
    private javax.swing.JPanel ind_Panel9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMaximize;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JPanel pnlActions;
    private javax.swing.JPanel pnlAllOrdersTable;
    private javax.swing.JPanel pnlBasket;
    private javax.swing.JPanel pnlBasketPanel;
    private javax.swing.JPanel pnlConfirmationPage;
    private javax.swing.JPanel pnlEmptyCart;
    private javax.swing.JPanel pnlEmptyOrders;
    private javax.swing.JPanel pnlLoading;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMyDetails;
    private javax.swing.JPanel pnlOrderLines;
    private javax.swing.JPanel pnlOrders;
    private javax.swing.JPanel pnlParent;
    private javax.swing.JPanel pnlProducts;
    private javax.swing.JPanel pnlProfileUpdated;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlShop;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel sidepane;
    private javax.swing.JTable tblOrders;
    private javax.swing.JLabel totalOrderlbl;
    // End of variables declaration//GEN-END:variables
}
