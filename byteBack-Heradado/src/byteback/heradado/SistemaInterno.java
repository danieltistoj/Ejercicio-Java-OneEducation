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
public class SistemaInterno {
    private String clave = "12345";
    public boolean autentica(Gerente gerente){
        boolean IniciarSesion = gerente.iniciarSesion(clave);
        if(IniciarSesion){
            System.out.println("Login exitoso");
            return true;
        }else{
            System.out.println("Error en Login");
            return false;
        }
        
    }
}
