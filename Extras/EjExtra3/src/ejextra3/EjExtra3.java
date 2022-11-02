/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejextra3;

import ejextra3.Servicios.RaicesServicio;
import ejextra3.entidades.Raices;

/**
 *
 * @author adria
 */
public class EjExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     RaicesServicio R = new RaicesServicio();
     Raices z = R.creaRaiz();
     
     R.getDiscriminante(z);
     R.tieneRaices(z);
     R.tieneRaiz(z);
     R.obtenerRaices(z);
     R.obtenerRaiz(z);
    
}
}
