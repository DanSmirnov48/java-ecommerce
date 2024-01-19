package models;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import static views.CustomerView.currentOrder;

public class Events{
    
    private final DecimalFormat df = new DecimalFormat(".##");
    
    public void hideHintFocusGained(JTextField txtField, JLabel lbl){
        txtField.addFocusListener(new FocusAdapterFocusAdapter(){
            @Override
            public void focusGained(FocusEvent evt) {
                if(txtField.getText().isEmpty() || txtField.getText().isBlank())
                    lbl.hide();
            }
        });
    }

    public void hideHintFocusLost(JTextField txtField, JLabel lbl){
        txtField.addFocusListener(new FocusAdapterFocusAdapter(){
            @Override
            public void focusLost(FocusEvent evt) {
                if(!(txtField.getText().isEmpty() || txtField.getText().isBlank()))
                    lbl.hide();
                else
                    lbl.show();
            }
        });
    }
    
    public void limitedMinInput(JTextField txtField, JLabel lbl, Integer minLength, String invalidMsg, String empty){
        txtField.addFocusListener(new FocusAdapterFocusAdapter(){
            @Override
            public void focusLost(FocusEvent evt){
                if(txtField.getText().length() > 0 && txtField.getText().length() < minLength ) 
                    lbl.setText(invalidMsg);
                else if(txtField.getText().length() == 0 || txtField.getText().isEmpty())
                    lbl.setText(empty);                    
  
            }
        });
    }
    
    public void limitedMinInputPassword(JTextField txtField, JLabel lbl){
        txtField.addFocusListener(new FocusAdapterFocusAdapter(){
            @Override
            public void focusLost(FocusEvent evt){
                if(txtField.getText().length() > 0 && txtField.getText().length() < 5 ) 
                    lbl.setText("Must contain at least 5 characters!");
                else if(txtField.getText().length() == 0 || txtField.getText().isEmpty())
                    lbl.setText("Can't be empty");    
                else if(checkPassword((JPasswordField) txtField))
                    lbl.setText("Must contain digits!");
                else if(extractNumber(txtField.getText()).length() < 2)
                    lbl.setText("Must contain at least 3 digits!");
            }
        });
    }
    
    public void limitedMinInputPassword(JTextField txtField, JLabel lbl, Integer minLength, String invalidMsg, String noNums, String empty){
        txtField.addFocusListener(new FocusAdapterFocusAdapter(){
            @Override
            public void focusLost(FocusEvent evt){
                if(txtField.getText().length() > 0 && txtField.getText().length() < minLength ) 
                    lbl.setText(invalidMsg);
                else if(txtField.getText().length() == 0 || txtField.getText().isEmpty())
                    lbl.setText(empty);    
                else if(checkPassword((JPasswordField) txtField))
                    lbl.setText(noNums);
                else if(extractNumber(txtField.getText()).length() < 3)
                    lbl.setText("Must contain at least 3 characters!");
            }
        });
    }
    
