package br.com.leonardosilva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double nota1, nota2, nota3, nota4, media;
        Scanner scan = new Scanner(System.in);

        System.out.println("AVALIAÇÃO DO ALUNO\n");

        System.out.println("Digite a 1ª nota:");
        nota1 = scan.nextDouble();

        System.out.println("Digite a 2ª nota:");
        nota2 = scan.nextDouble();

        System.out.println("Digite a 3ª nota:");
        nota3 = scan.nextDouble();

        System.out.println("Digite a 4ª nota:");
        nota4 = scan.nextDouble();

        // CALCULA A MÉDIA
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Resultado: o aluno está aprovado!");
        } else if (media >= 5) {
            System.out.println("Resultado: o aluno está em recuperação!");
        } else {
            System.out.println("Resultado: o aluno está reprovado!");
        }
    }
}