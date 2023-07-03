/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byteback.test;

import com.byteback.modelo.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class TestOrdenarLista {

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
        
        NumeroDeCuentaComparator comparator = new NumeroDeCuentaComparator();
        lista.sort(comparator);
        
        System.out.println("---DESPUES DE ORDEDNAR---");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        System.out.println("---ORDEN ALFABETICO---");
        lista.sort(new TitularDeCuentaComparator()); // Ya dejándolo mai delgado
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta + ", " + cuenta.getTitular().getNombre());
        }
        System.out.println("---ORDEN NUMERO NATURAL---");
        Collections.sort(lista);
        lista.sort(new TitularDeCuentaComparator()); // Ya dejándolo mai delgado
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta + ", " + cuenta.getTitular().getNombre());
        }
    }
    
}
class NumeroDeCuentaComparator implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta c1, Cuenta c2) {
        return Integer.compare(c1.getNumero(), c2.getNumero());
    }

}
class TitularDeCuentaComparator implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta c1, Cuenta c2) {
        String nombreC1 = c1.getTitular().getNombre();
        String nombreC2 = c2.getTitular().getNombre();
        return nombreC1.compareTo(nombreC2);
    }
}
