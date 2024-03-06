//1. Escreva um programa que leia dois vetores inteiros com dez posições cada.
//A partir desses vetores, carregue um terceiro vetor onde o valorde cada elemento
//será a média dos elementos de mesmo índice nos dois vetores anteriores.

import java.util.Scanner;

public class Vetor01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[10];

        System.out.println("Insira os valores do vetor 1: ");
            for (int i = 0; i <10; ++i) {
                vet1[i] = scanner.nextInt();
            }

        System.out.println("Insira os valores do vetor 2:");
            for (int j = 0; j <10; ++j) {
                vet2[j] = scanner.nextInt();
        }

        for (int i = 0; i <10; ++i) {
            vet3[i] = (vet1[i] + vet2[i]) / 2;
        }

        System.out.println("O vetor 3 corresponde a média dos vetores 1 e 2 de acordo com os respectivos índices.");
            for (int i = 0; i <10; ++i){
           System.out.println("Posição" + i + ": " + vet3[i]);
       }

    }
}