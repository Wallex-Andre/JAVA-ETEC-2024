package com.mycompany.idadenadadores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IdadeNadadores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    try {  
        System.out.println("Classificação de nadadores:");
        System.out.println();       
        System.out.println("Infantil A - Idade de 5 à 7 anos.");
        System.out.println("Infantil B - Idade de 8 à 10 anos.");
        System.out.println("Juvenil A - Idade de 11 à 13 anos.");
        System.out.println("Juvenil B - Idade de  14 à 17 anos."); 
        System.out.println("Senior - Idade a partir de 18 anos."); 
        
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        
        if (idade <=0) {
            System.out.println("Entrada inválida. Por favor, digite um número positivo e diferente de 0.");
        return;}
        
        if (idade >= 5 && idade <= 7) {
            System.out.println("A idade é " + idade);
            System.out.println("A classificação é Infantil A");
            
        }else if (idade >= 8 && idade <= 10) {
            System.out.println("A idade é " + idade);
            System.out.println("A classificação é Infantil B");
            
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("A idade é " + idade);
            System.out.println("A classificação é Juvenil A");
            
        } else if (idade >= 14 && idade <= 17){
            System.out.println("A idade é " + idade);
            System.out.println("A classificação é Juvenil B");
            
        } else if (idade >= 18){
            System.out.println("A idade é " + idade);
            System.out.println("A classificação é Senior");
        }
        
        }catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
        }   
  } 
}