
package ejercicio9;

import ejercicio9.entidades.Matematica;

/**
 *
 * @author adria
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           Matematica z = new Matematica();
           z.setNum1(Math.random()*10);
           z.setNum2(Math.random()*10);
           
           System.out.println(z.toString());

           System.out.println("El mayor es: " + z.devolverMayor());

           z.devolverPotencia();
           z.CalcularRaiz();
    }
    
    
    
    
    
}
    

