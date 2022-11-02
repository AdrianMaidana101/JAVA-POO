/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejextra3.Servicios;

import ejextra3.entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class RaicesServicio {
    private Scanner leer = new Scanner(System.in);
    public Raices creaRaiz(){
        Raices z = new Raices();
        System.out.println("Ingrese un valor para a");
        z.setA(leer.nextDouble());
        System.out.println("Ingrese un valor para b");
        z.setB(leer.nextDouble());
        System.out.println("Ingrese un valor para c");
        z.setC(leer.nextDouble());
        return z;
        
    }
    /**
     * 
     * @return devuelve el valor del discriminante (double). El 
    discriminante tiene la siguiente formula: (b^2)-4*a*c
     */    
    public double  getDiscriminante(Raices z){
        Double discriminante = (Math.pow( z.getB(),2))-4*z.getA()*z.getC();
        return discriminante;
    }
    
    /**
     * 
     * @param devuelve un booleano indicando si tiene una única solución, para 
      que esto ocurra, el discriminante debe ser igual que 0. 
     * @return 
     */
    public boolean tieneRaiz(Raices z){
        boolean r = false;
        if(getDiscriminante(z)==0){
            r = true;
        }
        System.out.println("tiene raiz");
        return r;
    }
    
    /**
     * 
     * @return devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices(Raices z){
        boolean r = false;
        if(getDiscriminante(z)>=0){
            r = true;
        }
        System.out.println("tiene raíces");
        return r;
    }
    
    
    /**
     *  llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles 
        soluciones.
     * @param z 
     */
    public void obtenerRaices(Raices z){
        if(tieneRaices(z) == true){
            crearRaices(z);            
        }
                   
    }
    /**
     * llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es 
en el caso en que se tenga una única solución posible.
     */
    public void obtenerRaiz(Raices z){
          if(tieneRaiz(z)==true){
              crearRaices(z);
          }  
    }
    
    
    /**
     * 
     * @param Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) 
     */
    public void crearRaices(Raices z){
        if(tieneRaiz(z)==true){
            double ecuacionpos = (-z.getB()+ Math.sqrt(Math.pow(z.getB(), 2))-(4*z.getA()*z.getC()))/(2*z.getA());
            System.out.println(ecuacionpos);
        }else if(tieneRaices(z)==true){
            double ecuacionpos = (-z.getB()+ Math.sqrt(Math.pow(z.getB(), 2))-(4*z.getA()*z.getC()))/(2*z.getA());
            System.out.println(ecuacionpos);
            double ecuacionneg = (-z.getB()- Math.sqrt(Math.pow(z.getB(), 2))-(4*z.getA()*z.getC()))/(2*z.getA());
            System.out.println(ecuacionneg);
        }else{
            System.out.println("No tiene solución");
        }
        
        
        
    }
 
    
    
    
    
    
    
}