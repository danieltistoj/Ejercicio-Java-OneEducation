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
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 4;
        int factorial = numero;
        if (numero == 0) {
            factorial = 1;
        } else if (numero == 1) {
            factorial = 1;
        } else {
            for (int i = numero; i > 1; i--) {
                factorial = factorial * (i - 1);
                
            }

        }
        System.out.println(factorial);
    }
    
}
