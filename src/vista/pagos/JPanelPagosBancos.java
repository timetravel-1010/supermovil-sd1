/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.pagos;

import controlador.ConnectionDB;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Arman
 */
public class JPanelPagosBancos extends javax.swing.JPanel {
    
    private JPanelPagos padre;
    private FileReader archivos;
    private ConnectionDB db;
    private String ruta="";
    /**
     * Creates new form JPanelPagosBancos
     */
    public JPanelPagosBancos(JPanelPagos papa, ConnectionDB db) {
        this.padre = papa;
        initComponents();
      //  archivos = null;
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

        jLabelTitulo = new javax.swing.JLabel();
        jButtonSeleccionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonCargar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(218, 234, 255));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setText("Cargar pagos bancarios:");
        add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 200, 30));

        jButtonSeleccionar.setBackground(new java.awt.Color(149, 193, 255));
        jButtonSeleccionar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonSeleccionar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSeleccionar.setText("Seleccionar archivo");
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarjButtonEnviarActionPerformed(evt);
            }
        });
        add(jButtonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, 30));

        jTextArea1.setBackground(new java.awt.Color(149, 193, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 510, 200));

        jButtonCargar.setBackground(new java.awt.Color(149, 193, 255));
        jButtonCargar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonCargar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCargar.setText("Enviar");
        jButtonCargar.setEnabled(false);
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarjButtonEnviarActionPerformed(evt);
            }
        });
        add(jButtonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 110, 30));

        jButtonCancelar.setBackground(new java.awt.Color(149, 193, 255));
        jButtonCancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSeleccionarjButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarjButtonEnviarActionPerformed
        // TODO add your handling code here:
        String aux="";   
        String texto="";
        try
        {
         /**llamamos el metodo que permite cargar la ventana*/
         JFileChooser file=new JFileChooser();
         file.showOpenDialog(this);
         /**abrimos el archivo seleccionado*/
         File abre=file.getSelectedFile();
         this.ruta=abre.getAbsolutePath();
         /**recorremos el archivo, lo leemos para plasmarlo
         *en el area de texto*/
         if(abre!=null)
         {     
            this.jButtonCargar.setEnabled(true);
            this.archivos=new FileReader(abre);
            BufferedReader lee=new BufferedReader(archivos);
            while((aux=lee.readLine())!=null)
            {
               texto+= aux+ "\n";
            }
               lee.close();
          }    
         }
         catch(IOException ex)
         {
           JOptionPane.showMessageDialog(null,ex+"" +
                 "\nNo se ha encontrado el archivo",
                       "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
          }
        this.jTextArea1.setText(texto);
    }//GEN-LAST:event_jButtonSeleccionarjButtonEnviarActionPerformed

    private void jButtonCargarjButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarjButtonEnviarActionPerformed
        // TODO add your handling code here:
        //Se capturan los datos del cliente para registrarlo o actualizarlo
        db.updateValorPagoCuentaM(ruta);
        db.updateUltimoPagoCuentaM(ruta);
        this.padre.eliminarPanel();
        this.padre.enableButtons(true);       
        
       JOptionPane.showMessageDialog(null, "¡Se han cargado los pagos correctamente!",
                        "Carga correcta", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonCargarjButtonEnviarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.padre.eliminarPanel();
        this.padre.enableButtons(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonSeleccionar;
    public javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
