package mapeo;
// Generated 30-nov-2016 14:10:39 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cochera generated by hbm2java
 */
public class Cochera  implements java.io.Serializable {


     private Integer codCochera;
     private int capacidad;
     private Set trens = new HashSet(0);

    public Cochera() {
    }

	
    public Cochera(int capacidad) {
        this.capacidad = capacidad;
    }
    public Cochera(int capacidad, Set trens) {
       this.capacidad = capacidad;
       this.trens = trens;
    }
   
    public Integer getCodCochera() {
        return this.codCochera;
    }
    
    public void setCodCochera(Integer codCochera) {
        this.codCochera = codCochera;
    }
    public int getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public Set getTrens() {
        return this.trens;
    }
    
    public void setTrens(Set trens) {
        this.trens = trens;
    }




}


