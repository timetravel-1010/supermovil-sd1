package vista.usuarios;

import controlador.ConnectionDB;
import enums.TipoLogin;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.menuPrincipal;
/**
 *
 * @author pc
 */
public class Login extends javax.swing.JFrame {
    
    private ConnectionDB connection;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setTitle("Login");
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Login.png")).getImage());
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(218, 234, 255));
        
        connection = new ConnectionDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        claveLabel = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        botonEntrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(150, 47, 249));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.lightGray);
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("Acceso al Sistema");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 220, 35));

        usuarioLabel.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        usuarioLabel.setText("Usuario:");
        getContentPane().add(usuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 130, 30));

        claveLabel.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        claveLabel.setText("Contraseña:");
        getContentPane().add(claveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 130, 30));

        txtUsuario.setBackground(new java.awt.Color(149, 193, 255));
        txtUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setCaretColor(new java.awt.Color(255, 117, 117));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 200, 30));

        txtClave.setBackground(new java.awt.Color(149, 193, 255));
        txtClave.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtClave.setForeground(new java.awt.Color(0, 0, 0));
        txtClave.setCaretColor(new java.awt.Color(255, 117, 117));
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClaveKeyReleased(evt);
            }
        });
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 200, 30));

        botonEntrar.setBackground(new java.awt.Color(149, 193, 255));
        botonEntrar.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        botonEntrar.setForeground(new java.awt.Color(0, 0, 0));
        botonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login.png"))); // NOI18N
        botonEntrar.setText("Entrar");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 410, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Password.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/User.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        // TODO add your handling code here:
        this.ingresar();
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void txtClaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.ingresar();
        }
    }//GEN-LAST:event_txtClaveKeyReleased

    /**
     * Metodo utilizado para validar el texto ingresado por el usuario 
     * @param userName
     * @param clave
     * @return true en caso de que los campos no sean vacios.
     */
    private boolean validacionTexto(String userName, String clave) {
        if (!"".equals(userName) && !"".equals(clave))
            return true;
        else 
            return false;
    }
    
    private void resetFields() {
        txtUsuario.setText("");
        txtClave.setText("");
    }
    
    private void ingresar(){
        String userName;
        String clave = "";
        char [] password = txtClave.getPassword();
        for (int x=0;x<password.length; x++){
            clave+=password[x];
        }
        userName = txtUsuario.getText();
        // Se valida que el texto ingresado no sea vacio.
        if (!validacionTexto(userName, clave)) {
            JOptionPane.showMessageDialog(null, "¡Informacion de sesion incorrecta!",
                "Error", JOptionPane.ERROR_MESSAGE);
            resetFields();
            return;
        }
        TipoLogin validacion = connection.validarUsuario(userName, clave);
        
        switch (validacion) {
            case Correcto:
                // aqui se muestra la siguiente interfaz de usuario.
                menuPrincipal main = new menuPrincipal(connection, this);
                this.setVisible(false); // se oculta la ventana de login
                resetFields();
                break;
            case Incorrecto:
                JOptionPane.showMessageDialog(null, "¡Informacion de sesion incorrecta!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                resetFields();
                break;
            case YaEnLinea:
                JOptionPane.showMessageDialog(null, "El usuario ya se encuentra conectado",
                        "Error", JOptionPane.ERROR_MESSAGE);
                resetFields();
                break;
            default:
                JOptionPane.showMessageDialog(null, "El usuario se encuentra inactivo, contacte al administrador",
                    "Error", JOptionPane.ERROR_MESSAGE);
                resetFields();
                break;
        }
    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JLabel claveLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables

    
}
