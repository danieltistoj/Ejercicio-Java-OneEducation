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
public class Cliente implements Autenticable{
   private String documento,nombre,telefono;
   private String clave;
   private AutenticacionUtil util;

    public Cliente() {
        this.util = new AutenticacionUtil();
    }
   
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.IniciarSesion(clave);
    }
    
}
