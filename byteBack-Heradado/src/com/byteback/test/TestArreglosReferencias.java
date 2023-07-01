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
      Object[] referencias = new Object[5];
      referencias[0] = new CuentaCorriente(200, 33);
      System.out.println(referencias[0]);
      
      Cuenta ca = new CuentaAhorro(2, 0);
      
      referencias[3] = ca;
      referencias[1]= cc;
      //Cast 
      CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
      System.out.println("Cast");
      System.out.println(cuenta);
      
      Cliente cliente = new Cliente();
      referencias[4] = cliente;
      cliente.setNombre("Juan");
      cliente.setDocumento("1231232");
      cliente.setTelefono("343424"); 
      System.out.println(cliente);
       
      //Cast cliente
      Cliente cliente2 = (Cliente) referencias[4];
      
      for(int i=0; i<referencias.length;i++){
          System.out.println("referencia "+i+": \n"+referencias[i]);
      }
 
    }
    
}
