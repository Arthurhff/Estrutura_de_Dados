/*Escreva um programa que leia 10 valores inteiros, informados pelo usuário e
        armazene-os em um vetor. Após isso, lendo o vetor uma única vez e sem criar
        outros vetores, mostre na tela a média dos valores armazenados no vetor
        ponderados pelos índices nos quais estão armazenados */

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 numeros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        double soma = 0;
        double somaPesos = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetor[i] * (i + 1);
            somaPesos += (i + 1);
        }
        double mediaPonderada = soma / somaPesos;

        System.out.println("A media dos valores no vetor e: " + mediaPonderada);

        scanner.close();
    }
}
