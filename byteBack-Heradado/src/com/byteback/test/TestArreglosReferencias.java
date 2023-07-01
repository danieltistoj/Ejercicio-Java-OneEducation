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
public class TestArreglosReferencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cuenta  cc = new CuentaCorriente(23, 44);
      Cuenta[] cuentas = new CuentaCorriente[5];
      cuentas[0] = new CuentaCorriente(200, 33);
      System.out.println(cuentas[0]);
     
      cuentas[1]= cc;
      for(int i=0; i<cuentas.length;i++){
          System.out.println("Cuenta "+i+": \n"+cuentas[i]);
      }
    }
    
}
