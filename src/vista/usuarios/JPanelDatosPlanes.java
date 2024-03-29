/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.usuarios;

import controlador.ConnectionDB;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vista.usuarios.JPanelUsuarios;

/**
 *
 * @author Manuel
 */
public class JPanelDatosPlanes extends javax.swing.JPanel {
    
    private JPanelUsuarios padreAdmin;
    private JPanelTablaPlanes padrePlan;
    private JPanel panelActual;
    private ConnectionDB db;
    private boolean tipoPanel; //true=panelAdmin, false = panelUsuarios.

    /**
     * Creates new form JPanelDatosPlanes
     */
    public JPanelDatosPlanes(JPanelUsuarios papa, ConnectionDB db) {
        initComponents();
        this.setBackground(new java.awt.Color(218, 234, 255));
        panelActual = new JPanel();
        tipoPanel=false;
        this.panelActual.setBackground(new java.awt.Color(218, 234, 255));
        this.add(panelActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 890, 490));
        padreAdmin = papa;
        this.db = db;
    }
    
    public JPanelDatosPlanes(JPanelTablaPlanes papa, ConnectionDB db) {
        initComponents();
        this.setBackground(new java.awt.Color(218, 234, 255));
        panelActual = new JPanel();
        tipoPanel=true;
        this.panelActual.setBackground(new java.awt.Color(218, 234, 255));
        this.add(panelActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 890, 490));
        padrePlan = papa;
        this.db = db;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombrePlan = new javax.swing.JLabel();
        jLabelMinutos = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelMegas = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelMensajes = new javax.swing.JLabel();
        jTextFieldNombrePlan = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldMinutos = new javax.swing.JTextField();
        jTextFieldMensajes = new javax.swing.JTextField();
        jTextFieldMegas = new javax.swing.JTextField();
        jButtonEnviar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelNombrePlan1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(218, 234, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombrePlan.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelNombrePlan.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombrePlan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNombrePlan.setText("Nombre:");
        add(jLabelNombrePlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 67, 142, 30));

        jLabelMinutos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelMinutos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMinutos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMinutos.setText("Minutos:");
        add(jLabelMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 166, 142, 30));

        jLabelPrecio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPrecio.setText("Precio:");
        add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 113, 142, 30));

        jLabelMegas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelMegas.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMegas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMegas.setText("Megas:");
        add(jLabelMegas, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 215, 142, 30));

        jLabelDescripcion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDescripcion.setText("Descripción:");
        add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 308, 142, 30));

        jLabelMensajes.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelMensajes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMensajes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMensajes.setText("Mensajes:");
        add(jLabelMensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 263, 142, 30));

        jTextFieldNombrePlan.setBackground(new java.awt.Color(149, 193, 255));
        jTextFieldNombrePlan.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextFieldNombrePlan.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNombrePlan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldNombrePlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombrePlanActionPerformed(evt);
            }
        });
        add(jTextFieldNombrePlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 65, 230, 30));

        jTextFieldPrecio.setBackground(new java.awt.Color(149, 193, 255));
        jTextFieldPrecio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextFieldPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });
        add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 111, 230, 30));

        jTextFieldMinutos.setBackground(new java.awt.Color(149, 193, 255));
        jTextFieldMinutos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextFieldMinutos.setForeground(new java.awt.Color(0, 0, 0));
        add(jTextFieldMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 164, 230, 30));

        jTextFieldMensajes.setBackground(new java.awt.Color(149, 193, 255));
        jTextFieldMensajes.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextFieldMensajes.setForeground(new java.awt.Color(0, 0, 0));
        add(jTextFieldMensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 261, 230, 30));

        jTextFieldMegas.setBackground(new java.awt.Color(149, 193, 255));
        jTextFieldMegas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextFieldMegas.setForeground(new java.awt.Color(0, 0, 0));
        add(jTextFieldMegas, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 215, 230, 30));

        jButtonEnviar.setBackground(new java.awt.Color(149, 193, 255));
        jButtonEnviar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonEnviar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarjButtonEnviarActionPerformed(evt);
            }
        });
        add(jButtonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 100, -1));

        jButtonCancelar.setBackground(new java.awt.Color(149, 193, 255));
        jButtonCancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarjButtonEnviarActionPerformed(evt);
            }
        });
        add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        jLabelNombrePlan1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelNombrePlan1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombrePlan1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNombrePlan1.setText("Administrador de planes:");
        add(jLabelNombrePlan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 210, 30));

        jTextAreaDescripcion.setBackground(new java.awt.Color(149, 193, 255));
        jTextAreaDescripcion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextAreaDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaDescripcion.setRows(5);
        jTextAreaDescripcion.setToolTipText("");
        jTextAreaDescripcion.setAutoscrolls(false);
        jTextAreaDescripcion.setDoubleBuffered(true);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 230, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jTextFieldNombrePlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombrePlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombrePlanActionPerformed

    private void jButtonEnviarjButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarjButtonEnviarActionPerformed
        // TODO add your handling code here:
        
        if (validarRegistroCliente()) {
                    String nombre = jTextFieldNombrePlan.getText();
        String descripcion = jTextAreaDescripcion.getText();
        Integer precio = Integer.parseInt(jTextFieldPrecio.getText());
        Integer minutos = Integer.parseInt(jTextFieldMinutos.getText());
        Integer megas = Integer.parseInt(jTextFieldMegas.getText());
        Integer mensajes = Integer.parseInt(jTextFieldMensajes.getText());

        boolean resultado;

        if (tipoPanel) { 
            
            Integer identificador = padrePlan.indexTabla();

            //Corregir
            resultado = db.updatePlan(identificador, nombre, descripcion, precio, minutos, megas, mensajes);

            if (resultado) {
                JOptionPane.showMessageDialog(null, "¡La actualización de los datos del usuario fue exitosa!",
                    "Actualización", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "¡No se realizó ninguna modificación!",
                    "Actualización", JOptionPane.ERROR_MESSAGE);
            }
            padrePlan.auxUpdateGui();
            } else {
            resultado = db.registrarPlanes(nombre, descripcion, precio, minutos, megas, mensajes);

            if(resultado){
                JOptionPane.showMessageDialog(null, "¡El registro de los datos del usuario fue exitoso!",
                    "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                //padreUsers.enableButtons(true);
            } else {
                JOptionPane.showMessageDialog(null, "¡No se pudo realizar el registro!",
                    "Registro Incorrecto", JOptionPane.ERROR_MESSAGE);
                
            }
            padreAdmin.eliminarPanel();
            padreAdmin.enableButtons(true);
            }
            
        }

    }//GEN-LAST:event_jButtonEnviarjButtonEnviarActionPerformed

    private void jButtonCancelarjButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarjButtonEnviarActionPerformed
        // TODO add your handling code here:
        if (tipoPanel) {
            padrePlan.auxUpdateGui();
        }else{
            padreAdmin.eliminarPanel();
            padreAdmin.enableButtons(true);
        }
        
    }//GEN-LAST:event_jButtonCancelarjButtonEnviarActionPerformed

    private boolean validarRegistroCliente(){
        boolean exito = true;
        
        if(jTextAreaDescripcion.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "¡Ingrese una descripción valida!",
                            "Validacion incorrecta", JOptionPane.ERROR_MESSAGE);
            exito = false;
        }
        
        if(jTextFieldNombrePlan.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "¡Ingrese un nombre valido!",
                            "Validacion incorrecta", JOptionPane.ERROR_MESSAGE);
            exito = false;
        }
        
        if(jTextFieldMegas.getText().length()<1){
            JOptionPane.showMessageDialog(null, "¡Ingrese una cantidad de megas valida!",
                            "Validacion incorrecta", JOptionPane.ERROR_MESSAGE);
            exito = false;
        }
        
        if(jTextFieldMensajes.getText().length()<1){
            JOptionPane.showMessageDialog(null, "¡Ingrese una cantidad de mensajes valida!",
                            "Validacion incorrecta", JOptionPane.ERROR_MESSAGE);
            exito = false;
        }
        
        if(jTextFieldMinutos.getText().length()<1){
            JOptionPane.showMessageDialog(null, "¡Ingrese una cantidad de minutos valida!",
                            "Validacion incorrecta", JOptionPane.ERROR_MESSAGE);
            exito = false;
        }
        
        if(jTextFieldPrecio.getText().length()<3){
            JOptionPane.showMessageDialog(null, "¡Ingrese un precio valido!",
                            "Validacion incorrecta", JOptionPane.ERROR_MESSAGE);
            exito = false;
        }
        
        return exito;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelMegas;
    private javax.swing.JLabel jLabelMensajes;
    private javax.swing.JLabel jLabelMinutos;
    private javax.swing.JLabel jLabelNombrePlan;
    private javax.swing.JLabel jLabelNombrePlan1;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextAreaDescripcion;
    public javax.swing.JTextField jTextFieldMegas;
    public javax.swing.JTextField jTextFieldMensajes;
    public javax.swing.JTextField jTextFieldMinutos;
    public javax.swing.JTextField jTextFieldNombrePlan;
    public javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
