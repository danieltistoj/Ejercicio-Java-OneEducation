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
public class Gerente extends Funcionario{
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }
    public boolean iniciarSesion(String clave){
        return clave == this.clave;
                
    }
    //sobre escritura de metodo
    public double getBonificacion(){
        return super.getSalario() + (super.getBonificacion());
    }
}