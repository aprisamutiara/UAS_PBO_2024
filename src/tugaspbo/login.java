package tugaspbo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbCreate = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel2.setText("Log in to your account");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 77, -1, -1));

        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 147, 129), 2));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 146, 237, 25));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 129, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 183, -1, -1));

        btnLogin.setBackground(new java.awt.Color(219, 64, 85));
        btnLogin.setFont(new java.awt.Font("Poppins SemiBold", 0, 10)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Log In");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 241, 237, 25));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 9)); // NOI18N
        jLabel6.setText("Don’t have an account? ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins Black", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(219, 64, 85));
        jLabel7.setText("WELCOME ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 136, 196, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Black", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(219, 64, 85));
        jLabel5.setText("BACK");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel8.setText("to Kacamoo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 176, -1, -1));

        lbCreate.setFont(new java.awt.Font("Poppins", 0, 9)); // NOI18N
        lbCreate.setForeground(new java.awt.Color(42, 80, 94));
        lbCreate.setText("Create your account.");
        lbCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCreateMouseClicked(evt);
            }
        });
        getContentPane().add(lbCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 270, -1, -1));

        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 147, 129), 2));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 200, 237, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspbo/Login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtUsername.getText();
        String password = txtPass.getText();
        try{
            if (username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Inputan tidak boleh kosong");
            return;
            }
            
            if ("admin".equals(username) && "admin123".equals(password)) {
                JOptionPane.showMessageDialog(this, "Login berhasil, selamat datang admin");
                menuAdmin admin = new menuAdmin();
                admin.setVisible(true);
                this.dispose();
            }else{
                this.stat = k.getConnection().prepareStatement("select username, password from tbpengguna where username = ?");
                this.stat.setString(1, username);
                this.rs = this.stat.executeQuery();

                if (rs.next()) {
                    String user = rs.getString("username");
                    JOptionPane.showMessageDialog(this, "Login berhasil, selamat datang " + user);
                    menuUser mu = new menuUser(user);
                    mu.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Username tidak ditemukan!");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        txtUsername.setText("");
        txtPass.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lbCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCreateMouseClicked
        signUp su = new signUp();
        su.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_lbCreateMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbCreate;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
