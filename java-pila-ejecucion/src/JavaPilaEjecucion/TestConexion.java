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
    public static void main(String[] args) throws Exception{
        try(Conexion con = new Conexion()){
            con.leerDatos();
        }catch(IllegalStateException e){
            System.out.println("Ejecutando catch");
            e.printStackTrace();
        }
        /*
        Conexion con = null;
        try {
            con = new Conexion();
            con.leerDatos();
        }catch(IllegalStateException e){
            e.printStackTrace();
        }finally{
            System.out.println("Ejecutando finally");
            con.cerrar();
        }
*/
        
   
    }
}
