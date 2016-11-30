/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import accesoHibernate.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mapeo.Cochera;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Usuario
 */
public class Cocherasdao implements cocheras  {
   Cochera c = new Cochera();
    
  @Override
    public boolean addCochera(int capacidad) {
        
        c.setCapacidad(capacidad);
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(c);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }
    
    
   @Override
    public DefaultTableModel TablaCocheras() {
        Session session = null;
        DefaultTableModel m = new DefaultTableModel() {
           
            public boolean isCellEditable(int column, int row) {
                return false;
            }
        };
        session = HibernateUtil.getSessionFactory().openSession();
        String[] columns = {"Código", "Capacidad"}; 
        Query createQuery = session.createQuery("select count(codCochera) from Cocheras"); 
        
        int c =  Integer.parseInt(createQuery.uniqueResult().toString());
        Query createQuery2 = session.createQuery("from Cocheras");
        
        Object data[][] = new Object[c][2];
        List rs = createQuery2.list();
        Iterator it = rs.iterator();
        int i = 0;
        while (it.hasNext()) { 
            Cochera co = (Cochera) it.next(); 
            data[i][0] = co.getCodCochera();
            data[i][1] = co.getCapacidad();
           i++;
        }
        m.setDataVector(data, columns);
        session.close();
        return m;
    }

    @Override
    public boolean deleteCochera(int cod_cochera) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction beginTransaction = session.beginTransaction();
            Query createQuery = session.createQuery("delete from Student s where s.id =:id");
            createQuery.setParameter("id", cod_cochera);
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

    

   
    

