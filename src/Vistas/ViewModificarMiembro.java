/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Entidades.Miembro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nedisane
 */
public class ViewModificarMiembro extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewModificarMiembro
     */
    public ViewModificarMiembro() {
        initComponents();
        completarComboBox();
    }

    public void completarComboBox() {
        //jcbBuscar.removeAllItems();
        for(Miembro m : Gestion.MD.listaMiembros()) {
            jcbBuscar.addItem(m);
        }
             
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jbActualizar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jrbAlta = new javax.swing.JRadioButton();
        jrbBaja = new javax.swing.JRadioButton();
        jcbBuscar = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("Modificar Miembro");

        jLabel2.setText("DNI");

        jLabel3.setText("APELLIDO");

        jLabel4.setText("NOMBRE");

        jbActualizar.setText("ACTUALIZAR");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("LIMPIAR");

        jbSalir.setText("SALIR");

        jrbAlta.setText("dar ALTA");
        jrbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAltaActionPerformed(evt);
            }
        });

        jrbBaja.setText("dar BAJA");
        jrbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbBajaActionPerformed(evt);
            }
        });

        jcbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("BUSCAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jrbAlta)
                .addGap(29, 29, 29)
                .addComponent(jrbBaja)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbActualizar)
                        .addGap(38, 38, 38)
                        .addComponent(jbLimpiar)
                        .addGap(40, 40, 40)
                        .addComponent(jbSalir)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAlta)
                    .addComponent(jrbBaja))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActualizar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSalir))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBuscarActionPerformed
        // TODO add your handling code here:
        Miembro miembro = new Miembro();
        miembro = Gestion.MD.buscarMiembroID(jcbBuscar.getSelectedIndex()+1);
        
        jtDNI.setText(miembro.getDni()+"");
        jtApellido.setText(miembro.getApellido());
        jtNombre.setText(miembro.getNombre());
        if(miembro.isEstado()) {
            jrbAlta.setSelected(true);
            jrbBaja.setSelected(false);
        } else {
            jrbAlta.setSelected(false);
            jrbBaja.setSelected(true);
        }
    }//GEN-LAST:event_jcbBuscarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
        try {
            int id = jcbBuscar.getSelectedIndex()+1;
            int dni = Integer.parseInt(jtDNI.getText());
            String nombre = jtNombre.getText();
            String apellido = jtApellido.getText();
            
            Miembro miembro = new Miembro(id,dni,apellido,nombre,jrbAlta.isSelected());
            
            Gestion.MD.actualizarMiembro(miembro);
            
            //completarComboBox();
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Datos Incorrectos"+ex);
        }
        
        
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jrbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAltaActionPerformed
        // TODO add your handling code here:
        if(jrbAlta.isSelected()) {
            jrbBaja.setSelected(false);
        }
    }//GEN-LAST:event_jrbAltaActionPerformed

    private void jrbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbBajaActionPerformed
        // TODO add your handling code here:
        if(jrbBaja.isSelected()) {
            jrbAlta.setSelected(false);
        }
    }//GEN-LAST:event_jrbBajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Miembro> jcbBuscar;
    private javax.swing.JRadioButton jrbAlta;
    private javax.swing.JRadioButton jrbBaja;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
