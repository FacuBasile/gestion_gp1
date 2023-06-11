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
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.ArrayList;


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
                miembroBuscado.setIdMiembro(id);
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
                miembroBuscado.setDni(dni);
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
    
    public ArrayList<Miembro> listaMiembros () {
        Miembro miembro;
        ArrayList <Miembro> miembros = new ArrayList();
        
        String query = "SELECT idMiembro, dni, apellido, nombre, estado FROM miembro";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                miembro = new Miembro();
                miembro.setIdMiembro(rs.getInt("idMiembro"));
                miembro.setDni(rs.getInt("dni"));
                miembro.setApellido(rs.getString("apellido"));
                miembro.setNombre(rs.getString("nombre"));
                miembro.setEstado(rs.getBoolean("estado"));
                
                miembros.add(miembro);
            }
            rs.close();;
        } catch (SQLException ex) {
            System.out.println("No se pudo obtener la lista de miembros "+ex);
        }
        return miembros;
    }
    
    public boolean encontrarMiembro (int dni) {
        //Miembro miembroBuscado = null;
        String query = "SELECT * FROM miembro WHERE DNI = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, dni);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return true;
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ALUMNO NO ENCONTRADO");
        }
        
        return false;
    }
    
    public void actualizarMiembro (Miembro miembro) {
        
        String query = "UPDATE miembro SET dni= ?,apellido= ?,nombre= ?,estado= ? WHERE idMiembro = ?";
    
        try {
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, miembro.getDni());
            ps.setString(2, miembro.getApellido());
            ps.setString(3, miembro.getNombre());
            ps.setBoolean(4, miembro.isEstado());
            ps.setInt(5, miembro.getIdMiembro());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Miembro Actualizado");
            
            ps.close();
            
        } catch ( SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el miembro: "+ ex);
        }
    }
    
    public void alta_BajaMiembro (int id, boolean bool) {
        
        String query = "UPDATE miembro SET Estado = ? WHERE miembro.idMiembro = ?";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(2, id);
            ps.setBoolean(1, bool);
            int rs = ps.executeUpdate();
            
            if(rs == 1){
                JOptionPane.showMessageDialog(null, "Estado del miembro Actualizado");
            }else if (rs == 0){
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el miembro");
            }
            ps.close();
            
        }catch(Exception ex){
            System.out.println("Error al actualizar el miembro "+ex);
        }
        
    }
    
}
