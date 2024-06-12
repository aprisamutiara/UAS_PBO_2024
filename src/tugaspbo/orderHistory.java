package tugaspbo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class orderHistory extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    private String username;

    public orderHistory(String username) {
        this.username = username;
        initComponents();
        refreshData(username); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lbHome = new javax.swing.JLabel();
        lbOrder = new javax.swing.JLabel();
        lbOrderHistory = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableData.setBackground(new java.awt.Color(251, 216, 210));
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "No Telp", "Alamat", "Warna"
            }
        ));
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 450, 220));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(219, 64, 85));
        jLabel3.setText("Kacamoo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 19, -1, -1));

        lbHome.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        lbHome.setForeground(new java.awt.Color(42, 80, 94));
        lbHome.setText("Home");
        lbHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHomeMouseClicked(evt);
            }
        });
        getContentPane().add(lbHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 21, -1, -1));

        lbOrder.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        lbOrder.setForeground(new java.awt.Color(42, 80, 94));
        lbOrder.setText("Order");
        lbOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOrderMouseClicked(evt);
            }
        });
        getContentPane().add(lbOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 21, -1, -1));

        lbOrderHistory.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        lbOrderHistory.setForeground(new java.awt.Color(42, 80, 94));
        lbOrderHistory.setText("Order history");
        lbOrderHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOrderHistoryMouseClicked(evt);
            }
        });
        getContentPane().add(lbOrderHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 21, -1, -1));

        lbLogout.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        lbLogout.setForeground(new java.awt.Color(42, 80, 94));
        lbLogout.setText("Logout");
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(lbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 21, -1, -1));

        jPanel1.setBackground(new java.awt.Color(251, 216, 210));

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

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setText("Order History");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspbo/Order History.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOrderMouseClicked
        order order = new order(username);
        order.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbOrderMouseClicked

    private void lbOrderHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOrderHistoryMouseClicked
        orderHistory oh = new orderHistory(username);
        oh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbOrderHistoryMouseClicked

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        login login = new login(); 
        login.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void lbHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseClicked
        menuUser mu = new menuUser(username);
        mu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbHomeMouseClicked

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        detail detail = new detail(username); 
        int i = tableData.getSelectedRow(); 
        
        String id = tableData.getValueAt(i, 0).toString(); 
        
        try{
            this.stat = k.getConnection().prepareStatement("SELECT * FROM tbkacamata where id = '" + id + "'");
            this.rs = this.stat.executeQuery();
            if (rs.next()) { 
                String nama = rs.getString("nama");
                String no = rs.getString("no_telp");
                String alamat = rs.getString("alamat");
                String frame = rs.getString("frame");
                String bahan = rs.getString("bahan");
                String warna = rs.getString("warna");
                String mkanan = rs.getString("minus_kanan");
                String mkiri = rs.getString("minus_kiri");
                String skanan = rs.getString("silinder_kanan");
                String skiri = rs.getString("silinder_kiri");
                
                detail.txtNama.setText(nama);
                detail.txtNo.setText(no);
                detail.txtAlamat.setText(alamat);
                detail.cbFrame.setSelectedItem(frame); 
                detail.cbBahan.setSelectedItem(bahan);
                detail.txtWarna.setText(warna);
                detail.txtMkanan.setText(mkanan);
                detail.txtMkiri.setText(mkiri); 
                detail.txtSkanan.setText(skanan);
                detail.txtSkiri.setText(skiri); 
                detail.setVisible(true); 
                this.dispose();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tableDataMouseClicked

    public void refreshData(String username){
        model = new DefaultTableModel();
        model.setRowCount(0);
        model.addColumn("ID");
        model.addColumn("Nama lengkap");
        model.addColumn("No telepon");
        model.addColumn("Alamat");
        tableData.setModel(model);
        try{
            this.stat = k.getConnection().prepareStatement("SELECT * FROM tbkacamata where username = ?");
            this.stat.setString(1, username);
            this.rs = this.stat.executeQuery();
            while (rs.next()){
                Object[] data = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),     
                };
                model.addRow(data);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderHistory(" ").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHome;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbOrder;
    private javax.swing.JLabel lbOrderHistory;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}
