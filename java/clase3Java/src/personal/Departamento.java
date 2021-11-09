package personal;

public class Departamento extends Personal {

    private String depto;

    public Departamento(String nombre, String apellido, String domicilio, int edad, String depto) {
        super(nombre, apellido, domicilio, edad);
        this.depto = depto;
    }

    public String mostrarDatos() {
        return "-Nombre: " + nombre + "\n-Apellido: " + apellido
                + "\n-Domicilio: " + domicilio + "\n-Edad: " + edad 
                + "\n-Sueldo: " + getSueldo() + "\n-Departamento: " + depto;
    }
    
}
