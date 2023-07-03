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
public class TestWrappers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double numeroDouble = 33.0; //aoutoboxing
        Boolean verdadero = true; //autoboxing
        
        Double numeroDouble2 = Double.valueOf(33);
        System.out.println(numeroDouble2);
        
        String numeroString = "43";
        
        Double stringToDouble = Double.valueOf(numeroString);
        Integer stringToInteger = Integer.valueOf(numeroString);
        
        System.out.println(stringToDouble);
        System.out.println(stringToInteger);
        
        Number  numero = Integer.valueOf(5);
        double numeroDoublePrim = numero.doubleValue();
        
        Boolean falso  = Boolean.FALSE;
        
    }
    
}
