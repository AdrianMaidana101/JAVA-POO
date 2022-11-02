/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejextra1;

import ejextra1.entidades.Cancion;
import java.util.Scanner;

/**
 Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir 
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y 
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además 
definir los métodos getters y setters correspondientes.
 */
public class EjExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cancion n = new Cancion();
        System.out.println("Ingrese el título de la canción");
        n.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        n.setAutor(leer.next());
        System.out.println(n.toString());
        
            
        
        
    }
    
}
