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
public class ControlBonificacion {
    private double suma;
    public double registrarSalario(Funcionario  funcionario){
        this.suma += funcionario.getBonificacion();
        System.out.println("Calculo actual bonificacion: "+this.suma);
        return this.suma;
        
    }
}
