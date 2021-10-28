package alumno;

public class Alumno {

    public String nombre, apellido;
    public int edad, id;
    public float notas;

    public Alumno(int id, String nombre, String apellido, int edad, float notas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notas = notas;
    }

}
