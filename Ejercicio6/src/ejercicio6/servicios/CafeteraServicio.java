/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.servicios;

import ejercicio6.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    public Cafetera crearCafetera(){
        Cafetera N = new Cafetera();
        System.out.println("Ingrese la cantidad de café que contiene la cafetera en militros");
        N.setCantidadActual(leer.nextInt());
        return N;   
    }
    
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
   public void llenarCafetera(Cafetera N){
       N.setCantidadActual(N.getCapacidadMaxima());
       System.out.println("Genial! Ahora la cafetera se encuentra llena" +"\n"
       + "Tomamos un café?" + "\n"
       + ".....");
   }
   
   /* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.*/
   public int servirTaza(Cafetera N){
       System.out.println("Indique la capacidad de la taza en mililitros");
       int taza = leer.nextInt();
       if(N.getCantidadActual()< taza){
           System.out.println("Ups! es todo lo que queda, te faltan " + (taza - N.getCantidadActual()) + "ml para completar la taza");
           N.setCantidadActual(N.getCantidadActual()-N.getCantidadActual());
       }else{
          N.setCantidadActual(N.getCantidadActual()- taza); 
       }
       System.out.println("Que lo disfrutes!!!");
       return N.getCantidadActual();
   }
   
   //Método vaciarCafetera(): pone la cantidad de café actual en cero. 
   
   public void vaciarCafetera(Cafetera N){
       N.setCantidadActual(0);
       System.out.println("La cafetera está vacía");
   }
    
   /*Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada*/
   public int agregarCafe(Cafetera N){
       System.out.println("Cuanto café va a agregar? (en ml)");
       N.setCantidadActual(N.getCantidadActual()+ leer.nextInt());
       System.out.println("Cargaste mas café, ahora la cafetera tiene " + N.getCantidadActual() + "ml");
       return N.getCantidadActual();
   }
   
   
   
}
