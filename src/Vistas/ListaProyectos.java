/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.ComentarioData;
import Data.ComposicionData;
import Data.EquipoData;
import Data.MiembroData;
import Data.TareaData;
import Data.proyectoData;
import Entidades.Equipo;
import Entidades.Miembro;
import Entidades.Proyecto;
import Entidades.Tarea;
import java.awt.event.ActionEvent;
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
DefaultListModel<Miembro> modeloMiembros = new DefaultListModel();
TareaData TD = new TareaData();
ComentarioData CD = new ComentarioData();
ComposicionData compD = new ComposicionData();
MiembroData MD = new MiembroData();
ViewModificarEquipo ME = new ViewModificarEquipo();
DefaultListModel<Tarea> tareas = new DefaultListModel();
int idproy, idMiembroEq;
public static int idMiembrolista, IdTarea;

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
        
        jPanel1.setSize(1000, 700);
        ME.setAlignmentX(500);
        
        
        ListaTareas.setModel(tareas);
        tareas.removeAllElements();
        
        BTNverTareas.setEnabled(false);
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
        BTNeliminarMiembroDelEquipo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BTNverTareas = new javax.swing.JButton();
        BTNasignarNuevaTarea = new javax.swing.JButton();
        BTNverEquipos = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaTareas = new javax.swing.JList();
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
        ListaMiembros.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaMiembrosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(ListaMiembros);

        BTNeliminarMiembroDelEquipo.setText("Eliminar Miembro del Equipo");
        BTNeliminarMiembroDelEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNeliminarMiembroDelEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        BTNverTareas.setText("Ver Tarea");
        BTNverTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNverTareasActionPerformed(evt);
            }
        });

        BTNasignarNuevaTarea.setText("Asignar Nueva Tarea");
        BTNasignarNuevaTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNasignarNuevaTareaActionPerformed(evt);
            }
        });

        BTNverEquipos.setText("VER EQUIPOS");
        BTNverEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNverEquiposActionPerformed(evt);
            }
        });

        ListaTareas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ListaTareas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaTareasValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(ListaTareas);

        jLabel2.setText("TAREAS:  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BTNeliminarMiembroDelEquipo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel4)))
                                .addGap(138, 138, 138)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BTNverEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNasignarNuevaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNverTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(BTNverEquipos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNeliminarMiembroDelEquipo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BTNverTareas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTNasignarNuevaTarea))
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)))
                .addContainerGap(13, Short.MAX_VALUE))
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
        
        jPanel2.removeAll();
        jPanel2.repaint();
        ME.setVisible(true);
        
        jPanel2.add(ME);
        ME.setFocusable(true);
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTNeliminarMiembroDelEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNeliminarMiembroDelEquipoActionPerformed
       Miembro m = (Miembro) ListaMiembros.getSelectedValue();
       Equipo e = (Equipo) ListaEquipos.getSelectedValue();
       compD.borrarMiembro(e.getIdEquipo(), m.getIdMiembro());
       
       
    }//GEN-LAST:event_BTNeliminarMiembroDelEquipoActionPerformed


    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int filaSeleccionada = jTable1.rowAtPoint(evt.getPoint());
        idproy = Integer.parseInt((String) jTable1.getValueAt(filaSeleccionada, 0));
        listarEquiposProyecto(idproy);      
    }//GEN-LAST:event_jTable1MouseClicked

    private void ListaEquiposValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaEquiposValueChanged
        ListaEquipos.removeAll();
        modeloMiembros.removeAllElements();
        Equipo e = (Equipo) ListaEquipos.getSelectedValue();
        int idEquipo = e.getIdEquipo();
        
        listarMiembrosEquipo(idEquipo);
    }//GEN-LAST:event_ListaEquiposValueChanged

    private void ListaEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaEquiposMouseClicked
        
        modeloMiembros.removeAllElements();
        Equipo e = (Equipo) ListaEquipos.getSelectedValue();
        int idEquipo = e.getIdEquipo();
        
        listarMiembrosEquipo(idEquipo);
    }//GEN-LAST:event_ListaEquiposMouseClicked

    private void BTNasignarNuevaTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNasignarNuevaTareaActionPerformed
        TareaForm TF = new TareaForm();
        TF.setVisible(true);
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.add(TF);
        
    }//GEN-LAST:event_BTNasignarNuevaTareaActionPerformed

    private void BTNverEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNverEquiposActionPerformed
        
        modeloEquipos.removeAllElements();
        
       listarEquiposProyecto(idproy);
    }//GEN-LAST:event_BTNverEquiposActionPerformed

    private void ListaMiembrosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaMiembrosValueChanged
        Miembro ml = (Miembro) ListaMiembros.getSelectedValue();
        idMiembroEq = ml.getIdMiembro();
        idMiembrolista = ml.getIdMiembro();
        listarTareasMiembro();
    }//GEN-LAST:event_ListaMiembrosValueChanged

    private void ListaTareasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaTareasValueChanged
        Tarea t = new Tarea();
        BTNverTareas.setEnabled(true);   
        t = (Tarea)ListaTareas.getSelectedValue();
        IdTarea = t.getIdTarea(); 
        
    }//GEN-LAST:event_ListaTareasValueChanged

    private void BTNverTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNverTareasActionPerformed
        ComentarioForm CF = new ComentarioForm();
        CF.setVisible(true);
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.add(CF);  
        CF.moveToFront();
    }//GEN-LAST:event_BTNverTareasActionPerformed

    
    
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
            
            modeloMiembros.addElement(m);
            
        }
        ListaMiembros.setModel(modeloMiembros);
    }
    
    
    public void listarEquiposProyecto(int idproy){
        modeloEquipos.removeAllElements();
        for(Equipo e : ed.listarEquipoPorProyecto(idproy)){
            
            modeloEquipos.addElement(e);
           
        }
         ListaEquipos.setModel(modeloEquipos);
    }
    
    public void listarTareasMiembro(){
        tareas.removeAllElements();
        for(Tarea t : TD.TareasDeMiembroEq(idMiembroEq)){
            tareas.addElement(t);
        }
        
        ListaTareas.setModel(tareas);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNasignarNuevaTarea;
    private javax.swing.JButton BTNeliminarMiembroDelEquipo;
    private javax.swing.JButton BTNverEquipos;
    private javax.swing.JButton BTNverTareas;
    private javax.swing.JList ListaEquipos;
    private javax.swing.JList ListaMiembros;
    private javax.swing.JList ListaTareas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
