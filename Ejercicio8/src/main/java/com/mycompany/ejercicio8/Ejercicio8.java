/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio8;

import com.mycompany.ejercicio8.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio8 {

    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Cadena c1 = new Cadena();

        System.out.println("Ingrese una frase: ");
        c1.setCadena(leer.next());
        
        c1.setLongitud(c1.getCadena().length());

        c1.mostrarVocales();
        
        c1.invertirFrase();
        
        System.out.println("Ingrese una letra a buscar: ");
        c1.vecesRepetido(leer.next());
        
        System.out.println("Ingrese otra frase: ");
        String frase2 = leer.next();
        
        c1.compararLongitud(frase2);
        
        c1.unirFrases( frase2);
        
        System.out.println("Ingrese un caracter para reemplazar las letras a: ");
        c1.reemplazar(leer.next());
        
        
        System.out.println("Ingrese una letra a buscar: ");
        System.out.println(c1.contiene(leer.next()));
    }
    }


