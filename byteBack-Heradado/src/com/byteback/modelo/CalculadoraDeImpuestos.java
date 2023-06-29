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
public class CalculadoraDeImpuestos {
       private double totalImpuesto;

    public void registra(Tributacion t) {
        double valor = t.getValorImpuesto();
        this.totalImpuesto += valor;
    }

    public double getTotalImpuesto() {
        return totalImpuesto;
    }
}
