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
public class Juego {

    private int puntos, vidas;
    public String personaje, enemigos, aliados;

    Juego(int puntos, int vidas, String personaje, String enemigos, String aliados) {
        this.puntos = puntos;
        this.vidas = vidas;
        this.personaje = personaje;
        this.enemigos = enemigos;
        this.aliados = aliados;
    }

    String mostrarSaludo() {
        return "Hola soy: " + this.personaje + " y tengo " + this.vidas + " Vidas!";
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

}
