package tugaspbo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class order extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    private String username;
    
    String id, nama, nomor, alamat, frame, bahan, mkanan, mkiri, skanan, skiri; 
    String warna = null; 
    
    public order(String username) { 
        this.username = username;
        initComponents();
        kosong();    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbFrame = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMkanan = new javax.swing.JTextField();
        txtSkiri = new javax.swing.JTextField();
        txtMkiri = new javax.swing.JTextField();
        txtSkanan = new javax.swing.JTextField();
        rbHitam = new javax.swing.JRadioButton();
        rbPutih = new javax.swing.JRadioButton();
        rbRose = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbBahan = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        rbHijau = new javax.swing.JRadioButton();
        rbAbu = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel3.setText("Nama lengkap");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 67, -1, -1));

        txtNama.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        txtNama.setPreferredSize(new java.awt.Dimension(224, 26));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 82, 215, 25));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel4.setText("Nomor telepon");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 67, -1, -1));

        txtNo.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        txtNo.setPreferredSize(new java.awt.Dimension(224, 26));
        getContentPane().add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 82, 215, 25));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel5.setText("Bahan kacamata");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 246, -1, -1));

        cbFrame.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        cbFrame.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kotak", "Bulat", "Cat eye" }));
        getContentPane().add(cbFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 215, 215, 25));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel6.setText("Minus kanan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel7.setText("Minus kiri");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel8.setText("Silinder kanan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 246, -1, -1));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel9.setText("Silinder kiri");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 246, -1, -1));

        txtMkanan.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        getContentPane().add(txtMkanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 215, 92, 25));

        txtSkiri.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        getContentPane().add(txtSkiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 261, 92, 25));

        txtMkiri.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        getContentPane().add(txtMkiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 215, 92, 25));

        txtSkanan.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        txtSkanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSkananActionPerformed(evt);
            }
        });
        getContentPane().add(txtSkanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 261, 92, 25));

        rbHitam.setBackground(new java.awt.Color(251, 216, 210));
        buttonGroup1.add(rbHitam);
        rbHitam.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        rbHitam.setText("Hitam");
        rbHitam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHitamActionPerformed(evt);
            }
        });
        getContentPane().add(rbHitam, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 175, -1, -1));

        rbPutih.setBackground(new java.awt.Color(251, 216, 210));
        buttonGroup1.add(rbPutih);
        rbPutih.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        rbPutih.setText("Putih");
        getContentPane().add(rbPutih, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 175, -1, -1));

        rbRose.setBackground(new java.awt.Color(251, 216, 210));
        buttonGroup1.add(rbRose);
        rbRose.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        rbRose.setText("Rose gold");
        getContentPane().add(rbRose, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 175, -1, -1));

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel10.setText("Warna");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 159, -1, -1));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORMULIR PEMESANAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 11, -1, 16));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pandangan Anda Prioritas Kami!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 19, -1, -1));

        btnTambah.setBackground(new java.awt.Color(219, 64, 85));
        btnTambah.setFont(new java.awt.Font("Poppins SemiBold", 0, 10)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Pesan");
        btnTambah.setBorder(null);
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 301, 163, 25));

        btnBatal.setBackground(new java.awt.Color(219, 64, 85));
        btnBatal.setFont(new java.awt.Font("Poppins SemiBold", 0, 10)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.setBorder(null);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 301, 132, 25));

        jLabel11.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kacamoo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 28, -1, -1));

        jPanel1.setBackground(new java.awt.Color(219, 64, 85));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 57));

        jLabel14.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel14.setText("Alamat");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 113, -1, -1));
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 128, 447, 25));

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel15.setText("Frame kacamata");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 200, -1, -1));

        cbBahan.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        cbBahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metal", "Plastik", "Material Campuran" }));
        getContentPane().add(cbBahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 261, 215, 25));

        btnBack.setBackground(new java.awt.Color(219, 64, 85));
        btnBack.setFont(new java.awt.Font("Poppins SemiBold", 0, 10)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Kembali");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 301, 132, 25));

        rbHijau.setBackground(new java.awt.Color(251, 216, 210));
        buttonGroup1.add(rbHijau);
        rbHijau.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        rbHijau.setText("Hijau");
        getContentPane().add(rbHijau, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 173, -1, -1));

        rbAbu.setBackground(new java.awt.Color(251, 216, 210));
        buttonGroup1.add(rbAbu);
        rbAbu.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        rbAbu.setText("Abu-abu");
        getContentPane().add(rbAbu, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 173, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspbo/Order.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kosong(){
        txtNama.setText(null);
        txtNo.setText(null);
        txtAlamat.setText(null);
        cbFrame.setSelectedItem(null);
        cbBahan.setSelectedItem(null);
        buttonGroup1.clearSelection();
        rbHitam.setSelected(false);
        rbPutih.setSelected(false);
        rbRose.setSelected(false);
        txtMkanan.setText("");
        txtMkiri.setText("");
        txtSkanan.setText("");
        txtSkiri.setText("");
        txtSkiri.setText("");
    }
    
    private void rbHitamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHitamActionPerformed
  
    }//GEN-LAST:event_rbHitamActionPerformed

    private void txtSkananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSkananActionPerformed

    }//GEN-LAST:event_txtSkananActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
       
        if (rbHitam.isSelected()){
            warna = "Hitam";
        } else if (rbPutih.isSelected()){
            warna = "Putih";
        } else if (rbRose.isSelected()){
            warna = "Rose gold";
        } else if (rbHijau.isSelected()){
            warna = "Hijau";
        } else if (rbAbu.isSelected()){
            warna = "Abu-abu";
        }
       
        nama = txtNama.getText();
        nomor = txtNo.getText();
        alamat = txtAlamat.getText(); 
        frame = cbFrame.getSelectedItem().toString();
        bahan = cbBahan.getSelectedItem().toString();
        mkanan = txtMkanan.getText();
        mkiri = txtMkiri.getText();
        skanan = txtSkanan.getText();
        skiri = txtSkiri.getText();
        
        if (nama.isEmpty() || nomor.isEmpty() || alamat.isEmpty() || frame.isEmpty() || bahan.isEmpty() || warna.isEmpty() || mkanan.isEmpty() || mkiri.isEmpty() || skanan.isEmpty() || skiri.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Inputan tidak boleh kosong");
            return;
        }
        
        try {
            this.stat = k.getConnection().prepareStatement("select * from tbkacamata where id=?");
            stat.setString(1, "id");
            this.rs = this.stat.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Data sudah ada, tidak bisa menambahkan data duplikat");
                return;
            }

            this.stat = k.getConnection().prepareStatement("insert into tbkacamata (`nama`, `no_telp`, `alamat`, `frame`, `bahan`, `warna`, `minus_kanan`, `minus_kiri`, `silinder_kanan`, `silinder_kiri`, `username`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stat.setString(1, nama);
            stat.setString(2, nomor);
            stat.setString(3, alamat);
            stat.setString(4, frame);
            stat.setString(5, bahan);
            stat.setString(6, warna);
            stat.setString(7, mkanan);
            stat.setString(8, mkiri);
            stat.setString(9, skanan);
            stat.setString(10, skiri);
            stat.setString(11, username);
            stat.setString(12, "Pending");
            stat.executeUpdate();
            kosong();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }//GEN-LAST:event_btnTambahActionPerformed

    
    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
       kosong();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        menuUser mu = new menuUser(username);
        mu.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnBackActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnTambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbBahan;
    private javax.swing.JComboBox<String> cbFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbAbu;
    private javax.swing.JRadioButton rbHijau;
    private javax.swing.JRadioButton rbHitam;
    private javax.swing.JRadioButton rbPutih;
    private javax.swing.JRadioButton rbRose;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtMkanan;
    private javax.swing.JTextField txtMkiri;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtSkanan;
    private javax.swing.JTextField txtSkiri;
    // End of variables declaration//GEN-END:variables
}