    public void limitedMaxInput(JTextField txtField, JLabel lbl, Integer maxLength, boolean allowWhiteSpaceAndNumbers) {
        txtField.addKeyListener(new KeyAdapterKeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                lbl.setText("");
                char c = evt.getKeyChar();
                if(!allowWhiteSpaceAndNumbers)
                    if(!(Character.isLetter(c) || Character.isISOControl(c))) evt.consume();
                else
                    if(!(Character.isLetter(c) || Character.isDigit(c) || Character.isISOControl(c))) evt.consume();
                if(txtField.getText().length() >= maxLength )
                    evt.consume();
            }
        });
    }
    
    public void limitedMaxInputFullName(JTextField txtField, JLabel lbl, Integer maxLength){
        txtField.addKeyListener(new KeyAdapterKeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                lbl.setText("");
                char c = evt.getKeyChar();
                if(txtField.getText().isEmpty())
                    if(!(Character.isLetter(c) || Character.isISOControl(c))) evt.consume();
                else{
                    if(!(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))) 
                        evt.consume();
                    if(txtField.getText().length() >= maxLength )
                        evt.consume();                     
                }
            }
        });
    }

    public void validateFullName(JTextField txtField, JLabel lbl){
        txtField.addFocusListener(new FocusAdapterFocusAdapter(){
            @Override
            public void focusLost(FocusEvent evt){
                String fullName = txtField.getText();
                if(!(fullName.isBlank() || fullName.isEmpty())){
                    fullName = fullName.trim();
                    String[] splited = fullName.split("\\s+");
                    if(splited.length < 2) lbl.setText("Not a Full Name");
                    else if(splited.length >= 2 && splited.length < 4){
                        List myList = new ArrayList<String>();
                        for (String name : splited) {
                            name = name.trim();
                            name = name.substring(0, 1).toUpperCase() + name.substring(1);
                            myList.add(name);
                        } 
                        String listString = String.join(" ", myList).replaceAll("^\\s+", "");
                        txtField.setText(listString);
                    }else lbl.setText("Not a Valid Name");
                }else lbl.setText("Can't be Empty");
            }
        });
    }
    
    public void addProductNameValidation(JTextField txtField){
        txtField.addKeyListener(new KeyAdapterKeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if(!(Character.isLetter(c) || Character.isWhitespace(c)))
                    evt.consume();

                if(txtField.getText().length() >= 20)
                    evt.consume();                     
            }
        });
    }
    
    public void addProductPriceValidation(JTextField txtField){
        txtField.addKeyListener(new KeyAdapterKeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if(!(Character.isDigit(c) || evt.getKeyChar() == '.'))
                    evt.consume();

                if(txtField.getText().length() >= 6)
                    evt.consume();                     
            }
        });
    }
    
    public void addProductStockValidation(JTextField txtField){
        txtField.addKeyListener(new KeyAdapterKeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if(!(Character.isDigit(c)))
                    evt.consume();

                if(txtField.getText().length() >= 6)
                    evt.consume();                     
            }
        });
    }
    
    public void addProductSizeValidation(JTextField txtField){
        txtField.addKeyListener(new KeyAdapterKeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if(!(Character.isDigit(c)))
                    evt.consume();

                if(txtField.getText().length() >= 2)
                    evt.consume();
            }
        });
    }
    
    public void editDetailsOnSecurity(JLabel lbl, JTextField txtField){
        lbl.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt) {
                if(!txtField.isEditable()){
                    txtField.setEditable(true);
                    txtField.setForeground(new Color(51,0,204));
                    txtField.requestFocus();
                }else if(txtField.isEditable()){
                    txtField.setEditable(false);
                    txtField.setForeground(new Color(0,0,0));
                    txtField.setFocusable(false);
                    txtField.setFocusable(true);
                }
            }
        });
    }
    
    public void focusGained(JTextField txtField, JLabel img){
        txtField.addFocusListener(new FocusAdapterFocusAdapter(){
            @Override
            public void focusGained(FocusEvent evt) {
                try {
                    BufferedImage bIcon = ImageIO.read(new File("Images\\focus.png"));
                    BufferedImage icon = new BufferedImage(bIcon.getWidth(), bIcon.getHeight(), BufferedImage.TYPE_INT_ARGB);
                    Graphics2D graphics = icon.createGraphics();
                    graphics.drawImage(bIcon, null, 0, 0);
                    Thread thread = new Thread(){
                        @Override
                        public void run(){
                            if(Thread.currentThread().isInterrupted()) return;
                            try {
                                for(int i = 0; i <= 100; i = i + 10){
                                    float alp[] = new float[]{1f, 1f, 1f, (((float) i )/100)};
                                    float def[] = new float[]{0, 0, 0, 0};
                                    RescaleOp r = new RescaleOp(alp, def, null);
                                    BufferedImage filter = r.filter(icon, null);
                                    img.setIcon(new ImageIcon(filter));
                                    sleep(20);
                                }
                            } catch (InterruptedException ex) {}
                        }
                    }; thread.start();
                } catch (IOException ex) {
                    Logger.getLogger(Events.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void focusLost(JTextField txtField, JLabel img){
        txtField.addFocusListener(new FocusAdapterFocusAdapter(){
            @Override
            public void focusLost(FocusEvent evt) {
                try {
                    BufferedImage bIcon = ImageIO.read(new File("Images\\focus.png"));
                    BufferedImage icon = new BufferedImage(bIcon.getWidth(), bIcon.getHeight(), BufferedImage.TYPE_INT_ARGB);
                    Graphics2D graphics = icon.createGraphics();
                    graphics.drawImage(bIcon, null, 0, 0);
                    Thread thread = new Thread(){
                        @Override
                        public void run(){
                            try {
                                for(int i = 100; i >= 0; i = i - 10){
                                    float alp[] = new float[]{1f, 1f, 1f, (((float) i )/100)};
                                    float def[] = new float[]{0, 0, 0, 0};
                                    RescaleOp r = new RescaleOp(alp, def, null);
                                    BufferedImage filter = r.filter(icon, null);
                                    img.setIcon(new ImageIcon(filter));
                                    sleep(20);
                                }
                            } catch (InterruptedException ex) {}
                        }
                    }; thread.start();
                } catch (IOException ex) {}
            }
        });
    }
    
    public void showOverlay(JPanel panel, Product product, JLabel img, JLabel name, JLabel price){
        panel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt) {
                
                img.hide();
                name.hide();
                price.hide();
                panel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                panel.requestFocus();
                panel.setBorder(null);
                panel.setLayout(new BorderLayout(0, 0));
                
                JPanel pnl = new RoundedPanel(50);
                pnl.setOpaque(false);
                pnl.setLayout(null);
                
                JLabel lbl = new JLabel();
                lbl.setOpaque(false);
                lbl.setBounds(0,0,230,260);
                lbl.setLayout(null);
                
                JLabel close = new JLabel(new ImageIcon("Images\\close.png"));
                close.setBorder(null);
                close.setOpaque(false);
                close.setCursor(new Cursor(Cursor.HAND_CURSOR));
                close.setBounds(195,15,20,25);
                
                JLabel quantitylbl = new JLabel("Qty:");
                quantitylbl.setBorder(null);
                quantitylbl.setOpaque(false);
                quantitylbl.setBounds(50, 60, 130, 30);
                quantitylbl.setForeground(Color.WHITE);
                quantitylbl.setFont(new Font("Comic Sans MS", Font.ITALIC, 18)); 
                
                JComboBox quantity = new JComboBox();
                for(int i = 1; i <= product.getStockLevel(); i++) quantity.addItem(i);
                quantity.setFocusable(false);
                quantity.setMaximumRowCount(6);
                quantity.setBounds(108, 60, 65, 30);
                quantity.setCursor(new Cursor(Cursor.HAND_CURSOR));
                quantity.setForeground(Color.BLACK);
                quantity.setFont(new Font("Comic Sans MS", Font.ITALIC, 17)); 
                quantity.setOpaque(false);
                
                JLabel sizelbl;
                if(product.getClass().getName().equals("models.Footwear")){
                    var footwear = (Footwear)product;
                    sizelbl = new JLabel("Size:  "+String.valueOf(footwear.getSize()));
                }else{
                    var clothing = (Clothing)product;
                    sizelbl = new JLabel("Size:  "+clothing.getMeasurement());
                }
                sizelbl.setBorder(null);
                sizelbl.setOpaque(false);
                sizelbl.setBounds(50, 100, 140, 30);
                sizelbl.setForeground(Color.WHITE);
                sizelbl.setFont(new Font("Comic Sans MS", Font.ITALIC, 18)); 
                
                JLabel total = new JLabel("Total:  £" + product.getPrice());
                total.setBorder(null);
                total.setOpaque(false);
                total.setBounds(50, 140, 140, 30);
                total.setForeground(Color.WHITE);
                total.setFont(new Font("Comic Sans MS", Font.ITALIC, 18)); 
                
                JButton btn = new JButton(new ImageIcon("Images\\addBtn.png"));
                btn.setBounds(12, 200, 206, 45);
                btn.setBorder(null);
                btn.setOpaque(true);
                btn.setFocusable(false);
                btn.setContentAreaFilled(false);
                btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                
                itemStateChanged(quantity, total, product);
                addToCartBtn(btn, panel, product, pnl, img, name, price, quantity);
                hideOverlay(close, panel, pnl, img, name, price, lbl);
                try {
                    BufferedImage bIcon = ImageIO.read(new File("Images\\overlay.png"));
                    BufferedImage icon = new BufferedImage(bIcon.getWidth(), bIcon.getHeight(), BufferedImage.TYPE_INT_ARGB);
                    Graphics2D graphics = icon.createGraphics();
                    graphics.drawImage(bIcon, null, 0, 0);
                    Thread thread = new Thread(){
                        @Override
                        public void run(){
                            try {
                                for(int i = 0; i <= 100; i = i + 10){
                                    float alp[] = new float[]{1f, 1f, 1f, (((float) i )/100)};
                                    float def[] = new float[]{0, 0, 0, 0};
                                    RescaleOp r = new RescaleOp(alp, def, null);
                                    BufferedImage filter = r.filter(icon, null);
                                    lbl.setIcon(new ImageIcon(filter));
                                    sleep(30);
                                }
                            } catch (InterruptedException ex) {}
                        }
                    }; thread.start();
                } catch (IOException ex) {
                    System.out.println(ex.getLocalizedMessage());
                }finally{
                    pnl.add(close);
                    pnl.add(quantitylbl);
                    pnl.add(quantity);
                    pnl.add(sizelbl);
                    pnl.add(total);
                    pnl.add(btn);
                    pnl.add(lbl);
                    panel.add(pnl);
                }
            }
        });
    }
    
    private void hideOverlay(JLabel close, JPanel main, JPanel panel, JLabel img, JLabel name, JLabel price, JLabel overlay){
        close.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt) {               
                try {
                    BufferedImage bIcon = ImageIO.read(new File("Images\\overlay.png"));
                    BufferedImage icon = new BufferedImage(bIcon.getWidth(), bIcon.getHeight(), BufferedImage.TYPE_INT_ARGB);
                    Graphics2D graphics = icon.createGraphics();
                    graphics.drawImage(bIcon, null, 0, 0);
                    Thread thread = new Thread(){
                        @Override
                        public void run(){
                            try {
                                
                                for(int i = 100; i >= 0; i = i - 10){
                                    float alp[] = new float[]{1f, 1f, 1f, (((float) i )/100)};
                                    float def[] = new float[]{0, 0, 0, 0};
                                    RescaleOp r = new RescaleOp(alp, def, null);
                                    BufferedImage filter = r.filter(icon, null);
                                    overlay.setIcon(new ImageIcon(filter));
                                    sleep(20);
                                }
                            } catch (InterruptedException ex) {
                                System.out.println(ex.getLocalizedMessage());
                            }
                            finally{
                                Border panelborder = main.getBorder();
                                Border panlelmargin = new EmptyBorder(10, 20, 15, 20);
                                main.setBorder(new CompoundBorder(panelborder, panlelmargin));
                                panel.hide();
                                img.show();
                                name.show();
                                price.show();
                                main.setCursor(new Cursor(Cursor.HAND_CURSOR));
                            }
                        }
                    }; thread.start();
                } catch (IOException ex) {
                    System.out.println(ex.getLocalizedMessage());
                }
            }
        });
        
        main.addFocusListener(new FocusAdapterFocusAdapter(){
            @Override
            public void focusLost(FocusEvent evt) {
                try {
                    BufferedImage bIcon = ImageIO.read(new File("Images\\overlay.png"));
                    BufferedImage icon = new BufferedImage(bIcon.getWidth(), bIcon.getHeight(), BufferedImage.TYPE_INT_ARGB);
                    Graphics2D graphics = icon.createGraphics();
                    graphics.drawImage(bIcon, null, 0, 0);
                    Thread thread = new Thread(){
                        @Override
                        public void run(){
                            try {
                                for(int i = 100; i >= 0; i = i - 10){
                                    float alp[] = new float[]{1f, 1f, 1f, (((float) i )/100)};
                                    float def[] = new float[]{0, 0, 0, 0};
                                    RescaleOp r = new RescaleOp(alp, def, null);
                                    BufferedImage filter = r.filter(icon, null);
                                    overlay.setIcon(new ImageIcon(filter));
                                    sleep(20);
                                }
                            } catch (InterruptedException ex) {
                                System.out.println(ex.getLocalizedMessage());
                            }
                            finally{
                                panel.hide();
                                img.show();
                                name.show();
                                price.show();
                                main.setCursor(new Cursor(Cursor.HAND_CURSOR));
                            }
                        }
                    }; thread.start();
                } catch (IOException ex) {
                    System.out.println(ex.getLocalizedMessage());
                }
            }
        });
    }
    
    private void itemStateChanged(JComboBox combo, JLabel total, Product product){
        combo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evt) {
                Integer quantity = (Integer)combo.getSelectedItem();
                total.setText("Total:  £" + product.getPrice() * quantity);
            }
        });
    }
    
    private void addToCartBtn(JButton btn, JPanel main, Product product, JPanel pnl, JLabel img, JLabel name, JLabel price, JComboBox quantityCbo){
        btn.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt) {
                
                int quantity = (int) quantityCbo.getSelectedItem();
                OrderLine orderLine = new OrderLine(0, product, quantity);
                if(currentOrder.addOrderLine(orderLine)){
                    currentOrder.calculateTotal();
                }else{
                    showProductAlreadyInTheBasketScreen(main, product, pnl);
                    return;
                }
                       
                pnl.hide();
                JPanel panel = new RoundedPanel(50);
                panel.setOpaque(false);
                panel.setLayout(null);
                removeConfirmationScreen(panel, pnl, img, name, price);
                JLabel lbl = new JLabel();
                lbl.setOpaque(false);
                lbl.setBounds(0,0,230,260);
                lbl.setLayout(null);
                
                try {
                    BufferedImage bIcon = ImageIO.read(new File("Images\\purchaseConfirm.png"));
                    BufferedImage icon = new BufferedImage(bIcon.getWidth(), bIcon.getHeight(), BufferedImage.TYPE_INT_ARGB);
                    Graphics2D graphics = icon.createGraphics();
                    graphics.drawImage(bIcon, null, 0, 0);
                    Thread thread = new Thread(){
                        @Override
                        public void run(){
                            try {
                                for(int i = 0; i <= 100; i = i + 5){
                                    float alp[] = new float[]{1f, 1f, 1f, (((float) i )/100)};
                                    float def[] = new float[]{0, 0, 0, 0};
                                    RescaleOp r = new RescaleOp(alp, def, null);
                                    BufferedImage filter = r.filter(icon, null);
                                    lbl.setIcon(new ImageIcon(filter));
                                    sleep(35);
                                }
                            } catch (InterruptedException ex) {}
                        }
                    }; thread.start();
                } catch (IOException ex) {
                    System.out.println(ex.getLocalizedMessage());
                }
                panel.add(lbl);
                main.add(panel);
                main.setCursor(new Cursor(Cursor.HAND_CURSOR));
                
                
                setTimeout(() -> panel.hide(), 1500);
                setTimeout(() -> img.show(), 1500);
                setTimeout(() -> name.show(), 1500);
                setTimeout(() -> price.show(), 1500);
            }
        });
    }
    
    private void removeConfirmationScreen(JPanel screen, JPanel pnl, JLabel img, JLabel name, JLabel price){
        screen.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt) {  
                screen.hide();
                pnl.hide();
                img.show();
                name.show();
                price.show();
            }
        });
    }
    
    private void showProductAlreadyInTheBasketScreen(JPanel main, Product product, JPanel pnl){
        pnl.hide();
        JPanel panel = new RoundedPanel(50);
        panel.setOpaque(false);
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        
        JLabel lbl = new JLabel("<html>"+ product+" is already in the basket" +"</html>");
        lbl.setOpaque(false);
        lbl.setBounds(40,0,170,260);
        lbl.setLayout(null);
        lbl.setForeground(Color.BLACK);
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setVerticalAlignment(SwingConstants.CENTER);
        lbl.setFont(new Font("Comic Sans MS", Font.ITALIC, 19)); 
        
        panel.add(lbl);
        main.add(panel);
        
        setTimeout(() -> main.remove(panel), 1000);
        setTimeout(() -> pnl.show(), 1500);
    }
    
    public void incrementQty(JButton btn, OrderLine orderLine, JLabel qty, JLabel total, JLabel totalOrderlbl){
        btn.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt) {  
                if(orderLine.getProduct().getStockLevel() > orderLine.getQuantity()){
                    orderLine.setQuantity(orderLine.getQuantity() + 1);
                    qty.setText(String.valueOf(orderLine.getQuantity()));
                    orderLine.setLineTotal(orderLine.getQuantity() * orderLine.getProduct().getPrice());
                    total.setText("£"+String.valueOf(df.format(orderLine.getLineTotal())));
                    currentOrder.calculateTotal();
                    totalOrderlbl.setText("Total   £"+df.format(currentOrder.getOrderTotal()));
                }
            }
        });
    }
    
    public void decrementQty(JButton btn, OrderLine orderLine, JLabel qty, JLabel total, JLabel totalOrderlbl){
        btn.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt) {  
                if(orderLine.getQuantity() > 1){
                    orderLine.setQuantity(orderLine.getQuantity() - 1);
                    qty.setText(String.valueOf(orderLine.getQuantity()));
                    orderLine.setLineTotal(orderLine.getQuantity() * orderLine.getProduct().getPrice());
                    total.setText("£"+String.valueOf(df.format(orderLine.getLineTotal())));
                    currentOrder.calculateTotal();
                    totalOrderlbl.setText("Total   £"+df.format(currentOrder.getOrderTotal()));
                }
            }
        });
    }
    
    public void setPanelHover(JPanel btn, JPanel side){
        btn.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent evt) {
                btn.setBackground(new Color(25, 22, 38));
                side.setOpaque(true);
            }
        });
    }
    
    public void resetPanelHower(JPanel btn, JPanel side){
        btn.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseExited(MouseEvent evt) {
                btn.setBackground(new Color(11, 7, 17));
                side.setOpaque(false);
            }
        });
    }
    
    public void findOrderByIdValidation(JTextField txtField, JLabel hint){
        txtField.addKeyListener(new KeyAdapterKeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if(!(Character.isDigit(c)))
                    evt.consume();
                else
                    hint.setVisible(false);
                if(txtField.getText().length() > 3 )
                    evt.consume();                     
            }
        });
    }
    
    private static class KeyAdapterKeyAdapter implements KeyListener {

        public KeyAdapterKeyAdapter() { }

        @Override
        public void keyTyped(KeyEvent evt) { }

        @Override
        public void keyPressed(KeyEvent evt) { }

        @Override
        public void keyReleased(KeyEvent evt) { }
    }

    private static class FocusAdapterFocusAdapter implements FocusListener {

        public FocusAdapterFocusAdapter() {}

        @Override
        public void focusGained(FocusEvent evt) { }

        @Override
        public void focusLost(FocusEvent evt) {}
    }
    
    public void setProps(JTextField txtField, JLabel name, JTextField txtField1, JLabel lbl){
        if(txtField.getText().isEmpty()){
            txtField1.setVisible(false);
            name.setVisible(false);
            lbl.setVisible(false);
            txtField.nextFocus();
        }else{
            txtField1.setVisible(true);
            txtField.requestFocus();
            name.setVisible(true);
            lbl.setVisible(true);
            lbl.setIcon(new ImageIcon("Images\\edit.png"));
            txtField1.setText(txtField.getText());
        }
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
    
    public String extractNumber(final String str) {                
        if(str == null || str.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
                found = true;
            }else if(found)
                break;                
        }
        return sb.toString();
    }
    
    private boolean checkPassword(JPasswordField passwordField){
        return !passwordField.getText().matches(".*\\d.*");
    }
}
