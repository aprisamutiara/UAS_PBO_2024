package tugaspbo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class menuAdmin extends javax.swing.JFrame {
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    public menuAdmin() {
        initComponents();
        tanggal(); 
        jumlahPengguna(); 
        jumlahOrder(); 
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lbDashboard = new javax.swing.JLabel();
        lbAkun = new javax.swing.JLabel();
        lbOrder = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbJorder = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbJakun = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lbLogout.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        lbLogout.setForeground(new java.awt.Color(42, 80, 94));
        lbLogout.setText("Logout");
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(lbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 280, -1, -1));

        lbTime.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        lbTime.setText("Tanggal");
        getContentPane().add(lbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(219, 64, 85));
        jLabel4.setText("Hallo Admin!");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lbJorder.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        lbJorder.setForeground(new java.awt.Color(255, 255, 255));
        lbJorder.setText("10");
        getContentPane().add(lbJorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Order");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Akun Pengguna");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        lbJakun.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        lbJakun.setForeground(new java.awt.Color(255, 255, 255));
        lbJakun.setText("10");
        getContentPane().add(lbJakun, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        jPanel1.setBackground(new java.awt.Color(219, 64, 85));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 310, 70));

        jPanel2.setBackground(new java.awt.Color(219, 64, 85));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 310, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspbo/Menu Admin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 510, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void lbDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDashboardMouseClicked
        menuAdmin ma = new menuAdmin(); 
        ma.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_lbDashboardMouseClicked

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        login login = new login(); 
        login.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void tanggal() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");
        String formattedNow = now.format(formatter);
        lbTime.setText(formattedNow);
    }
    
    private void jumlahPengguna() {
        try {
            this.stat = k.getConnection().prepareStatement("SELECT COUNT(*) AS jumlahPengguna FROM tbpengguna");
            this.rs = this.stat.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("jumlahPengguna");
                lbJakun.setText(String.valueOf(count));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void jumlahOrder() {
        try {
            this.stat = k.getConnection().prepareStatement("SELECT COUNT(*) AS jumlahOrder FROM tbkacamata");
            this.rs = this.stat.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("jumlahOrder");
                lbJorder.setText(String.valueOf(count));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAkun;
    private javax.swing.JLabel lbDashboard;
    private javax.swing.JLabel lbJakun;
    private javax.swing.JLabel lbJorder;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbOrder;
    private javax.swing.JLabel lbTime;
    // End of variables declaration//GEN-END:variables
}
