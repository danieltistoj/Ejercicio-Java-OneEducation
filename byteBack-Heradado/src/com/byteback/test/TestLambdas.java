/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byteback.test;

import com.byteback.modelo.Cliente;
import com.byteback.modelo.Cuenta;
import com.byteback.modelo.CuentaAhorro;
import com.byteback.modelo.CuentaCorriente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class TestLambdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cc1 = new CuentaCorriente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Nico");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta ca2 = new CuentaAhorro(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Guilermo");
        ca2.setTitular(clienteCC2);
        ca2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Cuenta ca4 = new CuentaAhorro(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Ana");
        ca4.setTitular(clienteCC4);
        ca4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(ca2);
        lista.add(cc3);
        lista.add(ca4);
        System.out.println("---ANTES DE ORDEDNAR---");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        //NumeroDeCuentaComparator comparator = new NumeroDeCuentaComparator();
        //lista.sort(comparator);
        //Usandod Lambdas
        lista.sort((Cuenta o1, Cuenta o2) ->
                Integer.compare(o1.getNumero(), o2.getNumero())
        );

        System.out.println("---DESPUES DE ORDEDNAR---");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        System.out.println("---ORDEN ALFABETICO---");
        lista.sort((Cuenta o1, Cuenta o2) -> 
               o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre())
           
        ); // Ya dejándolo mai delgado
       /*
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta + ", " + cuenta.getTitular().getNombre());
        }
*/
       
       
        lista.forEach(cuenta-> System.out.println(cuenta));
        
        
        System.out.println("---ORDEN NUMERO NATURAL---");
        Collections.sort(lista);
        lista.sort(new TitularDeCuentaComparator()); // Ya dejándolo mai delgado
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta + ", " + cuenta.getTitular().getNombre());
        }
    }
    
}
