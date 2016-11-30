/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import accesoHibernate.HibernateUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mapeo.Estacion;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author diego
 */
public class Estacionesdao implements estaciones
{
   Estacion l = new Estacion();

    @Override
    public boolean addEstacion(String nombre, String localidad, String direccion, int codPostal) {
        l.setNombre(nombre);
        l.setLocalidad(localidad);
        l.setDireccion(direccion);
        l.setCodPostal(codPostal);
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(l);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            session.close();
            return false;
        }
    }

    @Override
    public DefaultTableModel TablaEstaciones() {
        Session session = null;
        DefaultTableModel m = new DefaultTableModel() {
           
            public boolean isCellEditable(int column, int row) {
                return false;
            }
        };
        session = HibernateUtil.getSessionFactory().openSession();
        String[] columns = {"Código", "Nombre", "Localidad", "Direccion", "Código Postal"}; 
        Query createQuery = session.createQuery("select count(codEstacion) from Estacion"); 
        
        int c =  Integer.parseInt(createQuery.uniqueResult().toString());
        Query createQuery2 = session.createQuery("from Estacion");
        
        Object data[][] = new Object[c][5];
        List rs = createQuery2.list();
        Iterator it = rs.iterator();
        int i = 0;
        while (it.hasNext()) { 
            Estacion co = (Estacion) it.next(); 
            data[i][0] = co.getCodEstacion();
            data[i][1] = co.getNombre();
            data[i][2] = co.getLocalidad();
            data[i][3] = co.getDireccion();
            data[i][4] = co.getCodPostal();
            
            
            
           i++;
        }
        m.setDataVector(data, columns);
        session.close();
        return m;
    }

    @Override
    public boolean deleteEstacion(int codEstacion) {
        l.setCodEstacion(codEstacion);
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction beginTransaction = session.beginTransaction();
            Query createQuery = session.createQuery("delete from Estaciones l where l.codEstacion =:codEstacion");
            createQuery.setParameter("codEstacion", codEstacion);
            createQuery.executeUpdate();
            beginTransaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    
        
}
}

//    @Override
//    public int numeroEstacion() {
//        int cod=0;
//    
//        String c="select max(cod_estacion)+1 as total from Estaciones l";
//        Session session=HibernateUtil.getSessionFactory().openSession();
//        Query q=session.createQuery(c);
//       List results=q.list();
//      Iterator codigo=results.iterator();
//      int i=0;
//      while(codigo.hasNext()){
//     cod = q.getInt("total");
//     i++;
//}
//session.close();
//
//    }
//}
    


   
    

