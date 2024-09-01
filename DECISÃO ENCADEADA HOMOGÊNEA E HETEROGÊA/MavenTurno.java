package com.mycompany.maventurno;

import java.util.Scanner;

public class MavenTurno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Digite a hora de início do turno (em formato 24h, entre 0 e 23): ");
        double horaInicio = scanner.nextDouble();

        if (horaInicio < 0 || horaInicio > 23) {
            System.out.println("Hora inválida. Por favor, digite um número entre 0 e 23.");
            
        }else if (horaInicio >= 5 && horaInicio < 13) {
            System.out.println("Turno da manhã.");
            
        } else if (horaInicio >= 13 && horaInicio < 21) {
            System.out.println("Turno da tarde.");
            
        } else {
            System.out.println("Turno da noite.");
        }
    }
}
