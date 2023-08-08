package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //se utiliza exception para controlar que se ingresen numeros enteros
        Scanner tc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ejecución numero " + i);
            boolean repe = true;
            int num1 = 0, num2 = 0;
            while (repe) {
                try {
                    System.out.print("Ingrese el primer numero: ");
                    num1 = tc.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = tc.nextInt();
                    repe = false;
                } catch (InputMismatchException e) {
                    System.err.println("Ingrese únicamente un número entero");
                    tc.nextLine();
                }
            }
            tc.nextLine();
            System.out.println("Ingrese la operación a realizar");
            String ope = tc.nextLine();
            switch (ope) {
                case "+":
                    if (Calculadora.suma(num1, num2) < 0) {
                        System.out.println("El resultado es negativo, tene cuidado!");
                    } else if (Calculadora.suma(num1, num2) > 1000) {
                        System.out.println("El resultado es un número grande");
                    } else {
                        System.out.println(Calculadora.suma(num1, num2));
                    }

                    break;
                case "-":
                    if (Calculadora.resta(num1, num2) < 0) {
                        System.out.println("El resultado es negativo, tene cuidado!");
                    } else if (Calculadora.resta(num1, num2) > 1000) {
                        System.out.println("El resultado es un número grande");
                    } else {
                        System.out.println(Calculadora.resta(num1, num2));
                    }

                    break;
                case "*":
                    if (Calculadora.multi(num1, num2) < 0) {
                        System.out.println("El resultado es negativo, tene cuidado!");
                    } else if (Calculadora.multi(num1, num2) > 1000) {
                        System.out.println("El resultado es un número grande");
                    } else {
                        System.out.println(Calculadora.multi(num1, num2));
                    }

                    break;
                case "/":
                    if (Calculadora.div(num1, num2) < 0) {
                        System.out.println("El resultado es negativo, tene cuidado!");
                    } else if (Calculadora.div(num1, num2) > 1000) {
                        System.out.println("El resultado es un número grande");
                    } else {
                        System.out.println(Calculadora.div(num1, num2));
                    }
                    break;
                default:
                    System.out.println("Tipo de operación no válida"); // si el tipo de operacion no es valida se cierra el programa
                    System.exit(0);
            }
        }
    }
}