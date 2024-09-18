package com.mycompany.paresemordemcrescente;

import java.util.Scanner;

public class ParesEmOrdemCrescente {
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

                    for (int i = inicio; i <= fim; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    entradaValida = true;
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