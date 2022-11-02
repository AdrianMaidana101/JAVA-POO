/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia7;

import ejerciciosguia7.Servicios.LibroServicio;
import ejerciciosguia7.clases.Libro;

/**
 *
 * @author adria
 */
public class Ejercicio1 {

    /**
     * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas
     */
    public static void main(String[] args) {
        
        LibroServicio sm = new LibroServicio();
        Libro nuevo = sm.crearLibro();
        System.out.println(nuevo.toString());   
    }
    
}
