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
public class EjercicioTablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int contador=1;contador<=10;contador++){
            for(int multiplicacion=0;multiplicacion<=10;multiplicacion++){
                System.out.print(contador*multiplicacion);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}
