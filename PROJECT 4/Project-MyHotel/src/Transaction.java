/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIDDY
 */
public class Transaction extends javax.swing.JFrame {

    /**
     * Creates new form Transaction
     */
    public Transaction() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_checkIn = new javax.swing.JButton();
        btn_checkOut = new javax.swing.JButton();
        btn_displayTransaction = new javax.swing.JButton();
        btn_updateTransaction = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        btn_checkIn.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btn_checkIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkin.jpg"))); // NOI18N
        btn_checkIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 227, 96), 2, true));
        btn_checkIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkInActionPerformed(evt);
            }
        });
        getContentPane().add(btn_checkIn);
        btn_checkIn.setBounds(200, 320, 200, 200);

        btn_checkOut.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btn_checkOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkout.jpg"))); // NOI18N
        btn_checkOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 227, 96), 2, true));
        btn_checkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkOutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_checkOut);
        btn_checkOut.setBounds(460, 320, 200, 200);

        btn_displayTransaction.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btn_displayTransaction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/displaytrans.jpg"))); // NOI18N
        btn_displayTransaction.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 227, 96), 2, true));
        btn_displayTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_displayTransactionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_displayTransaction);
        btn_displayTransaction.setBounds(970, 320, 200, 200);

        btn_updateTransaction.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btn_updateTransaction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/updatetrans.jpg"))); // NOI18N
        btn_updateTransaction.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 227, 96), 2, true));
        btn_updateTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateTransactionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_updateTransaction);
        btn_updateTransaction.setBounds(710, 320, 200, 200);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(251, 227, 96));
        jLabel3.setText("Transaction Panel");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(485, 135, 450, 60);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Transaction Panel");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 140, 450, 60);

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(251, 227, 96));
        jLabel8.setText("Transaction");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(960, 580, 220, 60);

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(251, 227, 96));
        jLabel7.setText("Display");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1000, 520, 140, 60);

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(251, 227, 96));
        jLabel9.setText("Update");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(750, 520, 140, 60);

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(251, 227, 96));
        jLabel10.setText("Transaction");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(710, 570, 220, 60);

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(251, 227, 96));
        jLabel11.setText("Check Out");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(460, 520, 180, 60);

        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(251, 227, 96));
        jLabel12.setText("Check In");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(230, 520, 160, 60);

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jButton1.setText("Back to Mainmenu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 660, 320, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_checkInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkInActionPerformed
        // TODO add your handling code here:
        CheckIn1 ci = new CheckIn1();
        ci.setLocationRelativeTo(null);
        ci.setVisible(true);
        
    }//GEN-LAST:event_btn_checkInActionPerformed

    private void btn_checkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkOutActionPerformed
        // TODO add your handling code here:
        CheckOut co = new CheckOut();
        co.setLocationRelativeTo(null);
        co.setVisible(true);

    }//GEN-LAST:event_btn_checkOutActionPerformed

    private void btn_updateTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateTransactionActionPerformed
        // TODO add your handling code here:
        UpdateTransaction ut = new UpdateTransaction();
        ut.setLocationRelativeTo(null);
        ut.setVisible(true);

    }//GEN-LAST:event_btn_updateTransactionActionPerformed

    private void btn_displayTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_displayTransactionActionPerformed
        // TODO add your handling code here:
        DisplayTransaction dt = new DisplayTransaction();
        dt.setLocationRelativeTo(null);
        dt.setVisible(true);

    }//GEN-LAST:event_btn_displayTransactionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        Receptionist adm = new Receptionist();
        adm.setLocationRelativeTo(null);
        adm.setVisible(true);
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
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_checkIn;
    private javax.swing.JButton btn_checkOut;
    private javax.swing.JButton btn_displayTransaction;
    private javax.swing.JButton btn_updateTransaction;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
