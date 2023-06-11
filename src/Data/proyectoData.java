/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Proyecto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class proyectoData {
    
    private final Connection con;
    
    public proyectoData() {
        con = Conexion.getConexion();
    }
    
    public void guardarProyecto(Proyecto p){
        String query ="INSERT INTO proyecto (nombre, descripcion, fechaInicio, estado) VALUES( ?, ?, ?, ?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
           
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDate(3, Date.valueOf(p.getFechaInicio()));
            ps.setBoolean(4, p.isEstado());
            ps.executeUpdate();
            
            ps.executeUpdate();
            
            ResultSet resultado = ps.getGeneratedKeys();
            
            if(resultado.next()){
                JOptionPane.showMessageDialog(null, "Proyecto Agregado Correctamente");
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar el nuevo Proyecto"+ex);
        } 
    }
    
    public Proyecto buscarProyectoID(int id){
    Proyecto p = null;
    
    String query = "SELECT * FROM `proyecto` WHERE idProyecto = ?";
    
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            
            ResultSet  rs = ps.executeQuery();
            
            if(rs.next()){
                p = new Proyecto();
                p.setIdProyecto(id);
                p.setDescripcion(rs.getString("descripcion"));
                p.setNombre(rs.getString("nombre"));
                p.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                p.setEstado(rs.getBoolean("estado"));
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(proyectoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    return p;
}    
  

    public Proyecto buscarProyectoNombre(String n){
    Proyecto p = null;
    
    String query = "SELECT * FROM `proyecto` WHERE nombre = ?";
    
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, n);
            
            ResultSet  rs = ps.executeQuery();
            
            if(rs.next()){
                p = new Proyecto();
                p.setIdProyecto(rs.getInt("idProyecto"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                p.setEstado(rs.getBoolean("estado"));
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(proyectoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    return p;
}    
}
