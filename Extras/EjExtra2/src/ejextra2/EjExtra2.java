/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejextra2;

import ejextra2.entidades.Puntos;
import ejextra2.servicios.PuntosServicios;

/**
 *
 * @author adria
 */
public class EjExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntosServicios a = new PuntosServicios();
        Puntos xy = a.crearPuntos();
        a.calcularDistancia(xy);
    }
    
}
