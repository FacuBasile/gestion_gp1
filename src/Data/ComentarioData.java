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
import java.time.LocalDate;
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
}
