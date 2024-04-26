package Lista_Exercicios_01;

//Escreva um programa que crie um vetor de números inteiros, receba 10 valores
// informados pelo usuário, imprima todos os valores pares e depois todos os valores ímpares

import java.util.Scanner;

public class Exerc_01 {
    public static void main(String[]args){

        // Entrada de Dados
        Scanner sc = new Scanner(System.in);
        int qtd_elementos = 10;
        int [] vetor = new int [qtd_elementos];

        for(int i = 0; i < qtd_elementos; i++){
            System.out.printf("Digite o %d° elemento do vetor: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        // Saída de Dados
        System.out.print("Elementos pares do vetor:\n");
        for(int i = 0; i < qtd_elementos; i++){
            if( vetor[i] % 2 == 0){
                System.out.println(vetor[i]);
            }
        }

        System.out.print("Elementos ímpares do vetor:\n");
        for(int i = 0; i < qtd_elementos; i++){
            if(vetor[i] % 2 != 0){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}