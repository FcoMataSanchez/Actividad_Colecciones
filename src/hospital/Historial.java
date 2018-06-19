/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.List;

/**
 *
 * @author alumneDAM
 */
public class Historial{
    String nhistorial;
    Paciente paciente;
   public List<Ingreso>listingreso;

    public Historial(String nhistorial, Paciente paciente, List<Ingreso> listingreso) {
        this.nhistorial = nhistorial;
        this.paciente = paciente;
        this.listingreso = listingreso;
    }

    public String getNhistorial() {
        return nhistorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Ingreso> getListingreso() {
        return listingreso;
    }

    public void setListingreso(List<Ingreso> listingreso) {
        this.listingreso = listingreso;
    }

    @Override
    public String toString() {
        return "Historial: " + "nhistorial=" + nhistorial + ", paciente=" + paciente + ", listingreso=" + listingreso;
    }

    
    
    
}
