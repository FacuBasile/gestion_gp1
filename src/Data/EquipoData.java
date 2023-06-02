/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;

/**
 *
 * @author Nedisane
 */
public class EquipoData {
    
    private final Connection con;
    
    public EquipoData() {
        con = Conexion.getConexion();
    }
    
    
}
