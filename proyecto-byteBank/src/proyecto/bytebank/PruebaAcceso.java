/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.bytebank;

/**
 *
 * @author Usuario
 */
public class PruebaAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cuenta cuenta = new Cuenta();
       cuenta.depositar(400);
       cuenta.retirar(300);
        System.out.println(cuenta.getSaldo());
    }
    
}
