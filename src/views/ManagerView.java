package views;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import models.Enums.ProductStock;
import models.Events;
import models.Footwear;
import models.MyFunction;
import models.Order;
import models.OrderLine;
import models.Product;
import models.RoundedPanel;
import models.SerProducts;
import models.SortMap;
import models.Staff;
import models.TableModel;

public final class ManagerView extends javax.swing.JFrame {
    
    private Staff loggedInStaff;
    private HashMap<Integer, Product> products;
    private final CardLayout rightCardLayout;
    private Product ProductToEdit = null;
    DBManager db = new DBManager();
    Events evts = new Events();
    int xy, xx;
    String imgPath = null;
    
    public ManagerView(Staff staff) {
        initComponents();
        loggedInStaff = staff;
        products = db.loadProducts();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        rightCardLayout = (CardLayout) pnlRight.getLayout(); 
        
        jScrollPane1.setBorder(null);
        jScrollPane3.setBorder(null);
        jScrollPane4.setBorder(null);
        jScrollPane5.setBorder(null);
        jScrollPane6.setBorder(null);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(8);
        jScrollPane3.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPane4.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPane5.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPane6.getVerticalScrollBar().setUnitIncrement(10);
        
        jLabel33.setText(greetTimeMsg()+" " + loggedInStaff.getFirstName());
        
        panelHover();
        callHoverOnTextField();
        updateStatusForCustomers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTop = new javax.swing.JPanel();
        pnlActions = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        pnlParent = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        pnMain = new javax.swing.JPanel();
        HomePageBtn = new javax.swing.JPanel();
        ind_Panel17 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        MyDetailsBtn = new javax.swing.JPanel();
        ind_Panel15 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        ManageCustomersBtn = new javax.swing.JPanel();
        ind_Panel13 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        ManageOrdersBtn = new javax.swing.JPanel();
        ind_Panel14 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        ManageProductsBtn = new javax.swing.JPanel();
        ind_Panel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        LogOut = new javax.swing.JPanel();
        ind_Panel18 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        pnlMain = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        pnlDash = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        lblPending = new javax.swing.JLabel();
        lblProcessed = new javax.swing.JLabel();
        lblArrived = new javax.swing.JLabel();
        lblCanceled = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        lblInStock = new javax.swing.JLabel();
        lblOutOfStock = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        pnlMyDetails = new javax.swing.JPanel();
        ManagerMyDetailsHide = new javax.swing.JLabel();
        ManagerMyDetailsShow = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        pnlAllProductsEver = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        pnlCustomers = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        pnlOrders = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pnlOrderStatus = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        pnlOrderLines = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        OrderLines = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        pnlProductsTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ProductsTableProductsCbo = new javax.swing.JComboBox<>();
        ProductsTableUpdateBtn = new javax.swing.JButton();
        ProductsTableDeleteBtn = new javax.swing.JButton();
        ProductsTableAddBtn = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ProductsTableSearchTxt = new javax.swing.JTextField();
        ProductsTableSearchBtn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        pnlAddProduct = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        txtIcon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        pnlNeProduct = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pnlUpdateProduct = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlProductUpdated = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        pnlProfileUpdated = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
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
        pnlActions.setOpaque(false);
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

        jLabel44.setPreferredSize(new java.awt.Dimension(5, 14));
        pnlActions.add(jLabel44);

        pnlTop.add(pnlActions, java.awt.BorderLayout.LINE_END);

        getContentPane().add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlParent.setLayout(new java.awt.BorderLayout());

        sidepane.setBackground(new java.awt.Color(11, 7, 17));
        sidepane.setForeground(new java.awt.Color(51, 51, 51));
        sidepane.setPreferredSize(new java.awt.Dimension(250, 200));
        sidepane.setLayout(new java.awt.CardLayout());

        pnMain.setBackground(new java.awt.Color(11, 7, 17));
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePageBtn.setBackground(new java.awt.Color(11, 7, 17));
        HomePageBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomePageBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomePageBtnMousePressed(evt);
            }
        });
        HomePageBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_Panel17.setBackground(new java.awt.Color(235, 42, 83));
        ind_Panel17.setOpaque(false);
        ind_Panel17.setPreferredSize(new java.awt.Dimension(4, 40));

        javax.swing.GroupLayout ind_Panel17Layout = new javax.swing.GroupLayout(ind_Panel17);
        ind_Panel17.setLayout(ind_Panel17Layout);
        ind_Panel17Layout.setHorizontalGroup(
            ind_Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        ind_Panel17Layout.setVerticalGroup(
            ind_Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        HomePageBtn.add(ind_Panel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 6, 40));

        jLabel31.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Dashboard");
        HomePageBtn.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, -1));

        pnMain.add(HomePageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 250, -1));

        MyDetailsBtn.setBackground(new java.awt.Color(11, 7, 17));
        MyDetailsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MyDetailsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MyDetailsBtnMousePressed(evt);
            }
        });
        MyDetailsBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_Panel15.setBackground(new java.awt.Color(235, 42, 83));
        ind_Panel15.setOpaque(false);
        ind_Panel15.setPreferredSize(new java.awt.Dimension(4, 40));

        javax.swing.GroupLayout ind_Panel15Layout = new javax.swing.GroupLayout(ind_Panel15);
        ind_Panel15.setLayout(ind_Panel15Layout);
        ind_Panel15Layout.setHorizontalGroup(
            ind_Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        ind_Panel15Layout.setVerticalGroup(
            ind_Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        MyDetailsBtn.add(ind_Panel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 6, 40));

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("My Details");
        MyDetailsBtn.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, -1));

        pnMain.add(MyDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 250, -1));

        ManageCustomersBtn.setBackground(new java.awt.Color(11, 7, 17));
        ManageCustomersBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageCustomersBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManageCustomersBtnMousePressed(evt);
            }
        });
        ManageCustomersBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        ManageCustomersBtn.add(ind_Panel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 6, 40));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Manage Customers");
        ManageCustomersBtn.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, -1));

        pnMain.add(ManageCustomersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, -1));

        ManageOrdersBtn.setBackground(new java.awt.Color(11, 7, 17));
        ManageOrdersBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageOrdersBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManageOrdersBtnMousePressed(evt);
            }
        });
        ManageOrdersBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_Panel14.setBackground(new java.awt.Color(235, 42, 83));
        ind_Panel14.setOpaque(false);
        ind_Panel14.setPreferredSize(new java.awt.Dimension(4, 40));

        javax.swing.GroupLayout ind_Panel14Layout = new javax.swing.GroupLayout(ind_Panel14);
        ind_Panel14.setLayout(ind_Panel14Layout);
        ind_Panel14Layout.setHorizontalGroup(
            ind_Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        ind_Panel14Layout.setVerticalGroup(
            ind_Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        ManageOrdersBtn.add(ind_Panel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 6, 40));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Manage Orders");
        ManageOrdersBtn.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, -1));

        pnMain.add(ManageOrdersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 250, -1));

        ManageProductsBtn.setBackground(new java.awt.Color(11, 7, 17));
        ManageProductsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageProductsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManageProductsBtnMousePressed(evt);
            }
        });
        ManageProductsBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        ManageProductsBtn.add(ind_Panel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 6, 40));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Manage Products");
        ManageProductsBtn.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, -1));

        pnMain.add(ManageProductsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 250, -1));

        LogOut.setBackground(new java.awt.Color(41, 37, 37));
        LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogOutMousePressed(evt);
            }
        });
        LogOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_Panel18.setBackground(new java.awt.Color(235, 42, 83));
        ind_Panel18.setOpaque(false);
        ind_Panel18.setPreferredSize(new java.awt.Dimension(4, 40));

        javax.swing.GroupLayout ind_Panel18Layout = new javax.swing.GroupLayout(ind_Panel18);
        ind_Panel18.setLayout(ind_Panel18Layout);
        ind_Panel18Layout.setHorizontalGroup(
            ind_Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        ind_Panel18Layout.setVerticalGroup(
            ind_Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        LogOut.add(ind_Panel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 6, 40));

        jLabel36.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Log Out");
        LogOut.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, -1));

        pnMain.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 250, -1));

        sidepane.add(pnMain, "Main");

        pnlParent.add(sidepane, java.awt.BorderLayout.LINE_START);

        pnlRight.setLayout(new java.awt.CardLayout());

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profilePic.png"))); // NOI18N
        pnlMain.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, 180));

        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 0, 25)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlMain.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 620, 70));

        pnlRight.add(pnlMain, "Main");

        pnlDash.setBackground(new java.awt.Color(255, 255, 255));
        pnlDash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("All Products Ever Existed");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnlDash.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 210, 40));

        lblPending.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblPending.setForeground(new java.awt.Color(255, 255, 255));
        lblPending.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPending.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDash.add(lblPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 128, 25, 25));

        lblProcessed.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblProcessed.setForeground(new java.awt.Color(255, 255, 255));
        lblProcessed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProcessed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDash.add(lblProcessed, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 128, 25, 25));

        lblArrived.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblArrived.setForeground(new java.awt.Color(255, 255, 255));
        lblArrived.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrived.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDash.add(lblArrived, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 128, 25, 25));

        lblCanceled.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblCanceled.setForeground(new java.awt.Color(255, 255, 255));
        lblCanceled.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCanceled.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDash.add(lblCanceled, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 128, 25, 25));

        lblTotal.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDash.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 128, 25, 25));

        lblCategory.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(102, 102, 102));
        lblCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlDash.add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 398, 40, 32));

        lblProduct.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblProduct.setForeground(new java.awt.Color(102, 102, 102));
        lblProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlDash.add(lblProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 433, 40, 32));

        lblInStock.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblInStock.setForeground(new java.awt.Color(102, 102, 102));
        lblInStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlDash.add(lblInStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 469, 40, 32));

        lblOutOfStock.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblOutOfStock.setForeground(new java.awt.Color(102, 102, 102));
        lblOutOfStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlDash.add(lblOutOfStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 505, 40, 32));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Dash.png"))); // NOI18N
        pnlDash.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 645));

        pnlRight.add(pnlDash, "Dash");

        pnlMyDetails.setBackground(new java.awt.Color(255, 255, 255));
        pnlMyDetails.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        pnlMyDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManagerMyDetailsHide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManagerMyDetailsHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_hide_20px.png"))); // NOI18N
        ManagerMyDetailsHide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManagerMyDetailsHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManagerMyDetailsHideMouseClicked(evt);
            }
        });
        pnlMyDetails.add(ManagerMyDetailsHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 30, 30));

        ManagerMyDetailsShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManagerMyDetailsShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_eye_20px.png"))); // NOI18N
        ManagerMyDetailsShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManagerMyDetailsShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManagerMyDetailsShowMouseClicked(evt);
            }
        });
        pnlMyDetails.add(ManagerMyDetailsShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 30, 30));

        jTextField10.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(34, 34, 34));
        jTextField10.setBorder(null);
        pnlMyDetails.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 124, 290, 39));

        jPasswordField1.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(34, 34, 34));
        jPasswordField1.setBorder(null);
        pnlMyDetails.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 124, 260, 39));

        jTextField11.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(34, 34, 34));
        jTextField11.setBorder(null);
        pnlMyDetails.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 232, 290, 39));

        jTextField12.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(34, 34, 34));
        jTextField12.setBorder(null);
        pnlMyDetails.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 340, 290, 39));

        jTextField13.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(34, 34, 34));
        jTextField13.setBorder(null);
        pnlMyDetails.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 232, 290, 39));

        jTextField14.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(34, 34, 34));
        jTextField14.setBorder(null);
        pnlMyDetails.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 340, 290, 39));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 330, 48));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 120, 330, 48));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 228, 330, 48));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 336, 330, 48));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 228, 330, 48));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlMyDetails.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 336, 330, 48));

        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pnlMyDetails.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 340, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ManagerDetails.png"))); // NOI18N
        pnlMyDetails.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        pnlRight.add(pnlMyDetails, "MyDetails");

        pnlAllProductsEver.setBackground(new java.awt.Color(255, 255, 255));
        pnlAllProductsEver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setFont(new java.awt.Font("Comic Sans MS", 0, 17)); // NOI18N
        jTable4.setForeground(new java.awt.Color(102, 102, 102));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Added On", "Deleted On", "Availibility"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable4.setSelectionBackground(new java.awt.Color(84, 73, 253));
        jTable4.setShowHorizontalLines(false);
        jTable4.setShowVerticalLines(false);
        jScrollPane6.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
        }

        pnlAllProductsEver.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 1000, 640));

        pnlRight.add(pnlAllProductsEver, "AllProductsEver");

        pnlCustomers.setBackground(new java.awt.Color(255, 255, 255));
        pnlCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlCustomersMousePressed(evt);
            }
        });
        pnlCustomers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setFocusable(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        pnlCustomers.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, 270, 35));

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
        pnlCustomers.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 25, 270, 35));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageCustomerGroup.png"))); // NOI18N
        jLabel45.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlCustomers.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 590, 50));

        jTable3.setFont(new java.awt.Font("Comic Sans MS", 0, 17)); // NOI18N
        jTable3.setForeground(new java.awt.Color(102, 102, 102));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Full Name", "Address 1", "Address 2", "Town", "Postcodel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable3.setSelectionBackground(new java.awt.Color(84, 73, 253));
        jTable3.setShowHorizontalLines(false);
        jTable3.setShowVerticalLines(false);
        jScrollPane5.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setHeaderValue("Is Availible");
            jTable3.getColumnModel().getColumn(4).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setHeaderValue("Town");
            jTable3.getColumnModel().getColumn(5).setResizable(false);
            jTable3.getColumnModel().getColumn(5).setHeaderValue("Postcodel");
        }

        pnlCustomers.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 1000, 560));

        pnlRight.add(pnlCustomers, "Customers");

        pnlOrders.setBackground(new java.awt.Color(255, 255, 255));
        pnlOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlOrdersMousePressed(evt);
            }
        });
        pnlOrders.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnlOrders.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 45, 220, 35));

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
        pnlOrders.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 45, 220, 35));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/managerOrdersButtonGroup.png"))); // NOI18N
        pnlOrders.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 490, 90));

        jLabel37.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("Order ID");
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlOrders.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 70, 20));

        jTextField9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField9.setBorder(null);
        jTextField9.setOpaque(false);
        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField9FocusLost(evt);
            }
        });
        pnlOrders.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 140, 25));

        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setFocusPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        pnlOrders.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 45, 50, 35));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/managerOrdersSearch.png"))); // NOI18N
        pnlOrders.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 240, 50));

        jTable2.setFont(new java.awt.Font("Comic Sans MS", 0, 17)); // NOI18N
        jTable2.setForeground(new java.awt.Color(102, 102, 102));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer", "Date", "Total", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable2.setGridColor(new java.awt.Color(84, 73, 253));
        jTable2.setSelectionBackground(new java.awt.Color(84, 73, 253));
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        pnlOrders.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, 1000, 530));

        pnlRight.add(pnlOrders, "Orders");

        pnlOrderStatus.setBackground(new java.awt.Color(255, 255, 255));
        pnlOrderStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_left_25px.png"))); // NOI18N
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        pnlOrderStatus.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 50));

        jLabel38.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlOrderStatus.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 650, 60));

        jLabel39.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        pnlOrderStatus.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 350, 50));

        jLabel40.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        pnlOrderStatus.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 350, 50));

        jLabel43.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        pnlOrderStatus.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 350, 50));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancelOrder.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setFocusPainted(false);
        pnlOrderStatus.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 350, 60));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle.png"))); // NOI18N
        pnlOrderStatus.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 700, 440));

        pnlRight.add(pnlOrderStatus, "OrderStatus");

        pnlOrderLines.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        OrderLines.setBackground(new java.awt.Color(255, 255, 255));
        OrderLines.setPreferredSize(new java.awt.Dimension(800, 400));

        javax.swing.GroupLayout OrderLinesLayout = new javax.swing.GroupLayout(OrderLines);
        OrderLines.setLayout(OrderLinesLayout);
        OrderLinesLayout.setHorizontalGroup(
            OrderLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        OrderLinesLayout.setVerticalGroup(
            OrderLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(OrderLines);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_left_25px.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlOrderLinesLayout = new javax.swing.GroupLayout(pnlOrderLines);
        pnlOrderLines.setLayout(pnlOrderLinesLayout);
        pnlOrderLinesLayout.setHorizontalGroup(
            pnlOrderLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrderLinesLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlOrderLinesLayout.setVerticalGroup(
            pnlOrderLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
            .addGroup(pnlOrderLinesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlRight.add(pnlOrderLines, "orderLines");

        pnlProductsTable.setBackground(new java.awt.Color(255, 255, 255));
        pnlProductsTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N

        jTable1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setSelectionBackground(new java.awt.Color(84, 73, 253));
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        pnlProductsTable.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 117, 1000, 530));

        ProductsTableProductsCbo.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        ProductsTableProductsCbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Clothing", "Footwear" }));
        ProductsTableProductsCbo.setBorder(null);
        ProductsTableProductsCbo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProductsTableProductsCbo.setFocusable(false);
        ProductsTableProductsCbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsTableProductsCboActionPerformed(evt);
            }
        });
        pnlProductsTable.add(ProductsTableProductsCbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 195, 33));

        ProductsTableUpdateBtn.setBorder(null);
        ProductsTableUpdateBtn.setBorderPainted(false);
        ProductsTableUpdateBtn.setContentAreaFilled(false);
        ProductsTableUpdateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProductsTableUpdateBtn.setFocusPainted(false);
        ProductsTableUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsTableUpdateBtnActionPerformed(evt);
            }
        });
        pnlProductsTable.add(ProductsTableUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 23, 200, 31));

        ProductsTableDeleteBtn.setBorder(null);
        ProductsTableDeleteBtn.setBorderPainted(false);
        ProductsTableDeleteBtn.setContentAreaFilled(false);
        ProductsTableDeleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProductsTableDeleteBtn.setFocusPainted(false);
        ProductsTableDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsTableDeleteBtnActionPerformed(evt);
            }
        });
        pnlProductsTable.add(ProductsTableDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 69, 200, 31));

        ProductsTableAddBtn.setBorder(null);
        ProductsTableAddBtn.setBorderPainted(false);
        ProductsTableAddBtn.setContentAreaFilled(false);
        ProductsTableAddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProductsTableAddBtn.setFocusPainted(false);
        ProductsTableAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsTableAddBtnActionPerformed(evt);
            }
        });
        pnlProductsTable.add(ProductsTableAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 23, 200, 31));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crudBtns.png"))); // NOI18N
        pnlProductsTable.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, 90));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Product Name...");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlProductsTable.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 100, 30));

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
        pnlProductsTable.add(ProductsTableSearchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 220, 30));

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
        pnlProductsTable.add(ProductsTableSearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 50, 30));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        pnlProductsTable.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 330, 60));

        pnlRight.add(pnlProductsTable, "ProductsTable");

        pnlAddProduct.setBackground(new java.awt.Color(255, 255, 255));
        pnlAddProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_left_25px.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        pnlAddProduct.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField1.setBorder(null);
        pnlAddProduct.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 118, 250, 39));

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField2.setBorder(null);
        pnlAddProduct.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 182, 250, 39));

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField3.setBorder(null);
        pnlAddProduct.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 244, 250, 39));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Measurement*");
        pnlAddProduct.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 130, 30));

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X-Small", "Small", "Medium", "Large", "X-Large" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAddProduct.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 320, 45));

        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField4.setBorder(null);
        pnlAddProduct.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 303, 250, 39));

        txtIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/txtFieldIcon.png"))); // NOI18N
        pnlAddProduct.add(txtIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 282, 380, 80));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlAddProduct.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 375, 130, 130));

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlAddProduct.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 550, 330, 40));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        pnlAddProduct.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 110, 40));

        jComboBox3.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clothing", "Footwear" }));
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        pnlAddProduct.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 55, 320, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addProduct.png"))); // NOI18N
        pnlAddProduct.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pnlRight.add(pnlAddProduct, "AddProduct");

        pnlNeProduct.setBackground(new java.awt.Color(255, 255, 255));
        pnlNeProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlNeProduct.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 180, 180));

        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setFocusPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        pnlNeProduct.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 320, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/newProduct.png"))); // NOI18N
        pnlNeProduct.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pnlRight.add(pnlNeProduct, "newProduct");

        pnlUpdateProduct.setBackground(new java.awt.Color(255, 255, 255));
        pnlUpdateProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_left_25px.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });
        pnlUpdateProduct.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField5.setBorder(null);
        pnlUpdateProduct.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 88, 250, 39));

        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField6.setBorder(null);
        pnlUpdateProduct.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 152, 250, 39));

        jTextField7.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField7.setBorder(null);
        pnlUpdateProduct.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 214, 250, 39));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Size*");
        pnlUpdateProduct.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 283, -1, -1));

        jTextField8.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField8.setBorder(null);
        pnlUpdateProduct.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 275, 250, 39));

        jComboBox4.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X-Small", "Small", "Medium", "Large", "X-Large" }));
        jComboBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlUpdateProduct.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 275, 320, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/txtFieldIcon.png"))); // NOI18N
        pnlUpdateProduct.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 250, 370, 90));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        pnlUpdateProduct.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 345, 130, 130));

        jButton3.setToolTipText("");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnlUpdateProduct.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 524, 330, 45));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        pnlUpdateProduct.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 390, 113, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/updateProduct.png"))); // NOI18N
        pnlUpdateProduct.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pnlRight.add(pnlUpdateProduct, "UpdateProduct");

        pnlProductUpdated.setBackground(new java.awt.Color(255, 255, 255));
        pnlProductUpdated.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setFocusPainted(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        pnlProductUpdated.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 320, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/productUpdated.png"))); // NOI18N
        pnlProductUpdated.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pnlRight.add(pnlProductUpdated, "productUpdated");

        pnlProfileUpdated.setBackground(new java.awt.Color(255, 255, 255));
        pnlProfileUpdated.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        pnlProfileUpdated.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 340, 50));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profileUpdated.png"))); // NOI18N
        pnlProfileUpdated.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        pnlRight.add(pnlProfileUpdated, "ProfileUpdated");

        pnlParent.add(pnlRight, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlParent, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        System.exit(0);
    }//GEN-LAST:event_lblCloseMousePressed

    private void lblMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMousePressed
        ManagerView.this.setState(Frame.ICONIFIED);
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

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        imgPath = new MyFunction().BrowseImage(jLabel8);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jComboBox3.getSelectedItem() == "Clothing"){
            String name = jTextField1.getText();
            Double price = Double.valueOf(jTextField2.getText());
            Integer stock = Integer.parseInt(jTextField3.getText());
            jComboBox1.setVisible(true);
            String mes = jComboBox1.getSelectedItem().toString();
            byte[] img = null;
            if (imgPath != null){
                try {
                    Path pth = Paths.get(imgPath);
                    img = Files.readAllBytes(pth);
                    var clothing = (Product)new Clothing(null, name, price, stock, img, mes);
                    db.InsertProduct(clothing);
                    RefreshClothingTabel();
                } catch (IOException ex) {
                    System.out.println(ex.getLocalizedMessage());
                }
                jLabel35.setIcon(new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH)));
            }else 
                jLabel8.setText("<html>Image\nRequired</html>"); 
        }else if(jComboBox3.getSelectedItem() == "Footwear"){
            String name = jTextField1.getText();
            Double price = Double.valueOf(jTextField2.getText());
            Integer stock = Integer.parseInt(jTextField3.getText());
            Integer size = Integer.parseInt(jTextField3.getText());
            byte[] img = null;
            if (imgPath != null){
                try {
                    Path pth = Paths.get(imgPath);
                    img = Files.readAllBytes(pth);
                    var footwear = (Product)new Footwear(null, name, price, stock, img, size);
                    db.InsertProduct(footwear);
                    RefreshFootwearTabel();
                } catch (IOException ex) {
                    System.out.println(ex.getLocalizedMessage());
                }
                jLabel35.setIcon(new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH)));
            }else
                jLabel8.setText("<html>Image\nRequired</html>");
        }
        rightCardLayout.show(pnlRight, "newProduct");
        Executors.newSingleThreadExecutor().execute(() -> {
            products.clear();
            products = db.loadProducts();
            jTextField1.setText(null);
            jTextField2.setText(null);
            jTextField3.setText(null);
            jLabel8.setIcon(null);
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ProductsTableUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsTableUpdateBtnActionPerformed
        if(jTable1.getSelectedRow() != -1){
            String productName = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            for(Map.Entry<Integer, Product> productEntry : products.entrySet()){
                var product = productEntry.getValue();
                if(product.getProductName().equals(productName)){
                    if(product.getClass().getName().equals("models.Footwear")){
                        var footwear = (Footwear)product;
                        jTextField5.setText(footwear.getProductName());
                        jTextField6.setText(Double.toString(footwear.getPrice()));
                        jTextField7.setText(Integer.toString(footwear.getStockLevel()));
                        jComboBox4.setVisible(false);
                        jTextField8.setVisible(true);
                        jLabel5.setVisible(true);
                        jTextField8.setText(Integer.toString(footwear.getSize()));
                        jLabel14.setIcon(new ImageIcon(new ImageIcon(footwear.getProductImage()).getImage()
                                                        .getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
                        ProductToEdit = footwear;
                    }else{
                        var clothing = (Clothing)product;
                        jTextField5.setText(clothing.getProductName());
                        jTextField6.setText(Double.toString(clothing.getPrice()));
                        jTextField7.setText(Integer.toString(clothing.getStockLevel()));
                        jComboBox4.setVisible(true);
                        jLabel5.setVisible(false);
                        jTextField8.setVisible(false);
                        jComboBox4.setSelectedItem(clothing.getMeasurement());
                        jLabel14.setIcon(new ImageIcon(new ImageIcon(clothing.getProductImage()).getImage()
                                                        .getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
                        ProductToEdit = clothing;
                    }
                }
            }
            evts.addProductNameValidation(jTextField5);
            evts.addProductPriceValidation(jTextField6);
            evts.addProductStockValidation(jTextField7);
            evts.addProductSizeValidation(jTextField8);
            rightCardLayout.show(pnlRight, "UpdateProduct");
        }
    }//GEN-LAST:event_ProductsTableUpdateBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            int id = ProductToEdit.getProductId();
            String name = jTextField5.getText();
            double price = Double.parseDouble(jTextField6.getText());
            int stocklvl = Integer.parseInt(jTextField7.getText());
            String extra = jTextField8.getText();
            if(ProductToEdit.getClass().getName().equals("models.Footwear")){
                int size  = Integer.parseInt(extra);
                byte[] img = null;
                if (imgPath != null){
                    try {
                        Path pth = Paths.get(imgPath);
                        img = Files.readAllBytes(pth);
                        Footwear footwear = new Footwear(id, name, price, stocklvl, img, size);
                        db.EditProduct(footwear, true);
                        RefreshFootwearTabel();
                    } catch (IOException ex) {
                        Logger.getLogger(ManagerView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    Footwear footwear = new Footwear(id, name, price, stocklvl, null, size);
                    db.EditProduct(footwear, false);
                    RefreshFootwearTabel();
                }
            }else{
                String mes = jComboBox4.getSelectedItem().toString();
                byte[] img = null;
                if (imgPath != null){
                    try {
                        Path pth = Paths.get(imgPath);
                        img = Files.readAllBytes(pth);
                        Clothing clothing = new Clothing(id, name, price, stocklvl, img, mes);
                        db.EditProduct(clothing, true);
                        RefreshClothingTabel();
                    } catch (IOException ex) {
                        Logger.getLogger(ManagerView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    Clothing clothing = new Clothing(id, name, price, stocklvl, null, mes);
                    db.EditProduct(clothing, false);
                    RefreshClothingTabel();
                }
            }
            rightCardLayout.show(pnlRight, "productUpdated");
            RefreshAllTabel();
        }catch(NumberFormatException ex){ System.out.println("Error: Please Enter valid data"); }            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ProductsTableDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsTableDeleteBtnActionPerformed
        if(jTable1.getSelectedRow() != -1){
            int input = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete Product",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("Images/item.png"));
            if(input == 0){
                String productName = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                for(Map.Entry<Integer, Product> productEntry : products.entrySet()){
                    var product = productEntry.getValue();
                    if(product.getProductName().equals(productName)){
                        db.DeleteProduct(product.getProductId());
                        products.remove(product.getProductId());
                        RefreshAllTabel();
                    }
                }  
            }
        }
    }//GEN-LAST:event_ProductsTableDeleteBtnActionPerformed

    private void ProductsTableAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsTableAddBtnActionPerformed
        txtIcon.setVisible(false);
        jTextField4.setVisible(false);
        rightCardLayout.show(pnlRight, "AddProduct");
        evts.addProductNameValidation(jTextField1);
        evts.addProductPriceValidation(jTextField2);
        evts.addProductStockValidation(jTextField3);
        evts.addProductSizeValidation(jTextField4);
    }//GEN-LAST:event_ProductsTableAddBtnActionPerformed

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        if(jComboBox3.getSelectedItem() == "Clothing"){
            jLabel6.setText("Measurement*");
            jComboBox1.setVisible(true);
            txtIcon.setVisible(false);
        }
        if(jComboBox3.getSelectedItem() == "Footwear"){
            jLabel6.setText("Size*");
            jComboBox1.setVisible(false);
            txtIcon.setVisible(true);
            jTextField4.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void ProductsTableSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsTableSearchBtnActionPerformed
        if(!ProductsTableSearchTxt.getText().isEmpty()){
            searchProduct(ProductsTableSearchTxt.getText());
            ProductsTableSearchTxt.setText(null);
            requestFocusInWindow();
            jLabel7.setVisible(true);
        }
    }//GEN-LAST:event_ProductsTableSearchBtnActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        imgPath = null;
        imgPath = new MyFunction().BrowseImage(jLabel14);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void ManageProductsBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageProductsBtnMousePressed
        resetTextHover(jLabel31);
        textHover(jLabel21);
        resetTextHover(jLabel24);
        resetTextHover(jLabel25);
        resetTextHover(jLabel26);
        rightCardLayout.show(pnlRight, "ProductsTable");
        jLabel7.setText("Product Name...");
        populateTable();
    }//GEN-LAST:event_ManageProductsBtnMousePressed

    private void ManageCustomersBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageCustomersBtnMousePressed
        resetTextHover(jLabel31);
        resetTextHover(jLabel21);
        textHover(jLabel24);
        resetTextHover(jLabel25);
        resetTextHover(jLabel26);
        DefaultTableModel dm = (DefaultTableModel)jTable3.getModel();
        dm.getDataVector().removeAllElements();
        rightCardLayout.show(pnlRight, "Customers");
        populateTableCustomers();
    }//GEN-LAST:event_ManageCustomersBtnMousePressed

    private void ManageOrdersBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageOrdersBtnMousePressed
        resetTextHover(jLabel31);
        resetTextHover(jLabel21);
        resetTextHover(jLabel24);
        textHover(jLabel25);
        resetTextHover(jLabel26);
        
        evts.findOrderByIdValidation(jTextField9, jLabel37);
        jTable2.getSelectionModel().clearSelection();

        DefaultTableModel dm = (DefaultTableModel)jTable2.getModel();
        dm.getDataVector().removeAllElements();
        rightCardLayout.show(pnlRight, "Orders");
        populateTableAllOrdersSorted();
    }//GEN-LAST:event_ManageOrdersBtnMousePressed

    private void MyDetailsBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyDetailsBtnMousePressed
        resetTextHover(jLabel31);
        resetTextHover(jLabel21);
        resetTextHover(jLabel24);
        resetTextHover(jLabel25);
        textHover(jLabel26);
        ManagerMyDetailsShow.hide();
        rightCardLayout.show(pnlRight, "MyDetails");
        
        jTextField10.setText(loggedInStaff.getUserName());
        jPasswordField1.setText(loggedInStaff.getPassword());
        jTextField11.setText(loggedInStaff.getFirstName());
        jTextField12.setText(loggedInStaff.getLastName());
        jTextField13.setText(loggedInStaff.getPosition());
        jTextField14.setText(Double.toString(loggedInStaff.getSalary()));
    }//GEN-LAST:event_MyDetailsBtnMousePressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(!(db.userExists(jTextField10.getText()))){
            String username = jTextField10.getText();
            String fisrtName = jTextField11.getText();
            String lastName = jTextField12.getText();
            String password = jPasswordField1.getText();
            String position = jTextField13.getText();
            double salary = Double.parseDouble(jTextField14.getText());
            var staff = new Staff(username, password, fisrtName, lastName, position, salary);
            loggedInStaff = (Staff)Customer.editUser(staff, loggedInStaff.getUserName());
            rightCardLayout.show(pnlRight, "ProfileUpdated");
        }
        else{
            jTextField10.requestFocus();
            jTextField10.setText(null);
            JOptionPane.showMessageDialog(null, "Username is unavailible!\nPLease choose a different Username.");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        rightCardLayout.show(pnlRight, "Main");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void HomePageBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePageBtnMousePressed
        textHover(jLabel31);
        resetTextHover(jLabel21);
        resetTextHover(jLabel24);
        resetTextHover(jLabel25);
        resetTextHover(jLabel26);
        rightCardLayout.show(pnlRight, "Dash");
        Executors.newSingleThreadExecutor().execute(() -> {
            setDashValues();
        });	
    }//GEN-LAST:event_HomePageBtnMousePressed

    private void ManagerMyDetailsHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerMyDetailsHideMouseClicked
        jPasswordField1.setEchoChar((char)0);
        ManagerMyDetailsShow.show();
        ManagerMyDetailsHide.hide();
    }//GEN-LAST:event_ManagerMyDetailsHideMouseClicked

    private void ManagerMyDetailsShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerMyDetailsShowMouseClicked
        jPasswordField1.setEchoChar('\u2022');
        ManagerMyDetailsHide.show();
        ManagerMyDetailsShow.hide();
    }//GEN-LAST:event_ManagerMyDetailsShowMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        rightCardLayout.show(pnlRight, "Main");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        rightCardLayout.show(pnlRight, "Main");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void ProductsTableSearchTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductsTableSearchTxtFocusLost
        jLabel7.setText("Product Name...");
        jLabel7.setVisible(true);
    }//GEN-LAST:event_ProductsTableSearchTxtFocusLost

    private void ProductsTableSearchTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductsTableSearchTxtKeyPressed
        jLabel7.setVisible(false);
    }//GEN-LAST:event_ProductsTableSearchTxtKeyPressed

    private void LogOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMousePressed
        new LoginView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTable2.getSelectedRow() != -1){
            int orderId = Integer.parseInt(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 0))); 
            Executors.newSingleThreadExecutor().execute(() -> {
                showOrderLineOrders(orderId, new Color(11,7,17), Color.WHITE);
            });
            
            rightCardLayout.show(pnlRight, "orderLines");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        rightCardLayout.show(pnlRight, "ProductsTable");
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        rightCardLayout.show(pnlRight, "ProductsTable");
    }//GEN-LAST:event_jLabel12MousePressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jTable3.getSelectedRow() != - 1){
            int input = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete Customer",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("Images/account.png"));
            if(input == 0){
                var customer = Customer.getCustomerByUsername(String.valueOf(jTable3.getValueAt(jTable3.getSelectedRow(), 0)));
                customer.getOrders().clear();
                Customer.deleteCustomer(customer.getUserName());
                DefaultTableModel dm = (DefaultTableModel)jTable3.getModel();
                dm.getDataVector().removeAllElements();
                populateTableCustomers();
                jTable3.getSelectionModel().clearSelection();
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void pnlCustomersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCustomersMousePressed
        jTable3.getSelectionModel().clearSelection();
    }//GEN-LAST:event_pnlCustomersMousePressed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(jTable2.getSelectedRow() != -1){
            int orderId = Integer.parseInt(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 0))); 
            var customer = Customer.getCustomerByUsername(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 1)));
            var order = customer.getOrders().get(orderId);
            if(!(order.getStstus().equals("Arrived") || (order.getStstus().equals("Cenceled")))){
                rightCardLayout.show(pnlRight, "OrderStatus");
                jLabel38.setText(customer.getFirstName() +" "+ customer.getLastName() + "s' Order");
                jLabel39.setText("Order Placed On: " + new SimpleDateFormat("dd MMMM yyyy").format(order.getOrderDate()));
                jLabel40.setText("Will Arrive On: " + Order.findArivialTime(order.getOrderDate(), 7));
                jLabel43.setText("Order Total: £" + new DecimalFormat(".##").format(order.getOrderTotal()));
                jButton13.addActionListener((ActionEvent e) -> {
                    order.setStstus("Cenceled");
                    Order.updateOrderStatus(order);
                    jTable2.getSelectionModel().clearSelection();
                    DefaultTableModel dm = (DefaultTableModel)jTable2.getModel();
                    dm.getDataVector().removeAllElements();
                    populateTableAllOrdersSorted();
                    rightCardLayout.show(pnlRight, "Orders");
                });
            }else{
                JOptionPane.showMessageDialog(null, "The customer has already received their order.\nThe oder can not be canceled now!");
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        rightCardLayout.show(pnlRight, "Orders");
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(!jTextField9.getText().isEmpty()){
            jLabel37.setVisible(true);
            int orderId = Integer.parseInt(jTextField9.getText());
            jTextField9.setText(null);
            if(Order.findOrderByOrderId(orderId)){
		Executors.newSingleThreadExecutor().execute(() -> {
                    showOrderLineOrders(orderId, new Color(11,7,17), Color.WHITE);
		});
                rightCardLayout.show(pnlRight, "orderLines");
            }else{
                JOptionPane.showMessageDialog(null, "Order not Found");
            }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
        if(jTextField9.getText().isEmpty()){
            jLabel37.setText("Order ID");
            jLabel37.setVisible(true);
        }
    }//GEN-LAST:event_jTextField9FocusLost

    private void pnlOrdersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrdersMousePressed
        jTable2.getSelectionModel().clearSelection();
    }//GEN-LAST:event_pnlOrdersMousePressed

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        rightCardLayout.show(pnlRight, "Orders");
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        evts.findOrderByIdValidation(jTextField9, jLabel37);
        jTable2.getSelectionModel().clearSelection();
        
        var customer = Customer.getCustomerByUsername(String.valueOf(jTable3.getValueAt(jTable3.getSelectedRow(), 0)));
        jTable3.getSelectionModel().clearSelection();

        DefaultTableModel dm = (DefaultTableModel)jTable2.getModel();
        dm.getDataVector().removeAllElements();
        rightCardLayout.show(pnlRight, "Orders");
        
        populateTableOrdersSorted(customer);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void ProductsTableProductsCboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsTableProductsCboActionPerformed
        if(ProductsTableProductsCbo.getSelectedItem() == "All")
            populateTable();
        if(ProductsTableProductsCbo.getSelectedItem() == "Clothing")
            populateTableClothing();
        if(ProductsTableProductsCbo.getSelectedItem() == "Footwear")
            populateTableFootwear();
    }//GEN-LAST:event_ProductsTableProductsCboActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        allTheProductsEver();
        rightCardLayout.show(pnlRight, "AllProductsEver");
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void showOrderLineOrders(int orderId, Color panelColor, Color txtColor){
        var panel = OrderLines;
        int height = 0;
        
        panel.setLayout(new FlowLayout(0, 100, 35));
        panel.setOpaque(true);
        panel.setBackground(Color.WHITE);
        panel.removeAll();
        
        Customer customerDets = null;
        Order order = new Order();
        HashMap<String, Customer> customers = new DBManager().loadCustomer();
        for(Entry<String, Customer> cEntries : customers.entrySet()){
            var customer = cEntries.getValue();
            if(customer.getOrders().containsKey(orderId)){
                customerDets = customer;
                order = customer.getOrders().get(orderId);
            }
        }
        
        for(Entry<Integer, OrderLine> olEntry : order.getOrderLines().entrySet()){
            var orderLine = olEntry.getValue();
                
            var mainPanel = new RoundedPanel(30, panelColor);
            mainPanel.setLayout(null);
            mainPanel.setOpaque(false);
            mainPanel.setBackground(panelColor);
            mainPanel.setPreferredSize(new Dimension(600, 290));
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
            String pDate = String.valueOf("<html>Order Placed: "+new SimpleDateFormat("dd MMMM yyyy").format(order.getOrderDate())+"</html>");           
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
            
            String pUser = "<html>Dispatched To: " + customerDets.getFirstName() + " " + customerDets.getLastName() +"</html>";                      
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
            
            height+=340;
        }
        panel.setPreferredSize(new Dimension(800, height));
    }
    
    private void RefreshAllTabel(){
        jTable1.setModel(new DefaultTableModel());
        populateTable();
    }
    
    private void RefreshClothingTabel(){
        jTable1.setModel(new DefaultTableModel());
        populateTableClothing();
    }
    
    private void RefreshFootwearTabel(){
        jTable1.setModel(new DefaultTableModel());
        populateTableFootwear();
    }
    
    private void populateTable(){
        Executors.newSingleThreadExecutor().execute(() -> {
            ArrayList<Product> pList = db.ProductList();
            String [] colNames = {"Name", "Price", "Stock Level", "Product", "Image"};
            Object [] [] rows = new Object [pList.size()] [5];
            for(int i = 0; i < pList.size(); i ++){
                rows [i] [0] = pList.get(i).getProductName();
                rows [i] [1] = pList.get(i).getPrice();
                rows [i] [2] = pList.get(i).getStockLevel();
                rows [i] [3] = pList.get(i).getClass().getSimpleName();
                ImageIcon img = new ImageIcon(new ImageIcon(pList.get(i).getProductImage()).getImage()
                                                .getScaledInstance(100, 100, Image.SCALE_SMOOTH));
                rows [i] [4] = img;
            }
            jTable1.setModel(new TableModel(rows, colNames));
            jTable1.setRowHeight(120);
            tabelSettigns(jTable1, 4);
        });
    }
    
    private void populateTableClothing(){
        Executors.newSingleThreadExecutor().execute(() -> {
            ArrayList<Clothing> pList = db.ClothingList();
            String [] colNames = {"Name", "Price", "Stock Level", "Measurement", "Image"};
            Object [] [] rows = new Object [pList.size()] [5];
            for(int i = 0; i < pList.size(); i ++){
                rows [i] [0] = pList.get(i).getProductName();
                rows [i] [1] = pList.get(i).getPrice();
                rows [i] [2] = pList.get(i).getStockLevel();
                rows [i] [3] = pList.get(i).getMeasurement();
                rows [i] [4] = new ImageIcon(new ImageIcon(pList.get(i).getProductImage()).getImage()
                                     .getScaledInstance(100, 100, Image.SCALE_SMOOTH));
            }
            jTable1.setModel(new TableModel(rows, colNames));
            jTable1.setRowHeight(120);
            tabelSettigns(jTable1, 4);
        });
    }
    
    private void populateTableFootwear(){
        Executors.newSingleThreadExecutor().execute(() -> {
            ArrayList<Footwear> pList = db.FootwearList();
            String [] colNames = {"Name", "Price", "Stock Level", "Size", "Image"};
            Object [] [] rows = new Object [pList.size()] [5];
            for(int i = 0; i < pList.size(); i ++){
                rows [i] [0] = pList.get(i).getProductName();
                rows [i] [1] = pList.get(i).getPrice();
                rows [i] [2] = pList.get(i).getStockLevel();
                rows [i] [3] = pList.get(i).getSize();
                rows [i] [4] = new ImageIcon(new ImageIcon(pList.get(i).getProductImage()).getImage()
                                                .getScaledInstance(100, 100, Image.SCALE_SMOOTH));
            }
            jTable1.setModel(new TableModel(rows, colNames));
            jTable1.setRowHeight(120);
            tabelSettigns(jTable1, 4);
        });
    }
    
    private void searchProduct(String Value){
        Executors.newSingleThreadExecutor().execute(() -> {
            ArrayList<Product> pList = db.SearchProductList(Value);
            if(pList.isEmpty()){
                JOptionPane.showMessageDialog(null, "No Products Found");
            }else{
                String [] colNames = null;
                Object [] [] rows = new Object [pList.size()] [5];
                for(int i = 0; i < pList.size(); i ++){
                    for(Map.Entry<Integer, Product> productEntry : products.entrySet()){
                        var product = productEntry.getValue();
                        if(product.getProductName().equals(pList.get(i).getProductName())){
                            if(product.getClass().getName().equals("models.Footwear")){
                                String []sizeArr = {"Name", "Price", "Stock Level", "Size", "Image"};
                                colNames = sizeArr;
                                var footwear = (Footwear)product;
                                rows [i] [3] = footwear.getSize();
                            }else{
                                String []mesArr = {"Name", "Price", "Stock Level", "Measurement", "Image"};
                                colNames = mesArr;
                                var clothing = (Clothing)product;
                                rows [i] [3] = clothing.getMeasurement();
                            }
                            rows [i] [0] = pList.get(i).getProductName();
                            rows [i] [1] = pList.get(i).getPrice();
                            rows [i] [2] = pList.get(i).getStockLevel();
                            rows [i] [4] = new ImageIcon(new ImageIcon(pList.get(i).getProductImage()).getImage()
                                                            .getScaledInstance(100, 100, Image.SCALE_SMOOTH));
                        }
                    }  
                }
                jTable1.setModel(new TableModel(rows, colNames));
                jTable1.setRowHeight(120);
                tabelSettigns(jTable1, 4);
            }
        });
    }
    
    private void allTheProductsEver(){
        Executors.newSingleThreadExecutor().execute(() -> {
            var Model = (DefaultTableModel)jTable4.getModel();
            HashMap<Integer, Product> allProductsHashMap = SerProducts.deserializeHashMap();
            for(Entry<Integer, Product> product : allProductsHashMap.entrySet()){
                var p = product.getValue();
                
                if(p.getProductDeletedOn() == null){
                    Model.addRow(new Object[] {
                        p.getProductId(),
                        p.getProductName(),
                        new SimpleDateFormat("dd MMM yyyy").format(p.getProductAddedOn()),
                        "-",
                        p.isProductAvailible()
                    });
                }else{
                    Model.addRow(new Object[] {
                        p.getProductId(),
                        p.getProductName(),
                        new SimpleDateFormat("dd MMM yyyy").format(p.getProductAddedOn()),
                        new SimpleDateFormat("dd MMM yyyy").format(p.getProductDeletedOn()),
                        p.isProductAvailible()
                    });
                }
            }
            
            jTable4.setRowHeight(80);

            TableColumnModel columnModel = jTable4.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(30);
            columnModel.getColumn(1).setPreferredWidth(150);
            columnModel.getColumn(2).setPreferredWidth(150);
            columnModel.getColumn(3).setPreferredWidth(150);
            columnModel.getColumn(4).setPreferredWidth(50);

            JTableHeader datTable = jTable4.getTableHeader();
            ((DefaultTableCellRenderer)datTable.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            jTable4.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            jTable4.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            jTable4.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            jTable4.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
            jTable4.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

            tableHeaderSettings(jTable4);
        });
    }
    
    private void populateTableCustomers(){
        Executors.newSingleThreadExecutor().execute(() -> {
            var customersModel = (DefaultTableModel)jTable3.getModel();
            HashMap<String, Customer> customers = new DBManager().loadCustomer();
            for(Map.Entry<String, Customer> cusotmerEntry : customers.entrySet()){
                var customer = cusotmerEntry.getValue();
                customersModel.addRow(new Object[] {
                    customer.getUserName(),
                    customer.getFirstName() +" "+ customer.getLastName(),
                    customer.getAddressLine1(),
                    customer.getAddressLine2(),
                    customer.getTown(),
                    customer.getPostCode()
                });
            }
            jTable3.setRowHeight(80);

            TableColumnModel columnModel = jTable3.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(70);
            columnModel.getColumn(1).setPreferredWidth(100);
            columnModel.getColumn(2).setPreferredWidth(110);
            columnModel.getColumn(3).setPreferredWidth(110);
            columnModel.getColumn(4).setPreferredWidth(80);
            columnModel.getColumn(5).setPreferredWidth(70);

            JTableHeader datTable = jTable3.getTableHeader();
            ((DefaultTableCellRenderer)datTable.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            jTable3.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            jTable3.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            jTable3.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            jTable3.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
            jTable3.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
            jTable3.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );

            tableHeaderSettings(jTable3);
        }); 
    }
    
    private void populateTableAllOrdersSorted(){
        
        jTable2.setRowHeight(80);
        jTable2.setRowHeight(80);
        TableColumnModel columnModel = jTable2.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(200);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(150);

        JTableHeader datTable = jTable2.getTableHeader();
        ((DefaultTableCellRenderer)datTable.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jTable2.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jTable2.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jTable2.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jTable2.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        jTable2.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        tableHeaderSettings(jTable2);
            
        Executors.newSingleThreadExecutor().execute(() -> {    
            var previousOrdersModel = (DefaultTableModel)jTable2.getModel();
            HashMap<String, Customer> customers = new DBManager().loadCustomer();
            Map<Integer, Order> unsortMap = new HashMap<>();
            
            for(Entry<String, Customer> cusotmerEntry : customers.entrySet()){
                var customer = cusotmerEntry.getValue();
                for(Entry<Integer, Order> oEntry : customer.getOrders().entrySet()){
                    unsortMap.put(oEntry.getKey(), oEntry.getValue());
                }
            }
            
            Map<Integer, Order> sortedMap = SortMap.sortByComparator(unsortMap, true);
            for(Entry<Integer, Order> oEntry : sortedMap.entrySet()){
                var order = oEntry.getValue();
                previousOrdersModel.addRow(new Object[] {
                    order.getOrderId(),
                    Customer.getCustomerByOrderId(order.getOrderId()).getUserName(),
                    new SimpleDateFormat("dd MMM yyyy").format(order.getOrderDate()),
                    "£"+new DecimalFormat(".##").format(order.getOrderTotal()),
                    order.getStstus()
                });
            }
        });
    }
    
    private void populateTableOrdersSorted(Customer customer) {
        Executors.newSingleThreadExecutor().execute(() -> {
            jTable2.setRowHeight(80);
            jTable2.setRowHeight(80);
            TableColumnModel columnModel = jTable2.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(100);
            columnModel.getColumn(1).setPreferredWidth(200);
            columnModel.getColumn(2).setPreferredWidth(200);
            columnModel.getColumn(3).setPreferredWidth(150);
            columnModel.getColumn(4).setPreferredWidth(150);
            
            JTableHeader datTable = jTable2.getTableHeader();
            ((DefaultTableCellRenderer)datTable.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            jTable2.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            jTable2.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            jTable2.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            jTable2.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
            jTable2.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
            tableHeaderSettings(jTable2);
            
            var previousOrdersModel = (DefaultTableModel)jTable2.getModel();
            
            Map<Integer, Order> sortedMap = SortMap.sortByComparator(customer.getOrders(), true);
            for(Entry<Integer, Order> oEntry : sortedMap.entrySet()){
                var order = oEntry.getValue();
                previousOrdersModel.addRow(new Object[] {
                    order.getOrderId(),
                    customer.getUserName(),
                    new SimpleDateFormat("dd MMM yyyy").format(order.getOrderDate()),
                    "£"+new DecimalFormat(".##").format(order.getOrderTotal()),
                    order.getStstus()
                });
            }
        });
    }
    
    private void tabelSettigns(JTable table, int size){
        if(size == 6){
            TableColumnModel columnModel = table.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(20);
            columnModel.getColumn(1).setPreferredWidth(200);
            columnModel.getColumn(2).setPreferredWidth(120);
            columnModel.getColumn(3).setPreferredWidth(120);
            columnModel.getColumn(4).setPreferredWidth(120);
            columnModel.getColumn(5).setPreferredWidth(150);

            JTableHeader datTable = table.getTableHeader();
            ((DefaultTableCellRenderer)datTable.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        }
        if(size == 5){
            TableColumnModel columnModel = table.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(20);
            columnModel.getColumn(1).setPreferredWidth(200);
            columnModel.getColumn(2).setPreferredWidth(120);
            columnModel.getColumn(3).setPreferredWidth(120);
            columnModel.getColumn(4).setPreferredWidth(150);

            JTableHeader datTable = table.getTableHeader();
            ((DefaultTableCellRenderer)datTable.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        }
        if(size == 4){
            TableColumnModel columnModel = table.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(200);
            columnModel.getColumn(1).setPreferredWidth(70);
            columnModel.getColumn(2).setPreferredWidth(70);
            columnModel.getColumn(3).setPreferredWidth(150);

            JTableHeader datTable = table.getTableHeader();
            ((DefaultTableCellRenderer)datTable.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        }
        if(size == 3){
            TableColumnModel columnModel = table.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(100);
            columnModel.getColumn(1).setPreferredWidth(100);
            columnModel.getColumn(2).setPreferredWidth(100);
            columnModel.getColumn(3).setPreferredWidth(100);

            JTableHeader datTable = table.getTableHeader();
            ((DefaultTableCellRenderer)datTable.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            table.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        }
        tableHeaderSettings(table);
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
    
    private void setDashValues() {
        var processing = Order.countStatus(Enums.OrderStatus.PROCESSING);
        var dispatched = Order.countStatus(Enums.OrderStatus.DISPATCHED);
        var arrived = Order.countStatus(Enums.OrderStatus.ARRIVED);
        var canceled = Order.countStatus(Enums.OrderStatus.CANCELED);
        var total = Order.countStatus(Enums.OrderStatus.TOTAL);
        
        lblPending.setText(String.valueOf(processing));
        lblProcessed.setText(String.valueOf(dispatched));
        lblArrived.setText(String.valueOf(arrived));
        lblCanceled.setText(String.valueOf(canceled));
        lblTotal.setText(String.valueOf(total));
        
        var inStock = Product.getProductStock(ProductStock.IN_STOCK);
        var outOfStock = Product.getProductStock(ProductStock.OUT_OF_STOCK);
        var all = Product.getProductStock(ProductStock.ALL);
        
        lblProduct.setText(String.valueOf(all));
        lblInStock.setText(String.valueOf(inStock));
        lblOutOfStock.setText(String.valueOf(outOfStock));
        lblCategory.setText(String.valueOf(2));
        
    }
    
    private void unboughtProucts(){
        ArrayList<Integer> unboughtProducts = Product.getUnboughtProducts();
        for(var productId : unboughtProducts){
            var product = Product.getProductById(productId);
            System.out.println(product.getProductName());
        }
    }
    
    private void updateStatusForCustomers(){
        Executors.newSingleThreadExecutor().execute(() -> {
            Order.updateOrderStatusForEveryCustomer();
        }); 
    }
    
    private String greetTimeMsg(){
        int timeOfDay = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
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
    
    private void panelHover(){
        evts.setPanelHover(HomePageBtn, ind_Panel17);
        evts.setPanelHover(ManageProductsBtn, ind_Panel11);
        evts.setPanelHover(ManageCustomersBtn, ind_Panel13);
        evts.setPanelHover(ManageOrdersBtn, ind_Panel14);
        evts.setPanelHover(MyDetailsBtn, ind_Panel15);
        
        evts.resetPanelHower(HomePageBtn, ind_Panel17);
        evts.resetPanelHower(ManageProductsBtn, ind_Panel11);
        evts.resetPanelHower(ManageCustomersBtn, ind_Panel13);
        evts.resetPanelHower(ManageOrdersBtn, ind_Panel14);
        evts.resetPanelHower(MyDetailsBtn, ind_Panel15);
    }
    
    private void callHoverOnTextField(){
        evts.focusGained(jTextField10, jLabel1);
        evts.focusLost(jTextField10, jLabel1);
        
        evts.focusGained(jTextField11, jLabel18);
        evts.focusLost(jTextField11, jLabel18);
        
        evts.focusGained(jTextField12, jLabel28);
        evts.focusLost(jTextField12, jLabel28);
        
        evts.focusGained(jPasswordField1, jLabel2);
        evts.focusLost(jPasswordField1, jLabel2);
        
        evts.focusGained(jTextField13, jLabel19);
        evts.focusLost(jTextField13, jLabel19);
        
        evts.focusGained(jTextField14, jLabel27);
        evts.focusLost(jTextField14, jLabel27);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            //new ManagerView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePageBtn;
    private javax.swing.JPanel LogOut;
    private javax.swing.JPanel ManageCustomersBtn;
    private javax.swing.JPanel ManageOrdersBtn;
    private javax.swing.JPanel ManageProductsBtn;
    private javax.swing.JLabel ManagerMyDetailsHide;
    private javax.swing.JLabel ManagerMyDetailsShow;
    private javax.swing.JPanel MyDetailsBtn;
    private javax.swing.JPanel OrderLines;
    private javax.swing.JButton ProductsTableAddBtn;
    private javax.swing.JButton ProductsTableDeleteBtn;
    private static javax.swing.JComboBox<String> ProductsTableProductsCbo;
    private javax.swing.JButton ProductsTableSearchBtn;
    private javax.swing.JTextField ProductsTableSearchTxt;
    private javax.swing.JButton ProductsTableUpdateBtn;
    private javax.swing.JLabel bg;
    private javax.swing.JPanel ind_Panel11;
    private javax.swing.JPanel ind_Panel13;
    private javax.swing.JPanel ind_Panel14;
    private javax.swing.JPanel ind_Panel15;
    private javax.swing.JPanel ind_Panel17;
    private javax.swing.JPanel ind_Panel18;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    public volatile javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblArrived;
    private javax.swing.JLabel lblCanceled;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblInStock;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblOutOfStock;
    private javax.swing.JLabel lblPending;
    private javax.swing.JLabel lblProcessed;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnlActions;
    private javax.swing.JPanel pnlAddProduct;
    private javax.swing.JPanel pnlAllProductsEver;
    private javax.swing.JPanel pnlCustomers;
    private javax.swing.JPanel pnlDash;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMyDetails;
    private javax.swing.JPanel pnlNeProduct;
    private javax.swing.JPanel pnlOrderLines;
    private javax.swing.JPanel pnlOrderStatus;
    private javax.swing.JPanel pnlOrders;
    private javax.swing.JPanel pnlParent;
    private javax.swing.JPanel pnlProductUpdated;
    private javax.swing.JPanel pnlProductsTable;
    private javax.swing.JPanel pnlProfileUpdated;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel pnlUpdateProduct;
    private javax.swing.JPanel sidepane;
    private javax.swing.JLabel txtIcon;
    // End of variables declaration//GEN-END:variables



}
