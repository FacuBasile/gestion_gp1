/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Tarea;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author H
 */
public class TareaData {
    private final Connection con;
    
    public TareaData() {
        con = Conexion.getConexion();
    }
    
    public void nuevaTarea(Tarea t, int idMiembroEq){
        String query ="INSERT INTO tarea(nombre, fechaCreacion, fechaCierre, estado, idMiembroEq) VALUES ( ?, ?, ?, ?, ?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getNombre());
            ps.setDate(2, Date.valueOf(t.getFechaCreacion()));
            ps.setDate(3, Date.valueOf(t.getFechaCierre()));
            ps.setBoolean(4, t.isEstado());
            ps.setInt(5, t.getIdMiembroEq());
            
            ps.executeQuery();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "TAREA GUARDADA");
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TareaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
     public void ActualizarTarea(Tarea t, int idMiembroEq){
        String query ="UPDATE tarea SET nombre = ?, fechaCreacion= ?, fechaCierre = ?, estado = ? WHERE idMiembroEq = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, t.getNombre());
            ps.setDate(2, Date.valueOf(t.getFechaCreacion()));
            ps.setDate(3, Date.valueOf(t.getFechaCierre()));
            ps.setBoolean(4, t.isEstado());
            ps.setInt(5, idMiembroEq);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "TAREA GUARDADA");
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TareaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
     
    public void actualizarFechaCierre(Tarea t, LocalDate f){
       String query = "UPDATE tarea SET fechaCierre = ? WHERE idTarea = ?"; 
       
        try { 
            
            PreparedStatement ps = con.prepareStatement(query);
           
            
            ps.setDate(1, Date.valueOf(f));
            ps.setInt(2, t.getIdTarea());
            
            int res = ps.executeUpdate();
            
            if(res>0){
                JOptionPane.showMessageDialog(null, "Fecha Cierre actualizada");
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TareaData.class.getName()).log(Level.SEVERE, null, ex);
        }
         
           
           
       
    }
    
    public void actualizarEstadoTarea(Tarea t, int bool){
        
       String query = "UPDATE tarea SET estado = ? WHERE idTarea = ?"; 
       
        try { 
            
            PreparedStatement ps = con.prepareStatement(query);
           
            
            ps.setInt(1, bool);
            ps.setInt(2, t.getIdTarea());
            
            int res = ps.executeUpdate();
            
            if(res>0){
                JOptionPane.showMessageDialog(null, "ESTADO Tarea actualizado");
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TareaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Tarea> TareasDeMiembroEq(int idMiembroEq){
        ArrayList<Tarea> tareas = new ArrayList();
        
        String query ="SELECT * from tarea WHERE idMiembroEq = ?";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idMiembroEq);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Tarea t = new Tarea();
                t.setNombre(rs.getString("nombre"));
                t.setIdTarea(rs.getInt("idTarea"));
                t.setIdMiembroEq(rs.getInt("idMiembroEq"));
                t.setEstado(rs.getBoolean("estado"));
                t.setFechaCierre(rs.getDate("fechaCierre").toLocalDate());
                t.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());
                
                tareas.add(t);
               
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TareaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        return tareas;
    }
    
    public ArrayList<Tarea> TareasCerradasDeMiembroEq(int idMiembroEq){
        ArrayList<Tarea> tareas = new ArrayList();
        
        String query ="SELECT * from tarea WHERE idMiembroEq = ? AND estado = 0";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idMiembroEq);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Tarea t = new Tarea();
                t.setNombre(rs.getString("nombre"));
                t.setIdTarea(rs.getInt("idTarea"));
                t.setIdMiembroEq(rs.getInt("idMiembreoEq"));
                t.setEstado(rs.getBoolean("estado"));
                t.setFechaCierre(rs.getDate("fechaCierre").toLocalDate());
                t.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());
                
                tareas.add(t);
               
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TareaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        return tareas;
    }
    
    public ArrayList<Tarea> TareasNoCerradasDeMiembroEq(int idMiembroEq){
        ArrayList<Tarea> tareas = new ArrayList();
        
        String query ="SELECT * from tarea WHERE idMiembroEq = ? AND estado = 1";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idMiembroEq);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Tarea t = new Tarea();
                t.setNombre(rs.getString("nombre"));
                t.setIdTarea(rs.getInt("idTarea"));
                t.setIdMiembroEq(rs.getInt("idMiembreoEq"));
                t.setEstado(rs.getBoolean("estado"));
                t.setFechaCierre(rs.getDate("fechaCierre").toLocalDate());
                t.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());
                
                tareas.add(t);
               
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TareaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        return tareas;
    }
}
