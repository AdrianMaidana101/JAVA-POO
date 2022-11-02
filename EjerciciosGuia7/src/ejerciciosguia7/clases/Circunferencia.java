/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia7.clases;

/**
 *
 * @author adria
 */
public class Circunferencia {
    private double radio;
    private double area;
    private double perimetro;
    
    

    public Circunferencia() {
        
    }
    
    public Circunferencia(double radio) {
        this.area = calcualrArea(radio, area);
        this.radio = radio;
        this.perimetro = calcularPerimetro(radio, perimetro);
    }
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

    
    private double calcularPerimetro(double radio, double perimetro){
        perimetro = 2*(3.14 * radio);
        return perimetro;
    }

    private double calcualrArea(double radio, double area) {
        area = 3.14*(radio*radio);
        return area;
    }

    

   
    
    
    

    
    
    
    
}
