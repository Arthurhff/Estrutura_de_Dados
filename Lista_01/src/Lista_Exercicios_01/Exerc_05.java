package Lista_Exercicios_01;

/*Faça um programa que leia um valor e apresente o número de Fibonacci
correspondente a este valor lido. Lembre-se que os 2 primeiros elementos da
série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a
ele. Todos os valores de Fibonacci calculados neste problema devem caber em
um inteiro de 64 bits sem sinal.*/

import java.util.Scanner;

public class Exerc_05 {
    public static void main(String[]args){

        // Entrada de Dados
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos: ");
        int qtd_elementos = sc.nextInt();
        int [] vetor = new int [qtd_elementos];

        // Processamento de Dados
        vetor[0] = 0;
        vetor[1] = 1;
        for(int i = 2; i < qtd_elementos; i++){
            vetor[i] = vetor[i - 1] + vetor[i - 2];
        }

        // Saída de Dados
        for(int i = 0; i < qtd_elementos; i++){
            System.out.printf("%d° elemento: %d\n", i + 1, vetor[i]);
        }

        sc.close();
    }
}