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
public class EjercicioMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int fila=0;fila<=10;fila++){
            for(int columna=0;columna<fila;columna++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}
