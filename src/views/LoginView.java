package views;

import AppPackage.AnimationClass;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.Thread.sleep;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.DBManager;
import models.Events;
import models.Order;
import models.Customer;
import models.Product;
import models.SerProducts;
import models.User;

public final class LoginView extends javax.swing.JFrame {

    protected static final Preferences preference = Preferences.userNodeForPackage(LoginView.class);
    private final CardLayout cardLayout;
    private final CardLayout signUpCardLayout;
    AnimationClass animation = new AnimationClass();
    Events event = new Events();
    int xy, xx;
    
    public LoginView() {
        initComponents();
        cardLayout = (CardLayout) pnlLeft.getLayout();
        signUpCardLayout = (CardLayout) pnlSignUp.getLayout();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        
        SignIntxtUsername.setText(preference.get("Username", null));
        SignIntxtPassword.setText(preference.get("Password", null));
        jCheckBox1.setSelected(preference.getBoolean("RememberMe", false));
        
        SignInlblShow.hide();
        SignUplblShow.hide();
        newPasswordlblShow.hide();

        
//        SerProducts.serialiseHashMap(SerProducts.hashMapOfAllProducts());
        
//        SerProducts.testAddProuct(new Product(null, "testName3", 99.99, 99, null, new Date(), new Date(2021, 02, 17), false));
//        SerProducts.testAddProuct(new Product(null, "testName2", 99.99, 99, null, new Date(), new Date(2021, 02, 17), false));

//        HashMap<Integer, Product> map = SerProducts.deserializeHashMap();
//        SerProducts.testMap(map);
//        System.out.println("Size: "+ map.size());


//        System.out.println(SerProducts.compareHashMap());
//        
//        SerProducts.differenceOfHashMaps().forEach(key -> {
//            System.out.printf("Product ID: %s\n", key);
//        });
        
        
        loginEvts();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlParent = new javax.swing.JPanel();
        pnlLeft = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        SignIntxtUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        SignIntxtPassword = new javax.swing.JPasswordField();
        SignInlblHide = new javax.swing.JLabel();
        SignInlblShow = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        SignInlblForgotPasword = new javax.swing.JLabel();
        SignInBtnLogIn = new javax.swing.JButton();
        SignInBtnSignUp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlAskUsername = new javax.swing.JPanel();
        UpdatePasswordUsernametxt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Confirmusernamebtn = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        pnlUpdatePassword = new javax.swing.JPanel();
        SignIntxtPassword1 = new javax.swing.JPasswordField();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        newPasswordlblHide = new javax.swing.JLabel();
        newPasswordlblShow = new javax.swing.JLabel();
        SignIntxtPassword2 = new javax.swing.JPasswordField();
        jLabel44 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        NewPasswordConfirm = new javax.swing.JButton();
        NewPasswordCancelBtn = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        pnlPasswordUpdated = new javax.swing.JPanel();
        Confirmusernamebtn1 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        pnlSignUp = new javax.swing.JPanel();
        PnlAccount = new javax.swing.JPanel();
        PnlAccountAccount = new javax.swing.JLabel();
        PnlAccountAddress = new javax.swing.JLabel();
        PnlAccountSecurity = new javax.swing.JLabel();
        SignUplblUsernameHint = new javax.swing.JLabel();
        SignUptxtUsername = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        SignUplblUsernameError = new javax.swing.JLabel();
        SignUplblFullNameHint = new javax.swing.JLabel();
        SignUptxtFullName = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        SignUplblFullNameError = new javax.swing.JLabel();
        SignUplblPasswordHint = new javax.swing.JLabel();
        SignUplblHide = new javax.swing.JLabel();
        SignUplblShow = new javax.swing.JLabel();
        SignUptxtPassword = new javax.swing.JPasswordField();
        jLabel38 = new javax.swing.JLabel();
        SignUplblPasswordError = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PnlAddress = new javax.swing.JPanel();
        PnlAddressAccount = new javax.swing.JLabel();
        PnlAddressAddress = new javax.swing.JLabel();
        PnlAddressSecurity = new javax.swing.JLabel();
        SignUptxtAddressLine1 = new javax.swing.JTextField();
        SignUplblAddressLine1Error = new javax.swing.JLabel();
        SignUptxtAddressLine2 = new javax.swing.JTextField();
        SignUplblAddressLine2Error = new javax.swing.JLabel();
        SignUptxtTown = new javax.swing.JTextField();
        SignUplblTownError = new javax.swing.JLabel();
        SignUptxtPostcode = new javax.swing.JTextField();
        SignUplblPostcodeError = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PnlConfirmation = new javax.swing.JPanel();
        PnlSecurityAccount = new javax.swing.JLabel();
        PnlSecurityAddress = new javax.swing.JLabel();
        PnlSecuritySecurity = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ValidateUsername = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        ValidateFullName = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        ValidatePassword = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        ValidateAddress1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ValidateAddress2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        ValidateTown = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        ValidatePostCode = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PnlNewCustomer = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        pnlLoading = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlRightPanelMain = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Title Frame Test");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnlParent.setMaximumSize(new java.awt.Dimension(1000, 650));
        pnlParent.setMinimumSize(new java.awt.Dimension(1000, 650));
        pnlParent.setPreferredSize(new java.awt.Dimension(1000, 650));
        pnlParent.setLayout(new java.awt.BorderLayout());

        pnlLeft.setBackground(new java.awt.Color(255, 255, 255));
        pnlLeft.setForeground(new java.awt.Color(51, 51, 51));
        pnlLeft.setMaximumSize(new java.awt.Dimension(500, 650));
        pnlLeft.setMinimumSize(new java.awt.Dimension(500, 650));
        pnlLeft.setPreferredSize(new java.awt.Dimension(500, 650));
        pnlLeft.setLayout(new java.awt.CardLayout());

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });
        pnlLogin.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 175, 40, 220));

        SignIntxtUsername.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        SignIntxtUsername.setBorder(null);
        pnlLogin.add(SignIntxtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 221, 240, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setToolTipText("");
        pnlLogin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 217, 330, 48));

        SignIntxtPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        SignIntxtPassword.setBorder(null);
        pnlLogin.add(SignIntxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 342, 250, 40));

        SignInlblHide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignInlblHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_hide_20px.png"))); // NOI18N
        SignInlblHide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignInlblHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInlblHideMouseClicked(evt);
            }
        });
        pnlLogin.add(SignInlblHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 348, 30, 30));

        SignInlblShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignInlblShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_eye_20px.png"))); // NOI18N
        SignInlblShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignInlblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInlblShowMouseClicked(evt);
            }
        });
        pnlLogin.add(SignInlblShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 348, 30, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setToolTipText("");
        pnlLogin.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 338, 330, 48));

        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/uncheckedSmall.png"))); // NOI18N
        jCheckBox1.setOpaque(false);
        jCheckBox1.setPreferredSize(new java.awt.Dimension(13, 13));
        jCheckBox1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checkedSmall.png"))); // NOI18N
        pnlLogin.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 408, 30, 30));

        SignInlblForgotPasword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignInlblForgotPasword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInlblForgotPaswordMouseClicked(evt);
            }
        });
        pnlLogin.add(SignInlblForgotPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 408, 120, 30));

        SignInBtnLogIn.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        SignInBtnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        SignInBtnLogIn.setText("Log in");
        SignInBtnLogIn.setBorder(null);
        SignInBtnLogIn.setContentAreaFilled(false);
        SignInBtnLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignInBtnLogIn.setFocusable(false);
        SignInBtnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInBtnLogInActionPerformed(evt);
            }
        });
        pnlLogin.add(SignInBtnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 180, 40));

        SignInBtnSignUp.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        SignInBtnSignUp.setForeground(new java.awt.Color(153, 153, 153));
        SignInBtnSignUp.setText("Sign up");
        SignInBtnSignUp.setBorder(null);
        SignInBtnSignUp.setContentAreaFilled(false);
        SignInBtnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignInBtnSignUp.setFocusable(false);
        SignInBtnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignInBtnSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignInBtnSignUpMouseExited(evt);
            }
        });
        SignInBtnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInBtnSignUpActionPerformed(evt);
            }
        });
        pnlLogin.add(SignInBtnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 100, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoginBtn.png"))); // NOI18N
        pnlLogin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 210, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        pnlLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 650));

        pnlLeft.add(pnlLogin, "LogIn");
        pnlLogin.getAccessibleContext().setAccessibleParent(pnlParent);

        pnlAskUsername.setBackground(new java.awt.Color(255, 255, 255));
        pnlAskUsername.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpdatePasswordUsernametxt.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        UpdatePasswordUsernametxt.setBorder(null);
        pnlAskUsername.add(UpdatePasswordUsernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 267, 300, 40));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setToolTipText("");
        pnlAskUsername.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 263, 330, 48));

        Confirmusernamebtn.setBorder(null);
        Confirmusernamebtn.setBorderPainted(false);
        Confirmusernamebtn.setContentAreaFilled(false);
        Confirmusernamebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Confirmusernamebtn.setFocusPainted(false);
        Confirmusernamebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmusernamebtnActionPerformed(evt);
            }
        });
        pnlAskUsername.add(Confirmusernamebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 363, 330, 46));

        jLabel45.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 102, 0));
        pnlAskUsername.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 270, 20));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_left_25px.png"))); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel29MousePressed(evt);
            }
        });
        pnlAskUsername.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 60, 50));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/askUsername.png"))); // NOI18N
        pnlAskUsername.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 650));

        pnlLeft.add(pnlAskUsername, "askUsername");

        pnlUpdatePassword.setBackground(new java.awt.Color(255, 255, 255));
        pnlUpdatePassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignIntxtPassword1.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        SignIntxtPassword1.setBorder(null);
        pnlUpdatePassword.add(SignIntxtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 242, 270, 40));

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setToolTipText("");
        pnlUpdatePassword.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 237, 330, 48));

        jLabel42.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 102, 0));
        pnlUpdatePassword.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 282, 250, 20));

        newPasswordlblHide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newPasswordlblHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_hide_20px.png"))); // NOI18N
        newPasswordlblHide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newPasswordlblHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newPasswordlblHideMouseClicked(evt);
            }
        });
        pnlUpdatePassword.add(newPasswordlblHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 352, 30, 30));

        newPasswordlblShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newPasswordlblShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_eye_20px.png"))); // NOI18N
        newPasswordlblShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newPasswordlblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newPasswordlblShowMouseClicked(evt);
            }
        });
        pnlUpdatePassword.add(newPasswordlblShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 352, 30, 30));

        SignIntxtPassword2.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        SignIntxtPassword2.setBorder(null);
        pnlUpdatePassword.add(SignIntxtPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 347, 270, 40));

        jLabel44.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 102, 0));
        pnlUpdatePassword.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 250, 20));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setToolTipText("");
        pnlUpdatePassword.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 343, 330, 48));

        NewPasswordConfirm.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        NewPasswordConfirm.setForeground(new java.awt.Color(255, 255, 255));
        NewPasswordConfirm.setBorder(null);
        NewPasswordConfirm.setContentAreaFilled(false);
        NewPasswordConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewPasswordConfirm.setFocusPainted(false);
        NewPasswordConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPasswordConfirmActionPerformed(evt);
            }
        });
        pnlUpdatePassword.add(NewPasswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 468, 330, 41));

        NewPasswordCancelBtn.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        NewPasswordCancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewPasswordCancelBtn.setBorder(null);
        NewPasswordCancelBtn.setContentAreaFilled(false);
        NewPasswordCancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewPasswordCancelBtn.setFocusPainted(false);
        NewPasswordCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPasswordCancelBtnActionPerformed(evt);
            }
        });
        pnlUpdatePassword.add(NewPasswordCancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 520, 330, 41));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/newPassword.png"))); // NOI18N
        pnlUpdatePassword.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 650));

        pnlLeft.add(pnlUpdatePassword, "updatePassword");

        pnlPasswordUpdated.setBackground(new java.awt.Color(255, 255, 255));
        pnlPasswordUpdated.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Confirmusernamebtn1.setBorder(null);
        Confirmusernamebtn1.setBorderPainted(false);
        Confirmusernamebtn1.setContentAreaFilled(false);
        Confirmusernamebtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Confirmusernamebtn1.setFocusPainted(false);
        Confirmusernamebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirmusernamebtn1ActionPerformed(evt);
            }
        });
        pnlPasswordUpdated.add(Confirmusernamebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 466, 330, 46));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/passwordUpdated.png"))); // NOI18N
        pnlPasswordUpdated.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 650));

        pnlLeft.add(pnlPasswordUpdated, "PasswordUpdated");

        pnlSignUp.setBackground(new java.awt.Color(255, 255, 255));
        pnlSignUp.setMaximumSize(new java.awt.Dimension(500, 650));
        pnlSignUp.setMinimumSize(new java.awt.Dimension(500, 650));
        pnlSignUp.setPreferredSize(new java.awt.Dimension(500, 650));
        pnlSignUp.setLayout(new java.awt.CardLayout());

        PnlAccount.setMaximumSize(new java.awt.Dimension(500, 650));
        PnlAccount.setMinimumSize(new java.awt.Dimension(500, 650));
        PnlAccount.setPreferredSize(new java.awt.Dimension(500, 650));
        PnlAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlAccountAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlAccount.add(PnlAccountAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 42, 27, 28));

        PnlAccountAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlAccountAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlAccountAddressMouseClicked(evt);
            }
        });
        PnlAccount.add(PnlAccountAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 42, 29, 28));

        PnlAccountSecurity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlAccountSecurity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlAccountSecurityMouseClicked(evt);
            }
        });
        PnlAccount.add(PnlAccountSecurity, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 41, 28, 29));

        SignUplblUsernameHint.setBackground(new java.awt.Color(255, 255, 255));
        SignUplblUsernameHint.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        SignUplblUsernameHint.setForeground(new java.awt.Color(204, 204, 204));
        SignUplblUsernameHint.setText("At least 3 characters");
        SignUplblUsernameHint.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PnlAccount.add(SignUplblUsernameHint, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 276, 140, 20));

        SignUptxtUsername.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        SignUptxtUsername.setBorder(null);
        SignUptxtUsername.setOpaque(false);
        PnlAccount.add(SignUptxtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 267, 280, 40));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setToolTipText("");
        PnlAccount.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 263, 330, 48));

        SignUplblUsernameError.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        SignUplblUsernameError.setForeground(new java.awt.Color(102, 51, 255));
        PnlAccount.add(SignUplblUsernameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 300, 20));

        SignUplblFullNameHint.setBackground(new java.awt.Color(255, 255, 255));
        SignUplblFullNameHint.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        SignUplblFullNameHint.setForeground(new java.awt.Color(204, 204, 204));
        SignUplblFullNameHint.setText("John Doe");
        SignUplblFullNameHint.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PnlAccount.add(SignUplblFullNameHint, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 377, 140, 20));

        SignUptxtFullName.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        SignUptxtFullName.setBorder(null);
        SignUptxtFullName.setOpaque(false);
        PnlAccount.add(SignUptxtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 368, 280, 40));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setToolTipText("");
        PnlAccount.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 364, 330, 48));

        SignUplblFullNameError.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        SignUplblFullNameError.setForeground(new java.awt.Color(102, 51, 255));
        PnlAccount.add(SignUplblFullNameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 409, 300, 20));

        SignUplblPasswordHint.setBackground(new java.awt.Color(255, 255, 255));
        SignUplblPasswordHint.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        SignUplblPasswordHint.setForeground(new java.awt.Color(204, 204, 204));
        SignUplblPasswordHint.setText("At least 5 characters");
        SignUplblPasswordHint.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PnlAccount.add(SignUplblPasswordHint, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 478, 140, 20));

        SignUplblHide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignUplblHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_hide_20px.png"))); // NOI18N
        SignUplblHide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUplblHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUplblHideMouseClicked(evt);
            }
        });
        PnlAccount.add(SignUplblHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 473, 30, 30));

        SignUplblShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignUplblShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_eye_20px.png"))); // NOI18N
        SignUplblShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUplblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUplblShowMouseClicked(evt);
            }
        });
        PnlAccount.add(SignUplblShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 473, 30, 30));

        SignUptxtPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        SignUptxtPassword.setBorder(null);
        SignUptxtPassword.setOpaque(false);
        PnlAccount.add(SignUptxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 469, 260, 40));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setToolTipText("");
        PnlAccount.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 465, 330, 48));

        SignUplblPasswordError.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        SignUplblPasswordError.setForeground(new java.awt.Color(102, 51, 255));
        PnlAccount.add(SignUplblPasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 512, 300, 20));

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancel");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PnlAccount.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 564, 180, 45));

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Next Step");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PnlAccount.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 565, 130, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoginBtn.png"))); // NOI18N
        PnlAccount.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 210, 100));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pnlAccount.png"))); // NOI18N
        PnlAccount.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 650));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PnlAccount.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 310, 160));

        pnlSignUp.add(PnlAccount, "account");

        PnlAddress.setMaximumSize(new java.awt.Dimension(500, 650));
        PnlAddress.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlAddressAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlAddressAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlAddressAccountMouseClicked(evt);
            }
        });
        PnlAddress.add(PnlAddressAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 44, 26, 26));

        PnlAddressAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlAddress.add(PnlAddressAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 44, 26, 26));

        PnlAddressSecurity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlAddressSecurity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlAddressSecurityMouseClicked(evt);
            }
        });
        PnlAddress.add(PnlAddressSecurity, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 44, 26, 26));

        SignUptxtAddressLine1.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        SignUptxtAddressLine1.setBorder(null);
        PnlAddress.add(SignUptxtAddressLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 166, 280, 40));

        SignUplblAddressLine1Error.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        SignUplblAddressLine1Error.setForeground(new java.awt.Color(102, 51, 255));
        PnlAddress.add(SignUplblAddressLine1Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 300, 20));

        SignUptxtAddressLine2.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        SignUptxtAddressLine2.setBorder(null);
        PnlAddress.add(SignUptxtAddressLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 267, 280, 40));

        SignUplblAddressLine2Error.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        SignUplblAddressLine2Error.setForeground(new java.awt.Color(102, 51, 255));
        PnlAddress.add(SignUplblAddressLine2Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 300, 20));

        SignUptxtTown.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        SignUptxtTown.setBorder(null);
        PnlAddress.add(SignUptxtTown, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 368, 280, 40));

        SignUplblTownError.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        SignUplblTownError.setForeground(new java.awt.Color(102, 51, 255));
        PnlAddress.add(SignUplblTownError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 412, 300, 20));

        SignUptxtPostcode.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        SignUptxtPostcode.setBorder(null);
        PnlAddress.add(SignUptxtPostcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 469, 280, 40));

        SignUplblPostcodeError.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        SignUplblPostcodeError.setForeground(new java.awt.Color(102, 51, 255));
        PnlAddress.add(SignUplblPostcodeError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 513, 300, 20));

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 153, 153));
        jButton5.setText("Cancel");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        PnlAddress.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 564, 110, 45));

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Skip");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        PnlAddress.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 564, 180, 45));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoginBtn.png"))); // NOI18N
        PnlAddress.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 210, 100));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pnlAddress.png"))); // NOI18N
        PnlAddress.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 650));

        pnlSignUp.add(PnlAddress, "address");

        PnlConfirmation.setMaximumSize(new java.awt.Dimension(500, 650));
        PnlConfirmation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlSecurityAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlSecurityAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlSecurityAccountMouseClicked(evt);
            }
        });
        PnlConfirmation.add(PnlSecurityAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 44, 26, 26));

        PnlSecurityAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlSecurityAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlSecurityAddressMouseClicked(evt);
            }
        });
        PnlConfirmation.add(PnlSecurityAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 44, 26, 26));

        PnlSecuritySecurity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlConfirmation.add(PnlSecuritySecurity, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 44, 26, 26));

        jLabel16.setBackground(new java.awt.Color(204, 204, 255));
        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Username:");
        PnlConfirmation.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 105, 30));

        jLabel18.setBackground(new java.awt.Color(204, 204, 255));
        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Full Name:");
        PnlConfirmation.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 105, 30));

        jLabel17.setBackground(new java.awt.Color(204, 204, 255));
        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Password:");
        PnlConfirmation.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 105, 30));

        jLabel23.setBackground(new java.awt.Color(204, 204, 255));
        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Address Line:");
        PnlConfirmation.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 105, 30));

        jLabel24.setBackground(new java.awt.Color(204, 204, 255));
        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Address Line 2:");
        PnlConfirmation.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 105, 30));

        jLabel25.setBackground(new java.awt.Color(204, 204, 255));
        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Town:");
        PnlConfirmation.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 105, 30));

        jLabel26.setBackground(new java.awt.Color(204, 204, 255));
        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Postcode:");
        PnlConfirmation.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 105, 30));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PnlConfirmation.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 30, 30));

        ValidateUsername.setEditable(false);
        ValidateUsername.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        ValidateUsername.setBorder(null);
        ValidateUsername.setOpaque(false);
        PnlConfirmation.add(ValidateUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 180, 30));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PnlConfirmation.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 30, 30));

        ValidateFullName.setEditable(false);
        ValidateFullName.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        ValidateFullName.setBorder(null);
        ValidateFullName.setOpaque(false);
        PnlConfirmation.add(ValidateFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 180, 30));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PnlConfirmation.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 30, 30));

        ValidatePassword.setEditable(false);
        ValidatePassword.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        ValidatePassword.setBorder(null);
        ValidatePassword.setOpaque(false);
        PnlConfirmation.add(ValidatePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 180, 30));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PnlConfirmation.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 30, 30));

        ValidateAddress1.setEditable(false);
        ValidateAddress1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        ValidateAddress1.setBorder(null);
        ValidateAddress1.setOpaque(false);
        PnlConfirmation.add(ValidateAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 180, 30));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PnlConfirmation.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 30, 30));

        ValidateAddress2.setEditable(false);
        ValidateAddress2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        ValidateAddress2.setBorder(null);
        ValidateAddress2.setOpaque(false);
        PnlConfirmation.add(ValidateAddress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 180, 30));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PnlConfirmation.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 30, 30));

        ValidateTown.setEditable(false);
        ValidateTown.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        ValidateTown.setBorder(null);
        ValidateTown.setOpaque(false);
        PnlConfirmation.add(ValidateTown, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 180, 30));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PnlConfirmation.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 30, 30));

        ValidatePostCode.setEditable(false);
        ValidatePostCode.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        ValidatePostCode.setBorder(null);
        ValidatePostCode.setOpaque(false);
        PnlConfirmation.add(ValidatePostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 180, 30));

        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/uncheckedSmall.png"))); // NOI18N
        jCheckBox2.setOpaque(false);
        jCheckBox2.setPreferredSize(new java.awt.Dimension(13, 13));
        jCheckBox2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checkedSmall.png"))); // NOI18N
        PnlConfirmation.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 471, 20, 20));

        jLabel32.setBackground(new java.awt.Color(204, 204, 255));
        jLabel32.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel32.setText("Please agree to");
        PnlConfirmation.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 90, 20));

        jLabel33.setBackground(new java.awt.Color(204, 204, 255));
        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 204));
        jLabel33.setText("our terms of service");
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlConfirmation.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, 20));

        jLabel34.setBackground(new java.awt.Color(204, 204, 255));
        jLabel34.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel34.setText("and");
        PnlConfirmation.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 20, 20));

        jLabel35.setBackground(new java.awt.Color(204, 204, 255));
        jLabel35.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 204));
        jLabel35.setText("privacy policy.");
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlConfirmation.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 90, 20));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PnlConfirmation.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 544, 330, 45));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/createAccount.png"))); // NOI18N
        PnlConfirmation.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 350, 60));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pnlSecurity.png"))); // NOI18N
        PnlConfirmation.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 650));

        pnlSignUp.add(PnlConfirmation, "confirmation");

        PnlNewCustomer.setMaximumSize(new java.awt.Dimension(500, 650));
        PnlNewCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PnlNewCustomer.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 468, 330, 41));

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/newUser.png"))); // NOI18N
        PnlNewCustomer.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 650));

        pnlSignUp.add(PnlNewCustomer, "newCustomer");

        pnlLeft.add(pnlSignUp, "SignUp");

        pnlLoading.setBackground(new java.awt.Color(255, 255, 255));
        pnlLoading.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logingif.gif"))); // NOI18N
        pnlLoading.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 650));

        jLabel50.setBackground(new java.awt.Color(153, 153, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyLoginPage.png"))); // NOI18N
        pnlLoading.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 650));

        pnlLeft.add(pnlLoading, "Loading");

        pnlParent.add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlRight.setBackground(new java.awt.Color(102, 0, 204));
        pnlRight.setMaximumSize(new java.awt.Dimension(500, 650));
        pnlRight.setMinimumSize(new java.awt.Dimension(500, 650));
        pnlRight.setPreferredSize(new java.awt.Dimension(500, 650));
        pnlRight.setLayout(new java.awt.BorderLayout());

        pnlTop.setBackground(new java.awt.Color(255, 255, 255));
        pnlTop.setMaximumSize(new java.awt.Dimension(100, 100));
        pnlTop.setMinimumSize(new java.awt.Dimension(100, 100));
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
        pnlTop.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_minus_25px.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel10MouseReleased(evt);
            }
        });
        pnlTop.add(jLabel10);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_multiply_25px.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel11MouseReleased(evt);
            }
        });
        pnlTop.add(jLabel11);

        jLabel12.setText("   ");
        pnlTop.add(jLabel12);

        pnlRight.add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlRightPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlRightPanelMain.setMaximumSize(new java.awt.Dimension(500, 550));
        pnlRightPanelMain.setMinimumSize(new java.awt.Dimension(500, 550));
        pnlRightPanelMain.setPreferredSize(new java.awt.Dimension(500, 550));
        pnlRightPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });
        pnlRightPanelMain.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 310, 220));

        jLabel49.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 204));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("View Shop");
        pnlRightPanelMain.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 90, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/right.png"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 550));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 550));
        pnlRightPanelMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, -1, 600));

        pnlRight.add(pnlRightPanelMain, java.awt.BorderLayout.LINE_END);

        pnlParent.add(pnlRight, java.awt.BorderLayout.LINE_END);

        getContentPane().add(pnlParent);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTopMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnlTopMousePressed

    private void pnlTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTopMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnlTopMouseDragged

    private void jLabel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseReleased
        LoginView.this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseReleased

    private void jLabel11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseReleased
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseReleased

    private void SignInBtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInBtnSignUpActionPerformed
        animation.jLabelXRight(70, 230, 50, 15, jLabel6);
        SignInBtnSignUp.setForeground(new Color(255, 255, 255));
        SignInBtnLogIn.setForeground(new Color(153,153,153));
        cardLayout.show(pnlLeft, "SignUp");
        animation.jLabelXRight(230, 70, 150, 15, jLabel6);
