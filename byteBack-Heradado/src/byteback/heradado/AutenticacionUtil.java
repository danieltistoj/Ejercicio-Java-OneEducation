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
public class AutenticacionUtil {
    private String clave;
    public boolean IniciarSesion(String clave){
        return this.clave == clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
