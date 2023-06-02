/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Miembro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

/**
 *
 * @author Nedisane
 */
public class MiembroData {
    
    private final Connection con;
    
    public MiembroData() {
        con = Conexion.getConexion();
    }
    
    public void guardarMiembro (Miembro miembro) {
        
        String query = "INSERT INTO miembro(dni, apellido, nombre, estado) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, miembro.getDni());
            ps.setString(2, miembro.getApellido());
            ps.setString(3, miembro.getNombre());
            ps.setBoolean(4, miembro.isEstado());
            
            ps.executeUpdate();
            
            ResultSet resultado = ps.getGeneratedKeys();
            
            if(resultado.next()){
                JOptionPane.showMessageDialog(null, "Miembro Agregado Correctamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar el nuevo miembro"+ex);
        }
        
    }
    
    public Miembro buscarMiembroID (int id) {
        
        Miembro miembroBuscado = null;
            
        String query = "SELECT * FROM miembro WHERE idMiembro = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            
            ResultSet resultado = ps.executeQuery();
            
            if (resultado.next()) {
                miembroBuscado = new Miembro();
                miembroBuscado.setDni(resultado.getInt("dni"));
                miembroBuscado.setApellido(resultado.getString("apellido"));
                miembroBuscado.setNombre(resultado.getString("nombre"));
                miembroBuscado.setEstado(resultado.getBoolean("estado"));
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Miembro no encontrado"+ex);
        }
        return miembroBuscado;
        
    }
    
    public Miembro buscarMiembroDNI (int dni) {
        
        Miembro miembroBuscado = null;
            
        String query = "SELECT * FROM miembro WHERE dni = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, dni);
            
            ResultSet resultado = ps.executeQuery();
            
            if (resultado.next()) {
                miembroBuscado = new Miembro();
                miembroBuscado.setIdMiembro(resultado.getInt("idMiembro"));
                miembroBuscado.setApellido(resultado.getString("apellido"));
                miembroBuscado.setNombre(resultado.getString("nombre"));
                miembroBuscado.setEstado(resultado.getBoolean("estado"));
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Miembro no encontrado"+ex);
        }
        return miembroBuscado;
        
    }
    
    
    
}
