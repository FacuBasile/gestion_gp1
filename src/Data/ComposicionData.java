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
import java.time.LocalDate;
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
                JOptionPane.showMessageDialog(null, "EL MIEMBRO SE INCORPORÓ AL EQUIPO");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR MIEMBRO AL EQUIPO" + ex);
        }
    }
}