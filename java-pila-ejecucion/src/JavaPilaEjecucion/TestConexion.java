/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPilaEjecucion;

/**
 *
 * @author Usuario
 */
public class TestConexion {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        try {
            con.leerDatos();
        } catch (IllegalStateException e) {
            System.out.println("Recibiendo exception");
            e.printStackTrace();
        }finally{
            System.out.println("Ejecutando finally");
            con.cerrar();
        }
   
    }
}
