/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;


/**
 *
 * @author klemavilanova
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libreria libreria1 = new Libreria();
        
        libreria1.engadirLibro(new Libro("dfkjlf","pedro","c20",8.20,3));
        libreria1.engadirLibro(new Libro("asjdjh","juan","c21",9,1));
        libreria1.engadirLibro(new Libro("absjdhldkjh","ana","c22",10,0));

        int seg = 0;
        while(seg == 0){
            System.out.println("Pulsa:");
            System.out.println("A (Añadir Libro)");
            System.out.println("B (Eliminar Libro)");
            System.out.println("C (Amosar libros ordenados)");
            System.out.println("D (Eliminar libros con 0 unidades)");
            System.out.println("E (Condultar libro)");
            System.out.println("F (Salir)");
            String res = JOptionPane.showInputDialog("Pulse la opcion");
            switch(res){
                case "A":
                    String titulo = JOptionPane.showInputDialog("Titulo: ");
                    String autor = JOptionPane.showInputDialog("Autor: ");
                    String ISBM = JOptionPane.showInputDialog("Isbm: ");
                    double prezo = Double.parseDouble(JOptionPane.showInputDialog("Prezo: "));
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog("Unidades: "));
                    libreria1.engadirLibro(new Libro(titulo,autor,ISBM,prezo,unidades));
                    break;
                case "B":
                    String t = JOptionPane.showInputDialog("Titulo: ");
                    libreria1.venderLibro(t);
                    break;
                case "C":
                    libreria1.ordenar();
                    break;
                case "D":
                    libreria1.baixaLibros();
                    break;
                case "E":
                    String cod = JOptionPane.showInputDialog("Isbm: ");
                    libreria1.consultar(cod);
                    break;
                case "F":
                    seg = 1;
                    break;
            }
        }

    }
    
}
