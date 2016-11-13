/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HAI;

/**
 *
 * @author Ivan Rezki
 */
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Psikotest_add extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String sql;

    String stridPsikotest, stridPelamar, stridPsikolog, strhasil, strfilename;
    FileInputStream fispsiko;
    int jlhbaris = 0;

    /**
     * Creates new form Psikotest_add
     */
    public Psikotest_add() {

        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        conn = Connect.ConnectDB();
        Get_Data();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        tfidPsikotest = new java.awt.TextField();
        tfidPelamar = new java.awt.TextField();
        tfidPsikolog = new java.awt.TextField();
        tfhasil = new java.awt.TextField();
        label5 = new java.awt.Label();
        btnInsertFile = new javax.swing.JButton();
        btnAdd = new java.awt.Button();
        btnCancel = new java.awt.Button();
        lbfilename = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableview = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(null);

        label1.setText("ID Psikotest");
        panel1.add(label1);
        label1.setBounds(25, 18, 70, 20);

        label2.setText("ID Pelamar");
        panel1.add(label2);
        label2.setBounds(25, 48, 66, 20);

        label3.setText("ID Psikolog");
        panel1.add(label3);
        label3.setBounds(25, 78, 67, 20);

        label4.setText("Hasil");
        panel1.add(label4);
        label4.setBounds(25, 108, 33, 20);
        panel1.add(tfidPsikotest);
        tfidPsikotest.setBounds(132, 18, 120, 20);

        tfidPelamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidPelamarActionPerformed(evt);
            }
        });
        panel1.add(tfidPelamar);
        tfidPelamar.setBounds(132, 48, 120, 20);
        panel1.add(tfidPsikolog);
        tfidPsikolog.setBounds(132, 78, 120, 20);
        panel1.add(tfhasil);
        tfhasil.setBounds(132, 108, 120, 20);

        label5.setText("File");
        panel1.add(label5);
        label5.setBounds(25, 141, 24, 20);

        btnInsertFile.setText("Browse");
        btnInsertFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertFileActionPerformed(evt);
            }
        });
        panel1.add(btnInsertFile);
        btnInsertFile.setBounds(132, 138, 80, 23);

        btnAdd.setLabel("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panel1.add(btnAdd);
        btnAdd.setBounds(116, 202, 55, 24);

        btnCancel.setLabel("Cancel");
        panel1.add(btnCancel);
        btnCancel.setBounds(181, 202, 55, 24);

        lbfilename.setText("File Name");
        panel1.add(lbfilename);
        lbfilename.setBounds(230, 140, 70, 20);
        lbfilename.getAccessibleContext().setAccessibleName("File Name");

        jLabel1.setText("Nama");

        jFormattedTextField1.setText("PHOTO");
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        jButton5.setText("VIEW");

        jButton4.setText("EDIT");

        jButton6.setText("ADD");

        tableview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tableview);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5))
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Get_Data() {
        sql = "select * from tbpsikotest";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tableview.setModel(DbUtils.resultSetToTableModel(rs));
            tableview.setDefaultEditor(Object.class, null);
            tableview.setAutoCreateRowSorter(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    private void tfidPelamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidPelamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfidPelamarActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        stridPsikotest = tfidPsikotest.getText();
        stridPelamar = tfidPelamar.getText();
        stridPsikolog = tfidPsikolog.getText();
        strhasil = tfhasil.getText();
        strfilename = lbfilename.getText();

        try {
            conn = Connect.ConnectDB();
            if (stridPsikotest.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter patient id", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (stridPelamar.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter patient name", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (stridPsikolog.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Father's name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (strhasil.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter address", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (strfilename.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter contact no.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Statement stmt;
            stmt = conn.createStatement();
            sql = "Select * from tbpsikotest where idPsikotest= '" + stridPsikotest + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                tfidPsikotest.setText("");
//                tfidPsikotest.requestDefaultFocus();
                return;
            }
            sql = "insert into tbpsikotest values('"
                    + stridPsikotest + "','" + stridPelamar + "','" + stridPsikolog + "','" + strhasil + "','"
                    + strfilename + "')";

            pst = conn.prepareStatement(sql);
            pst.execute();
            
            
            String url = "jdbc:mysql://localhost:3306/hai";
            String user = "root";
            String password = "abc";

            String filePath;
            filePath = lbfilename.getText();
            conn = DriverManager.getConnection(url, user, password);
 
            sql = "update tbpsikotest set dokPsikotest = LOAD_FILE(?) where idPsikotest ='" + stridPsikotest + "'";
            PreparedStatement statement = conn.prepareStatement(sql);
 
            statement.setString(1, filePath);
 
            int row = statement.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Successfully add data", "Psikotest", JOptionPane.INFORMATION_MESSAGE);
                Get_Data();
            }
            conn.close();

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnInsertFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertFileActionPerformed
        // TODO add your handling code here:
        JFileChooser OpenFile = new JFileChooser();
        OpenFile.setMultiSelectionEnabled(false);
        OpenFile.showOpenDialog(null);
        File x_file = OpenFile.getSelectedFile();
        String NamaFile = x_file.getAbsolutePath();
        lbfilename.setText(NamaFile);
    }//GEN-LAST:event_btnInsertFileActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Psikotest_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Psikotest_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Psikotest_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Psikotest_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Psikotest_add().setVisible(true);
            }
        });
    }

    public void cariIdPsikotest() {
        conn = Connect.ConnectDB();
        sql = "select * from tbPsikotest where idPsikotest= '" + stridPsikotest + "'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                jlhbaris++;
            }

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void insertdatapsikotest() {
        try {
            conn = Connect.ConnectDB();
            sql = "insert into tbPsikotest(idPsikotest, idPelamar, idPsikolog, hasil, dokPsikotest) values('"
                    + stridPsikotest + "','"
                    + stridPelamar + "','"
                    + stridPsikolog + "','"
                    + strhasil + "','"
                    + "hextoraw(" + strfilename + "))";

            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Psikotest_add.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAdd;
    private java.awt.Button btnCancel;
    private javax.swing.JButton btnInsertFile;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JLabel lbfilename;
    private java.awt.Panel panel1;
    private javax.swing.JTable tableview;
    private java.awt.TextField tfhasil;
    private java.awt.TextField tfidPelamar;
    private java.awt.TextField tfidPsikolog;
    private java.awt.TextField tfidPsikotest;
    // End of variables declaration//GEN-END:variables
}