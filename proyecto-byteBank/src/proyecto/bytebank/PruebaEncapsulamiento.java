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
public class PruebaEncapsulamiento {
    public static void main(String[] args) {
         Cuenta cuenta = new Cuenta(1);
         Cliente cliente = new Cliente();
         cliente.setNombre("Diengo");
         cliente.setDocumento("dadfadfa");
         cuenta.setTitular(cliente);
         System.out.println(cliente);
         System.out.println(cuenta.getTitular().getNombre());
    }
}
