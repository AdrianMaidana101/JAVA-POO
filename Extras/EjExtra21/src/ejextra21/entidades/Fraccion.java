/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejextra21.entidades;

/**
 *
 * @author adria
 */
public class Fraccion {
    private int numerador, denominador;

    // Constructores

    public Fraccion() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        // Llamar al setter para que se haga la validación del denominador
        this.setDenominador(denominador);
    }

    public Fraccion(Fraccion f) {
        this.numerador = f.getNumerador();
        this.denominador = f.getDenominador();
    }
    // Getters y setters

    public int getNumerador() {
        return this.numerador;
    }

    public int getDenominador() {
        return this.denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Denominador debe ser distinto de 0");
        }
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getNumerador()).concat("/").concat(String.valueOf(this.getDenominador()));
    }
    
    

    
    
}
