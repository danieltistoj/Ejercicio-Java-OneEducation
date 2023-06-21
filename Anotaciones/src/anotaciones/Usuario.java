/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotaciones;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombre;
    private String identidad;
    @EdadMinima(valor  = 18)
    private LocalDate fechaNacimiento;

    public Usuario(String nombre, String identidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    
}
