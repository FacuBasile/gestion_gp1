/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_gp1;

import Data.ComentarioData;
import Data.ComposicionData;
import Data.EquipoData;
import Data.MiembroData;
import Data.TareaData;
import Data.proyectoData;
import Entidades.Comentario;
import Entidades.Composicion;
import Entidades.Equipo;
import Entidades.Miembro;
import Entidades.Proyecto;
import Entidades.Tarea;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
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
        //pruebacrearEquipo(); //Fuciona
        pruebaModificarProyecto(); //No Funciona
        //pruebaDarBajaProyecto(); //Funciona
        //pruebaBuscarEquipo(); //Funciona
        //pruebaModificarEquipo(); //Funciona
        //pruebaListaEquipo(); //Funciona
        //pruebaModificarEstadoEquipo(); //Funciona
        
        // ******************* PRUEBAS MIEMBRO DATA ******************* (JUAN)
        
        //pruebaMiembroDataGuardar(); //Funciona
        //pruebaMiembroDataBuscarID(); //Funciona
        //pruebaMiembroDataBuscarDNI(); //Funciona
        //pruebaMiembroDataBuscarLista(); //Funciona
        //pruebaMiembroDataActualizar(); //Funciona
        //pruebaMiembroDataAlta_BajaEstado(); //Funciona
        
        
        
        // PRUEBAS PROYECTO DATA (FACU)
        //pruebasProyectoData();
        
        
        //+++++++++++++++++++  PRUEBA COMENTARIO DATA +++++++++++++++++++++ (CHRISTIAN)
          //crearComentario();  
          
        //+++++++++++++++++++  PRUEBA COMPOSICION DATA +++++++++++++++++++++ (CHRISTIAN) 
          //integrarMiembro();
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
    public static void pruebacrearEquipo () {
        Equipo equipo = new Equipo("Gama",LocalDate.of(2001, 05, 01),true);
        EquipoData equipoData = new EquipoData();
        equipoData.crearEquipo(equipo);
    }
    
    public static void pruebaModificarProyecto () {
        EquipoData equipoData = new EquipoData();
        equipoData.modificarProyecto(2, 0);
    }
    
    public static void pruebaDarBajaProyecto () {
        EquipoData equipoData = new EquipoData();
        equipoData.darBajaProyecto(1);
    }
    
    public static void pruebaBuscarEquipo () {
        EquipoData equipoData = new EquipoData();
        System.out.println(equipoData.buscarEquipo(2));
    }
    
    public static void pruebaModificarEquipo () {
        Equipo equipo = new Equipo(3,9999999,"Gama",LocalDate.of(2000, 05, 01),false);
        EquipoData equipoData = new EquipoData();
        equipoData.modificarEquipo(equipo);
    }
    
    public static void pruebaListaEquipo () {
        EquipoData equipoData = new EquipoData();
        System.out.println(equipoData.listaEquipo());
    }
    
    public static void pruebaModificarEstadoEquipo () {
        EquipoData equipoData = new EquipoData();
        equipoData.modificarEstadoEquipo(1, false);
    }
        
    // ******************* PRUEBAS MIEMBRO DATA ******************* (JUAN)
    public static void pruebaMiembroDataGuardar () {
        Miembro miembro = new Miembro(65742358,"Gomez","Karim",false);
        MiembroData miembroData = new MiembroData();
        miembroData.guardarMiembro(miembro);
    }
    
    public static void pruebaMiembroDataBuscarID () {
        MiembroData miembroData = new MiembroData();
        System.out.println(miembroData.buscarMiembroID(2));
    }
    
    public static void pruebaMiembroDataBuscarDNI () {
        MiembroData miembroData = new MiembroData();
        System.out.println(miembroData.buscarMiembroDNI(56871356));
    }
    
    public static void pruebaMiembroDataBuscarLista() {
        MiembroData miembroData = new MiembroData();
        System.out.println(miembroData.listaMiembros());
    }
    
    public static void pruebaMiembroDataActualizar() {
        Miembro miembro = new Miembro(2,65742358,"Vallejos","Jose",false);
        MiembroData miembroData = new MiembroData();
        miembroData.actualizarMiembro(miembro);
    }
    
    public static void pruebaMiembroDataAlta_BajaEstado() {
        MiembroData miembroData = new MiembroData();
        miembroData.alta_BajaMiembro(3, true);
    }
    
    // ******************* PRUEBAS PROYECTO DATA ******************* (FACU)
    
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
    
    public static void listarProyectos(){
       proyectoData pd = new proyectoData();
       Proyecto p = new Proyecto();
       
        System.out.println(pd.proyectos().toString());
        
    }
    
    public static void crearTarea(){
        Tarea t = new Tarea();
        TareaData td = new TareaData();
        
        t.setNombre("CREAR TAREA DESDE MAIN DE NETBEANS PARA PROBAR");
        t.setFechaCierre(LocalDate.MIN);
        t.setEstado(true);
        td.nuevaTarea(t, 0);
    }
    
     // ******************* PRUEBA COMENTARIO DATA ******************* (CHRISTIAN)
    
    public static void crearComentario() {
        ComentarioData cd = new ComentarioData();
        Comentario c = new Comentario("ACA TENGO MI AVANCE EN LA TAREA", LocalDate.now(), 0);
        cd.generarComentario(c);
    }
    
    public static void integrarMiembro(){
        ComposicionData cd = new ComposicionData();      
        Composicion m = new Composicion(LocalDate.parse("2023-06-02"), 0, 2);
        cd.insertarMiembro(m);
    }
    
}
