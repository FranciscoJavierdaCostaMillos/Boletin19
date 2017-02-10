/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;


/**
 *
 * @author fjavierdacostamillos
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libreria libreria1 = new Libreria();
        
        libreria1.engadirLibro(new Libro("La casa","Irene","c20",10.70,3));
        libreria1.engadirLibro(new Libro("El sol","Paco","c21",18,1));
        libreria1.engadirLibro(new Libro("Datos","Antonio","c22",35,0));

        int seg = 0;
        while(seg == 0){
            System.out.println("Pulsa (A-F):");
            System.out.println("Engadir");
            System.out.println("Eliminar");
            System.out.println("Amosar ordenadamente");
            System.out.println("Eliminar");
            System.out.println("Consulta");
            System.out.println("Salir");
            String res = JOptionPane.showInputDialog("Opcion Pulsando");
            switch(res){
                case "A":
                case "a":    
                    String titulo = JOptionPane.showInputDialog("Titulo: ");
                    String autor = JOptionPane.showInputDialog("Autor: ");
                    String ISBM = JOptionPane.showInputDialog("Isbn: ");
                    double prezo = Double.parseDouble(JOptionPane.showInputDialog("Precio: "));
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog("Unidades: "));
                    libreria1.engadirLibro(new Libro(titulo,autor,ISBM,prezo,unidades));
                    break;
                case "B":
                case "b":    
                    String t = JOptionPane.showInputDialog("Titulo: ");
                    libreria1.venderLibro(t);
                    break;
                case "C":
                case "c":
                    libreria1.ordenar();
                    break;
                case "D":
                case "d":    
                    libreria1.baixaLibros();
                    break;
                case "E":
                case "e":    
                    String cod = JOptionPane.showInputDialog("Isbm: ");
                    libreria1.consultar(cod);
                    break;
                case "F":
                case "f":    
                    seg = 1;
                    break;
            }
        }

    }
    
}
