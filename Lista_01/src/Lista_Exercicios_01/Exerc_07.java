package Lista_Exercicios_01;

/*Escreva um programa que receba um número inteiro 2 ≤ 𝑁 ≤ 5, crie uma
matriz quadrada 𝑁 × 𝑁, preencha a matriz com valores de 1 até 𝑁2, calcule o
quadrado da matriz criada e exiba o resultado na tela.*/

import java.util.Scanner;

public class Exerc_07 {
    public static void main(String[]args){

        // Entrada de Dados
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de linhas e colunas da matriz quadrada: ");
        int quantidade_linhas_colunas = sc.nextInt();
        int [][] matriz = new int[quantidade_linhas_colunas][quantidade_linhas_colunas];
        int [][] matriz_quadrada = new int[quantidade_linhas_colunas][quantidade_linhas_colunas];
        for(int i = 0; i < quantidade_linhas_colunas; i++){
            for(int j = 0; j < quantidade_linhas_colunas; j++){
                System.out.printf("Digite o %d° elemento da %d° linha: ", j + 1, i + 1);
                matriz[i][j] = sc.nextInt();
            }
        }

        // Processamento de Dados

        for(int i = 0; i < quantidade_linhas_colunas; i++){
            for(int j = 0; j < quantidade_linhas_colunas; j++){
                matriz_quadrada[i][j] = matriz[i][j];
            }
        }

        // Saída de Dados
        for(int i = 0; i < quantidade_linhas_colunas; i++){
            for(int j = 0; j < quantidade_linhas_colunas; j++){
                System.out.printf("%d ", matriz_quadrada[i][j]);
            }
            System.out.println();
        }
    }
}
