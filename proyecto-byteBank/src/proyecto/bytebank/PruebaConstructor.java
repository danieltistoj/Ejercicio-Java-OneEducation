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
public class PruebaConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
       Cuenta cuenta = new Cuenta(55);
       cuenta.setAgencia(-4);
        System.out.println(cuenta.getAgencia());
*/
        Cuenta cuenta1 = new Cuenta(1);
        Cuenta cuenta2 = new Cuenta(1);
        Cuenta cuenta3 = new Cuenta(1);
        System.out.println(Cuenta.getTotal());
    }
    
}
