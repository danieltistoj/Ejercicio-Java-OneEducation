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
public class Contador extends Funcionario{

    @Override
    public double getBonificacion() {
        System.out.println("Ejecuntado desde contador");
        return 200; //To change body of generated methods, choose Tools | Templates.
    }
    
}
