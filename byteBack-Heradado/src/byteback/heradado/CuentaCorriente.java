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
public class CuentaCorriente  extends Cuenta implements Tributacion{

    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void retirar(double valor) {
        double comision = 0.2;
        super.retirar(valor + comision); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void depositar(double valor) {
        this.saldo+=valor;
    }

    @Override
    public double getValorImpuesto() {
        return super.saldo * 0.01;
    }
     
    
}
