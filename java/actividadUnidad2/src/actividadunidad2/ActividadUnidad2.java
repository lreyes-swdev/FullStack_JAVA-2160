/*
 * Crear un programa en Java en el cual se pida al usuario ingresar:
 * nombre, apellido, edad, hobbie, editor de código preferido y sistema operativo que utiliza.
 * Luego deberán mostrarse por consola los datos ingresados.
 * El programa deber ser subido a un repositorio de GitHub.
 */
package actividadunidad2;

import java.util.Scanner;

/**
 * @author lreyes-swdev
 */
public class ActividadUnidad2 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        usuario.setNombre(sc.nextLine());

        System.out.println("Ingrese su apellido:");
        usuario.setApellido(sc.nextLine());

        System.out.println("Ingrese su edad:");
        usuario.setEdad(sc.nextInt());
        sc.nextLine(); //se limpia '\n' que pLeaermanece en el buffer de entrada

        System.out.println("Ingrese su hobbie:");
        usuario.setHobbie(sc.nextLine());

        System.out.println("Ingrese su editor de código preferido:");
        usuario.setEditorCódigoPreferido(sc.nextLine());

        System.out.println("Ingrese el sistema operativo que utiliza:");
        usuario.setSistemaOperativo(sc.nextLine());

        System.out.println("\n" + usuario.mostrarDatos());
    }

}
