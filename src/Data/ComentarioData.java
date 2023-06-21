/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Comentario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ComentarioData {
    
    private final Connection con;
    
     public ComentarioData() {
        con = Conexion.getConexion();
    }
     
    public void generarComentario(Comentario c){
        String query = "INSERT INTO `comentario`(`comentario`, `fechaAvance`, `idTarea`) VALUES (?, ?, ?)";
        
        try {    
            PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, c.getComentario());
            stmt.setDate(2, Date.valueOf(c.getFechaAvance()));
            stmt.setInt(3, c.getIdTarea());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "SE AGREGÓ EL COMENTARIO");
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL GENERAR COMENTARIO" + ex);
        }
    }
    
    public Comentario buscarComentario(int IdTarea){
        Comentario comentario = null;
        String query = "SELECT * FROM `comentario` WHERE idTarea = ?";
        
        try {                           
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, IdTarea);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                comentario = new Comentario();
                comentario.setIdComentario(rs.getInt("idComentario"));
                comentario.setComentario(rs.getString("comentario"));
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
                String fecha = formatoFecha.format(rs.getDate("fechaAvance"));
                LocalDate fechaNueva = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                comentario.setFechaAvance(fechaNueva);
                comentario.setIdTarea(IdTarea);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR" + ex);
        }
        
        return comentario;  
    }
    
    public void editarComentario(Comentario c){
        String query ="UPDATE comentario SET comentario = ?, fechaAvance = ? WHERE idTarea = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, c.getComentario());
            ps.setDate(2, Date.valueOf(c.getFechaAvance()));
            ps.setInt(3, c.getIdTarea());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "COMENTARIO EDITADO");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ComentarioData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
