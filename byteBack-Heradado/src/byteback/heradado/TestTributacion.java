/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteback.heradado;

import byteback.heradado.Modelo.*;

/**
 *
 * @author Usuario
 */
public class TestTributacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(222, 333);
        cc.depositar(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadoraDeImpuestos calc = new CalculadoraDeImpuestos();

        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImpuesto());
    }
    
}
