/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byteback.test;

import com.byteback.modelo.CuentaAhorro;
import com.byteback.modelo.CuentaCorriente;


/**
 *
 * @author Usuario
 */
public class TestCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1, 1);
        CuentaAhorro ca  = new CuentaAhorro(2, 3);
        cc.depositar(2000);
        cc.transfereir(1000, ca);
        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
        
    }
    
}
