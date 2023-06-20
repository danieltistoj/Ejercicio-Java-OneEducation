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
public class FuncionarioAutenticable extends Funcionario{
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }
    public boolean iniciarSesion(String clave){
        return clave == this.clave;
                
    }
    @Override
    public double getBonificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
