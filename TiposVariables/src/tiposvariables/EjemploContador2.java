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
public class EjemploContador2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int contador = 0,total=0;
       
       while(contador<=10){
           total += contador ;
           contador++;
       }
        System.out.println("El total es: "+total);
    }
    
}
