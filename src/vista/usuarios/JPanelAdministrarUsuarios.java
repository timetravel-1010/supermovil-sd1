package vista.usuarios;

import controlador.ConnectionDB;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Usuario;

/**
 *
 * @author Arman
 */
public class JPanelAdministrarUsuarios extends javax.swing.JPanel {
    
    private JPanelTablaUsuarios tabla;
    private JPanelDatosUsuario usuario;
    private ConnectionDB db; 
    private Usuario user;
    private JPanel panelActual;

    /**
     * Creates new form JPanelAdministrarUsuarios
     */
    private JPanelUsuarios padre;
    private JPanelTablaUsuarios panelTabla;
    private boolean flag;
    public JPanelAdministrarUsuarios(JPanelUsuarios papa) {
        initComponents();
        this.setBackground(new java.awt.Color(218, 234, 255));
        padre = papa;
        db = new ConnectionDB();
        JButtonModificar.setEnabled(false);
        JButtonActivar.setEnabled(false);
        JButtonInactivar.setEnabled(false);
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
        JTextNombreUsuario = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        JButtonMostrarTodos = new javax.swing.JButton();
        JButtonModificar = new javax.swing.JButton();
        JButtonActivar = new javax.swing.JButton();
        JButtonInactivar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1110, 570));
        setPreferredSize(new java.awt.Dimension(1110, 570));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del Usuario:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        JTextNombreUsuario.setBackground(new java.awt.Color(149, 193, 255));
        JTextNombreUsuario.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JTextNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        JTextNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextNombreUsuarioActionPerformed(evt);
            }
        });
        add(JTextNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 330, -1));

        jButtonBuscar.setBackground(new java.awt.Color(149, 193, 255));
        jButtonBuscar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 18, -1, -1));

        JButtonMostrarTodos.setBackground(new java.awt.Color(149, 193, 255));
        JButtonMostrarTodos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JButtonMostrarTodos.setForeground(new java.awt.Color(0, 0, 0));
        JButtonMostrarTodos.setText("Mostrar todos");
        JButtonMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonMostrarTodosActionPerformed(evt);
            }
        });
        add(JButtonMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        JButtonModificar.setBackground(new java.awt.Color(149, 193, 255));
        JButtonModificar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JButtonModificar.setForeground(new java.awt.Color(0, 0, 0));
        JButtonModificar.setText("Modificar");
        JButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonModificarActionPerformed(evt);
            }
        });
        add(JButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, 150, 30));

        JButtonActivar.setBackground(new java.awt.Color(149, 193, 255));
        JButtonActivar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JButtonActivar.setForeground(new java.awt.Color(0, 0, 0));
        JButtonActivar.setText("Activar");
        JButtonActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonActivarActionPerformed(evt);
            }
        });
        add(JButtonActivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 150, 30));

        JButtonInactivar.setBackground(new java.awt.Color(149, 193, 255));
        JButtonInactivar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JButtonInactivar.setForeground(new java.awt.Color(0, 0, 0));
        JButtonInactivar.setText("Inactivar");
        JButtonInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInactivarActionPerformed(evt);
            }
        });
        add(JButtonInactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 150, 30));

        jButtonCancelar.setBackground(new java.awt.Color(149, 193, 255));
        jButtonCancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 520, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void JTextNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextNombreUsuarioActionPerformed
    
    public void pintarPanel(JPanel panel){
        panelActual= panel;
        add(panelActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 890, 490));
        this.revalidate();
        this.repaint();
    }
    
    public void pintarPanel(JPanel panel, int x, int y){//Sobrecarga que recibe coordenadas para centrar el panel
        panelActual=panel;
        this.add(panelActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, 1110, 570));
        this.revalidate();
        this.repaint();
    }
    
    public void pintarPanel(JPanelTablaUsuarios panel){
        tabla = panel;
        panelTabla = panel;
        add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 890, 490));
        this.revalidate();
        this.repaint();
    }
    
    public void eliminarPanel(){
        this.remove(panelActual);
        panelActual=null;
        this.revalidate();
        this.repaint();
    }
    
    public void eliminarTabla(){
        this.remove(panelTabla);
        panelTabla=null;
        tabla=null;
        this.revalidate();
        this.repaint();
    }
    
    public void refrescarGUI(){
        this.revalidate();
        this.repaint();
    }
    
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        padre.eliminarPanel();
        padre.enableButtons(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void JButtonMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonMostrarTodosActionPerformed
        // TODO add your handling code here:        
        enableMAD(false);
        if (flag)
            this.eliminarTabla();
        tabla = new JPanelTablaUsuarios(this);
        this.pintarPanel(tabla);
        panelTabla.agregarTodos();
        this.refrescarGUI();
        flag = true;  
    }//GEN-LAST:event_JButtonMostrarTodosActionPerformed

    private void JButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonModificarActionPerformed
        // TODO add your handling code here:
        usuario = new JPanelDatosUsuario(this);
        String cedula = tabla.indexTabla();
        Usuario user = db.getUsuario2(cedula);
        usuario.titulo.setText("Modificar");
        usuario.jTextCedula2.setText(user.getCedula());
        usuario.jTextNombre2.setText(user.getNombre());
        usuario.jTextDireccion2.setText(user.getDireccion());
        usuario.jTextPassword2.setText(user.getPasswordd());
        usuario.jComboBoxRol.setSelectedItem(user.getRol());
        usuario.jTextTelefono2.setText(user.getTelefono());
        usuario.jTextUsername2.setText(user.getNombre_usuario());
        usuario.jTextCedula2.setEditable(false);
        if (flag)this.eliminarTabla();
        
        this.pintarPanel(usuario, 135, 75);
        this.enableButtons(false);
        this.refrescarGUI();
        flag=false;
     
        
    }//GEN-LAST:event_JButtonModificarActionPerformed

    private void JButtonActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonActivarActionPerformed
        // TODO add your handling code here:
        enableMAD(false);
        String cedula = tabla.indexTabla();
        db.updateEstadoUsuario(cedula, true);
        this.eliminarTabla();
        tabla = new JPanelTablaUsuarios(this);
        tabla.agregarTodos();
        this.pintarPanel(tabla);
        JOptionPane.showMessageDialog(null, "¡El cambio de estado fue exitoso!",
                        "Exito", JOptionPane.INFORMATION_MESSAGE);
        this.refrescarGUI();
    }//GEN-LAST:event_JButtonActivarActionPerformed

    private void JButtonInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInactivarActionPerformed
        // TODO add your handling code here:
        enableMAD(false);
        String cedula = tabla.indexTabla();
        db.updateEstadoUsuario(cedula, false);
        this.eliminarTabla();
        tabla = new JPanelTablaUsuarios(this);
        tabla.agregarTodos();
        this.pintarPanel(tabla);
        JOptionPane.showMessageDialog(null, "¡El cambio de estado fue exitoso!",
                        "Exito", JOptionPane.INFORMATION_MESSAGE);
        this.refrescarGUI();
    }//GEN-LAST:event_JButtonInactivarActionPerformed
                              
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        enableMAD(false);
        String nombreU = JTextNombreUsuario.getText();
        if (flag)
            this.eliminarTabla();
        this.pintarPanel(new JPanelTablaUsuarios(this));
        panelTabla.agregarSelectivo(nombreU);
        this.refrescarGUI();
        flag=true;
    }//GEN-LAST:event_jButtonBuscarActionPerformed
 
    public void enableButtons(boolean b){
        this.JButtonActivar.setEnabled(b);
        this.JButtonInactivar.setEnabled(b);
        this.JButtonModificar.setEnabled(b);
        this.JButtonMostrarTodos.setEnabled(b);
        this.jButtonBuscar.setEnabled(b);
        this.jButtonCancelar.setEnabled(b);
    }
    
    public void enableMAD(boolean b) { 
        JButtonModificar.setEnabled(b);
        JButtonActivar.setEnabled(b);
        JButtonInactivar.setEnabled(b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonActivar;
    private javax.swing.JButton JButtonInactivar;
    private javax.swing.JButton JButtonModificar;
    private javax.swing.JButton JButtonMostrarTodos;
    private javax.swing.JTextField JTextNombreUsuario;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}