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
public  interface Autenticable {
   

    public void setClave(String clave);
    public boolean iniciarSesion(String clave);

}
