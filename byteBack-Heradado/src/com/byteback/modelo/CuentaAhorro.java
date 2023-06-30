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
public class CuentaAhorro extends Cuenta{

    public CuentaAhorro(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        this.saldo+=valor;
    }
    
    @Override
    public void retirar(double valor) throws SaldoInsuficienteException {
        //double comision = 0.2;
        super.retirar(valor ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Cuenta de ahorro: \n"+super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
