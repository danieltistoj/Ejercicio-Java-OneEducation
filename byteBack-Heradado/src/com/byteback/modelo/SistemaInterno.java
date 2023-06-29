/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byteback.modelo;

/**
 *
 * @author Usuario
 */
public class SistemaInterno {
    private String clave = "12345";
    //todo lo que este con la categoria de autenticable puede ser pasable como parametro
    public boolean autentica(Autenticable funcionario){
        boolean IniciarSesion = funcionario.iniciarSesion(clave);
        if(IniciarSesion){
            System.out.println("Login exitoso");
            return true;
        }else{
            System.out.println("Error en Login");
            return false;
        }
        
    }
}
