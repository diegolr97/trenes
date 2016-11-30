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
    
    public boolean deleteEstacion(int codEstacion){
        estaciones.deleteEstacion(codEstacion);
        return true;
    }
    
    public DefaultTableModel TablaEstaciones(){
         return estaciones.TablaEstaciones();
    }
    
    public boolean modificarEstacion(int codEstacion, String nombre, String localidad, String direccion, int codPostal){
        estaciones.modificarEstacion(codEstacion, nombre, localidad, direccion, codPostal);
        return true;
    }
    
    
private cocheras cocheras = new Cocherasdao();

    public boolean addCochera(int capacidad){
        cocheras.addCochera(capacidad);
        return true;
}
    public DefaultTableModel TablaCocheras(){
        return cocheras.TablaCocheras();
    }
    
    public boolean modificarCochera(int codCochera, int capacidad){
        cocheras.modificarCochera(codCochera, capacidad);
        return true;
    }
    
    public boolean deleteCochera(int codCochera){
        cocheras.deleteCochera(codCochera);
        return true;
    }
    
    
            
    
}
