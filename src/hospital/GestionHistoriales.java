/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author paco
 */
public class GestionHistoriales {
    Scanner lector = new Scanner(System.in);
    List<Historial> gh = new ArrayList<Historial>();
    DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
    
    public void anadir(Historial h) {
        gh.add(h);
    }

    public Historial BuscarHistorial() {
        System.out.println("Escribe nombre del historial a buscar");
        String id=lector.next();
        for (Historial historial : gh) {
           if(0==historial.nhistorial.compareTo(id)){
               return historial;
           }
        }
        return null;
    }
    
    public void modificarDatos(Historial h){
        System.out.println("Introduce nuevos datos del paciente:");
        System.out.println("cip:");
        String cip=lector.next();
        System.out.println("nif:");
        String nif=lector.next();
        System.out.println("nom:");
        String nom=lector.next();
        h.paciente.setCip(cip);
        h.paciente.setNif(nif);
        h.paciente.setNom(nom);
    }

    public List<Historial> lista(Historial h) {  
         ArrayList<Historial> re= new ArrayList<Historial>();
         for (Historial hist : gh) {
           if(hist.nhistorial==h.nhistorial){
            re.add(hist);
        }
        
    }
         return re;
    }
    
    public void anadirIngreso(Historial h,Ingreso i){
        h.listingreso.add(i);
    }
    
    public Ingreso utimoIngreso(Historial h){
      return h.listingreso.get(h.listingreso.size()-1);
    }
    
}
