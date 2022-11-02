/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import ejercicio7.entidades.Persona;
import ejercicio7.servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       PersonaServicio p1 = new PersonaServicio();
       Persona [] pers = new Persona[4];
       int mayor = 0;
       int menor = 0;
       int flaco = 0;
       int joya = 0;
       int gordo = 0;
        for (int i = 0; i < 4; i++) {
            pers[i] =  p1.crearPersona();
            if(p1.calcularIMC(pers[i]) == -1){
                System.out.println("Estas flaquito");
                flaco ++;
            }else if(p1.calcularIMC(pers[i]) == 0){
                System.out.println("Joya!");
                joya ++;
            }else {
                System.out.println("Tenés que hacer dieta.");
                gordo ++;
            }
            
            if(p1.esMayorDeEdad(pers[i]) == true){
                mayor ++;
            }else{
                menor ++;
            }
            
        }
        
        System.out.println("El " + flaco*100/4 + "% estan con bajo peso" );
        System.out.println("El " + joya*100/4 + "% estan en su peso ideal");
        System.out.println("El " + gordo*100/4 + "% tienen sobrepeso");
        System.out.println("El " + mayor*100/4 + "% son mayores de edad y" +"\n"
                + " el " + menor*100/4 + "% son menores");
        
        
        
        

    }
    
}
