/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_gp1;

import Data.proyectoData;
import Entidades.Proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
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
        
        //comprobarConeccion();
        
        // ******************* PRUEBAS EQUIPO DATA ******************* (JUAN)
        
        
        // ******************* PRUEBAS MIEMBRO DATA ******************* (JUAN)
        
        // PRUEBAS PROYECTO DATA (FACU)
        pruebasProyectoData();
        
        
        
    }
    //CONECCION
    public static void comprobarConeccion () {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost/gestion_gp1","root","");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar los Drivers");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectarse a la Base de Datos");
        }
        //Si no salta ningun cartel "ANDA", sino "ALGO FALLA"
    }
    //CRUD (Create, Read, Update, Delete)
    // ******************* PRUEBAS EQUIPO DATA ******************* (JUAN)
        
        
    // ******************* PRUEBAS MIEMBRO DATA ******************* (JUAN)
    
    
    public static void pruebasProyectoData(){
        System.out.println("se crea proyecto");
        Proyecto p = new Proyecto();
        p.setNombre("APLICACION_gp1");
        p.setDescripcion("APRENDIENDO SQL Y JAVA");
        p.setFechaInicio(LocalDate.now());
        p.setEstado(true);
        
        proyectoData pd = new proyectoData();
        pd.guardarProyecto(p);
        
        
        System.out.println("BUSCAR PROYECTO POR ID");
        System.out.println("NOMBRE: "+pd.buscarProyectoID(p.getIdProyecto()).getNombre());
        System.out.println("BUSCAR PROYECTO POR NOMBRE");
        String nombre=p.getNombre();
        System.out.println("NOMBRE: "+pd.buscarProyectoNombre(nombre).getNombre());
    }
}
