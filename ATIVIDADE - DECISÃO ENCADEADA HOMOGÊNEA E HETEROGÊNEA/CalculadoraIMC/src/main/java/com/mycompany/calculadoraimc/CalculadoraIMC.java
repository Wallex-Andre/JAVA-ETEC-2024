package com.mycompany.calculadoraimc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
    try {
        System.out.print("Digite a sua massa em kg: ");
        double massa = scanner.nextDouble();
        
        if (massa <= 0) {
            System.out.println("Por favor, digite um valor diferente de 0 e positivo.");
            return;}

            System.out.print("Digite a sua altura em metros: ");
            double altura = scanner.nextDouble();

        if (altura <= 0) {
           System.out.println("Por favor, digite um valor diferente de 0 e positivo.");
            return;}

        double imc = massa / (altura * altura);

        if (imc < 18) {
            System.out.println("Magreza.");
            System.out.println("O seu IMC é " + imc);
            
        }else if (imc >= 18.0 && imc <= 24.9) {
            System.out.println("Saudável.");
            System.out.println("O seu IMC é " + imc);
            
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso.");
            System.out.println("O seu IMC é " + imc);
            
        } else if (imc >= 30.0){
            System.out.println("Obesidade.");
            System.out.println("O seu IMC é " + imc);
        }
        
        } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine();
        }
    }
}