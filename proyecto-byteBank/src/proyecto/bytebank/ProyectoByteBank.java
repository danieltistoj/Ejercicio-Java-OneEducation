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
public class ProyectoByteBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Cuenta primeraCuenta = new Cuenta();
            primeraCuenta.saldo = 1000;
            System.out.println(primeraCuenta.saldo);
            
            Cuenta segundaCuenta = new Cuenta();
            segundaCuenta.saldo=500;
            System.out.println(segundaCuenta.saldo);
    }
    
}
