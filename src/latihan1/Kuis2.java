/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author Lenovo
 */
public class Kuis2 extends javax.swing.JFrame {

    /**
     * Creates new form Kuis2
     */
    public Kuis2() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dc = new java.awt.TextField();
        hb1 = new java.awt.TextField();
        hb2 = new java.awt.TextField();
        hb3 = new java.awt.TextField();
        hb4 = new java.awt.TextField();
        button1 = new java.awt.Button();
        Proses = new java.awt.Button();
        button3 = new java.awt.Button();
        hasil = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Pembayaran");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 30, 120, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Diskon");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 180, 110, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Harga Barang 1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 60, 110, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Harga Barang 2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 90, 110, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Harga Barang 3");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 120, 110, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Harga Barang 4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 150, 110, 14);

        dc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcActionPerformed(evt);
            }
        });
        getContentPane().add(dc);
        dc.setBounds(170, 180, 160, 20);

        hb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb1ActionPerformed(evt);
            }
        });
        getContentPane().add(hb1);
        hb1.setBounds(170, 60, 160, 20);
        getContentPane().add(hb2);
        hb2.setBounds(170, 90, 160, 20);
        getContentPane().add(hb3);
        hb3.setBounds(170, 120, 160, 20);
        getContentPane().add(hb4);
        hb4.setBounds(170, 150, 160, 20);

        button1.setBackground(new java.awt.Color(255, 255, 51));
        button1.setLabel("Keluar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(310, 230, 100, 24);

        Proses.setBackground(new java.awt.Color(255, 255, 0));
        Proses.setLabel("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        getContentPane().add(Proses);
        Proses.setBounds(50, 230, 100, 24);

        button3.setBackground(new java.awt.Color(255, 204, 0));
        button3.setLabel("Hapus");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        getContentPane().add(button3);
        button3.setBounds(180, 230, 100, 24);
        getContentPane().add(hasil);
        hasil.setBounds(50, 270, 360, 180);

        setBounds(0, 0, 507, 499);
    }// </editor-fold>//GEN-END:initComponents

    private void hb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hb1ActionPerformed

    private void dcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dcActionPerformed

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        int barang1 = Integer.parseInt(hb1.getText());
        int barang2 = Integer.parseInt(hb2.getText());
        int barang3 = Integer.parseInt(hb3.getText());
        int barang4 = Integer.parseInt(hb4.getText());
        int diskon = Integer.parseInt(dc.getText());
        
        int th2 = barang1+barang2+barang3+barang4;
        hasil.setText(String.valueOf(th2));
        
        int dis = th2 * diskon/100;
        hasil.setText(String.valueOf(dis));
        
        int tb2 = th2 - dis;
        hasil.setText(String.valueOf(tb2));
        
        hasil.setText("\nHarga barang 1 : "+barang1+"\n Harga barang 2 : "+barang2+"\n Harga barang 3 : "+barang3+"\n Harga barang 4 : "+barang4+"\n Diskon anda : "+diskon+"\n Total harga : "+th2+"\n Total bayar : "+tb2);
    }//GEN-LAST:event_ProsesActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        hasil.setText("");
        buttonGroup1.clearSelection();
        hb1.setText("");
        hb2.setText("");
        hb3.setText("");
        hb4.setText("");
        dc.setText("");
        
        
    }//GEN-LAST:event_button3ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        dispose();
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Proses;
    private java.awt.Button button1;
    private java.awt.Button button3;
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.TextField dc;
    private java.awt.TextArea hasil;
    private java.awt.TextField hb1;
    private java.awt.TextField hb2;
    private java.awt.TextField hb3;
    private java.awt.TextField hb4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
