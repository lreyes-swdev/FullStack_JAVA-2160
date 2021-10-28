package accesorios;

public class Auto {

    public int velocidad;
    private boolean encedido;
    public int capPasajeros;
    public String color, modelo, anio, patente;

    public boolean isEncedido() {
        return encedido;
    }

    public void setEncedido(boolean encedido) {
        this.encedido = encedido;
    }

    public Auto(int velocidad, int capPasajeros, String color, String modelo, String anio, String patente) {
        this.velocidad = velocidad;
        this.capPasajeros = capPasajeros;
        this.color = color;
        this.modelo = modelo;
        this.anio = anio;
        this.patente = patente;
    }

    public boolean encender_auto() {
        if (this.isEncedido()) {
            System.out.println("El auto está encendido!!");
            return false;
        } else {
            System.out.println("El auto está encendiendo");
            return true;
        }
    }

}
