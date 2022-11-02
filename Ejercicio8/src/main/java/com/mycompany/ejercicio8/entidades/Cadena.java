
package com.mycompany.ejercicio8.entidades;

/**
 *
 * @author adria
 */
public class Cadena {
    private String cadena;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String cadena, int longitud) {
        this.cadena = cadena;
        this.longitud = longitud;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void mostrarVocales() {

        int cantidadVocales = 0;

        String[] vector = new String[getLongitud()];

        for (int i = 0; i < getLongitud(); i++) {
            vector[i] = getCadena().substring(i, i + 1);

            switch (vector[i].toLowerCase()) {
                case "a":
                    cantidadVocales++;
                    break;
                case "e":
                    cantidadVocales++;
                    break;
                case "i":
                    cantidadVocales++;
                    break;
                case "o":
                    cantidadVocales++;
                    break;
                case "u":
                    cantidadVocales++;
                    break;
            }
        }
        System.out.println("La frase tiene " + cantidadVocales + " vocales.");
    }
    
    public void invertirFrase(){
        
        StringBuilder invertir = new StringBuilder(cadena);

        String cadenaInvertida = invertir.reverse().toString();

        System.out.println(cadenaInvertida);
     /*public void invertirFrace (){
         
        char []invertir=frase.toCharArray();
         for (int i = frase.length()-1; i >=0; i--){
           System.out.print(invertir[i]);
         
         } 
         System.out.println("");

       
        */   
    }
    
    public void vecesRepetido(String letra){
        
        String[] vector = new String[longitud];
        int repetidas = 0;
        for (int i = 0; i < longitud; i++) {
            vector[i] = cadena.substring(i, i + 1);
            
            if (vector[i].equalsIgnoreCase(letra)){
                repetidas++;
            }
        }
        
        System.out.println("La letra " + letra + " se repite: " + repetidas + " veces.");
        
    }
    
    public void compararLongitud(String frase){
        
        if (getLongitud() > frase.length()){
            System.out.println("La primera frase es mas larga.");
        } else if (getLongitud() < frase.length()){
            System.out.println("La segunda frase es más larga.");
        } else {
            System.out.println("Las frases tienen la misma longitud.");
        }
    }
    
    public void unirFrases(String frase){
        
        System.out.println(getCadena().concat(frase));
    }
    
    public void reemplazar(String letra){
        
        System.out.println(cadena.replace("a", letra));
    }
    
    public boolean contiene( String letra){
        
        boolean res = cadena.contains(letra);       
        
        return res;
    }
}
