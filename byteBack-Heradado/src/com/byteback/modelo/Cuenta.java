/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byteback.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Cuenta va a crear nuevas instancias de
 * Cuenta corriente y cuenta de ahorro
 * @version 1.0
 * @author Daniel Tistoj
 * 
 */
public abstract class Cuenta {
    protected double saldo;
    private int agencia;
    private int numero;
    private static int total = 0;
    Cliente titular;
    public abstract   void depositar(double valor);
    /**
     * Instancia una nueva cuenta con paramentros
     * @param agencia
     * @param numero 
     */
    public Cuenta(int agencia, int numero) {
        if(agencia<=0){
            System.out.println("no se permite 0 o menor a 0");
            this.agencia = 1;
        }else{
            this.agencia = agencia;
        }
        this.numero = numero;
        total++;
        //System.out.println("num cuenta: "+total);
        //System.out.println("aqui se crea una misma cuenta");
    }
    /**
     * Este metodo retira dinero de la cuenta y si ocurre un error, devuelve 
     * una excepcion 
     * @param valor
     * @throws SaldoInsuficienteException 
     */
    public void retirar(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor){
           throw new SaldoInsuficienteException("No tiene saldo");
        }
        this.saldo-=valor;
    }
    
    public boolean transfereir(double valor, Cuenta cuenta){
        if(this.saldo >= valor){
            try {
                this.retirar(valor);
            } catch (SaldoInsuficienteException ex) {
                Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
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

    @Override
    public String toString() {
        String cuenta = "Numero: "+this.numero+ 
                        "\n"+ "Agencia: "+this.agencia;
        return cuenta; //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean esIgual(Cuenta cuenta){
        return this.agencia == cuenta.agencia 
               && this.numero == cuenta.numero; 
                
    }


    @Override
    public boolean equals(Object obj) {
        Cuenta cuenta = (Cuenta) obj;
        return this.agencia == cuenta.agencia 
               && this.numero == cuenta.numero; 
    }
    
    
    
}
