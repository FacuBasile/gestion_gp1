/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Equipo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nedisane
 */
public class EquipoData {
    
    private final Connection con;
    
    public EquipoData() {
        con = Conexion.getConexion();
    }
    
    public void crearEquipo (Equipo equipo) {
        String query = "INSERT INTO equipo (nombre, fechaCreacion, estado) VALUES (?,?,?) ";
    
        try {
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, equipo.getNombre());
            ps.setDate(2, Date.valueOf(equipo.getFechaCreacion()));
            ps.setBoolean(3, equipo.isEstado());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Equipó Creado");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear el equipo "+ex);;
        }
    }
    
    public void modificarProyecto (int idEquipo, int idProyecto) {
        String query = "UPDATE Equipo SET idProyecto = ? WHERE idEquipo = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idEquipo);
            ps.setInt(2, idProyecto);
            
            int update = ps.executeUpdate();
            
            if (update == 1) {
                JOptionPane.showMessageDialog(null, "Proyecto Agregado al Equipo");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar el proyecto al equipo"+ex);;
        }
    }
    
    public void darBajaProyecto (int idEquipo) {
        String query = "UPDATE Equipo SET idProyecto = NULL WHERE idEquipo = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idEquipo);
            //ps.setNull(2, idProyecto);
            
            int update = ps.executeUpdate();
            
            if (update == 1) {
                JOptionPane.showMessageDialog(null, "Proyecto eliminado del equipo Exitosamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el proyecto del equipo"+ex);;
        }
    }
    
    public Equipo buscarEquipo (int id) {
        Equipo equipoBuscado = null;
        
        String query = "SELECT * FROM `equipo` WHERE idEquipo = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                equipoBuscado = new Equipo();
                equipoBuscado.setIdEquipo(id);
                equipoBuscado.setIdProyecto(rs.getInt("idProyecto"));
                equipoBuscado.setNombre(rs.getString("nombre"));
                equipoBuscado.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());
                equipoBuscado.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Equipo no encontrado "+ex);
        }
        return equipoBuscado;
    }
    
    public void modificarEquipo (Equipo equipo) {
        String query = "UPDATE equipo SET nombre = ?, fechaCreacion = ?, estado = ? WHERE idEquipo = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, equipo.getNombre());
            ps.setDate(2, Date.valueOf(equipo.getFechaCreacion()));
            ps.setBoolean(3, equipo.isEstado());
            ps.setInt(4, equipo.getIdEquipo());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Equipo Modificado Exitosamente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el equipo "+ex);;
        }
    }
    
    public ArrayList<Equipo> listaEquipo () {
        Equipo equipo;
        ArrayList <Equipo> equipos = new ArrayList();
        
        String query = "SELECT idEquipo, idProyecto, nombre, fechaCreacion, estado FROM equipo";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                equipo = new Equipo();
                equipo.setIdEquipo(rs.getInt("idEquipo"));
                equipo.setIdProyecto(rs.getInt("idProyecto"));
                equipo.setNombre(rs.getString("nombre"));
                equipo.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());
                equipo.setEstado(rs.getBoolean("estado"));
                
                equipos.add(equipo);
            }
            
        } catch (SQLException ex) {
            System.out.println("No se pudo obtener la lista de equipos "+ex);
        }
        return equipos;
    }
    
    public void modificarEstadoEquipo (int id, boolean bool) {
        String query = "UPDATE equipo SET estado = ? WHERE idEquipo = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(2, id);
            ps.setBoolean(1, bool);
            int rs = ps.executeUpdate();
            
            if(rs == 1){
                JOptionPane.showMessageDialog(null, "Estado del equipo Actualizado");
            }else if (rs == 0){
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el equipo");
            }
            ps.close();
        }catch(Exception ex){
            System.out.println("Error al actualizar el equipo "+ex);
        }
    }
    
}
