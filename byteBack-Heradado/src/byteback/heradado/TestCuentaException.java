/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteback.heradado;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class TestCuentaException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Cuenta cuenta = new CuentaAhorro(123, 456);
            cuenta.depositar(200);
            cuenta.retirar(200);
            cuenta.retirar(210);
        } catch (SaldoInsuficienteException ex) {
            Logger.getLogger(TestCuentaException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
