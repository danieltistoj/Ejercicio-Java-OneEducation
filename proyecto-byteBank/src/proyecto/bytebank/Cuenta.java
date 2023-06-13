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
public class Cuenta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;
    void depositar(double valor){
        this.saldo+=valor;
    }
    public boolean retirar(double valor){
        if(this.saldo>= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
   
    }
    
    public boolean transfereir(double valor, Cuenta cuenta){
        if(retirar(valor)){
         cuenta.depositar(valor);  
         return true;
        }
        return false;
        
    }
}
