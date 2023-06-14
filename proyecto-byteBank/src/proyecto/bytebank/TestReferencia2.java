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
       diego.setNombre("diego"); 
       diego.setDocumento("455667"); 
       diego.setTelefono("234324243"); 
       
       Cuenta cuentaDiego = new Cuenta(1);
      
        cuentaDiego.titular = diego;
        System.out.println(cuentaDiego.titular.getDocumento());
        System.out.println(cuentaDiego.titular);
        System.out.println(diego);
    }
    
}
