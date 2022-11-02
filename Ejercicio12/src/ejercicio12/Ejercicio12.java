/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import ejercicio12.entidades.Persona;
import ejercicio12.servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio h1 = new PersonaServicio();
        Persona n = h1.crearPersona();
        
        System.out.println("tiene " + h1.calcularEdad(n));
        System.out.println("Ingrese una edad para comparar");
        int edadUsuario = leer.nextInt();
        boolean v = h1.menorQue(edadUsuario, n);
        if(v){
            System.out.println("Es menor que la edad que tiene el usuario");
        }else{
            System.out.println("Es mayor que la edad que tiene el usuario");
        }
        
        h1.mostrarPersona(n);
        
        
        
        
    }
    
    
    
}
