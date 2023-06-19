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
public class ByteBackHeradado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setNombre("Diego");
        diego.setDocumentoIdentidad("343534534");
        diego.setSalario(2000);
        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());
    }
    
}
