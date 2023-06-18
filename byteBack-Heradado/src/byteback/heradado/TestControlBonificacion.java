/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteback.heradado;

/**
 *
 * @author Usuario
 */
public class TestControlBonificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setSalario(2000);
        Gerente jimena = new Gerente();
        jimena.setSalario(10000);
        Contador alexis = new Contador();
        alexis.setSalario(2000);
        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(jimena);
        controlBonificacion.registrarSalario(alexis);
        
    }
    
}
