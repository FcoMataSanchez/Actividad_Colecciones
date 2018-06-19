/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author alumneDAM
 */
public class EntradaHospital {
   
    PriorityQueue<RegistroEntrada> registro = new PriorityQueue<RegistroEntrada>();

    public void anadir(RegistroEntrada a) {
        registro.offer(a);
    }

    public RegistroEntrada siguiente() {
        return registro.poll();
    }

    public List<RegistroEntrada> lista() {  
         ArrayList<RegistroEntrada> re= new ArrayList<RegistroEntrada>();
        for (RegistroEntrada reg : registro) {
            re.add(reg);
        }
        return re;
    }
    
    
    
}
