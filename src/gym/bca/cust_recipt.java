/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.bca;
import static gym.bca.bill.p_bill;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.sql.*;


/**
 *
 * @author KRATOS
 */
public class cust_recipt extends javax.swing.JFrame {
Connection co=null;
ResultSet rs=null;
PreparedStatement ps=null;
    /**
     * Creates new form cust_recipt
     */
    public cust_recipt() {
        initComponents();
        co=Mysqlconnect.MysqlDB();
        
    }
      public void close(){
        WindowEvent w=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
          Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        r_rec = new javax.swing.JTextField();
        r_fname = new javax.swing.JTextField();
        R_mname = new javax.swing.JTextField();
        r_lname = new javax.swing.JTextField();
        r_genderr = new javax.swing.JTextField();
        r_date1 = new javax.swing.JTextField();
        r_date2 = new javax.swing.JTextField();
        r_cont = new javax.swing.JTextField();
        r_weg = new javax.swing.JTextField();
        r_hig = new javax.swing.JTextField();
        r_amt = new javax.swing.JTextField();
        r_type = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/bca/P_10.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 950, 110);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("RECEIPT NUMBER");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(57, 60, 200, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("CUSTOMER NAME");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(57, 103, 200, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("GENDER");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(57, 146, 200, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("DURATION");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(57, 189, 200, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("CONTACT NUMBER");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(57, 232, 200, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("WEIGHT");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(57, 275, 200, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("HEIGHT");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(57, 318, 200, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("AMOUNT");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(57, 361, 200, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("PAYMENT TYPE");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(57, 404, 200, 25);
        jPanel2.add(r_rec);
        r_rec.setBounds(283, 60, 150, 25);

        r_fname.setToolTipText("CUSTOMER FIRST NAME");
        r_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_fnameActionPerformed(evt);
            }
        });
        jPanel2.add(r_fname);
        r_fname.setBounds(283, 103, 150, 25);

        R_mname.setToolTipText("CUSTOMER MIDDLE NAME");
        jPanel2.add(R_mname);
        R_mname.setBounds(451, 103, 150, 25);

        r_lname.setToolTipText("CUSTOMER LAST NAME");
        jPanel2.add(r_lname);
        r_lname.setBounds(619, 103, 150, 25);

        r_genderr.setToolTipText("CUSTOMER GENDER\n");
        jPanel2.add(r_genderr);
        r_genderr.setBounds(283, 146, 150, 25);

        r_date1.setToolTipText("CUSTOMER JOINING DATE ");
        jPanel2.add(r_date1);
        r_date1.setBounds(283, 189, 150, 25);

        r_date2.setToolTipText("CUSTOMER LEAVING DATE");
        jPanel2.add(r_date2);
        r_date2.setBounds(501, 189, 150, 25);

        r_cont.setToolTipText("CUSTOMER CONTACT NUMBER");
        jPanel2.add(r_cont);
        r_cont.setBounds(283, 232, 200, 25);
        jPanel2.add(r_weg);
        r_weg.setBounds(283, 275, 150, 25);

        r_hig.setToolTipText("Inch");
        jPanel2.add(r_hig);
        r_hig.setBounds(283, 318, 150, 25);

        r_amt.setToolTipText("Rs.");
        jPanel2.add(r_amt);
        r_amt.setBounds(283, 361, 150, 25);

        r_type.setToolTipText("TYPE OF PAYMENT");
        jPanel2.add(r_type);
        r_type.setBounds(283, 404, 150, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("TO");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(451, 189, 32, 25);

        jButton1.setText("Add Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(392, 463, 150, 20);

        jLabel11.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CUSTOMER RECORD");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(350, 0, 400, 35);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/bca/D_10.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(0, -10, 220, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r_fnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
        
        bill b=new bill();
        
                      p_bill.append( "\t\t ADD FTINESS CLUB \n\n"+
              "\n*******************************************************************************************************************\n"+
              "RECEIPT NUMBER:    \t"+r_rec.getText()+"\n\n"+
              "CUSTOMER NAME:    \t"+r_fname.getText()+
              "\t"+R_mname.getText()+
              "\t"+r_lname.getText()+"\n\n"+
              "GENDER:    \t"+r_genderr.getText()+"\n\n"+
              "DURATION:    \t"+r_date1.getText()+
              "\t"+r_date2.getText()+"\n\n"+
              "CONTACT NUMBER:    \t"+r_cont.getText()+"\n\n"+
              "WEIGHT:    \t"+r_weg.getText()+"\n\n"+
              "HEIGHT:    \t"+r_hig.getText()+"\n\n"+
              "AMOUNT:    \t"+r_amt.getText()+"\n\n"+
              "PAYMENT TYPE:    \t"+r_type.getText()+"\n"+
              "*******************************************************************************************************************"           
               );
                       
        b.setVisible(true);
        close();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(cust_recipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cust_recipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cust_recipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cust_recipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cust_recipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField R_mname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField r_amt;
    public static javax.swing.JTextField r_cont;
    public static javax.swing.JTextField r_date1;
    public static javax.swing.JTextField r_date2;
    public static javax.swing.JTextField r_fname;
    public static javax.swing.JTextField r_genderr;
    public static javax.swing.JTextField r_hig;
    public static javax.swing.JTextField r_lname;
    public static javax.swing.JTextField r_rec;
    public static javax.swing.JTextField r_type;
    public static javax.swing.JTextField r_weg;
    // End of variables declaration//GEN-END:variables
}
