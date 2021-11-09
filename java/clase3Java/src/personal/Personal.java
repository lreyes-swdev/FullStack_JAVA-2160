package personal;

public class Personal {

    public String nombre, apellido, domicilio;
    public int edad;
    private float sueldo;

    public float getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(float nuevoSueldo) {
        this.sueldo = nuevoSueldo;
    }

    public Personal(String nombre, String apellido, String domicilio, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.edad = edad;
    }
    
    public Personal() {
        this.nombre = null;
        this.apellido = null;
        this.domicilio = null;
        this.edad = 0;
    }
    
}
