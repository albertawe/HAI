/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HAI;
/**
 *
 * @author Raj
 */
import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
public class Login extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Login
     */
    public Login() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
                //setLocationRelativeTo(null);
                 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1280, 776));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("TeXGyreAdventor", 0, 18)); // NOI18N
        jLabel1.setText("username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 300, 110, 20);

        jLabel2.setFont(new java.awt.Font("TeXGyreAdventor", 0, 18)); // NOI18N
        jLabel2.setText("password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 330, 90, 20);

        txtUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        txtUserName.setOpaque(false);
        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUserName);
        txtUserName.setBounds(540, 300, 166, 17);

        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        txtPassword.setOpaque(false);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(540, 330, 166, 17);

        btnOK.setBackground(new java.awt.Color(0, 0, 0));
        btnOK.setIcon(new javax.swing.ImageIcon("C:\\java\\HAI\\src\\image\\dsasdasda.PNG")); // NOI18N
        btnOK.setBorder(null);
        btnOK.setOpaque(false);
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
        });
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        getContentPane().add(btnOK);
        btnOK.setBounds(540, 360, 60, 30);

        btnCancel.setForeground(new java.awt.Color(240, 240, 240));
        btnCancel.setToolTipText("");
        btnCancel.setBorder(null);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancel.setOpaque(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(620, 360, 60, 30);
        getContentPane().add(filler2);
        filler2.setBounds(89, 517, 86, 11);

        jLabel5.setFont(new java.awt.Font("TeXGyreAdventor", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Develop by");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 470, 150, 25);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HAI/Logo-Hai.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(510, 380, 250, 210);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HAI/Logo-Haiii.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(490, 110, 260, 170);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1370, 0);

        jLabel4.setFont(new java.awt.Font("TeXGyreAdventor", 0, 18)); // NOI18N
        jLabel4.setText("username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 300, 110, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\java\\HAI\\src\\image\\hero.jpg")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1280, 760);

        setSize(new java.awt.Dimension(1296, 806));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtUserNameMouseClicked

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {                                   
    if (txtUserName.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter user name","Error", JOptionPane.ERROR_MESSAGE);
           return;
            
            }
    String Password= String.valueOf(txtPassword.getPassword());
        if (Password.equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter password","Error", JOptionPane.ERROR_MESSAGE);
           return;
          
            }
      con=Connect.ConnectDB();
      String sql= "select * from users where username= '" + txtUserName.getText() + "'"
              + " and password ='" + txtPassword.getText() + "'";
      try
      {
          pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
          if (rs.next()){
             this.hide();
             MainMenu frm=new MainMenu();
             frm.setVisible(true);
          }
          else{
              
            JOptionPane.showMessageDialog(null, "Login Failed..Try again !","Access denied",JOptionPane.ERROR_MESSAGE);
          }
      }catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
          
    }                                     
    }                                  

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
    }//GEN-LAST:event_formWindowOpened

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
     if (evt.getKeyCode()==KeyEvent.VK_ENTER){
           con=Connect.ConnectDB();
      String sql= "select * from users where username= '" + txtUserName.getText() + "' and password ='" + txtPassword.getText() + "'";
      try
      {
          pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
          if (rs.next()){
             this.hide();
             MainMenu frm=new MainMenu();
             frm.setVisible(true);
          }
          else{
              
            JOptionPane.showMessageDialog(null, "Login Failed..Try again !","Access denied",JOptionPane.ERROR_MESSAGE);
            txtUserName.setText("");
            txtPassword.setText("");
            txtUserName.requestDefaultFocus();
         }
      }catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
          
    }            
     }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
      
    }//GEN-LAST:event_btnOKActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run()  {
                    try{
                Thread.sleep(4500); 
            }
                    catch(Exception e)
                    {
                        
                    }
                new Login().setVisible(true);
            
        }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSplitPane jSplitPane1;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
