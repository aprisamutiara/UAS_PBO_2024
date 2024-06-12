package tugaspbo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class detail extends javax.swing.JFrame {
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    String nama, nomor, alamat, frame, bahan, warna, mkanan, mkiri, skanan, skiri, username; 
 
    public detail(String username) {
        this.username = username; 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtWarna = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMkanan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMkiri = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSkanan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSkiri = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnUbah = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cbBahan = new javax.swing.JComboBox<>();
        cbFrame = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel1.setText("Nomor telepon");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, -1, -1));

        txtNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 80, 94), 2));
        getContentPane().add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 66, 140, 20));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel2.setText("Alamat");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, -1, -1));

        txtAlamat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 80, 94), 2));
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 94, 140, 20));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel3.setText("Frame");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel4.setText("Bahan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel5.setText("Warna");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 178, -1, -1));

        txtWarna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 80, 94), 2));
        getContentPane().add(txtWarna, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 178, 140, 20));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel6.setText("Minus kanan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 206, -1, -1));

        txtMkanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 80, 94), 2));
        getContentPane().add(txtMkanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 206, 140, 20));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel7.setText("Minus kiri");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 234, -1, -1));

        txtMkiri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 80, 94), 2));
        getContentPane().add(txtMkiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 234, 140, 20));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel8.setText("Silinder kanan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 262, -1, -1));

        txtSkanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 80, 94), 2));
        getContentPane().add(txtSkanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 262, 140, 20));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel9.setText("Silinder kiri");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        txtSkiri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 80, 94), 2));
        getContentPane().add(txtSkiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 290, 140, 20));

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel10.setText("Nama lengkap");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        btnUbah.setBackground(new java.awt.Color(219, 64, 85));
        btnUbah.setFont(new java.awt.Font("Poppins SemiBold", 0, 10)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setText("Ubah");
        btnUbah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUbahMouseClicked(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 328, 228, 20));

        txtNama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 80, 94), 2));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 38, 140, 20));

        btnKembali.setBackground(new java.awt.Color(219, 64, 85));
        btnKembali.setFont(new java.awt.Font("Poppins SemiBold", 0, 10)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("Kembali");
        btnKembali.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 356, 228, 20));

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Detail Order");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 5, -1, -1));

        cbBahan.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        cbBahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metal", "Plastik", "Material Campuran" }));
        cbBahan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 80, 94), 2));
        getContentPane().add(cbBahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 150, 140, 20));

        cbFrame.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        cbFrame.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kotak", "Bulat", "Cat eye" }));
        cbFrame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 80, 94), 2));
        getContentPane().add(cbFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 122, 140, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspbo/Detail Pesanan.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUbahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseClicked
        nama = txtNama.getText();
        nomor = txtNo.getText();
        alamat = txtAlamat.getText(); 
        frame = cbFrame.getSelectedItem().toString();
        bahan = cbBahan.getSelectedItem().toString();
        warna = txtWarna.getText(); 
        mkanan = txtMkanan.getText();
        mkiri = txtMkiri.getText();
        skanan = txtSkanan.getText();
        skiri = txtSkiri.getText();
        
        try{
          stat = k.getConnection().prepareStatement("update tbkacamata set nama=?, no_telp=?, alamat=?, frame=?, bahan=?, warna=?, minus_kanan=?, minus_kiri=?, silinder_kanan=?, silinder_kiri=? where username=?");
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
          stat.executeUpdate();
          JOptionPane.showMessageDialog(null, "Data berhasil diperbarui"); 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnUbahMouseClicked

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        orderHistory oh = new orderHistory(username);
        oh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detail("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnUbah;
    public javax.swing.JComboBox<String> cbBahan;
    public javax.swing.JComboBox<String> cbFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField txtAlamat;
    public javax.swing.JTextField txtMkanan;
    public javax.swing.JTextField txtMkiri;
    public javax.swing.JTextField txtNama;
    public javax.swing.JTextField txtNo;
    public javax.swing.JTextField txtSkanan;
    public javax.swing.JTextField txtSkiri;
    public javax.swing.JTextField txtWarna;
    // End of variables declaration//GEN-END:variables
}
