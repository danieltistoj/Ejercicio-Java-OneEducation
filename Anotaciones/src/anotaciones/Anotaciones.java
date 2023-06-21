/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotaciones;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author Usuario
 */
public class Anotaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Usuario usuario = new Usuario("Maria", "42198284863", LocalDate.of(1995, Month.MARCH, 14));
           System.out.println(validador(usuario));
    }
    public static <T> boolean validador(T objeto) {
        Class<?> clase = objeto.getClass();
        for (Field field : clase.getDeclaredFields()) {
            if (field.isAnnotationPresent(EdadMinima.class)) {
                EdadMinima edadMinima = field.getAnnotation(EdadMinima.class);
                try {
                    field.setAccessible(true);
                    LocalDate fechaNacimiento = (LocalDate) field.get(objeto);
                    return Period.between(fechaNacimiento, LocalDate.now()).getYears() >= edadMinima.valor();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    
    }
    
}
