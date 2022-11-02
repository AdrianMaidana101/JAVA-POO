/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia7.Servicios;

import ejerciciosguia7.clases.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class CircunferenciaServicio {
    private final Scanner leer = new Scanner(System.in);
    //System.out.println("Escriba el díametro de la circunferencia");
    public Circunferencia crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia");
        double radio = leer.nextDouble();
        return new Circunferencia(radio);
    }
}
