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
public class TestGerente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Gerente gerente = new Gerente();
        gerente.setSalario(5000);
*/
        Gerente gerente = new Gerente();
        gerente.setSalario(6000);
        gerente.setClave("AluraCursosOnLine");
        gerente.setTipo(1);
        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("AluraCursosOnLine"));
    }
    
}
