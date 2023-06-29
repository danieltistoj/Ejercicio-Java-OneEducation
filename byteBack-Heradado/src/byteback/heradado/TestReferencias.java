/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteback.heradado;

import byteback.heradado.Modelo.Gerente;
import byteback.heradado.Modelo.Contador;
import byteback.heradado.Modelo.Funcionario;

/**
 *
 * @author Usuario
 */
public class TestReferencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Funcionario funcionario = new Contador();
       funcionario.setNombre("Diego");
       Gerente gerente = new Gerente();
       gerente.setNombre("Jimena");
       funcionario.setSalario(2000);
       gerente.setSalario(10000);
    }
    
}
