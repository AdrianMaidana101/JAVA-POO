/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import ejercicio5.entidades.CuentaBancaria;
import ejercicio5.servicios.ServicioCuenta;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCuenta c = new ServicioCuenta();
        CuentaBancaria CB = c.crearCuenta();
        int opc;
        do{
        System.out.println("INGRESE LA OPERACIÓN QUE DESEA REALIZAR"+"\n"
                + "================================================="+"\n"
                + "     1 - INGRESAR DINERO EN CUENTA"+"\n"
                + "     2 - RETIRAR DINERO"+"\n"
                + "     3 - EXTRACCION RÁPIDA"+"\n"
                + "     4 - CONSULTAR SALDO"+"\n"
                + "     5 - DATOS DE LA CUENTA"+"\n"
                + "     6 - SALIR");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    c.ingresarDinero(CB);
                    break;
                case 2:
                    c.retirarDinero(CB);
                    break;
                case 3:
                    c.extraccionRapida(CB);
                    break;
                case 4:
                    System.out.println("Su saldo es $ " + c.consultarSaldo(CB));
                    break;
                case 5:
                    c.consultarDatos(CB);
                    break;

            }
            if (opc == 6) {
                System.out.println("¿Está seguro que desea salir del programa S/N?");
                String salida;
                do {
                    salida = leer.next();
                    if (salida.equalsIgnoreCase("S")) {
                        System.out.println("saliste");
                    } else if (salida.equalsIgnoreCase("N")) {
                        opc = 7;
                    } else {
                        System.out.println("Opción incorrecta, presione S/N");
                    }
                } while (!salida.equalsIgnoreCase("S") && !salida.equalsIgnoreCase("N"));
            }
        
        }while(opc !=6);
    }
    
}
