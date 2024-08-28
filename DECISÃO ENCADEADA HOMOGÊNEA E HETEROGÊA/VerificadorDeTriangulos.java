package com.mycompany.verificadordetriangulos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificadorDeTriangulos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;

        while (!valido) {
            try {
                double A, B, C;
                System.out.print("Digite quanto mede o primeiro lado do triângulo: ");
                A = scanner.nextDouble();

                if (A <= 0) {
                    System.out.println("O lado não forma um triângulo.");
                    continue;
                }

                System.out.print("Digite quanto mede o segundo lado do triângulo: ");
                B = scanner.nextDouble();

                if (B <= 0) {
                    System.out.println("O lado não forma um triângulo.");
                    continue;
                }

                System.out.print("Digite quanto mede o terceiro lado do triângulo: ");
                C = scanner.nextDouble();

                if (C <= 0) {
                    System.out.println("O lado não forma um triângulo.");
                    continue;
                }

                if (A + B <= C || A + C <= B || B + C <= A) {
                    System.out.println("Os lados não formam um triângulo.");
                    continue;
                }

                if (B == A && C == A) {
                    System.out.println("Triângulo Equilátero.");
                } else if (A == B && C != B || C == A && B != A || B == C && B != A) {
                    System.out.println("Triângulo Isósceles.");
                } else {
                    System.out.println("Triângulo Escaleno.");
                }

                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine();
            }
        }
    }
}