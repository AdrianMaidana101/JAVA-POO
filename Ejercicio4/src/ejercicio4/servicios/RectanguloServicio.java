/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.servicios;

import ejercicio4.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class RectanguloServicio {

    
    private final Scanner leer = new Scanner(System.in);
    public Rectangulo crearRectangulo(){
        Rectangulo a = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo");
        a.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectángulo");
        a.setAltura(leer.nextInt());
        
      return a;  
        
    }
    
    public int calcularSuperficie(Rectangulo a){
      return a.getBase() * a.getAltura();
    }
    
    public int calcularPerimetro(Rectangulo a){
      return (a.getBase() + a.getAltura())* 2;
    }
    
   
    public void rellenarRectangulo(Rectangulo a){
        for (int i = 0; i < a.getAltura(); i++) {
            for (int j = 0; j <a.getBase(); j++) {
                System.out.print("*");
                /*if ((i==0 || i==a.getAltura()-1) || (j==0 || j==a.getBase()-1)){
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }*/
            }
            System.out.println("");
     }      
        
    }
    
    
}
    

