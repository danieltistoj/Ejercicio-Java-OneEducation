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
public class JavaPilaEjecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }
    public static void metodo1() {
        System.out.println("Inicio metodo1");
        metodo2();
        System.out.println("Fin metodo 1");
    }

    public static void metodo2() {
        System.out.println("Inicio metodo 2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                if(i == 3){
                    int num = 0;
                    int resultado = i/num;
                }
                String test = null;
                System.out.println(test.toString());
            } catch (ArithmeticException | NullPointerException e) {
                System.out.println("Atrapo exception");
                e.printStackTrace();//imprime toda la pila
            }
            //System.out.println(resultado);
        }
        System.out.println("Fin metodo 2");
    }
    
}
