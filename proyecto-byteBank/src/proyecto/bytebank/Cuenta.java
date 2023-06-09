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
    private static int total = 0;
    Cliente titular;
    void depositar(double valor){
        this.saldo+=valor;
    }

    public Cuenta(int agencia) {
        if(agencia<=0){
            System.out.println("no se permite 0 o menor a 0");
            this.agencia = 1;
        }else{
            this.agencia = agencia;
        }
        total++;
        System.out.println("num cuenta: "+total);
        System.out.println("aqui se crea una misma cuenta");
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
    public static int getTotal(){
        //total es de la clase no de una instancia
        return Cuenta.total;
    }
}
