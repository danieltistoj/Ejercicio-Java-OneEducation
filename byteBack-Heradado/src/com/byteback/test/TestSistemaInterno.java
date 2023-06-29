/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byteback.test;

import com.byteback.modelo.Gerente;
import com.byteback.modelo.SistemaInterno;
import com.byteback.modelo.Administrador;

/**
 *
 * @author Usuario
 */
public class TestSistemaInterno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SistemaInterno sistemaInterno = new SistemaInterno();
       Gerente gerente = new Gerente();
       Administrador administrador = new Administrador();
       
       sistemaInterno.autentica(gerente);
       sistemaInterno.autentica(administrador);
    }
    
}
