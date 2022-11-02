/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejextra1.entidades;

/**
 *
 * @author adria
 */
public class Cancion {
  private String autor;
  private String titulo;

    public Cancion() {
        this.autor ="";
        this.titulo ="";
    }

    public Cancion(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Cancion{" + "autor=" + autor.substring(0,1).toUpperCase()+autor.substring(1).toLowerCase() + ", titulo=" + titulo.substring(0,1).toUpperCase()+titulo.substring(1).toLowerCase();
    }
    
    
  
  
  
}
