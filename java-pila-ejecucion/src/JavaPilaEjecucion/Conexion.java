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
public class Conexion implements AutoCloseable{
       public Conexion() {
       System.out.println("Abriendo conexion");
       throw new IllegalStateException();
   }

   public void leerDatos() {
       System.out.println("Recibiendo datos");
      //throw new IllegalStateException();
   }

   public void cerrar() {
       System.out.println("Cerrando conexion");
   }

    @Override
    public void close() throws Exception {
       this.cerrar();
    }
}
