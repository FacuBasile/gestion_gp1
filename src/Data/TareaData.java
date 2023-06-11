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
import java.time.LocalDate;
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
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, t.getNombre());
            ps.setDate(2, Date.valueOf(t.getFechaCreacion()));
            ps.setDate(3, Date.valueOf(t.getFechaCierre()));
            ps.setBoolean(4, t.isEstado());
            ps.setInt(5, t.getIdMiembroEq());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "TAREA ACTUALIZADA");
            }
            
            
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
            
        } catch (SQLException ex) {
            Logger.getLogger(TareaData.class.getName()).log(Level.SEVERE, null, ex);
        }
         
           
           
       
    }
    
}
