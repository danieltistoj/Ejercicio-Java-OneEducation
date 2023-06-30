/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byteback.test;

/**
 *
 * @author Usuario
 */
public class TestString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Alura";
        String nombre2 = new String("Alura");
        System.out.println("Antes de replace: " + nombre);
        nombre = nombre.replace("A", "a");
        System.out.println("Despues de replace: " + nombre);
        nombre = nombre.concat(" cursos online");
        System.out.println("Despues de concat: "+nombre);      
      
               
    }
    
}
