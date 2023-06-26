/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPilaEjecucion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class JavaPilaEjecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (Exception ex) {
            Logger.getLogger(JavaPilaEjecucion.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Fim do main");
    }
    public static void metodo1() throws MeException{
        System.out.println("Inicio metodo1");
        metodo2();
        System.out.println("Fin metodo 1");
    }

    public static void metodo2() throws MeException{
        System.out.println("Inicio metodo 2");
        throw new MeException("Mi excepcion fue lanzada");
        //System.out.println("Fin metodo 2");
    }
    
}
