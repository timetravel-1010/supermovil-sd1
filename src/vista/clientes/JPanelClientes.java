/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.clientes;

import controlador.ConnectionDB;
import java.awt.Dimension;
import javax.swing.JPanel;
import vista.menuPrincipal;

/**
 *
 * @author Arman
 */
public class JPanelClientes extends javax.swing.JPanel {

    /**
     * Creates new form JPanelClientes
     */
    private JPanel panelActual;
    private menuPrincipal menup;
    private ConnectionDB conexion;
    private JPanelAdminClientes panelTablaClientes;
    
    public JPanelClientes(menuPrincipal menu) { //Metodo constructor de la vista de clientes, recibe el menú principal
        initComponents();
        this.conexion = new ConnectionDB();
        this.panelActual=new JPanel();
        //this.add(panelActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1110, 570));
        this.menup=menu;
        this.panelTablaClientes = new JPanelAdminClientes(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegistrarCliente = new javax.swing.JButton();
        jButtonAdministrarClientes = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1110, 655));
        setPreferredSize(new java.awt.Dimension(1110, 655));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegistrarCliente.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButtonRegistrarCliente.setText("Registrar Cliente");
        jButtonRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarClienteActionPerformed(evt);
            }
        });
        add(jButtonRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 200, 30));

        jButtonAdministrarClientes.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButtonAdministrarClientes.setText("Administrar Clientes");
        jButtonAdministrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministrarClientesActionPerformed(evt);
            }
        });
        add(jButtonAdministrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarClienteActionPerformed
        // TODO add your handling code here:
        this.eliminarPanel();
        this.pintarPanel(new JPanelRegistrarCliente(this));
        menup.refrescarGUI();
        this.enableButtons(false);
    }//GEN-LAST:event_jButtonRegistrarClienteActionPerformed

    private void jButtonAdministrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministrarClientesActionPerformed
        // TODO add your handling code here:
        this.eliminarPanel();
        // Se debe mostrar la tabla de clientes
        this.pintarPanel(panelTablaClientes);
        menup.refrescarGUI();
        this.enableButtons(false);
    }//GEN-LAST:event_jButtonAdministrarClientesActionPerformed

    public void pintarPanel(JPanel panel){//Metodo que recibe como parametro un panel y lo pinta en el espacio disponible
        panelActual=panel;
        this.add(panelActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1110, 570));
        this.revalidate();
        this.repaint();
    }

    
    public void pintarPanel(JPanel panel, int x, int y){//Sobrecarga que recibe coordenadas para centrar el panel
        panelActual=panel;
        this.add(panelActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, 1110, 570));
        this.revalidate();
        this.repaint();
    }
    
    public void eliminarPanel(){//Metodo que elimina el panel pintado actualmente
        this.remove(panelActual);
        this.revalidate();
        this.repaint();
    }
    
    public void enableButtons (Boolean b){//Metodo que recibe un Boolean, si es true, se habilitan los botones, si es false, se inhabilitan
        jButtonRegistrarCliente.setEnabled(b);
        jButtonAdministrarClientes.setEnabled(b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdministrarClientes;
    private javax.swing.JButton jButtonRegistrarCliente;
    // End of variables declaration//GEN-END:variables

}
