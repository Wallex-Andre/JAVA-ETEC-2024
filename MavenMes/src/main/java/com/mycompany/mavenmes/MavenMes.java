package com.mycompany.mavenmes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MavenMes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    try {
            System.out.println("Números correspondentes aos meses do ano");
            System.out.println();
            
            System.out.print("Digite um número entre 1 e 12: ");
            int numeroMes = scanner.nextInt();      
            
            if (numeroMes <=0) {
                System.out.println("O número  digitado é um negativo, por favor, digite um número positivo entre 1 e 12.");
            return;}
            
            if (numeroMes > 12) {
                System.out.println("Número de mês inválido. Por favor, digite um número entre 1 e 12.");
            return;}

             switch (numeroMes) {
                case 1 -> System.out.println("O mês correspondente é Janeiro");
                case 2 -> System.out.println("O mês correspondente é Fevereiro");
                case 3 -> System.out.println("O mês correspondente é Março");
                case 4 -> System.out.println("O mês correspondente é Abril");
                case 5 -> System.out.println("O mês correspondente é Maio");
                case 6 -> System.out.println("O mês correspondente é Junho");
                case 7 -> System.out.println("O mês correspondente é Julho");
                case 8 -> System.out.println("O mês correspondente é Agosto");
                case 9 -> System.out.println("O mês correspondente é Setembro");
                case 10 -> System.out.println("O mês correspondente é Outubro");
                case 11 -> System.out.println("O mês correspondente é Novembro");
                case 12 -> System.out.println("O mês correspondente é Dezembro");
                default -> System.out.println("Número de mês inválido. Por favor, digite um número entre 1 e 12.");
                }
             
        }catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número entre 1 e 12.");
            scanner.next();
        }
    }
}