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
public class TestReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 200;
        //al hacer esto ambos objetos apuntan a la misma direccion en memoria
        //Cuenta seguntaCuenta = primeraCuenta;
        Cuenta seguntaCuenta = new Cuenta();
        seguntaCuenta.saldo = 100;
        System.out.println("Saldo primera cuenta: " + primeraCuenta.saldo);
        System.out.println("Saldo segunda Cuenta: " + seguntaCuenta.saldo);
        seguntaCuenta.saldo+=400;
        
        System.out.println();
        
        System.out.println("Saldo primera cuenta: " + primeraCuenta.saldo);
        System.out.println("Saldo segunda Cuenta: " + seguntaCuenta.saldo);
        
        System.out.println(primeraCuenta);
        System.out.println(seguntaCuenta);
        
        if(seguntaCuenta == primeraCuenta){
            System.out.println("Son iguales");
        }else{
            System.out.println("no son iguales");
        }
    }
    
}
