package PengirimanBarang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form_Jenis_Paket extends javax.swing.JFrame {
private Connection con;
private Statement st;
private ResultSet rspaket;
private String sql="";
private String id,type;
private int berat,biaya,asuransi;

    public Form_Jenis_Paket() {
        initComponents();
        koneksikan();
        tampildata("select * from tb_jenis_paket");
    }
    
    private void koneksikan() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_pengiriman_barang","root","");
            System.out.println("Koneksi berhasil");
            JOptionPane.showMessageDialog(null, "koneksi berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal \n"+e);
        }
    }

private void tampildata(String sql) {
    DefaultTableModel datalist= new DefaultTableModel();
    datalist.addColumn("No");
    datalist.addColumn("ID Paket");
    datalist.addColumn("Type");
    datalist.addColumn("Biaya");
    datalist.addColumn("Asuransi");
    try {
        int i = 1;
        st=con.createStatement();
        rspaket=st.executeQuery("select * from tb_jenis_paket");
        while (rspaket.next()) {
            datalist.addRow(new Object[]{
                (""+i++),rspaket.getString(1),
                rspaket.getString(2),rspaket.getString(3),
                rspaket.getString(4),
            });
            gridjenispaket.setModel(datalist);
            }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Gagal Tampil \n"+e.getMessage());        
    }
}

    private void kosongkan(){
        txtid.setText("");
        txttype.setSelectedItem("-pilih-");
        txtbiaya.setText("");
        txtasuransi.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtbiaya = new javax.swing.JTextField();
        txtasuransi = new javax.swing.JTextField();
        txttype = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridjenispaket = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Paket");

        jLabel2.setText("Paket Type");

        jLabel3.setText("Biaya");

        jLabel4.setText("Asuransi");

        txttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih-", "Reguler", "Kilat", "Express" }));

        gridjenispaket.setModel(new javax.swing.table.DefaultTableModel(
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
        gridjenispaket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridjenispaketMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gridjenispaket);

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnubah.setText("Ubah");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        btnbatal.setText("Batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FORM JENIS PAKET");

        Back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rey\\Pictures\\Projek\\back.png")); // NOI18N
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addGap(161, 161, 161)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtasuransi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtbiaya)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 107, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnubah)
                        .addGap(18, 18, 18)
                        .addComponent(btnhapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnbatal)
                        .addGap(18, 18, 18)
                        .addComponent(btnkeluar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtbiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel1))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtasuransi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnubah)
                    .addComponent(btnhapus)
                    .addComponent(btnbatal)
                    .addComponent(btnkeluar))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        id=String.valueOf(txtid.getText());
        type=txttype.getItemAt(txttype.getSelectedIndex()).toString();
        biaya=Integer.parseInt(txtbiaya.getText());
        asuransi=Integer.parseInt(txtasuransi.getText());
        try {
            sql = "insert into tb_jenis_paket(id_paket,paket_type,biaya,asuransi)value ("
                    + "'"+ id +"','"+ type +"','"+ biaya +"','"+ asuransi +"')";
            st=con.createStatement();
            st.execute(sql);
            tampildata("select * from tb_jenis_paket");
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"data gagal disimpan \n"+e.getMessage());
        }
        kosongkan();      
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        id=String.valueOf(txtid.getText());
        type=txttype.getItemAt(txttype.getSelectedIndex()).toString();
        biaya=Integer.parseInt(txtbiaya.getText());
        asuransi=Integer.parseInt(txtasuransi.getText());
        if (JOptionPane.showConfirmDialog(this,"Apakah data ini mau diubah","konfirmasi",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==
                JOptionPane.YES_OPTION) {
        try {
            sql = "update tb_jenis_paket set id_paket='" + id + "',"
                    + "paket_type='"+type+"',biaya='"+biaya+"' where id_paket='"+id+"'";
            st=con.createStatement();
            st.execute(sql);
            tampildata("select * from tb_jenis_paket");
            JOptionPane.showMessageDialog(null, "data berhasil diubah");
            kosongkan();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"data gagal diubah \n"+e.getMessage());}
        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        id=String.valueOf(txtid.getText());
        if (JOptionPane.showConfirmDialog(this,"Apakah anda yakin menghapus data ini","Konfirmasi",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==
                JOptionPane.YES_OPTION)
        {
            try {
                sql="delete from tb_jenis_paket where id_paket='"+id+"'";
                st=con.createStatement();
                st.execute(sql);
                tampildata("select * from tb_jenis_paket");
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosongkan();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"data gagal di hapus \n"+e.getMessage());
            }
            
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        kosongkan();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void gridjenispaketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridjenispaketMouseClicked
        txtid.setText(String.valueOf(gridjenispaket.getValueAt(gridjenispaket.getSelectedRow(),1)));
        txttype.setSelectedItem(String.valueOf(gridjenispaket.getValueAt(gridjenispaket.getSelectedRow(),2)));
        txtbiaya.setText(String.valueOf(gridjenispaket.getValueAt(gridjenispaket.getSelectedRow(),3)));
        txtasuransi.setText(String.valueOf(gridjenispaket.getValueAt(gridjenispaket.getSelectedRow(),4)));
    }//GEN-LAST:event_gridjenispaketMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        Login a=new Login();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackMouseClicked

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
            java.util.logging.Logger.getLogger(Form_Jenis_Paket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Jenis_Paket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Jenis_Paket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Jenis_Paket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Jenis_Paket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JTable gridjenispaket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtasuransi;
    private javax.swing.JTextField txtbiaya;
    private javax.swing.JTextField txtid;
    private javax.swing.JComboBox<String> txttype;
    // End of variables declaration//GEN-END:variables
}
