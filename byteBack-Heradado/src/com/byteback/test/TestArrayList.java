/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byteback.test;

import com.byteback.modelo.CuentaCorriente;
import java.util.ArrayList;
import com.byteback.modelo.*;
/**
 *
 * @author Usuario
 */
public class TestArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Cuenta> array = new ArrayList<>();
        Cuenta cc1 = new CuentaCorriente(11, 22);
        Cuenta cc2 = new CuentaCorriente(12,42);
        array.add(cc1);
        array.add(cc2);
        
        //System.out.println((CuentaCorriente) array.get(0));
        for(Cuenta cuenta:array){
            System.out.println(cuenta);
        }
        
        
    }
    
}
