/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.reportes;

import controlador.ConnectionDB;
import java.awt.Color;
import javax.swing.JPanel;
import vista.menuPrincipal;

/**
 *
 * @author Arman
 */
public class JPanelReportes extends javax.swing.JPanel {

    
    private JPanel panelActual;
    private menuPrincipal menup;
    private ConnectionDB conexion;
    /**
     * Creates new form JPanelReportes
     */
    public JPanelReportes(menuPrincipal menu) {
        initComponents();
        this.conexion = new ConnectionDB();
        this.menup = menu;
        this.panelActual = new JPanel();
        this.pintarPanel(panelActual);
        /*this.panelActual = new JPanel();
        this.panelActual.setBackground(Color.red);
        this.pintarPanel(this.panelActual); //Por alguna razón si no hago esta linea, no funciona*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonGenerarReportes = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonGenerarReportes.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButtonGenerarReportes.setText("Generar reportes");
        jButtonGenerarReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarReportesActionPerformed(evt);
            }
        });
        add(jButtonGenerarReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 210, 30));

        jButtonAtras.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarReportesActionPerformed
        // TODO add your handling code here:
        this.eliminarPanel();
        this.pintarPanel(new JPanelGenerarReportes(this));
        menup.refrescarGUI();
        this.enableButtons(false);
    }//GEN-LAST:event_jButtonGenerarReportesActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        this.menup.buttonReportes.setEnabled(true);
        this.menup.eliminarPanelActual();
        this.menup.refrescarGUI();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

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
        jButtonGenerarReportes.setEnabled(b);
        jButtonAtras.setEnabled(b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonGenerarReportes;
    // End of variables declaration//GEN-END:variables
}