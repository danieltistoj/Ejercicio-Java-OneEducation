/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPilaEjecucion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class TestCuentaExceptionCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cuenta cuenta = new Cuenta();
        try {
            cuenta.deposita();
        } catch (MeException ex) {
           ex.printStackTrace();
        }
    }
    
}
