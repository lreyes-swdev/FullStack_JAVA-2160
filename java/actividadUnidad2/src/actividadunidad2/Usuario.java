package actividadunidad2;

public class Usuario {

    private String nombre, apellido, hobbie, editorCódigoPreferido, sistemaOperativo;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getEditorCódigoPreferido() {
        return editorCódigoPreferido;
    }

    public void setEditorCódigoPreferido(String editorCódigoPreferido) {
        this.editorCódigoPreferido = editorCódigoPreferido;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String mostrarDatos() {
        return "Datos del usuario: \n-Nombre: " + nombre + "\n-Apellido: " + apellido
                + "\n-Edad: " + edad + "\n-Hobbie: " + hobbie
                + "\n-Editor de código preferido: " + editorCódigoPreferido
                + "\n-Sistema Operativo que utiliza: " + sistemaOperativo;
    }

}
