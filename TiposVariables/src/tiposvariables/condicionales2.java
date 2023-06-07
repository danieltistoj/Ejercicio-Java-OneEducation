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
public class condicionales2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad = 17;
        int cantidadPersonas = 2;
        //boolean esPareja = cantidadPersonas>1;
        boolean puedeEntrar = edad>=18 && cantidadPersonas>1;
        if (puedeEntrar) {
            System.out.println("Usted puede entrar");
        } else {
            System.out.println("Usted no puede entrar");
        }
    }
    
}
