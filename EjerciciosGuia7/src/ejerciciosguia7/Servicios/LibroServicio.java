/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia7.Servicios;

import ejerciciosguia7.clases.Libro;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class LibroServicio {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Libro crearLibro(){
        System.out.println("Ingrese el ISBN");
        int ISBN = leer.nextInt();
        System.out.println("Ingrese nombre del título del libro");
        String titulo = leer.next();
        System.out.println("Ingrese el autor del libro");
        String autor = leer.next();
        System.out.println("Ingrese el numero de paginas");
        int paginas = leer.nextInt();
        
        return new Libro (ISBN, titulo, autor, paginas);
       
    }
    
}
