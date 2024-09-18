package com.mycompany.somaparesintervalo;

import java.util.Scanner;

public class SomaParesIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite o valor inicial: ");
            if (scanner.hasNextInt()) {
                int inicio = scanner.nextInt();

                System.out.print("Digite o valor final: ");
                if (scanner.hasNextInt()) {
                    int fim = scanner.nextInt();

                    if (inicio <= fim) {
                        int soma = 0;
                        for (int i = inicio; i <= fim; i++) {
                            if (i % 2 == 0) {
                                soma += i;
                            }
                        }
                        System.out.println("A soma dos números pares entre " + inicio + " e " + fim + " é: " + soma);
                        entradaValida = true;
                    } else {
                        System.out.println("O valor final deve ser maior ou igual ao inicial. Tente novamente.");
                    }
                } else {
                    System.out.println("Valor final inválido. Digite um número inteiro.");
                    scanner.next(); // Limpa o buffer do scanner
                }
            } else {
                System.out.println("Valor inicial inválido. Digite um número inteiro.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }
    }
}