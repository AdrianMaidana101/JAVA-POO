/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.Servicios;

import ejercicio3.Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class OperacionServicio {
    private final Scanner leer = new Scanner(System.in);
    public Operacion crearOperacion(){
        Operacion op = new Operacion();
        System.out.println("Ingrese el primer número para crear una operación");
        op.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo número");
        op.setNum2(leer.nextInt());
        return op;  
    
    }
    public int sumar(Operacion op){        
        return op.getNum1()+op.getNum2();
    }
    public int restar(Operacion op){
        return op.getNum1()-op.getNum2();
    }
    public int multiplicar(Operacion op){
        if(op.getNum1()== 0 || op.getNum2() == 0){
        return 0;
        }
        return op.getNum1()*op.getNum2();
    }
    public double dividir(Operacion op){
        if(op.getNum1()== 0 || op.getNum2() == 0){
        return 0;
        }
        return (double) op.getNum1()/op.getNum2();
    }

    
}
