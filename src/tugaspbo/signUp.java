package tugaspbo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class signUp extends javax.swing.JFrame {
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
  
    public signUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        lbLogin = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel2.setText("Create Account");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 38, -1, -1));

        txtNama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 147, 129), 2));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 94, 242, 25));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 171, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 217, -1, -1));

        btnCreate.setBackground(new java.awt.Color(219, 64, 85));
        btnCreate.setFont(new java.awt.Font("Poppins SemiBold", 0, 10)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create Account");
        btnCreate.setBorder(null);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 270, 118, 25));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel6.setText("Already have account? ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 298, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        jLabel7.setText("Full name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 79, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 125, -1, -1));

        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 147, 129), 2));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 140, 242, 25));

        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 147, 129), 2));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 186, 242, 25));

        lbLogin.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(42, 80, 94));
        lbLogin.setText("Log in");
        lbLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLoginMouseClicked(evt);
            }
        });
        getContentPane().add(lbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 298, -1, -1));

        jLabel9.setFont(new java.awt.Font("Poppins Black", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(219, 64, 85));
        jLabel9.setText("WELCOME ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 196, -1));

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel10.setText("to Kacamoo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 190, -1, -1));

        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 147, 129), 2));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 232, 237, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspbo/Regis.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String fullName = txtNama.getText();
        String email = txtEmail.getText();
        String username = txtUsername.getText();
        String password = txtPass.getText();
        
        try{
            if (fullName.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Inputan tidak boleh kosong");
            return;
            }
            
            this.stat = k.getConnection().prepareStatement("select count(*) from tbpengguna WHERE username = ?");
            stat.setString(1, username);
            rs = stat.executeQuery();
            rs.next();
            if (rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Username telah tersedia!");
                return;
            }
            
            this.stat = k.getConnection().prepareStatement("insert into tbpengguna (`full_name`, `email`, `username`, `password`) VALUES (?, ?, ?, ?)");
            stat.setString(1, fullName);
            stat.setString(2, email);
            stat.setString(3, username);
            stat.setString(4, password);
            stat.executeUpdate();
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil membuat akun!");
            login si = new login();
            si.setVisible(true);
            this.dispose();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        txtNama.setText("");
        txtEmail.setText("");
        txtUsername.setText("");
        txtPass.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void lbLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLoginMouseClicked
        login si = new login();
        si.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbLoginMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
