/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejextra5.entidades;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Meses {


    private String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = meses[9];
    private Scanner leer = new Scanner(System.in);

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public boolean adivinarMes(){
        boolean acert = false;
        System.out.println("Ingrese un mes en minúscula");
        if(leer.next().equals(mesSecreto)){
            System.out.println("¡Ha acertado!");
            acert = true;
        }else{
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
        }
        return acert;
    }


}
