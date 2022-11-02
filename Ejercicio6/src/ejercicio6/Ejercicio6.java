/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio6.entidades.Cafetera;
import ejercicio6.servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("BIENVENIDO AL PROGRAMA DE LA CAFETERA NESSPRESSO");
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera nes = cs.crearCafetera();
        int opc;
        do{
            System.out.println("Ingrese la operación que desea realizar"+ "\n"
                            + "============================================" + "\n"
            + " 1 - LLENAR LA CAFETERA" + "\n"
            + " 2 - SERVIRSE UNA TAZA" + "\n"
            + " 3 - VACIAR LA CAFETERA" + "\n"
            + " 4 - AGREGAR CAFÉ" + "\n"
            + " 5 - SALIR");
            opc = leer.nextInt();
            switch (opc){
                case 1:
                    cs.llenarCafetera(nes);
                    break;
                case 2:
                    cs.servirTaza(nes);
                    break;
                case 3:
                    cs.vaciarCafetera(nes);
                    break;
                case 4:
                    cs.agregarCafe(nes);
                    
                    break;
            }
            if(opc == 5){
                System.out.println("De veras no quieres más café? Preciona S para salir o N para seguir usando la cafetera");
            String salida;
            do {
                    salida = leer.next();
                    if (salida.equalsIgnoreCase("S")) {
                        System.out.println("saliste");
                    } else if (salida.equalsIgnoreCase("N")) {
                        opc = 6;
                    } else {
                        System.out.println("Opción incorrecta, presione S/N");
                    }
                } while (!salida.equalsIgnoreCase("S") && !salida.equalsIgnoreCase("N"));
            }   
            
            
        }while(opc !=5);
        
        
        
        
        
        
    }
    
}
