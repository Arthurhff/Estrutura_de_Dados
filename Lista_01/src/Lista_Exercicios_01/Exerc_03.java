package Lista_Exercicios_01;

/*Leia um valor e faça um programa que coloque o valor lido na primeira posição
de um vetor de 10 posições. Em cada posição subsequente, coloque o dobro do
valor da posição anterior. Por exemplo, se o valor lido for 1, os valores do vetor
devem ser 1, 2, 4, 8 e assim sucessivamente. Mostre o vetor em seguida.*/

import java.util.Scanner;

public class Exerc_03 {
    public static void main(String[]args){

        // Entrada de Dados
        Scanner sc = new Scanner(System.in);
        int qtd_elementos = 10;
        int [] vetor = new int [qtd_elementos];
        for(int i = 0; i < qtd_elementos; i++){
            if (i == 0){
                System.out.print("Digite o primeiro elemento do vetor: ");
                vetor[i] = sc.nextInt();
            }
            else {
                vetor[i] = vetor[i - 1] * 2;
            }
        }

        // Saída de Dados
        for(int i = 0; i < qtd_elementos; i++){
            System.out.printf("%d° elemento: %d\n", i + 1, vetor[i]);
        }

        sc.close();
    }
}
