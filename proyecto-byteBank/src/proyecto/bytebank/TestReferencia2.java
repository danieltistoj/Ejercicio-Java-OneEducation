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
public class TestReferencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente diego = new Cliente();
       diego.nombre = "diego";
       diego.documento = "455667";
       diego.telefono = "234324243";
       
       Cuenta cuentaDiego = new Cuenta();
       cuentaDiego.agencia = 1;
       cuentaDiego.titular = diego;
        System.out.println(cuentaDiego.titular.documento);
        System.out.println(cuentaDiego.titular);
        System.out.println(diego);
    }
    
}
