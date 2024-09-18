package com.mycompany.tabuada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tabuada");

        double numero = 0;
        boolean entradaValida = false;

        do {
            System.out.print("Digite um número (pode ser decimal): ");
            try {
                numero = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next();
            }
        } while (!entradaValida);

        for (double d = 1; d <= 10; d++) {
            System.out.println(numero + " x " + d + " = " + (numero * d));
        }
    }
}