package Ejercicio1;

/***
 * @author joelbrondo
 */
public class Calculadora {

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static double multi(int num1, int num2) {
        return num1 * num2;
    }

    // si la division es por cero larga la exception
    // las excepciones se utilizan para captar los 'errores' que se producen en el programa y poder controlarlos
    // tecnicamente existen los errores y las excepciones
    public static double div(int num1, int num2) {
        double res = 0;
        try {
            res = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } finally {
            return res;
        }
    }
}
