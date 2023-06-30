/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byteback.test;

import java.util.function.ObjDoubleConsumer;

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
        nombre = nombre.toUpperCase();
        System.out.println("Convertir a mayusculas: "+nombre);
        nombre = nombre.toLowerCase();
        System.out.println("Convertir todo a minusculas: "+nombre);
        char letra = nombre.charAt(3);
        System.out.println("Caracter: "+letra);
        int index = nombre.indexOf("e");
        System.out.println("Retorna una posicion: "+index);
        String sub = nombre.substring(1);
        System.out.println("Sub String: "+sub);
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }
        
    }
    /**
     * Sobre carga de metodo
     * @param valor 
     */
    /*
    public static void printLine(String valor){
        System.out.println(valor);
    }
    public static void printLine(int valor){
        System.out.println(valor);
    }
*/  
    /**
     *Object es la clase padre de todos los tipos de variables o clases, 
     * pude recibir tanto String, int, char, etc.
     * 
     * @param valor 
     */
    public static void printLine(Object valor){
        System.out.println(valor);
    }
    
}
