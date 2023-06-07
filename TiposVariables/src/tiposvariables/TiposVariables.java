/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposvariables;

/**
 *
 * @author Usuario
 */
public class TiposVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double variable1 = 230.89;
        int variable1Entero = (int) variable1;
        System.out.println(variable1Entero);
        //int 2 a la 31
        //long 2 a la 64,  al final del nuemero se pone la letra l
        long variable = 122222222222222222L;
        //2 a la 16
        short short1 = (short) 65536;
        //byte 2 a la 8
        byte byte1 = 10;
        //float mas pequeño que double
        float float1 = 8.9F;
        
        double variable13 = 0.1;
        double variable4 = 0.2;
        double total = variable13 + variable4;
        
        System.out.println(total);
    }
    
}
