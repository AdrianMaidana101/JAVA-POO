/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejextra21;

import ejextra21.entidades.Fraccion;
import ejextra21.servicios.FraccionServicio;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class EjExtra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a la CALCULADORA de FRACCIONES");
        System.out.println("=========================================");
        FraccionServicio f1 = new FraccionServicio();
        Fraccion a = f1.crearFraccion();
        Fraccion b = f1.crearFraccion2();
        int opc;
        do{
            System.out.println("=====================================\n"
                    + "MENÚ\n"
                    + "==============================================\n"
                    + "Ingrese la operacion que desea realizar\n"
                    + "Ingrese 0 para salir\n"
                    + " 1 - SUMA\n"
                    + " 2 - RESTA\n"
                    + " 3 - PRODUCTO\n"
                    + " 4 - COCIENTE\n");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    System.out.println("La suma es: " + f1.simplifica(f1.suma(a, b)));
                    break;
                case 2:
                    System.out.println("La resta es: " + f1.simplifica(f1.resta(a, b)));
                    break;
                case 3:
                    System.out.println("El producto es: " + f1.simplifica(f1.producto(a, b)));
                    break;
                case 4:
                    System.out.println("El cociente es: "+ f1.simplifica(f1.cociente(a, b)));
                    break;
            }
            
        }while(opc!=0);
        
    }
    
}
