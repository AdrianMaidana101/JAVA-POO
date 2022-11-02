/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio11 {

    /**
     Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
     */
    public static void main(String[] args) {
        Date fechaActual = new Date();
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Día "); int dia = leer.nextInt();
        System.out.print("Mes "); int mes = leer.nextInt(); mes=mes-1;
        System.out.print("Año "); int anio = leer.nextInt(); anio=anio-1900;
        Date fechaIngresada = new Date(anio,mes,dia);
        
        System.out.println("Fecha actual " + fechaActual.toString());
        System.out.println("Fecha Ingresada " + fechaIngresada.toString());
        
        
            Date dif = new Date();            
            dif.setTime(fechaActual.getTime() - fechaIngresada.getTime());
            System.out.println("Hay " + dif.getYear()+" Años, "+ dif.getMonth()+" meses, "+ dif.getDate()+" días de diferencia");



//System.out.println("La diferencia es de "+ fechaActual.compareTo(fechaIngresada));
        
        //Date dif = dif.setTime(fechaActual.getTime() - fechaIngresada.getTime());
        //dif.setTime()
       
        /*
        if(dif.getYear() == 0){
            System.out.println("Son el mismo año");
        }else{
            System.out.println("Hay " + dif.toString() + " de diferencia");
        }
        */
        
    }
    
}
