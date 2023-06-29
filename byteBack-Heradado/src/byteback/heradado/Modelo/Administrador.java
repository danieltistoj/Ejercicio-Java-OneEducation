/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteback.heradado.Modelo;

/**
 *
 * @author Usuario
 */
public class Administrador extends Funcionario implements Autenticable{
    private AutenticacionUtil util;

    public Administrador() {
        this.util  = new AutenticacionUtil();
    }
    
    @Override
    public void setClave(String clave) {
      this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.IniciarSesion(clave);
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }
    
}
