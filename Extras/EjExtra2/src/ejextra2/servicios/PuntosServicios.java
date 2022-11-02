/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejextra2.servicios;

import ejextra2.entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class PuntosServicios {
    Scanner leer = new Scanner(System.in);
    public Puntos crearPuntos(){
       Puntos xy = new Puntos();
        System.out.println("Ingrese un valor para x1");
        xy.setX1(leer.nextInt());
        System.out.println("Ingrese un valor para y1");
        xy.setY1(leer.nextInt());
        System.out.println("Ingrese un valor para x2");
        xy.setX2(leer.nextInt());
        System.out.println("Ingrese un valor para y2");
        xy.setY2(leer.nextInt());
       
       
       return xy;
    }
   
    public void calcularDistancia(Puntos xy){
        int cat1 = xy.getX2()-xy.getX1();
        int cat2 = xy.getY2()-xy.getY1();
        double distancia = Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
        System.out.println(distancia);
    }
    
    
}
