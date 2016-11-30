/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public interface estaciones {
    public boolean addEstacion(String nombre, String localidad, String direccion, int codPostal);
    public boolean deleteEstacion(int codEstacion);
    public boolean modificarEstacion(int codEstacion, String nombre, String localidad, String direccion, int codPostal);
    public DefaultTableModel TablaEstaciones();
    
//    public int numeroEstacion();
    
}
