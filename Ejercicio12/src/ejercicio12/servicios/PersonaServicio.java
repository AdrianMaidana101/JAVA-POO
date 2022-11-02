/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12.servicios;

import ejercicio12.entidades.Persona;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author adria
 */
public class PersonaServicio {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona n = new Persona();
        System.out.println("Ingrese el nombre");
        n.setNombre(leer.next());
        System.out.println("ingrese fecha de nacimiento con el formato año/mes/dia");
        String fechaNacimiento = leer.next();
        Date fecha = new Date(fechaNacimiento);
        n.setFechaNacimiento(fecha);
        return n;
    }   
    
    public int calcularEdad(Persona n){
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - n.getFechaNacimiento().getYear();
        return edad;
    }
    
    public boolean menorQue(int edad, Persona n){
        boolean menor;
        int miEdad = calcularEdad(n);
        menor = edad <= miEdad;
        return menor;
    }
    
    public void mostrarPersona(Persona n){
        System.out.println(n.toString());
    }
    
    
}
