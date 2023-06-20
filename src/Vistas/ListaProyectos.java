/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.ComentarioData;
import Data.EquipoData;
import Data.MiembroData;
import Data.TareaData;
import Data.proyectoData;
import Entidades.Equipo;
import Entidades.Miembro;
import Entidades.Proyecto;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author H
 */
public class ListaProyectos extends javax.swing.JInternalFrame {
DefaultTableModel tm = new DefaultTableModel();
proyectoData pd = new proyectoData();
EquipoData ed = new EquipoData();
DefaultListModel<Equipo> modeloEquipos = new DefaultListModel();
DefaultListModel<String> modeloMiembros = new DefaultListModel();
TareaData TD = new TareaData();
ComentarioData CD = new ComentarioData();
MiembroData MD = new MiembroData();


    /**
     * Creates new form ListaProyectos
     */
    public ListaProyectos() {
        
        
        
        
        initComponents();
        llenarTabla();
        ListaEquipos.setModel(modeloEquipos);
        modeloEquipos.removeAllElements();
        
        ListaMiembros.setModel(modeloMiembros);
        modeloMiembros.removeAllElements();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaEquipos = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaMiembros = new javax.swing.JList();
        BTNasignarTarea = new javax.swing.JButton();
        btnListarTareas = new javax.swing.JButton();
        BTNasignarTarea1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jTable1.setFocusable(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("PROYECTOS:");

        jButton1.setText("ASIGNAR NUEVO EQUIPO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ListaEquipos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ListaEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaEquiposMouseClicked(evt);
            }
        });
        ListaEquipos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaEquiposValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(ListaEquipos);

        jLabel4.setText("MIEMBROS:");

        ListaMiembros.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(ListaMiembros);

        BTNasignarTarea.setText("Asignar Tarea");

        btnListarTareas.setText("Ver Tareas");
        btnListarTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTareasActionPerformed(evt);
            }
        });

        BTNasignarTarea1.setText("Eliminar Miembro del Equipo");
        BTNasignarTarea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNasignarTarea1ActionPerformed(evt);
            }
        });

        jLabel2.setText("EQUIPOS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNasignarTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListarTareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNasignarTarea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 384, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnListarTareas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNasignarTarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNasignarTarea1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTNasignarTarea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNasignarTarea1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNasignarTarea1ActionPerformed


    private void btnListarTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTareasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarTareasActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        
        
        int filaSeleccionada = jTable1.rowAtPoint(evt.getPoint());
        
         
        int idproy = Integer.parseInt((String) jTable1.getValueAt(filaSeleccionada, 0));
        
       listarEquiposProyecto( idproy);
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void ListaEquiposValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaEquiposValueChanged
        Equipo e = (Equipo) ListaEquipos.getSelectedValue();
        int idEquipo = e.getIdEquipo();
        
        listarMiembrosEquipo(idEquipo);
    }//GEN-LAST:event_ListaEquiposValueChanged

    private void ListaEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaEquiposMouseClicked
//       Equipo e = (Equipo) ListaEquipos.getSelectedValue();
//        int idEquipo = e.getIdEquipo();
//        
//        listarMiembrosEquipo(idEquipo);
    }//GEN-LAST:event_ListaEquiposMouseClicked

    
    
    public void llenarTabla(){
        
       String[] nombresColumnas = {"ID","Nombre","Descripcion"};
       
       tm.setColumnIdentifiers(nombresColumnas);
       jTable1.setModel(tm);
       
       for(Proyecto p : pd.proyectos()){
           String [] FilaDatosProyecto={String.valueOf(p.getIdProyecto()),p.getNombre(),p.getDescripcion()};
           
           tm.addRow(FilaDatosProyecto);
           jTable1.setModel(tm);
        }
       
    }
    
    
    
    public void listarMiembrosEquipo(int idEquipo){
        modeloMiembros.removeAllElements();
        
        for (Miembro m : MD.miembrosDeEquipo(idEquipo) ){
            
            modeloMiembros.addElement(m.toString());
            
        }
    }
    
    
    public void listarEquiposProyecto(int idproy){
        modeloEquipos.removeAllElements();
        for(Equipo e : ed.listarEquipoPorProyecto(idproy)){
            
            modeloEquipos.addElement(e);
            
        }
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNasignarTarea;
    private javax.swing.JButton BTNasignarTarea1;
    private javax.swing.JList ListaEquipos;
    private javax.swing.JList ListaMiembros;
    private javax.swing.JButton btnListarTareas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
