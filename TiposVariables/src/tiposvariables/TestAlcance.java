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
public class TestAlcance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("pruebas condicionales");

        int edad = 20;
        int cantidadPersonas = 3;
        boolean acompañado;

        if (cantidadPersonas >= 2) {
            acompañado = true;
        } else {
            acompañado = false;
        }

        if (edad >= 18 || acompañado) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("desafortunadamente no puedes ingresar");
        }
    }
    
}
