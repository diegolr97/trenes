package mapeo;
// Generated 30-nov-2016 14:10:39 by Hibernate Tools 4.3.1



/**
 * AccesoId generated by hbm2java
 */
public class AccesoId  implements java.io.Serializable {


     private int codAcceso;
     private int estacionCodEstacion;

    public AccesoId() {
    }

    public AccesoId(int codAcceso, int estacionCodEstacion) {
       this.codAcceso = codAcceso;
       this.estacionCodEstacion = estacionCodEstacion;
    }
   
    public int getCodAcceso() {
        return this.codAcceso;
    }
    
    public void setCodAcceso(int codAcceso) {
        this.codAcceso = codAcceso;
    }
    public int getEstacionCodEstacion() {
        return this.estacionCodEstacion;
    }
    
    public void setEstacionCodEstacion(int estacionCodEstacion) {
        this.estacionCodEstacion = estacionCodEstacion;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AccesoId) ) return false;
		 AccesoId castOther = ( AccesoId ) other; 
         
		 return (this.getCodAcceso()==castOther.getCodAcceso())
 && (this.getEstacionCodEstacion()==castOther.getEstacionCodEstacion());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodAcceso();
         result = 37 * result + this.getEstacionCodEstacion();
         return result;
   }   


}


