package recursosHumanos;

import personal.Departamento;

public class Finanzas extends Departamento {

    public String cargo;

    public Finanzas(String nombre, String apellido, String domicilio, int edad, String depto, String cargo) {
        super(nombre, apellido, domicilio, edad, depto);
        this.cargo = cargo;
    }

    public float ABonarSueldo() {
        switch (cargo) {
            case "gerente":
                return 350000;
            case "asistente":
                return 80000;
            default:
                return 0;
        }
    }

}
