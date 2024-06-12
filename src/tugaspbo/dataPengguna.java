package tugaspbo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dataPengguna extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();

    public dataPengguna() {
        initComponents();
        refreshData(); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPengguna = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbDashboard = new javax.swing.JLabel();
        lbAkun = new javax.swing.JLabel();
        lbOrder = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbLogout1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPengguna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPenggunaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPengguna);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 340, 250));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(219, 64, 85));
        jLabel2.setText("Kacamoo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 58, -1, -1));

        lbDashboard.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        lbDashboard.setForeground(new java.awt.Color(42, 80, 94));
        lbDashboard.setText("Dashboard");
        lbDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDashboardMouseClicked(evt);
            }
        });
        getContentPane().add(lbDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 119, -1, -1));

        lbAkun.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        lbAkun.setForeground(new java.awt.Color(42, 80, 94));
        lbAkun.setText("Akun pengguna");
        lbAkun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAkunMouseClicked(evt);
            }
        });
        getContentPane().add(lbAkun, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 142, -1, -1));

        lbOrder.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        lbOrder.setForeground(new java.awt.Color(42, 80, 94));
        lbOrder.setText("Order");
        lbOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOrderMouseClicked(evt);
            }
        });
        getContentPane().add(lbOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 165, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 80, 94));
        jLabel3.setText("Akun Pengguna");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        lbLogout1.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        lbLogout1.setForeground(new java.awt.Color(42, 80, 94));
        lbLogout1.setText("Logout");
        lbLogout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogout1MouseClicked(evt);
            }
        });
        getContentPane().add(lbLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspbo/Menu Admin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 510, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDashboardMouseClicked
        menuAdmin ma = new menuAdmin();
        ma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbDashboardMouseClicked

    private void lbAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAkunMouseClicked
        dataPengguna dp = new dataPengguna();
        dp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbAkunMouseClicked

    private void lbOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOrderMouseClicked
        dataOrder dor = new dataOrder();
        dor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbOrderMouseClicked

    private void lbLogout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogout1MouseClicked
        login login = new login(); 
        login.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_lbLogout1MouseClicked

    private void tblPenggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPenggunaMouseClicked
         int i = tblPengguna.getSelectedRow(); 
        
        if (i != -1) {      
            String id = tblPengguna.getValueAt(i, 0).toString(); 
            int response = JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                hapus(id);
            } else {
                JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus.");
            }
        }  
    }//GEN-LAST:event_tblPenggunaMouseClicked

    public void refreshData(){
        model = new DefaultTableModel();
        model.setRowCount(0);
        model.addColumn("id");
        model.addColumn("Nama lengkap");
//        model.addColumn("Email");
        model.addColumn("Username");
        tblPengguna.setModel(model);
        try{
            this.stat = k.getConnection().prepareStatement("select id, full_name, username from tbpengguna");
            this.rs = this.stat.executeQuery();
            while (rs.next()){
                Object[] data = {
                    rs.getString(1),
                    rs.getString("full_name"),
//                    rs.getString("email"),
                    rs.getString("username"),    
                };
                model.addRow(data);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
     private void hapus(String id){
         try{
            stat = k.getConnection().prepareStatement("delete from tbpengguna where id=?");
            stat.setString(1, id);
            stat.executeUpdate();
            refreshData();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataPengguna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAkun;
    private javax.swing.JLabel lbDashboard;
    private javax.swing.JLabel lbLogout1;
    private javax.swing.JLabel lbOrder;
    private javax.swing.JTable tblPengguna;
    // End of variables declaration//GEN-END:variables
}
