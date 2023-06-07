/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposvariables;

/**
 *
 * @author Usuario
 */
public class TestDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valorCompra =250.0;
        System.out.println("Compra por: $"+valorCompra);
        double descuento,valorTotal;
        if (valorCompra >= 100.0 && valorCompra <= 199.99) {
            valorCompra = valorCompra - (valorCompra*0.10);
            System.out.println("El descuento es del 10");
        } else if (valorCompra >= 200.0 && valorCompra <= 299.99) {
             valorCompra = valorCompra - (valorCompra*0.15);
            System.out.println("El descuento es del 15%");
        }else if (valorCompra >= 300.0) {
             valorCompra = valorCompra - (valorCompra*0.20);
            System.out.println("El descuento es del 20%");
        }else{
            System.out.println("no aplica descuento");
        }
        System.out.println("El valor total es de: $"+valorCompra);
    }
    
}
