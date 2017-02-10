/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author fjavierdacostamillos
 */
public class Libreria {
    ArrayList<Libro> ListaLibros = new ArrayList();
    
    public void engadirLibro(Libro c) {
        ListaLibros.add(c);
    }
    public void venderLibro(String titulo) {
        for(Libro l: ListaLibros){
            if(l.titulo.equals(titulo)){
                System.out.println("Datos consultados:"+ l);
            }
        }    }
    
    public void ordenar(){
        Collections.sort(ListaLibros, new Comparator<Libro>() {
            @Override
            public int compare(Libro libro1, Libro libro2)
            {
                return  libro1.titulo.compareTo(libro2.titulo);
            }
        });
        for(Libro l: ListaLibros){
            System.out.println("Libro: "+ l);
        }
    }
    public void baixaLibros() {
        ArrayList<Libro> aux = new ArrayList();
        for(Libro l: ListaLibros){
            if(l.unidades == 0){
                aux.add(l);
            }
        }
        for(Libro l: aux){
            ListaLibros.remove(l);
        }
    }
    public void consultar(String cod){
        for(Libro l: ListaLibros){
            if(l.ISBN.equals(cod)){
                System.out.println("Datos consultados:"+ l);
            }
        }
    }
    
    
}
