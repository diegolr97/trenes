package mapeo;
// Generated 30-nov-2016 14:10:39 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Linea generated by hbm2java
 */
public class Linea  implements java.io.Serializable {


     private Integer codLinea;
     private String empresa;
     private String tipo;
     private Set lineaestacions = new HashSet(0);
     private Set trens = new HashSet(0);

    public Linea() {
    }

	
    public Linea(String empresa, String tipo) {
        this.empresa = empresa;
        this.tipo = tipo;
    }
    public Linea(String empresa, String tipo, Set lineaestacions, Set trens) {
       this.empresa = empresa;
       this.tipo = tipo;
       this.lineaestacions = lineaestacions;
       this.trens = trens;
    }
   
    public Integer getCodLinea() {
        return this.codLinea;
    }
    
    public void setCodLinea(Integer codLinea) {
        this.codLinea = codLinea;
    }
    public String getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Set getLineaestacions() {
        return this.lineaestacions;
    }
    
    public void setLineaestacions(Set lineaestacions) {
        this.lineaestacions = lineaestacions;
    }
    public Set getTrens() {
        return this.trens;
    }
    
    public void setTrens(Set trens) {
        this.trens = trens;
    }




}


