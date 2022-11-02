/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.entidades.Rectangulo;
import ejercicio4.servicios.RectanguloServicio;

/**
 *
 * @author adria
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo a = rs.crearRectangulo();
        System.out.println("su el perimetro es "+ rs.calcularPerimetro(a));
        System.out.println("su superficie es " + rs.calcularSuperficie(a));
        System.out.println("---------------------");
        rs.rellenarRectangulo(a);
    }
 
}
