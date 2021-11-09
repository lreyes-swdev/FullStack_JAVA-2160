package operaciones;

public class Operaciones {

    public float num, num2;
    /*creamos dos variables de tipo float*/
    public String op;

    /*Creamos una variable de tipo String para la operación*/

 /*Constructor */
    public Operaciones(float num, float num2, String op) {
        /*inicializamos los atributos*/
        this.num = num;
        this.num2 = num2;
        this.op = op;
    }

    public float operacion() {
        /*Creamos una función*/
        switch (op) {
            case "+":
                return num + num2;
            case "-":
                return num - num2;
            case "*":
                return num * num2;
            case "/":
                return num / num2;
            default:
                return 0;
        }
    }
}
