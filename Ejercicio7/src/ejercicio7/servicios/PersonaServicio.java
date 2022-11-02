
package ejercicio7.servicios;

import ejercicio7.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class PersonaServicio {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        Persona n = new Persona();
        System.out.println("Ingrese el nombre");
        n.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        n.setEdad(leer.nextInt());
        
        boolean s = true;
        while( s ){
            System.out.println("Ingrese el sexo "
                + "M - Masculino"
                + "F - Femenino"
                + "O - Otro");
            n.setSexo(leer.next());
        
            if(n.getSexo().equalsIgnoreCase("m") || n.getSexo().equalsIgnoreCase("f") || n.getSexo().equalsIgnoreCase("O") ){
            s = false;
            
            }else{
                System.out.println("Error");
            }             
        }
        
        
        
        System.out.println("Ingrese el peso");
        n.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura");
        n.setAltura(leer.nextDouble());
        return n;
    }
    
    public int  calcularIMC(Persona n){
        int resultado;
       double imc = n.getPeso() / (Math.pow(n.getAltura(), 2));
       if(imc<20){
           resultado = -1;
       }else if(imc>=20 && imc<=25){
           resultado = 0;
       }else{
           resultado = 1;
       }
      return resultado;  
    }
    
    public boolean esMayorDeEdad(Persona n){
        boolean mayor = false;
        if(n.getEdad()>=18){
            mayor = true;
        }
        return mayor;       
    }   
}
