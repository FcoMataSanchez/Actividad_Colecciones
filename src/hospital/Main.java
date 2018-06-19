/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;


import hospital.RegistroEntrada.Estado;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author alumneDAM
 */
public class Main {

    
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        EntradaHospital eh = new EntradaHospital();
        GestionHistoriales gh=new GestionHistoriales();
        Scanner lector = new Scanner(System.in);
        
        Paciente p= new Paciente("1111A","1111A","Paco");
        Paciente p1= new Paciente("2222A","2222A","Paco");
        Paciente p2= new Paciente("3333A","3333A","Paco");
        
        RegistroEntrada r1 = new RegistroEntrada(p,df.parse("12-10-2015 23:55:55"),Estado.lleu,"djdjdjjd");
        RegistroEntrada r2 = new RegistroEntrada(p1,df.parse("12-10-2016 23:56:57"),Estado.greu,"djdjdjjd");
        RegistroEntrada r3 = new RegistroEntrada(p2,df.parse("12-10-2018 23:57:58"),Estado.moltgreu,"djdjdjjd");
        RegistroEntrada r4 = new RegistroEntrada(p,df.parse("12-10-2015 23:55:56"),Estado.lleu,"djdjdjjd");
        RegistroEntrada r5 = new RegistroEntrada(p1,df.parse("12-10-2016 23:59:59"),Estado.greu,"djdjdjjd");
        
        eh.anadir(r1);
        eh.anadir(r2);
        eh.anadir(r3);
        eh.anadir(r4);
        eh.anadir(r5);
        
        for (RegistroEntrada registroEntrada : eh.lista()) {
            System.out.println(registroEntrada);
        }
        System.out.println("------------");
        System.out.println(eh.siguiente().toString());
        System.out.println("------------");
        
        for (RegistroEntrada registroEntrada : eh.lista()) {
            System.out.println(registroEntrada);
        } 
        
        
        System.out.println("---------------------------------------------");
        
        Ingreso i1= new Ingreso(df.parse("11-10-2015 23:55:55"),df.parse("13-10-2015 23:55:55"),"dsesffeddefvrfevfvr");
        Ingreso i2= new Ingreso(df.parse("12-10-2015 23:55:55"),df.parse("14-10-2015 23:55:55"),"dsesffeddefvrfevfvr");
        Ingreso i3= new Ingreso(df.parse("13-10-2015 23:55:55"),df.parse("15-10-2015 23:55:55"),"dsesffeddefvrfevfvr");
        Ingreso i4= new Ingreso(df.parse("14-10-2015 23:55:55"),df.parse("16-10-2015 23:55:55"),"dsesffeddefvrfevfvr");
        Ingreso i5= new Ingreso(df.parse("15-10-2015 23:55:55"),df.parse("17-10-2015 23:55:55"),"dsesffeddefvrfevfvr");
        Ingreso i6= new Ingreso(df.parse("16-10-2015 23:55:55"),df.parse("18-10-2015 23:55:55"),"dsesffeddefvrfevfvr");
        ArrayList<Ingreso>Li1 = new ArrayList<Ingreso>();
        ArrayList<Ingreso>Li2 = new ArrayList<Ingreso>();
        ArrayList<Ingreso>Li3 = new ArrayList<Ingreso>();
        Li1.add(i1);
        Li1.add(i2);
        Li2.add(i3);
        Li2.add(i4);
        Li3.add(i5);
        Li3.add(i6);
        Historial h11= new Historial("1",p,Li1);
        Historial h12= new Historial("2",p,Li2);
        Historial h13= new Historial("3",p,Li3);
        
        gh.anadir(h11);
        gh.anadir(h12);
        gh.anadir(h13);
        System.out.println("Buscar por id:");
        System.out.println(gh.BuscarHistorial());
        System.out.println("Modificar datos: ");
        gh.modificarDatos(h13);
        System.out.println("Listar los ingresos de un paciente:");
        for (Historial historial : gh.lista(h13)) {
            System.out.println(historial);
        }
        System.out.println("Obtener el ultimo ingreso: ");
        System.out.println(gh.utimoIngreso(h13));
        System.out.println("Añadir nuevo ingreso: ");
        String descripcion=lector.next();
        Ingreso i = new Ingreso(df.parse("16-10-2019 23:55:55"),df.parse("18-10-2019 23:55:55"),descripcion);
        gh.anadirIngreso(h13,i);
    }
    
}
