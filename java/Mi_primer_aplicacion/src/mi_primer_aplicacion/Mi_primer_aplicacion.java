/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_primer_aplicacion;

/**
 *
 * @author lreye
 */
public class Mi_primer_aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        String nombre;
        float promedio;
        boolean llueve = true;
        numero = 13;
        float resultado;
        resultado = numero + 19;
        promedio = (numero + 19) / 2;
        System.out.println("Hola esta es mi primer aplicación!!");
        System.out.println(resultado);
        System.out.println("El promedio es: " + promedio);
        System.out.println(45 > 19 != 19 < 32);
        System.out.println("");
        if (llueve == true) {
            System.out.println("Usamos paraguas!!");
        } else {
            System.out.println("No usaremos paraguas!!");
        }
        Juego jugador = new Juego(0, 3, "Mario", "Hongos", "Martillo");
        Juego jugador2 = new Juego(0, 3, "Juan", "Hongos", "Martillo");

        System.out.println("Mi nombre es " + jugador.personaje);
        System.out.println("Tengo: " + jugador.getVidas() + " Vidas");
        System.out.println(jugador.mostrarSaludo());
        System.out.println(jugador2.mostrarSaludo());
    }

}
