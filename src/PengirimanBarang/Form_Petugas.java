package PengirimanBarang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form_Petugas extends javax.swing.JFrame {
private Connection con;
private Statement st;
private ResultSet rspetugas;
private String sql="";
private String id,nama,jabatan,alamat,telepon;

    public Form_Petugas() {
        initComponents();
        koneksikan();
        tampildata("select * from tb_petugas");
    }

    private void koneksikan() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_pengiriman_barang","root","");
            System.out.println("Koneksi berhasil");
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil!");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal! \n"+e);
        }
    }

private void tampildata(String sql) {
    DefaultTableModel datalist= new DefaultTableModel();
    datalist.addColumn("No");
    datalist.addColumn("ID Petugas");
    datalist.addColumn("Nama");
    datalist.addColumn("Jabatan");
    datalist.addColumn("Alamat");
    datalist.addColumn("telepon");
    try {
        int i = 1;
        st=con.createStatement();
        rspetugas=st.executeQuery("select * from tb_petugas");
        while (rspetugas.next()) {
            datalist.addRow(new Object[]{
                (""+i++),rspetugas.getString(1),
                rspetugas.getString(2),rspetugas.getString(3),
                rspetugas.getString(4),
                rspetugas.getString(5)
            });
            gridpetugas.setModel(datalist);
            }
    } catch (Exception e) {
        System.out.println(e);      
    }
}

    private void kosongkan(){
        txtid.setText("");
        txtnama.setText("");
        txtjabatan.setSelectedItem("-pilih-");
        txtalamat.setText("");
        txttelepon.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txttelepon = new javax.swing.JTextField();
        txtjabatan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        gridpetugas = new javax.swing.JTable();
        btnbatal = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Admin");

        jLabel2.setText("Alamat");

        jLabel3.setText("Nama Admin");

        jLabel4.setText("Telepon");

        jLabel5.setText("Jabatan");

        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        txtjabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Kurir", "Manager", " " }));

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        gridpetugas.setModel(new javax.swing.table.DefaultTableModel(
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
        gridpetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridpetugasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(gridpetugas);

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FORM ADMIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addGap(213, 213, 213)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnubah)
                        .addGap(18, 18, 18)
                        .addComponent(btnhapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnbatal)
                        .addGap(18, 18, 18)
                        .addComponent(btnkeluar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnkeluar)
                    .addComponent(btnbatal)
                    .addComponent(btnubah)
                    .addComponent(btnsimpan)
                    .addComponent(btnhapus))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        id=String.valueOf(txtid.getText());
        nama=String.valueOf(txtnama.getText());
        jabatan=txtjabatan.getItemAt(txtjabatan.getSelectedIndex()).toString();
        alamat=String.valueOf(txtalamat.getText());
        telepon=String.valueOf(txttelepon.getText());
        try {
            sql = "insert into tb_petugas(id_petugas,nama_petugas,jabatan,alamat,telepon)value ("
                    + "'"+ id +"','"+ nama +"','"+ jabatan +"','"+ alamat +"','"+ telepon + "')";
            st=con.createStatement();
            st.execute(sql);
            tampildata("select * from tb_petugas");
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"data gagal disimpan \n"+e.getMessage());}
        kosongkan();         
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        id=String.valueOf(txtid.getText());
        nama=String.valueOf(txtnama.getText());
        jabatan=txtjabatan.getItemAt(txtjabatan.getSelectedIndex()).toString();
        alamat=String.valueOf(txtalamat.getText());
        telepon=String.valueOf(txttelepon.getText());
        if (JOptionPane.showConfirmDialog(this,"Apakah data ini mau diubah","konfirmasi",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==
                JOptionPane.YES_OPTION) {
        try {
            sql = "update tb_petugas set nama_petugas='" + nama + "',"
                    + "jabatan='"+jabatan+"',alamat='"+alamat+"' where id_petugas='"+id+"'";
            st=con.createStatement();
            st.execute(sql);
            tampildata("select * from tb_petugas");
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
                sql="delete from tb_petugas where id_petugas='"+id+"'";
                st=con.createStatement();
                st.execute(sql);
                tampildata("select * from tb_petugas");
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                kosongkan();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Data gagal di hapus \n"+e.getMessage());
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        kosongkan();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void gridpetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridpetugasMouseClicked
        txtid.setText(String.valueOf(gridpetugas.getValueAt(gridpetugas.getSelectedRow(),1)));
        txtnama.setText(String.valueOf(gridpetugas.getValueAt(gridpetugas.getSelectedRow(),2)));
        txtjabatan.setSelectedItem(String.valueOf(gridpetugas.getValueAt(gridpetugas.getSelectedRow(),3)));
        txtalamat.setText(String.valueOf(gridpetugas.getValueAt(gridpetugas.getSelectedRow(),4)));
        txttelepon.setText(String.valueOf(gridpetugas.getValueAt(gridpetugas.getSelectedRow(),5)));
    }//GEN-LAST:event_gridpetugasMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        Login a=new Login();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackMouseClicked

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
            java.util.logging.Logger.getLogger(Form_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Petugas().setVisible(true);
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
    private javax.swing.JTable gridpetugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtid;
    private javax.swing.JComboBox<String> txtjabatan;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttelepon;
    // End of variables declaration//GEN-END:variables
}