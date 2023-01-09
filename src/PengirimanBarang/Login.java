package PengirimanBarang;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnKirim = new javax.swing.JButton();
        btnPetugas = new javax.swing.JButton();
        btnKURIR = new javax.swing.JButton();
        btnPaket = new javax.swing.JButton();
        btnPengirim1 = new javax.swing.JButton();
        btnPengirim2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("APLIKASI PENGIRIMAN BARANG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 70));

        btnKirim.setText("FORM PENGIRIMAN BARANG");
        btnKirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKirimActionPerformed(evt);
            }
        });
        jPanel1.add(btnKirim, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 180, 60));

        btnPetugas.setText("ADMIN");
        btnPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPetugasActionPerformed(evt);
            }
        });
        jPanel1.add(btnPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 180, 60));

        btnKURIR.setText("KURIR");
        btnKURIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKURIRActionPerformed(evt);
            }
        });
        jPanel1.add(btnKURIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 180, 60));

        btnPaket.setText("FORM JENIS PAKET");
        btnPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaketActionPerformed(evt);
            }
        });
        jPanel1.add(btnPaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 180, 60));

        btnPengirim1.setText("PENGIRIM");
        btnPengirim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPengirim1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPengirim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 180, 60));

        btnPengirim2.setText("PENGIRIM");
        btnPengirim2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPengirim2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPengirim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 180, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKirimActionPerformed
        Form_Pengiriman_Barang empat=new Form_Pengiriman_Barang();
        empat.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKirimActionPerformed

    private void btnPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaketActionPerformed
        Form_Jenis_Paket tiga=new Form_Jenis_Paket();
        tiga.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPaketActionPerformed

    private void btnKURIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKURIRActionPerformed
        Form_Pengirim dua=new Form_Pengirim();
        dua.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKURIRActionPerformed

    private void btnPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPetugasActionPerformed
        Form_Petugas satu=new Form_Petugas();
        satu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPetugasActionPerformed

    private void btnPengirim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengirim1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPengirim1ActionPerformed

    private void btnPengirim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengirim2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPengirim2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKURIR;
    private javax.swing.JButton btnKirim;
    private javax.swing.JButton btnPaket;
    private javax.swing.JButton btnPengirim1;
    private javax.swing.JButton btnPengirim2;
    private javax.swing.JButton btnPetugas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
