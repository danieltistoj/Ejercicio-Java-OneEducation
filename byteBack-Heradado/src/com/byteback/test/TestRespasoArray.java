/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byteback.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class TestRespasoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int numero = 40;
        //WRAPPER
        //Integer numeroObjeto = new Integer(40); deprecado
        Integer numeroObjeto = Integer.valueOf(40);
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(numero);//autoboxing -> lsta.add(new Integer(40))
        lista.add(numeroObjeto);
        lista.add(Integer.valueOf(50));
        //unboxing
        int valorPrimitivo = numeroObjeto;
        //int valorPrimitivo = numeroObjeto.intValue(); //reporta el primitivo int
        //Metodos de Integer
        numeroObjeto.byteValue();//retorna el valor en bytes
        numeroObjeto.doubleValue(); //retorna el valor en double
        numeroObjeto.floatValue();//retorna el valor en decimal float
        System.out.println("Integer");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("Short");
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println("Byte");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println("Long");
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        int ref = Integer.valueOf("3");
        System.out.println(ref+1);
    }
    
}
