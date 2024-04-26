package Lista_Exercicios_01;

/*Escreva um programa que leia 10 valores inteiros, informados pelo usuário e
  armazene-os em um vetor. Após isso, lendo o vetor uma única vez e sem criar
  outros vetores, mostre na tela a média dos valores armazenados no vetor
  ponderados pelos índices nos quais estão armazenados.*/

import java.util.Scanner;

public class Exerc_02 {
    public static void main(String[]args){

        // Entrada de Dados
        Scanner sc = new Scanner(System.in);
        int qtd_elementos = 10;
        int [] vetor = new int [qtd_elementos];
        for(int i = 0; i < qtd_elementos; i++){
            System.out.printf("Digite o %d° elemento do vetor: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        // Processamento de Dados
        double soma_numerador = 0;
        double soma_denominador = 0;
        double media_ponderada;
        for(int i = 0; i < qtd_elementos; i++){
            soma_numerador += (vetor[i] * i);
            soma_denominador += i;
        }
        media_ponderada = soma_numerador / soma_denominador;

        // Saída de Dados
        System.out.printf("A média ponderada é %.2f%n", media_ponderada);

        sc.close();
    }
}
