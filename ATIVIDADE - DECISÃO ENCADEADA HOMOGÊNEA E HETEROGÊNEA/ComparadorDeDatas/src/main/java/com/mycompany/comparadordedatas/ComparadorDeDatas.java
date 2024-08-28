package com.mycompany.comparadordedatas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ComparadorDeDatas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite a primeira data (dd/MM/yyyy):");
        String data1Str = scanner.next();

        System.out.println("Digite a segunda data (dd/MM/yyyy):");
        String data2Str = scanner.next();

        try {
            LocalDate data1 = LocalDate.parse(data1Str, formatter);
            LocalDate data2 = LocalDate.parse(data2Str, formatter);

            if (data1.isBefore(data2)) {
                System.out.println("Datas em ordem crescente:");
                System.out.println("Data 1: " + data1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                System.out.println("Data 2: " + data2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            } else if (data1.isAfter(data2)) {
                System.out.println("Datas em ordem crescente:");
                System.out.println("Data 2: " + data2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                System.out.println("Data 1: " + data1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            } else {
                System.out.println("As datas são iguais.");
            }
        } catch (DateTimeException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite uma data no formato dd/MM/yyyy.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Verifique se a entrada é uma data válida no formato dd/MM/yyyy.");
        }
    }
}