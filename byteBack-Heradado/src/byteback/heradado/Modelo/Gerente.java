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
public class Gerente extends Funcionario  implements Autenticable{

    //sobre escritura de metodo

    /**
     *
     * @return
     */
    @Override
    public double getBonificacion(){
        System.out.println("Ejecutando desde gerente");
        return super.getSalario() + (this.getSalario()*0.05 );
    }

    @Override
    public void setClave(String clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean iniciarSesion(String clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
