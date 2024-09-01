package com.mycompany.calculadorademedia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Calculadora de Média!");
        System.out.println("Por favor, digite as 4 notas:");

        try {
            double nota1, nota2, nota3, nota4, media;

            System.out.print("Digite a 1ª nota: ");
            nota1 = scanner.nextDouble();
            if (nota1 < 0) {
                System.out.println("Nota inválida. Por favor, digite uma nota positiva.");
                return;
            }

            System.out.print("Digite a 2ª nota: ");
            nota2 = scanner.nextDouble();
            if (nota2 < 0) {
                System.out.println("Nota inválida. Por favor, digite uma nota positiva.");
                return;
            }

            System.out.print("Digite a 3ª nota: ");
            nota3 = scanner.nextDouble();
            if (nota3 < 0) {
                System.out.println("Nota inválida. Por favor, digite uma nota positiva.");
                return;
            }

            System.out.print("Digite a 4ª nota: ");
            nota4 = scanner.nextDouble();
            if (nota4 < 0) {
                System.out.println("Nota inválida. Por favor, digite uma nota positiva.");
                return;
            }

            media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println("Conceito da média:");
            System.out.println("A - média maior ou igual à 9 = Aprovado ");
            System.out.println("B - média maior ou igual à 7 e menor que 9 = Aprovado");
            System.out.println("C - média maior ou igual à 5 e menor que 7 = Aprovado");
            System.out.println("D - média maior ou igual à 2,5 e menor que 5 = Reprovado"); 
            System.out.println("E - média menor ou que 2,5 = Reprovado"); 

            if (media >= 9) {
                System.out.println("A média é " + media);
                System.out.println("Você foi Aprovado");
                System.out.println("O conceito adquirido foi A");
            } else if (media >= 7 && media < 9) {
                System.out.println("A média é " + media);
                System.out.println("Você foi Aprovado");
                System.out.println("O conceito adquirido foi B");
            } else if (media >= 5 && media < 7) {
                System.out.println("A média é " + media);
                System.out.println("Você foi Aprovado");
                System.out.println("O conceito adquirido foi C");
            } else if (media >= 2.5 && media < 5) {
                System.out.println("A média é " + media);
                System.out.println("Você foi Reprovado");
                System.out.println("O conceito adquirido foi D");
            } else if (media < 2.5) {
                System.out.println("A média é " + media);
                System.out.println("Você foi Reprovado");
                System.out.println("O conceito adquirido foi E");
            } else if (media == 0) {
                System.out.println("A média é " + media);
                System.out.println("Você não obteve nota em nenhuma das provas.");
                System.out.println("O conceito adquirido foi Não Avaliado");
}
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número, para representar notas decimais utilize a vírgula");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Erro desconhecido: " + e.getMessage());
        }
    }
}