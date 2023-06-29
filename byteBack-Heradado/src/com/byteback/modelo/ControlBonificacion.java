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
public class ControlBonificacion {
    private double suma;
    public double registrarSalario(Funcionario  funcionario){
        this.suma += funcionario.getBonificacion();
        return this.suma;
        
    }

    public double getSuma() {
        return suma;
    }
    
}
