/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Date;
 
/**
 *
 * @author alumneDAM
 */
public class RegistroEntrada implements Comparable<RegistroEntrada>{
    public enum Estado{moltgreu,greu,lleu};
    
     public Paciente paciente;
     public Date fecha;
     public Estado estado;
     public String descripcion;

    RegistroEntrada(Paciente paciente, Date fecha, Estado estado, String descripcion) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(RegistroEntrada e) {
      if (this.estado.equals(e.estado)) {
           return this.fecha.compareTo(e.fecha);
       }
      return this.estado.compareTo(e.estado);
   }
    
     @Override
    public String toString() {
    return "RegistroEntrada{" + "paciente=" + paciente + ", fecha=" + fecha + ", estado=" + estado + ", descripcion=" + descripcion + '}';
    }
   
    
}
