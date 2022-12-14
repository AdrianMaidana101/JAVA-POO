
package ejercicio9.entidades;

/**
 *
 * @author adria
 */
public class Matematica {
    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Matematica{" + "Primer número" + num1 + ", Segundo número" + num2 + '}';
    }
    
    
    
    
    
    public double  devolverMayor(){
       return Math.max(num1, num2);
    }
    
    public void devolverPotencia(){
        int minimo = (int)Math.round(Math.min(num1,num2));
        System.out.println("La potencia del mayor por el menor es " + Math.pow((int)Math.round(devolverMayor()), minimo));
    }
    
    public void CalcularRaiz(){
        System.out.println("La raiz cuadrada es " + Math.abs(Math.min(num1, num1)));
        
    }
    
    
}
