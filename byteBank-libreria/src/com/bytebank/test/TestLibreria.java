/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytebank.test;

import com.byteback.modelo.Cuenta;
import com.byteback.modelo.CuentaAhorro;

/**
 *
 * @author Usuario
 */
public class TestLibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorro(1,1);
        cuenta.depositar(200);
    }
    
}
