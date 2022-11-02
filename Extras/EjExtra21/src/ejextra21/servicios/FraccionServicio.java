/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejextra21.servicios;

import ejextra21.entidades.Fraccion;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class FraccionServicio {
   private final Scanner leer = new Scanner(System.in);
   public Fraccion crearFraccion(){
       Fraccion a = new Fraccion();
       Fraccion b = new Fraccion();
       System.out.println("Ingrese un valor para el numerador 1");
       a.setNumerador(leer.nextInt());
       System.out.println("Ingrese un valor para el denominador 1");
       a.setDenominador(leer.nextInt());
       return a;   
   }
   
   public Fraccion crearFraccion2(){
       Fraccion b = new Fraccion();
       System.out.println("Ingrese un valor para el numerador 2");
       b.setNumerador(leer.nextInt());
       System.out.println("Ingrese un valor para el denominador 2");
       b.setDenominador(leer.nextInt());
       return b;
   }
   
   private int mcm(int a, int b) {
        return (a * b) / this.maximoComunDivisor(a, b);
    }

    public int maximoComunDivisor(int a, int b) {
        int temporal;//Para no perder b
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    // Métodos principales
    public Fraccion suma(Fraccion a, Fraccion b) {
        int mcm = this.mcm(a.getDenominador(), b.getDenominador());
        int diferenciaFraccionActual = mcm / a.getDenominador();
        int diferenciaOtraFraccion = mcm / b.getDenominador();
        Fraccion resultado = new Fraccion();
        resultado.setNumerador(
                (diferenciaFraccionActual * a.getNumerador()) + (diferenciaOtraFraccion * b.getNumerador()));
        resultado.setDenominador(mcm);
        return resultado;
    }

    public Fraccion resta(Fraccion a, Fraccion b) {
        int mcm = this.mcm(a.getDenominador(), b.getDenominador());
        int diferenciaFraccionActual = mcm / a.getDenominador();
        int diferenciaOtraFraccion = mcm / b.getDenominador();
        Fraccion resultado = new Fraccion();
        resultado.setNumerador((diferenciaFraccionActual * a.getNumerador()) - (diferenciaOtraFraccion * b.getNumerador()));
        resultado.setDenominador(mcm);
        return resultado;
    }

    public Fraccion producto(Fraccion a, Fraccion b) {
        return new Fraccion(a.getNumerador() * b.getNumerador(), a.getDenominador() * b.getDenominador());
    }

    public Fraccion cociente(Fraccion a, Fraccion b) {
        return new Fraccion(a.getNumerador() * b.getDenominador(), a.getDenominador() * b.getNumerador());
    }
    
    public Fraccion simplifica(Fraccion resultado) {
        int mcd = maximoComunDivisor(resultado.getNumerador(), resultado.getDenominador());
        return new Fraccion(resultado.getNumerador() / mcd, resultado.getDenominador() / mcd);
    }
}
