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
public class PruebaMetodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        miCuenta.saldo = 300;
        miCuenta.depositar(200);
        System.out.println(miCuenta.saldo);
        miCuenta.retirar(100);
        System.out.println(miCuenta.saldo);
        
        Cuenta cuentaJimena = new Cuenta();
        cuentaJimena.depositar(1000);
    
        if(cuentaJimena.transfereir(400, miCuenta)){
            System.out.println("Transferencia exitosa");
        }
        System.out.println(miCuenta.saldo);
        System.out.println(cuentaJimena.saldo);
    }
    
}
