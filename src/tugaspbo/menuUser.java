package tugaspbo;

public class menuUser extends javax.swing.JFrame {
    private String username;
    
    public menuUser(String username) {
        this.username = username;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbOrder = new javax.swing.JLabel();
        lbHome = new javax.swing.JLabel();
        lbOrderHistory = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbOrder.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        lbOrder.setForeground(new java.awt.Color(42, 80, 94));
        lbOrder.setText("Order");
        lbOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOrderMouseClicked(evt);
            }
        });
        getContentPane().add(lbOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 21, -1, -1));

        lbHome.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        lbHome.setForeground(new java.awt.Color(42, 80, 94));
        lbHome.setText("Home");
        lbHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHomeMouseClicked(evt);
            }
        });
        getContentPane().add(lbHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 21, -1, -1));

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

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(219, 64, 85));
        jLabel3.setText("Kacamoo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 19, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspbo/Landing.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuUser("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbHome;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbOrder;
    private javax.swing.JLabel lbOrderHistory;
    // End of variables declaration//GEN-END:variables
}
