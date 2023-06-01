/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
       
/**
 *
 * @author H
 */
public class Conexion {
    private static final String DATABASE_URL = "jdbc:mariadb://";
    private static final String DATABASE_HOST = "localhost";
    private static final String DATABASE_PUERTO = ":3306";
    private static final String DATABASE_DB = "/colegio";
    private static final String DATABASE_USUARIO = "root";
    private static final String DATABASE_PASSWORD = "";
    private static Conexion conexion = null;
    
    
    private Conexion(){
         try {
            //Cargar drivers
            Class.forName("org.mariadb.jdbc.Driver");
            
            
            
            
        } catch ( ClassNotFoundException ex ) {
            JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver" + ex);
        }
    }
    
    
   public static java.sql.Connection getConexion() {
        java.sql.Connection con = null;
        
        if ( conexion == null ) {
            conexion = new Conexion();
        }
        
        try {
            // Setup the connection with the DB
            con = DriverManager.getConnection(
                    DATABASE_URL + 
                    DATABASE_HOST + 
                    DATABASE_PUERTO + 
                    DATABASE_DB + 
                    "?useLegacyDatetimeCode=false&serverTimezone=UTC" + 
                    "&user=" + 
                    DATABASE_USUARIO + 
                    "&password=" + 
                    DATABASE_PASSWORD
            );
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex.getMessage() );
        }
        
        return con;
    }
}
