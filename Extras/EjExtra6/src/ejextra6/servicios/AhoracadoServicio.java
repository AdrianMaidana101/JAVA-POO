/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejextra6.servicios;

import ejextra6.entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class AhoracadoServicio {
    private final Scanner leer = new Scanner(System.in);
    Ahorcado a = new Ahorcado();
    
    public void crearJuego(){
        System.out.println("Ingrese la cantidad máxima de jugadas");
        a.setCantJugadas(leer.nextInt());
        System.out.println("Ingrese la palabra");
        String pal1=leer.next();
        String[] pal1Vec = new String[pal1.length()];
        for (int i = 0; i < pal1.length(); i++) {    
             pal1Vec[i]= pal1.substring(i, i+1);
        }
        a.setPalabra(pal1Vec);
        a.setLetrasEncontradas(0);
    }
    
    public void longitud(){
        System.out.println("La longitud de la palabra es de " + a.getPalabra().length + " espacios");
    }
    
    public boolean buscar(String letra){
        boolean bandera = false;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (letra.equals(a.getPalabra()[i])) {
                a.setLetrasEncontradas(a.getLetrasEncontradas()+1);
                bandera = true;
            }
        }
        
        return bandera;
    }
    
    public void encontradas(String letra){
        System.out.println("letras encontradas " + a.getLetrasEncontradas() + "/" + a.getPalabra().length);
    }
  /* if(cont>0){
            a.setLetrasEncontradas(a.getLetrasEncontradas()+cont);
            System.out.println("La letra se encuentra " + cont + " veces");
        }else{
            a.setCantJugadas(a.getCantJugadas()-1);
            System.out.println("La letra no se encontró");
        }
    */
    public void intentos(){
        System.out.println("Intentos restantes " + a.getCantJugadas());
    }

    public void juego(){
        System.out.println("=======================================");
        System.out.println("        JUGUEMOS AL AHORCADO           ");
        System.out.println("=======================================");
        crearJuego();
        longitud();
        do{
            System.out.println("Ingrese una letra a buscar");
            String letra = leer.next();
            if(buscar(letra)){
                System.out.println("Se encontró la letra");
                encontradas(letra);
            }else{
                System.out.println("La letra no se encontró");
                a.setCantJugadas(a.getCantJugadas()-1);
                intentos();
            }
            
            
        }while(a.getCantJugadas()>0 && a.getLetrasEncontradas()<a.getPalabra().length);
        if(a.getLetrasEncontradas()==a.getPalabra().length){
            System.out.println("Adivinaste");            
        }else{
            System.out.println("");
        }
        System.out.println("La palabra secreta es: "+Arrays.toString(a.getPalabra()));
        
    }

}
