package com.mycompany.mavenmacdonalds;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MavenMacDonalds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    try {     
            System.out.println("Menu de lanches disponíveis no MacDonald's");
            System.out.println("1. BigMac");
            System.out.println("2. Quarteirão");
            System.out.println("3. MacChicken");
            System.out.println("4. Cheddar");
            System.out.println("5. Cheese burger"); 
             
            System.out.print("Digite o número do lanche que você deseja: ");
            int lanche = scanner.nextInt();
            
            if (lanche <=0) {
           System.out.println("Por favor, digite um nmero positivo e correspondente aos lanches disponíveis no menu.");
            return;}
            
            if (lanche >5) {
           System.out.println("Por favor, digite um valr correspondente aos lanches disponíveis no menu.");
            return;}

             switch (lanche) {
                case 1 -> System.out.println("O lanche escolhido foi BigMac.");
                case 2 -> System.out.println("O lanche escolhido foi Quarteirão.");
                case 3 -> System.out.println("O lanche escolhido foi MacChicken.");
                case 4 -> System.out.println("O lanche escolhido foi Cheddar.");
                case 5 -> System.out.println("O lanche escolhido foi Cheese burger.");
                default -> System.out.println("O número digitado não corresponde a nenhum lanche do menu.");
                }
             
        }catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número correspondente aos lanches disponíveis no menu.");
                scanner.nextLine();
        }
    }
}