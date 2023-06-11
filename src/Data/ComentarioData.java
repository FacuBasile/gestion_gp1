/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
     
    public void generarComentario(String comentario, LocalDate fechaAvance, int idTarea){
        String query = "INSERT INTO `comentario`(`comentario`, `fechaAvance`, `idTarea`) VALUES (?, ?, ?)";
        
        try {    
            PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, comentario);
            stmt.setDate(2, fechaAvance);
            stmt.setInt(3, idTarea);
            
            int f = stmt.executeUpdate();
            
            if(f == 1){
                JOptionPane.showMessageDialog(null, "SE AGREGÓ EL COMENTARIO");
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL GENERAR COMENTARIO");
        }
    }
}