//        event.mouseEntered(jLabel22, jLabel14);
//        event.mouseExited(jLabel22, jLabel14);
        signupEvts();
        verifyDetails();
    }//GEN-LAST:event_SignInBtnSignUpActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cardLayout.show(pnlLeft, "LogIn");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void SignInBtnSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInBtnSignUpMouseEntered
        animation.jLabelXRight(80, 230, 10, 10, jLabel6);
        setTimeout(() -> SignInBtnSignUp.setForeground(new Color(255, 255, 255)), 100);
        setTimeout(() -> jButton4.setForeground(new Color(153,153,153)), 100);
    }//GEN-LAST:event_SignInBtnSignUpMouseEntered

    private void SignInBtnSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInBtnSignUpMouseExited
        animation.jLabelXLeft(230, 80, 10, 10, jLabel6);
        setTimeout(() -> SignInBtnSignUp.setForeground(new Color(153,153,153)), 100);
        setTimeout(() -> jButton4.setForeground(new Color(255, 255, 255)), 100);
    }//GEN-LAST:event_SignInBtnSignUpMouseExited
    
    private void SignInlblHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInlblHideMouseClicked
        SignIntxtPassword.setEchoChar((char)0);
        SignInlblShow.show();
        SignInlblHide.hide();
    }//GEN-LAST:event_SignInlblHideMouseClicked

    private void SignInlblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInlblShowMouseClicked
        SignIntxtPassword.setEchoChar('\u2022');
        SignInlblHide.show();
        SignInlblShow.hide();
    }//GEN-LAST:event_SignInlblShowMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        signUpCardLayout.show(pnlSignUp, "address");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void PnlAccountAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlAccountAddressMouseClicked
        if(jButton4.isVisible())
            signUpCardLayout.show(pnlSignUp, "address");
        else{
            SignUplblUsernameError.setForeground(new Color(204,0,51));
            SignUplblFullNameError.setForeground(new Color(204,0,51));
            SignUplblPasswordError.setForeground(new Color(204,0,51));
            
            setTimeout(() -> SignUplblUsernameError.setForeground(new Color(102,51,255)), 800);
            setTimeout(() -> SignUplblFullNameError.setForeground(new Color(102,51,255)), 800);
            setTimeout(() -> SignUplblPasswordError.setForeground(new Color(102,51,255)), 800);
        }
    }//GEN-LAST:event_PnlAccountAddressMouseClicked

    private void PnlAccountSecurityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlAccountSecurityMouseClicked
        signUpCardLayout.show(pnlSignUp, "security");
    }//GEN-LAST:event_PnlAccountSecurityMouseClicked

    private void PnlAddressAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlAddressAccountMouseClicked
        signUpCardLayout.show(pnlSignUp, "account");
    }//GEN-LAST:event_PnlAddressAccountMouseClicked

    private void PnlAddressSecurityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlAddressSecurityMouseClicked
        signUpCardLayout.show(pnlSignUp, "security");
    }//GEN-LAST:event_PnlAddressSecurityMouseClicked

    private void PnlSecurityAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlSecurityAccountMouseClicked
        signUpCardLayout.show(pnlSignUp, "account");
    }//GEN-LAST:event_PnlSecurityAccountMouseClicked

    private void PnlSecurityAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlSecurityAddressMouseClicked
        signUpCardLayout.show(pnlSignUp, "address");
    }//GEN-LAST:event_PnlSecurityAddressMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cardLayout.show(pnlLeft, "LogIn");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        signUpCardLayout.show(pnlSignUp, "confirmation");
        
        ValidateUsername.setText(SignUptxtUsername.getText());
        ValidateFullName.setText(SignUptxtFullName.getText());
        ValidatePassword.setText(SignUptxtPassword.getText());
        
        event.setProps(SignUptxtAddressLine1, jLabel23, ValidateAddress1, jLabel27);
        event.setProps(SignUptxtAddressLine2, jLabel24, ValidateAddress2, jLabel28);
        event.setProps(SignUptxtTown, jLabel25, ValidateTown, jLabel30);
        event.setProps(SignUptxtPostcode, jLabel26, ValidatePostCode, jLabel31);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void SignInBtnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInBtnLogInActionPerformed
        String userName = SignIntxtUsername.getText();
        String password = SignIntxtPassword.getText();
        
        if(!(userName.isEmpty() || password.isEmpty())){
            Executors.newSingleThreadExecutor().execute(() -> {
                cardLayout.show(pnlLeft, "Loading");
                var customer = new DBManager().customerLogin(userName, password);
                var staff = new DBManager().StaffLogin(userName, password);
                if(customer != null){
                    if(jCheckBox1.isSelected()){
                        preference.put("Username", userName);
                        preference.put("Password", password);
                        preference.putBoolean("RememberMe", jCheckBox1.isSelected());
                    }else{
                        try {
                            preference.clear();
                        } catch (BackingStoreException ex) { System.out.println(ex.getLocalizedMessage()); }
                    }
                    new CustomerView(customer, deserializeHashMap(customer.getUserName())).setVisible(true);
                    this.dispose();
                }else if(staff != null){
                    if(jCheckBox1.isSelected()){
                        preference.put("Username", userName);
                        preference.put("Password", password);
                        preference.putBoolean("RememberMe", jCheckBox1.isSelected());
                    }else{
                        try {
                            preference.clear();
                        } catch (BackingStoreException ex) { System.out.println(ex.getLocalizedMessage()); }
                    }
                    new ManagerView(staff).setVisible(true);
                    this.dispose(); 
                }else{
                    cardLayout.show(pnlLeft, "LogIn");
                    JOptionPane.showMessageDialog(null, "user not found");
                }
            });
        }else{
            cardLayout.show(pnlLeft, "LogIn");
            JOptionPane.showMessageDialog(null, "Password or Usernme is Empty");
        }
    }//GEN-LAST:event_SignInBtnLogInActionPerformed

    private void SignInlblForgotPaswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInlblForgotPaswordMouseClicked
        cardLayout.show(pnlLeft, "askUsername");
        newPasswordEvts();
    }//GEN-LAST:event_SignInlblForgotPaswordMouseClicked

    private void ConfirmusernamebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmusernamebtnActionPerformed
        String usernname = UpdatePasswordUsernametxt.getText().trim();
        if(new DBManager().userExists(usernname))
            cardLayout.show(pnlLeft, "updatePassword");
        else{
            UpdatePasswordUsernametxt.requestFocus();
            jLabel45.setText("User not found!");
        }
    }//GEN-LAST:event_ConfirmusernamebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jCheckBox2.isSelected()){
            String[] fullname = SignUptxtFullName.getText().split(" ");

            String username = SignUptxtUsername.getText();
            String password = SignUptxtPassword.getText();
            String firstName = fullname[0];
            String lastName = fullname[1];

            String address1 = SignUptxtAddressLine1.getText();
            String address2 = SignUptxtAddressLine2.getText();
            String town = SignUptxtTown.getText();
            String postcode = SignUptxtPostcode.getText();
            try{
                if(!SignUptxtAddressLine1.getText().isEmpty() && !SignUptxtAddressLine2.getText().isEmpty() && 
                            !SignUptxtTown.getText().isEmpty() && !SignUptxtPostcode.getText().isEmpty()){
                    var customer = new Customer(username, password, firstName, lastName, address1, address2, town, postcode);
                    new DBManager().registerCustomer(customer);
                }else{
                    var customer = new Customer(username, password, firstName, lastName, address1, address2, town, postcode);
                    new DBManager().registerCustomer(customer);
                }
                signUpCardLayout.show(pnlSignUp, "newCustomer"); 
            }catch(NullPointerException ex){
                signUpCardLayout.show(pnlSignUp, "account"); 
                SignUptxtUsername.requestFocus();
                JOptionPane.showMessageDialog(null, "\""+username+"\" is unavailible, please choose a different Username!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please agree to our privacy policy.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cardLayout.show(pnlLeft, "LogIn");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MousePressed
        cardLayout.show(pnlLeft, "LogIn");
    }//GEN-LAST:event_jLabel29MousePressed

    private void NewPasswordConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPasswordConfirmActionPerformed
        Thread clock = new Thread(){
            @Override
            public void run(){
                try {
                    jLabel40.hide();
                    jLabel39.hide();
                    sleep(100);
                    SignIntxtPassword1.requestFocus();
                    sleep(80);
                    SignIntxtPassword2.requestFocus();
                    sleep(80);
                    NewPasswordConfirm.requestFocus();
                    sleep(300);
                    jLabel40.show();
                    jLabel39.show();
                } catch (InterruptedException ex) {}
            }
        };
        clock.start();

        if(jLabel42.getText().isBlank() && jLabel44.getText().isBlank()){
            if((SignIntxtPassword1.getText().equals(SignIntxtPassword2.getText()) && 
                    !SignIntxtPassword1.getText().isEmpty() && !SignIntxtPassword2.getText().isEmpty())){
                String username = UpdatePasswordUsernametxt.getText().trim();
                String newPassword = SignIntxtPassword1.getText().trim();
                new DBManager().updateUserPassword(username, newPassword); 
                cardLayout.show(pnlLeft, "PasswordUpdated");
            }else{
                JOptionPane.showMessageDialog(null, "Passwords dont match.");
                SignIntxtPassword1.requestFocus();
            }
        }
    }//GEN-LAST:event_NewPasswordConfirmActionPerformed

    private void newPasswordlblHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newPasswordlblHideMouseClicked
        SignIntxtPassword1.setEchoChar((char)0);
        SignIntxtPassword2.setEchoChar((char)0);
        newPasswordlblShow.show();
        newPasswordlblHide.hide();
    }//GEN-LAST:event_newPasswordlblHideMouseClicked

    private void newPasswordlblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newPasswordlblShowMouseClicked
        SignIntxtPassword1.setEchoChar('\u2022');
        SignIntxtPassword2.setEchoChar('\u2022');
        newPasswordlblHide.show();
        newPasswordlblShow.hide();
    }//GEN-LAST:event_newPasswordlblShowMouseClicked

    private void NewPasswordCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPasswordCancelBtnActionPerformed
        cardLayout.show(pnlLeft, "LogIn");
    }//GEN-LAST:event_NewPasswordCancelBtnActionPerformed

    private void Confirmusernamebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirmusernamebtn1ActionPerformed
        cardLayout.show(pnlLeft, "LogIn");
    }//GEN-LAST:event_Confirmusernamebtn1ActionPerformed

    private void SignUplblHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUplblHideMouseClicked
        SignUptxtPassword.setEchoChar((char)0);
        SignUplblShow.show();
        SignUplblHide.hide(); 
    }//GEN-LAST:event_SignUplblHideMouseClicked

    private void SignUplblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUplblShowMouseClicked
        SignUptxtPassword.setEchoChar('\u2022');
        SignUplblHide.show();
        SignUplblShow.hide();
    }//GEN-LAST:event_SignUplblShowMouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        new VisitorView(new User()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        new VisitorView(new User()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel52MouseClicked
        
    private Order deserializeHashMap(String customer){
        try{
            File f = new File("files\\"+customer+".ser");
            if(f.exists() && !f.isDirectory()) { 
                FileInputStream fis = new FileInputStream("files\\"+customer+".ser");
                ObjectInputStream ois = new ObjectInputStream(fis);
                var order = (Order)ois.readObject();
                ois.close();
                fis.close();
                return order;
            }else{
                return new Order();
            }
        }catch (IOException | ClassNotFoundException ex) {
            System.out.println("File Doesn't Exist!");
        }
        return new Order();
    }
    
    private void loginEvts(){
        event.focusGained(SignIntxtUsername, jLabel9);
        event.focusLost(SignIntxtUsername, jLabel9);
        
        event.focusGained(SignIntxtPassword, jLabel13);
        event.focusLost(SignIntxtPassword, jLabel13);
    }
     
    private void newPasswordEvts(){
        //----------------------------------------ASKUSERNAME----------------------------------------------------------
        event.focusGained(UpdatePasswordUsernametxt, jLabel22);
        event.focusLost(UpdatePasswordUsernametxt, jLabel22);
        
        event.limitedMinInput(UpdatePasswordUsernametxt, jLabel45, 3, "Must contain at least 3 characters!", "Can't be empty");
        event.limitedMaxInput(UpdatePasswordUsernametxt, jLabel45,  14, false);
        //----------------------------------------NEWPASSWORD----------------------------------------------------------
        event.focusGained(SignIntxtPassword1, jLabel40);
        event.focusLost(SignIntxtPassword1, jLabel40);
        
        event.focusGained(SignIntxtPassword2, jLabel39);
        event.focusLost(SignIntxtPassword2, jLabel39);
        
        event.limitedMinInputPassword(SignIntxtPassword1, jLabel42);
        event.limitedMaxInput(SignIntxtPassword1, jLabel42, 20, true);
        
        event.limitedMinInputPassword(SignIntxtPassword2, jLabel44);
        event.limitedMaxInput(SignIntxtPassword2, jLabel44, 20, true);  
    }
    
    private void signupEvts(){
        //----------------------------------------ACCOUNT----------------------------------------------------------
        event.limitedMinInput(SignUptxtUsername, SignUplblUsernameError, 3, "Must contain at least 3 characters!", "Can't be empty");
        event.limitedMaxInput(SignUptxtUsername, SignUplblUsernameError,  14, false);
        
        event.limitedMinInputPassword(SignUptxtPassword, SignUplblPasswordError);
        event.limitedMaxInput(SignUptxtPassword, SignUplblPasswordError, 20, true);
        
        event.validateFullName(SignUptxtFullName, SignUplblFullNameError);
        event.limitedMaxInputFullName(SignUptxtFullName, SignUplblFullNameError, 27);
        
        //-------------------------
        event.hideHintFocusGained(SignUptxtUsername, SignUplblUsernameHint);
        event.hideHintFocusLost(SignUptxtUsername, SignUplblUsernameHint);
        
        event.hideHintFocusGained(SignUptxtFullName, SignUplblFullNameHint);
        event.hideHintFocusLost(SignUptxtFullName, SignUplblFullNameHint);
        
        event.hideHintFocusGained(SignUptxtPassword, SignUplblPasswordHint);
        event.hideHintFocusLost(SignUptxtPassword, SignUplblPasswordHint);
        
        //focus gained/lost
        event.focusGained(SignUptxtUsername, jLabel36);
        event.focusLost(SignUptxtUsername, jLabel36);
        
        event.focusGained(SignUptxtFullName, jLabel37);
        event.focusLost(SignUptxtFullName, jLabel37);
        
        event.focusGained(SignUptxtPassword, jLabel38);
        event.focusLost(SignUptxtPassword, jLabel38);
        
        //----------------------------------------ADDRESS----------------------------------------------------------
        event.limitedMinInput(SignUptxtAddressLine1, SignUplblAddressLine1Error, 5, "Must contain at least 5 characters!", "Can't be empty");
        event.limitedMaxInput(SignUptxtAddressLine1, SignUplblAddressLine1Error, 20, true);
        
        event.limitedMinInput(SignUptxtAddressLine2, SignUplblAddressLine2Error, 5, "Must contain at least 5 characters!", "");
        event.limitedMaxInput(SignUptxtAddressLine2, SignUplblAddressLine2Error, 20, true);
        
        event.limitedMinInput(SignUptxtTown, SignUplblTownError, 4, "Must contain at least 4 characters!", "Can't be empty");
        event.limitedMaxInput(SignUptxtTown, SignUplblTownError, 15, false);
        
        event.limitedMinInput(SignUptxtPostcode, SignUplblPostcodeError, 4, "Must contain at least 4 characters!", "Can't be empty");
        event.limitedMaxInput(SignUptxtPostcode, SignUplblPostcodeError, 7, true);
        
        //----------------------------------------SECURITY----------------------------------------------------------
        event.editDetailsOnSecurity(jLabel19, ValidateUsername);
        event.editDetailsOnSecurity(jLabel20, ValidateFullName);
        event.editDetailsOnSecurity(jLabel21, ValidatePassword);
        
        event.editDetailsOnSecurity(jLabel27, ValidateAddress1);
        event.editDetailsOnSecurity(jLabel28, ValidateAddress2);
        event.editDetailsOnSecurity(jLabel30, ValidateTown);
        event.editDetailsOnSecurity(jLabel31, ValidatePostCode);
        disableCopyPaste();
    }
    
    private void verifyDetails(){
        Thread clock = new Thread(){
            @Override
            public void run(){
                for(;;){
                    try {
                        signUp1event();
                        signUp2event();
                        sleep(800);
                    } catch (InterruptedException ex) {}
                }
            }
        }; clock.start();
    }
    
    private void signUp1event(){
        if(validateDetails(SignUptxtUsername, 3) && 
                validateDetails(SignUptxtFullName, 5) &&
                validateDetails(SignUptxtPassword, 5) && !validatePassword(SignUptxtPassword)){ 
            setTimeout(() -> animation.jLabelXRight(70, 220, 10, 10, jLabel7), 50);
            setTimeout(() -> jButton3.setForeground(new Color(153,153,153)), 150);
            jButton4.setVisible(true);
        }else{
            jButton3.setForeground(new Color(255,255,255));
            animation.jLabelXLeft(jLabel7.getX(), 70, 10, 10, jLabel7);
            jButton4.setVisible(false);
        }
    }
    
    private void signUp2event(){
        if(validateDetails(SignUptxtAddressLine1, 5) && 
                validateDetails(SignUptxtTown, 4) &&
                validateDetails(SignUptxtPostcode, 4)){ 
            jButton6.setText("Next Step");
        }else
            jButton6.setText("Skip");
    }
    
    private boolean validateDetails(JTextField txtField, Integer minLength){
        if(txtField.getText().length() > 0 && txtField.getText().length() < minLength ) 
            return false;
        else if(txtField.getText().length() == 0 || txtField.getText().isEmpty())
            return false;
        else
            return true;
    }
    
    private boolean validatePassword(JTextField txtField){
        return event.extractNumber(txtField.getText()).length() < 2;
    }
    
    private void showHome(){
        jCheckBox1.setSelected(preference.getBoolean("RememberMe", false));
        SignIntxtUsername.setText(preference.get("Username", null));
        SignIntxtPassword.setText(preference.get("Password", null));
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
    
    private void disableCopyPaste(){
        SignUptxtUsername.setTransferHandler(null);
        SignUptxtPassword.setTransferHandler(null);
        SignUptxtFullName.setTransferHandler(null);
        
        SignUptxtAddressLine1.setTransferHandler(null);
        SignUptxtAddressLine2.setTransferHandler(null);
        SignUptxtTown.setTransferHandler(null);
        SignUptxtPostcode.setTransferHandler(null);
        
        ValidateUsername.setTransferHandler(null);
        ValidateFullName.setTransferHandler(null);
        ValidatePassword.setTransferHandler(null);
        
        ValidateAddress1.setTransferHandler(null);
        ValidateAddress2.setTransferHandler(null);
        ValidateTown.setTransferHandler(null);
        ValidatePostCode.setTransferHandler(null);
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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new LoginView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmusernamebtn;
    private javax.swing.JButton Confirmusernamebtn1;
    private javax.swing.JButton NewPasswordCancelBtn;
    private javax.swing.JButton NewPasswordConfirm;
    private javax.swing.JPanel PnlAccount;
    private javax.swing.JLabel PnlAccountAccount;
    private javax.swing.JLabel PnlAccountAddress;
    private javax.swing.JLabel PnlAccountSecurity;
    private javax.swing.JPanel PnlAddress;
    private javax.swing.JLabel PnlAddressAccount;
    private javax.swing.JLabel PnlAddressAddress;
    private javax.swing.JLabel PnlAddressSecurity;
    private javax.swing.JPanel PnlConfirmation;
    private javax.swing.JPanel PnlNewCustomer;
    private javax.swing.JLabel PnlSecurityAccount;
    private javax.swing.JLabel PnlSecurityAddress;
    private javax.swing.JLabel PnlSecuritySecurity;
    private javax.swing.JButton SignInBtnLogIn;
    private javax.swing.JButton SignInBtnSignUp;
    private javax.swing.JLabel SignInlblForgotPasword;
    private javax.swing.JLabel SignInlblHide;
    private javax.swing.JLabel SignInlblShow;
    private javax.swing.JPasswordField SignIntxtPassword;
    private javax.swing.JPasswordField SignIntxtPassword1;
    private javax.swing.JPasswordField SignIntxtPassword2;
    private javax.swing.JTextField SignIntxtUsername;
    private javax.swing.JLabel SignUplblAddressLine1Error;
    private javax.swing.JLabel SignUplblAddressLine2Error;
    private javax.swing.JLabel SignUplblFullNameError;
    private javax.swing.JLabel SignUplblFullNameHint;
    private javax.swing.JLabel SignUplblHide;
    private javax.swing.JLabel SignUplblPasswordError;
    private javax.swing.JLabel SignUplblPasswordHint;
    private javax.swing.JLabel SignUplblPostcodeError;
    private javax.swing.JLabel SignUplblShow;
    private javax.swing.JLabel SignUplblTownError;
    private javax.swing.JLabel SignUplblUsernameError;
    private javax.swing.JLabel SignUplblUsernameHint;
    private javax.swing.JTextField SignUptxtAddressLine1;
    private javax.swing.JTextField SignUptxtAddressLine2;
    private javax.swing.JTextField SignUptxtFullName;
    private javax.swing.JPasswordField SignUptxtPassword;
    private javax.swing.JTextField SignUptxtPostcode;
    private javax.swing.JTextField SignUptxtTown;
    private javax.swing.JTextField SignUptxtUsername;
    private javax.swing.JTextField UpdatePasswordUsernametxt;
    private javax.swing.JTextField ValidateAddress1;
    private javax.swing.JTextField ValidateAddress2;
    private javax.swing.JTextField ValidateFullName;
    private javax.swing.JTextField ValidatePassword;
    private javax.swing.JTextField ValidatePostCode;
    private javax.swing.JTextField ValidateTown;
    private javax.swing.JTextField ValidateUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel newPasswordlblHide;
    private javax.swing.JLabel newPasswordlblShow;
    private javax.swing.JPanel pnlAskUsername;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlLoading;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlParent;
    private javax.swing.JPanel pnlPasswordUpdated;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlRightPanelMain;
    private javax.swing.JPanel pnlSignUp;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel pnlUpdatePassword;
    // End of variables declaration//GEN-END:variables



}
