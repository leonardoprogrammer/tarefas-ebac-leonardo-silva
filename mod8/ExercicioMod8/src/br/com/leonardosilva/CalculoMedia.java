package br.com.leonardosilva;

import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        Double nota1, nota2, nota3, nota4, media;
        Scanner scan = new Scanner(System.in);

        System.out.println("CÁLCULO DE MÉDIA DE 4 NOTAS\n");

        System.out.println("Digite a primeira nota:");
        nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota:");
        nota3 = scan.nextDouble();

        System.out.println("Digite a quarta nota:");
        nota4 = scan.nextDouble();

        // Calcula a média
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("\nA média é: " + media);
    }
}