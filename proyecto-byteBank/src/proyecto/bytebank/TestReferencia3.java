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
public class TestReferencia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cuenta cuentaDiego = new Cuenta();
       cuentaDiego.titular = new Cliente();
       cuentaDiego.titular.nombre = "diego";
        System.out.println(cuentaDiego.titular.nombre);
    }
    
}
