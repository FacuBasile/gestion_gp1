/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_gp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author H
 */
public class Gestion_gp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        comprobarConeccion();
    }
    
    
    //CONECCION
    public static void comprobarConeccion () {
        try {
            Class.forName("org.mariadb.jdbc.Drver");
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost/gestion_gp1","root","");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar los Drivers");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectarse a la Base de Datos");
        }
        //Si no salta ningun cartel "ANDA", sino "ALGO FALLA"
    }
    
}
