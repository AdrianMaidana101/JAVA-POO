/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.Entidades.Operacion;
import ejercicio3.Servicios.OperacionServicio;

/**
 *
 * @author adria
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       OperacionServicio op = new OperacionServicio();
       Operacion a = op.crearOperacion();
        System.out.println("la suma es"+ op.sumar(a));
        System.out.println("la resta es" + op.restar(a));
        if(op.multiplicar(a) == 0){
            System.out.println("Error");
        }else{
            System.out.println("la multiplicacion es "+ op.multiplicar(a));
        }
        if(op.dividir(a) == 0){
            System.out.println("Error");
        }else{
            System.out.println("la division es "+ op.dividir(a));
        }
    }
    
}
