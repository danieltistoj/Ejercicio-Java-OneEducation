/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byteback.modelo;

/**
 *
 * @author Usuario
 */
public class GuardaCuentas {
    private Object[] cuentas;
    private static int contador = 0;

    public GuardaCuentas() {
        this.cuentas = new Object[10];
    }

    public void add(Cuenta cuenta) {
        if (this.contador < 10) {
            this.cuentas[contador] = cuenta;
            this.contador++;
        } else {
            System.out.println("No hay espacio");
        }
    }

    public Object getAccount(int index) {
        return this.cuentas[index];
    }


    
}
