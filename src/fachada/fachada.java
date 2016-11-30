/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import dao.Cocherasdao;
import dao.Estacionesdao;
import dao.cocheras;
import dao.estaciones;
import static java.util.Collections.list;
import javax.swing.table.DefaultTableModel;
import mapeo.Cochera;

/**
 *
 * @author Usuario
 */
public class fachada{ 
private estaciones estaciones = new Estacionesdao();
    
    public boolean addEstaciones(String nombre, String localidad, String direccion, int contacto){
        estaciones.addEstacion(nombre, localidad, direccion, contacto);
       return true;
     }
    
    public boolean deleteEstacion(int cod_estacion){
        estaciones.deleteEstacion(cod_estacion);
        return true;
    }
    
    public DefaultTableModel TablaEstaciones(){
         return estaciones.TablaEstaciones();
    }
    
    
//    public int numeroEstacion(){
//        return estaciones.numeroEstacion();
//    }
    
    
            
    
}
