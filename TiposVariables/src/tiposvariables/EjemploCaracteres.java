/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposvariables;

/**
 *
 * @author Usuario
 */
public class EjemploCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char caracter = 'a';
        System.out.println(caracter);
        caracter = 65;
        caracter = 65 + 1;
        System.out.println(caracter);
        char segundoCaracter = (char) (caracter +1);
        System.out.println(segundoCaracter);
        
        String palabra = "Alura curso online";
        System.out.println(palabra);
        palabra = palabra + "2020";
        System.out.println(palabra);
    }
    
}
