package mapeo;
// Generated 30-nov-2016 14:10:39 by Hibernate Tools 4.3.1



/**
 * ViajeId generated by hbm2java
 */
public class ViajeId  implements java.io.Serializable {


     private int codViaje;
     private int estacionCodEstacion;
     private int estacionCodEstacion1;

    public ViajeId() {
    }

    public ViajeId(int codViaje, int estacionCodEstacion, int estacionCodEstacion1) {
       this.codViaje = codViaje;
       this.estacionCodEstacion = estacionCodEstacion;
       this.estacionCodEstacion1 = estacionCodEstacion1;
    }
   
    public int getCodViaje() {
        return this.codViaje;
    }
    
    public void setCodViaje(int codViaje) {
        this.codViaje = codViaje;
    }
    public int getEstacionCodEstacion() {
        return this.estacionCodEstacion;
    }
    
    public void setEstacionCodEstacion(int estacionCodEstacion) {
        this.estacionCodEstacion = estacionCodEstacion;
    }
    public int getEstacionCodEstacion1() {
        return this.estacionCodEstacion1;
    }
    
    public void setEstacionCodEstacion1(int estacionCodEstacion1) {
        this.estacionCodEstacion1 = estacionCodEstacion1;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ViajeId) ) return false;
		 ViajeId castOther = ( ViajeId ) other; 
         
		 return (this.getCodViaje()==castOther.getCodViaje())
 && (this.getEstacionCodEstacion()==castOther.getEstacionCodEstacion())
 && (this.getEstacionCodEstacion1()==castOther.getEstacionCodEstacion1());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodViaje();
         result = 37 * result + this.getEstacionCodEstacion();
         result = 37 * result + this.getEstacionCodEstacion1();
         return result;
   }   


}

