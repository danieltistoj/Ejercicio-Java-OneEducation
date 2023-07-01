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
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] edades = new int[5];
      edades[2] = 30;
        System.out.println(edades[2]);
        System.out.println(edades[0]);
        
        int size = edades.length;
        System.out.println(size);
        for(int i = 0; i<size; i++){
            System.out.println("posicion "+i+": "+edades[i]);
        }
    }
    
}
