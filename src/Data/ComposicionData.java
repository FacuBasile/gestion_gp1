/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Composicion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ComposicionData {
    
    private final Connection con;
    
    public ComposicionData() {
        con = Conexion.getConexion();
    }
     
    public void insertarMiembro(Composicion c){
        String query = "INSERT INTO `composicion`(`fechaIncorporacion`, `idEquipo`, `idMiembro`) VALUES (?, ?, ?)";
        
        try {                   
            PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setDate(1, Date.valueOf(c.getFechaIncorporacion()));
            stmt.setInt(2, c.getIdEquipo());
            stmt.setInt(3, c.getIdMiembro());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "EL MIEMBRO FUE ASIGNADO AL EQUIPO " + c.getIdEquipo());
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR MIEMBRO AL EQUIPO" + ex);
        }
    }
    
    public ArrayList<Composicion> listarMiembrosEquipo(){
        Composicion c;
        ArrayList<Composicion> listado = new ArrayList();
        
        String query = "SELECT idMiembroEq, fechaIncorporacion, idEquipo, idMiembro FROM composicion";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                c = new Composicion();
                c.setIdMiembroEq(rs.getInt("idMiembroEq"));
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
                String fecha = formatoFecha.format(rs.getDate("fechaIncorporacion"));
                LocalDate fechaNueva = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                c.setFechaIncorporacion(fechaNueva);
                c.setIdEquipo(rs.getInt("idEquipo"));
                c.setIdMiembro(rs.getInt("idMiembro"));
                
                listado.add(c);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ComposicionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listado;
    }
    
    public void actualizarMiembroEquipo(Composicion c){
            String query = "UPDATE `composicion` SET `idEquipo`= ? WHERE idMiembro = ?";          
        try {    
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, c.getIdEquipo());
            ps.setInt(2, c.getIdMiembro());
            
            int f = ps.executeUpdate();
            
            if(f == 1){
                JOptionPane.showMessageDialog(null, "EL MIEMBRO FUE ASIGNADO A OTRO EQUIPO" + "\n" +
                                                    "EQUIPO " + c.getIdEquipo());
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "ERROR " + ex);
        }
    }
    
    public void borrarMiembro(int idEquipo, int idMiembro){
            String query = "DELETE FROM `composicion` WHERE idMiembro = ? AND idEquipo = ? ";
        try {            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idMiembro);
            ps.setInt(2, idEquipo);
            
            int e =ps.executeUpdate();
            
            if(e>=1){
                JOptionPane.showMessageDialog(null, "MIEMBRO ELIMINADO DEL EQUIPO");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR");
            }
            
        } catch (SQLException ex) {
                Logger.getLogger(ComposicionData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}