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
public class Factorial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int factorial = 1;
        for(int i =1;i<11;i++){
            factorial*=i;
            System.out.println("factorial de "+i+" = "+factorial);
        }
    }
    
}
