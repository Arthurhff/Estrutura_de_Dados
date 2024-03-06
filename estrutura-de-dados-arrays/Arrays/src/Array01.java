/*Escreva um programa que crie um vetor de números inteiros, receba 10 valores
        informados pelo usuário, imprima todos os valores pares e depois todos os
        valores ímpares. */

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 numeros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Num par:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Num impar:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.println(vetor[i]);
            }
        }

        scanner.close();
    }
}