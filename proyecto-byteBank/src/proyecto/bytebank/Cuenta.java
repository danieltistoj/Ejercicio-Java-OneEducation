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
    private int agencia;
    private int numero;
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
    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia>0){
         this.agencia = agencia;   
        }else{
            System.out.println("no estan permitidos valores negativos");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
}
