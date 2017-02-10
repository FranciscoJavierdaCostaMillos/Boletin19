/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

/**
 *
 * @author fjavierdacostamillos
 */
public class Libro {
    public String titulo;
    public String autor;
    public String ISBN;
    public double prezo;
    public int unidades;

    public Libro(String titulo, String autor, String ISBN, double prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro: " + "titulo=" + titulo + ", precio=" + prezo + ", autor=" + autor + ", unidades=" + unidades + " ISBN=" + ISBN;
    }
    



}


