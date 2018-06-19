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
public class Ingreso implements Comparable<Ingreso>{

    @Override
    public String toString() {
        return "Ingreso: " + "ingreso=" + ingreso + ", alta=" + alta + ", descripcion=" + descripcion;
    }
   public Date ingreso,alta;
   String descripcion;

    public Ingreso(Date ingreso, Date alta, String descripcion) {
        this.ingreso = ingreso;
        this.alta = alta;
        this.descripcion = descripcion;
    }

    public Date getIngreso() {
        return ingreso;
    }
  
    public Date getAlta() {
        return alta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(Ingreso t) {
         return this.ingreso.compareTo(t.ingreso);
    }
   
    
   
}
