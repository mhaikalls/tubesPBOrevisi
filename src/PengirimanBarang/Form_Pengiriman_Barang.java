package PengirimanBarang;

import java.awt.Menu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form_Pengiriman_Barang extends javax.swing.JFrame {
private Connection con;
private Statement st;
private ResultSet rskirim;
private ResultSet rspetugas;
private ResultSet rspaket;
private ResultSet rspengirim;
private String sql="";
private String resi,tanggal,tujuan,idpetugas,nopengirim,penerima,alamat,telepon,pakettype,isipaket;
private int berat,biaya,asuransi,total;

    public Form_Pengiriman_Barang() {
        initComponents();
        koneksikan();
        daftarpetugas();
        daftarpengirim();
        daftarpaket();
        tampildata("select * from tb_pengiriman_barang");
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
    DefaultTableModel datalist = new DefaultTableModel();
    datalist.addColumn("No");
    datalist.addColumn("NO Resi");
    datalist.addColumn("Tanggal");
    datalist.addColumn("Tujuan");
    datalist.addColumn("ID Petugas");
    datalist.addColumn("NO Pengirim");
    datalist.addColumn("Penerima");
    datalist.addColumn("Alamat");
    datalist.addColumn("Telepon");
    datalist.addColumn("Paket");
    datalist.addColumn("Berat");
    datalist.addColumn("Biaya");
    datalist.addColumn("Asuransi");
    datalist.addColumn("Isi Paket");
    datalist.addColumn("Total");
    try {
        int i = 1;
        st=con.createStatement();
        rskirim=st.executeQuery("select * from tb_pengiriman_barang");
        while (rskirim.next()) {
            datalist.addRow(new Object[]{
                (""+i++),rskirim.getString(1),
                rskirim.getString(2),
                rskirim.getString(3),            
                rskirim.getString(4),
                rskirim.getString(5),
                rskirim.getString(6),
                rskirim.getString(7),
                rskirim.getString(8),
                rskirim.getString(9),
                rskirim.getString(10),
                rskirim.getString(11),
                rskirim.getString(12),
                rskirim.getString(13),
                rskirim.getString(14)
            });
            gridpengiriman.setModel(datalist);
            }
    } catch (Exception e) {
        System.out.println(e);        
    }
}
private void kosongkan(){
        txtresi.setText("");
        txttanggal.setText("");
        txtkotatujuan.setText("");
        txtidpetugas.setSelectedItem("-pilih-");
        txtnopengirim.setSelectedItem("-pilih-");
        txtpenerima.setText("");
        txtalamatpenerima.setText("");
        txttelepon.setText("");
        txtpakettype.setSelectedItem("-pilih-");
        txtberat.setText("");
        txtbiaya.setText("");
        txtasuransi.setText("");
        txtisipaket.setText("");
        txttotal.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txttanggal = new javax.swing.JTextField();
        txtnamapetugas = new javax.swing.JTextField();
        txtjabatan = new javax.swing.JTextField();
        txtbiaya = new javax.swing.JTextField();
        txtasuransi = new javax.swing.JTextField();
        txtberat = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        txtpakettype = new javax.swing.JComboBox<>();
        txtidpetugas = new javax.swing.JComboBox<>();
        txtkotatujuan = new javax.swing.JTextField();
        txtnamapengirim = new javax.swing.JTextField();
        txtpenerima = new javax.swing.JTextField();
        txttelepon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamatpengirim = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtisipaket = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtalamatpenerima = new javax.swing.JTextArea();
        btnubah = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        gridpengiriman = new javax.swing.JTable();
        txtresi = new javax.swing.JTextField();
        txtsimpan = new javax.swing.JButton();
        txtnopengirim = new javax.swing.JComboBox<>();
        btnhapus = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NO Resi");

        jLabel2.setText("Alamat");

        jLabel3.setText("Nama");

        jLabel4.setText("Tanggal");

        jLabel5.setText("ID Petugas");

        jLabel6.setText("Penerima");

        jLabel7.setText("Isi Paket");

        jLabel8.setText("Nama Petugas");

        jLabel9.setText("Jabatan");

        jLabel10.setText("Paket Type");

        jLabel11.setText("Biaya");

        jLabel12.setText("Asuransi");

        jLabel13.setText("Berat");

        jLabel14.setText("Total");

        jLabel15.setText("Kota Tujuan");

        jLabel16.setText("NO Pengirim");

        jLabel17.setText("Alamat");

        jLabel18.setText("Telepon");

        txtpakettype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtpakettypeItemStateChanged(evt);
            }
        });

        txtidpetugas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtidpetugasItemStateChanged(evt);
            }
        });
        txtidpetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpetugasActionPerformed(evt);
            }
        });

        txtalamatpengirim.setColumns(20);
        txtalamatpengirim.setRows(5);
        jScrollPane1.setViewportView(txtalamatpengirim);

        txtisipaket.setColumns(20);
        txtisipaket.setRows(5);
        jScrollPane2.setViewportView(txtisipaket);

        txtalamatpenerima.setColumns(20);
        txtalamatpenerima.setRows(5);
        jScrollPane3.setViewportView(txtalamatpenerima);

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

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        gridpengiriman.setModel(new javax.swing.table.DefaultTableModel(
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
        gridpengiriman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridpengirimanMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(gridpengiriman);

        txtsimpan.setText("Simpan");
        txtsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsimpanActionPerformed(evt);
            }
        });

        txtnopengirim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtnopengirimItemStateChanged(evt);
            }
        });

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("FORM PENGIRIMAN BARANG");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back)
                        .addGap(138, 138, 138)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpakettype, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtasuransi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txttotal)
                                        .addComponent(txtberat, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtidpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtresi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(txtjabatan))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtnamapetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel3))
                                        .addGap(8, 8, 8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(27, 27, 27)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane1)
                                                .addComponent(txtnamapengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtnopengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtpenerima, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel17)
                                                    .addComponent(jLabel18))
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jScrollPane3)
                                                    .addComponent(txttelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(8, 8, 8)
                                                .addComponent(txtkotatujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(txtsimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnubah, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnkeluar)))
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtresi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtidpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtnamapetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtpakettype, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtbiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtasuransi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtnopengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtnamapengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel2))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtpenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtkotatujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txttelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18))))))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtberat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsimpan)
                        .addComponent(btnubah)
                        .addComponent(btnbatal)
                        .addComponent(btnhapus)
                        .addComponent(btnkeluar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsimpanActionPerformed
        int by,br,tot;
        String hasil;
        by=Integer.parseInt(txtbiaya.getText());
        br=Integer.parseInt(txtberat.getText());
        tot=by*br;
        hasil=String.valueOf(tot);
        txttotal.setText(hasil);
        resi=String.valueOf(txtresi.getText());
        tanggal=String.valueOf(txttanggal.getText());
        tujuan=String.valueOf(txtkotatujuan.getText());
        idpetugas=txtidpetugas.getItemAt(txtidpetugas.getSelectedIndex()).toString();
        nopengirim=txtnopengirim.getItemAt(txtnopengirim.getSelectedIndex()).toString();
        penerima=String.valueOf(txtpenerima.getText());
        alamat=String.valueOf(txtalamatpenerima.getText());
        telepon=String.valueOf(txttelepon.getText());
        pakettype=txtpakettype.getItemAt(txtpakettype.getSelectedIndex()).toString();
        berat=Integer.parseInt(txtberat.getText());
        biaya=Integer.parseInt(txtbiaya.getText());
        asuransi=Integer.parseInt(txtasuransi.getText());
        isipaket=String.valueOf(txtisipaket.getText());
        total=Integer.parseInt(txttotal.getText());
        try {
            sql = "insert into tb_pengiriman_barang(no_resi,tanggal,kota_tujuan,id_petugas,no_pengirim,penerima,alamat,telepon,paket_type,berat,biaya,asuransi,isi_paket,total)value ("
                    + "'"+ resi +"','"+ tanggal +"','"+ tujuan +"','"+ idpetugas +"','"+ nopengirim +"','"+ penerima +"','"+ alamat +"','"+ telepon +"','"+ pakettype +"','"+ berat +"','"+ biaya +"','"+ asuransi +"','"+ isipaket +"','"+ total + "')";         
            st=con.createStatement();
            st.execute(sql);
            tampildata("select * tb_pengiriman_barang");
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal disimmpan \n"+e.getMessage());
        }            
        kosongkan();   
    }//GEN-LAST:event_txtsimpanActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        resi=String.valueOf(txtresi.getText());
        tanggal=String.valueOf(txttanggal.getText());
        tujuan=String.valueOf(txtkotatujuan.getText());
        idpetugas=txtidpetugas.getItemAt(txtidpetugas.getSelectedIndex()).toString();
        nopengirim=txtnopengirim.getItemAt(txtnopengirim.getSelectedIndex()).toString();
        penerima=String.valueOf(txtpenerima.getText());
        alamat=String.valueOf(txtalamatpenerima.getText());
        telepon=String.valueOf(txttelepon.getText());
        pakettype=txtpakettype.getItemAt(txtpakettype.getSelectedIndex()).toString();
        berat=Integer.parseInt(txtberat.getText());
        biaya=Integer.parseInt(txtbiaya.getText());
        asuransi=Integer.parseInt(txtasuransi.getText());
        isipaket=String.valueOf(txtisipaket.getText());
        total=Integer.parseInt(txttotal.getText());
        if (JOptionPane.showConfirmDialog(this,"Apakah data ini mau diubah","konfirmasi",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==
                JOptionPane.YES_OPTION) {
        try {
            sql = "update tb_pengiriman_barang set kota_tujuan ='"+ tujuan +"' ,id_petugas='"+ idpetugas +"',"
                    + "no_pengirim='"+ nopengirim +"',penerima= '"+ penerima +"',"
                    + "alamat='"+ alamat +"',telepon='"+ telepon +"',paket_type='"+ pakettype +"',"
                    + "berat='"+ berat +"',biaya='"+ biaya +"',asuransi='"+ asuransi +"',isi_paket='"+ isipaket +"',"
                    + "total='"+ total +"' where no_resi='"+ resi +"'";
            st=con.createStatement();
            st.execute(sql);
            tampildata("select * tb_pengiriman_barang");
            JOptionPane.showMessageDialog(null, "Data Berhasil Dirubah");
            kosongkan();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal dirubah \n"+e.getMessage());
        }            
        
        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        kosongkan();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        resi=String.valueOf(txtresi.getText());
        if (JOptionPane.showConfirmDialog(this,"Apakah anda yakin menghapus data ini","Konfirmasi",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==
                JOptionPane.YES_OPTION)
        {
           try {
               sql="delete from tb_pengiriman_barang where no_resi='"+resi+"'";
               st=con.createStatement();
               st.execute(sql);
                tampildata("select * from tb_pengiriman_barang");
                kosongkan();
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"data gagal di hapus\n"+e.getMessage());
           }   
       }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void gridpengirimanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridpengirimanMouseClicked
        txtresi.setText(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),1)));
        txttanggal.setText(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),2)));
        txtkotatujuan.setText(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),3)));
        txtidpetugas.setSelectedItem(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),4)));
        txtnopengirim.setSelectedItem(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),5)));
        txtpenerima.setText(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),6)));
        txtalamatpenerima.setText(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),7)));
        txttelepon.setText(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),8)));
        txtpakettype.setSelectedItem(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),9)));
        txtberat.setText(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),10)));
        txtbiaya.setText(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),11)));
        txtasuransi.setText(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),12)));
        txtisipaket.setText(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),13)));
        txttotal.setText(String.valueOf(gridpengiriman.getValueAt(gridpengiriman.getSelectedRow(),14)));
    }//GEN-LAST:event_gridpengirimanMouseClicked

    private void txtidpetugasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtidpetugasItemStateChanged
         try {
                sql="select * from tb_petugas where "
                        + "id_petugas='" +txtidpetugas.getSelectedItem()+ "'";
                st=con.createStatement();
                rspetugas=st.executeQuery(sql);
                while (rspetugas.next()) {
                    txtnamapetugas.setText(rspetugas.getString(2));
                    txtjabatan.setText(rspetugas.getString(3));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Gagal Tampil \n"+e.getMessage());
        }
    }//GEN-LAST:event_txtidpetugasItemStateChanged

    private void daftarpetugas(){
        txtidpetugas.removeAllItems();
        txtidpetugas.addItem("Pilih");
        try {
            String Sql="select * from tb_petugas";
            Statement st=con.createStatement();
            rspetugas=st.executeQuery(Sql);
            while(rspetugas.next()){
                String aliasid=rspetugas.getString("id_petugas");
                txtidpetugas.addItem(aliasid);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Gagal Menampilkan ID Petugas \n"+e.getMessage());                  
        }
}    
    
    private void txtnopengirimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtnopengirimItemStateChanged
        try {
                sql="select * from tb_pengirim where "
                        + "no_pengirim='" +txtnopengirim.getSelectedItem()+ "'";
                st=con.createStatement();
                rspengirim=st.executeQuery(sql);
                while (rspengirim.next()) {
                    txtnamapengirim.setText(rspengirim.getString(2));
                    txtalamatpengirim.setText(rspengirim.getString(3));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Gagal Tampil \n"+e.getMessage());
        }        
    }//GEN-LAST:event_txtnopengirimItemStateChanged

    private void daftarpengirim(){
        txtnopengirim.removeAllItems();
        txtnopengirim.addItem("Pilih");
        try {
            String sql ="select * from tb_pengirim";
            Statement st=con.createStatement();
            rspengirim=st.executeQuery(sql);
            while(rspengirim.next()) {
                String aliasid=rspengirim.getString("no_pengirim");
                txtnopengirim.addItem(aliasid);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Gagal Tampil \n"+e.getMessage());
        }
    }
    
    private void txtpakettypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtpakettypeItemStateChanged
        try {
                sql="select * from tb_jenis_paket where "
                        + "paket_type='" +txtpakettype.getSelectedItem()+ "'";
                st=con.createStatement();
                rspaket=st.executeQuery(sql);
                while (rspaket.next()) {
                    txtbiaya.setText(rspaket.getString(3));
                    txtasuransi.setText(rspaket.getString(4));
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Gagal Tampil \n"+e.getMessage());
        }
    }//GEN-LAST:event_txtpakettypeItemStateChanged

    private void daftarpaket(){
        txtpakettype.removeAllItems();
        txtpakettype.addItem("Pilih");
            try {
                String sql ="select * from tb_jenis_paket";
                Statement st=con.createStatement();
                rspaket=st.executeQuery(sql);
                while (rspaket.next()) {
                    String aliasid=rspaket.getString("paket_type");
                   txtpakettype.addItem(aliasid);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Gagal Tampil \n"+e.getMessage());
            }
    }
    
    private void txtidpetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpetugasActionPerformed
    }//GEN-LAST:event_txtidpetugasActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        Menu a=new Menu();
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
            java.util.logging.Logger.getLogger(Form_Pengiriman_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Pengiriman_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Pengiriman_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Pengiriman_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Pengiriman_Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnubah;
    private javax.swing.JTable gridpengiriman;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtalamatpenerima;
    private javax.swing.JTextArea txtalamatpengirim;
    private javax.swing.JTextField txtasuransi;
    private javax.swing.JTextField txtberat;
    private javax.swing.JTextField txtbiaya;
    private javax.swing.JComboBox<String> txtidpetugas;
    private javax.swing.JTextArea txtisipaket;
    private javax.swing.JTextField txtjabatan;
    private javax.swing.JTextField txtkotatujuan;
    private javax.swing.JTextField txtnamapengirim;
    private javax.swing.JTextField txtnamapetugas;
    private javax.swing.JComboBox<String> txtnopengirim;
    private javax.swing.JComboBox<String> txtpakettype;
    private javax.swing.JTextField txtpenerima;
    private javax.swing.JTextField txtresi;
    private javax.swing.JButton txtsimpan;
    private javax.swing.JTextField txttanggal;
    private javax.swing.JTextField txttelepon;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    private String hasil(int biaya, int berat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}