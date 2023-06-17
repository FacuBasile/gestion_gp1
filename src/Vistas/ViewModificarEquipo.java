/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Entidades.Equipo;
import Entidades.Proyecto;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Nedisane
 */
public class ViewModificarEquipo extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewModificarEquipo
     */
    public ViewModificarEquipo() {
        initComponents();
        completarComboBoxEquipo();
        completarComboBoxProyectos();
    }

    public void completarComboBoxProyectos() {
        jcbProyecto.addItem(null);
        for (Proyecto p : Gestion.PD.proyectos()) {
            jcbProyecto.addItem(p);
        }
    }
    
    public void completarComboBoxEquipo() {
        jcbBuscar.addItem(null);
        for (Equipo e : Gestion.ED.listaEquipo()) {
            jcbBuscar.addItem(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbBuscar = new javax.swing.JComboBox<>();
        jtNombre = new javax.swing.JTextField();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jcbProyecto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jbActualizar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jrbAlta = new javax.swing.JRadioButton();
        jrbBaja = new javax.swing.JRadioButton();

        jLabel1.setText("Modificar Equipo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Proyecto");

        jLabel4.setText("Buscar");

        jcbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha");

        jbActualizar.setText("ACTUALIZAR");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("LIMPIAR");

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbBuscar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtNombre)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jbActualizar)
                        .addGap(26, 26, 26)
                        .addComponent(jbLimpiar)
                        .addGap(48, 48, 48)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jrbAlta)
                        .addGap(40, 40, 40)
                        .addComponent(jrbBaja)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAlta)
                    .addComponent(jrbBaja))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActualizar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSalir))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
        
        int idProyecto = jcbProyecto.getSelectedIndex();
        String nombre = jtNombre.getText();
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = formatoFecha.format(jdcFecha.getDate());
        LocalDate nacimiento = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        
        
        Equipo equipo = new Equipo(idProyecto, nombre, nacimiento, jrbAlta.isSelected());
        
        Gestion.ED.modificarEquipo(equipo);
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jcbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBuscarActionPerformed
        // TODO add your handling code here:
        try {
            Equipo equipo = new Equipo(); 
            equipo = Gestion.ED.buscarEquipo(jcbBuscar.getSelectedIndex());
            
            jtNombre.setText(equipo.getNombre());
            jdcFecha.setDate(Date.valueOf(equipo.getFechaCreacion()));
            jcbBuscar.setSelectedIndex(1);
            
            if (equipo.isEstado()) {
                jrbAlta.setSelected(true);
                jrbBaja.setSelected(false);
            } else {
                jrbAlta.setSelected(false);
                jrbBaja.setSelected(true);
            }
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Datos Incorrectos"+ex);
        }
        
    }//GEN-LAST:event_jcbBuscarActionPerformed

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

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Equipo> jcbBuscar;
    private javax.swing.JComboBox<Proyecto> jcbProyecto;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JRadioButton jrbAlta;
    private javax.swing.JRadioButton jrbBaja;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
