
package ejextra4.entidades;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class NIF {
    private final Scanner leer = new Scanner(System.in);
    private int DNI;
    private char letra;

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

  

    
    
    public void crearNif(){
        System.out.print("Ingrese el DNI ");
        DNI = leer.nextInt();
        char nif[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};        
        letra = nif[DNI % 23];        
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, DNI, "-", letra);
        //System.out.println(DNI + "-"+ letra);
    }
    
}
