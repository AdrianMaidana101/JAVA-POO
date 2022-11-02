/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.servicios;

import ejercicio5.entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class ServicioCuenta {
    private final Scanner leer = new Scanner(System.in);
    public CuentaBancaria crearCuenta(){
        CuentaBancaria a = new CuentaBancaria();
        a.setNumeroCuenta((int) (Math.random()*10000));
        System.out.println("Ingrese el DNI del cliente");
        a.setDNICliente(leer.nextLong());
        System.out.println("Ingrese el saldo inicial");
        a.setSaldo(leer.nextInt());
        return a;
    }
    /*Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual.*/
    
    public void ingresarDinero(CuentaBancaria a){
        System.out.println("Ingrese la cantidad de dinero a depositar");
        int ingreso = leer.nextInt();
        a.setSaldo(a.getSaldo() + ingreso);
    }
    
    /*Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0. */
    
    public void retirarDinero(CuentaBancaria a){
        System.out.println("Ingrese la cantidad de dinero a retirar");
        int retiro = leer.nextInt();
        a.setSaldo(a.getSaldo() - retiro);
    }
    
    /*Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.*/
    
    public void extraccionRapida(CuentaBancaria a){
        int extr = (a.getSaldo()*20)/100;
        System.out.println("Desea extraer $" + extr + " S/N?");
        String e;
        do{
            e = leer.next();
        if(e.equalsIgnoreCase("S")){
            a.setSaldo(a.getSaldo()- extr);
        }else if(e.equalsIgnoreCase("N")){
            a.getSaldo();
        }else{
            System.out.println("Opción incorrecta presione S/N");
        }
        }while(!e.equalsIgnoreCase("S") && !e.equalsIgnoreCase("N"));
        
    }
    
    /*Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.*/
    
    public int consultarSaldo(CuentaBancaria a){
        return a.getSaldo();
    }
    
    /*Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
    
    public void consultarDatos(CuentaBancaria a){
        System.out.println("DATOS DE LA CUENTA"+"\n"
                + "CBU " + a.getNumeroCuenta()+"\n"
                        + "DNI " + a.getDNICliente()+"\n"
                        + "SALDO "+ a.getSaldo());
    }
    
    
    
    
}
