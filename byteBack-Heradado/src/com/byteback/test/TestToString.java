/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byteback.test;
import com.byteback.modelo.*;
/**
 *
 * @author Usuario
 */
public class TestToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object cc = new CuentaCorriente(22, 33);
        Object cp = new CuentaCorriente(33, 22);

        System.out.println(cc);
        System.out.println(cp);
    }
        @Override
    public String toString(){
        return super.toString();
        
    }
    
}
