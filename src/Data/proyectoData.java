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
import java.util.ArrayList;
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
            
            ResultSet resultado = ps.getGeneratedKeys();
            
            if(resultado.next()){
                JOptionPane.showMessageDialog(null, "Proyecto Agregado Correctamente");
                p.setIdProyecto(resultado.getInt("idProyecto"));
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar el nuevo Proyecto"+ex);
        } 
    }
    
    public ArrayList<Proyecto> proyectos(){
        ArrayList proyectos = new ArrayList();
        
        String query = "SELECT * FROM proyecto";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Proyecto p = new Proyecto();
                p.setNombre(rs.getString("nombre"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setIdProyecto(rs.getInt("idProyecto"));
                p.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                p.setEstado(rs.getBoolean("estado"));
                
                proyectos.add(p);
                
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(proyectoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
        
        
        return proyectos;
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
            
            
            ps.close();
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
            
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(proyectoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    return p;
}    
}
