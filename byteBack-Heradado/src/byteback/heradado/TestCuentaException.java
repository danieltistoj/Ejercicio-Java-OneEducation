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
public class TestCuentaException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorro(123, 456);
        cuenta.depositar(200);
        cuenta.retirar(200);
        cuenta.retirar(210);
    }
    
}
