/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public interface cocheras {
    public boolean addCochera(int capacidad);
    public boolean deleteCochera(int cod_cochera);
    public DefaultTableModel TablaCocheras();
    
    
}
