/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteback.heradado;

import byteback.heradado.Modelo.Gerente;
import byteback.heradado.Modelo.SistemaInterno;
import byteback.heradado.Modelo.Administrador;

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
