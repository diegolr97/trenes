package mapeo;
// Generated 30-nov-2016 14:10:39 by Hibernate Tools 4.3.1



/**
 * Tren generated by hbm2java
 */
public class Tren  implements java.io.Serializable {


     private TrenId id;
     private Cochera cochera;
     private Linea linea;
     private String modelo;

    public Tren() {
    }

    public Tren(TrenId id, Cochera cochera, Linea linea, String modelo) {
       this.id = id;
       this.cochera = cochera;
       this.linea = linea;
       this.modelo = modelo;
    }
   
    public TrenId getId() {
        return this.id;
    }
    
    public void setId(TrenId id) {
        this.id = id;
    }
    public Cochera getCochera() {
        return this.cochera;
    }
    
    public void setCochera(Cochera cochera) {
        this.cochera = cochera;
    }
    public Linea getLinea() {
        return this.linea;
    }
    
    public void setLinea(Linea linea) {
        this.linea = linea;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }




}


