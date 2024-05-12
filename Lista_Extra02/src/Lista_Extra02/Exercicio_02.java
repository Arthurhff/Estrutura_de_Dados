package Lista_Extra02;

/*2. Faça um programa que leia 10 números inteiros e os armazene em um vetor. Ordene o vetor em ordem não decrescente e imprima-o.*/

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [10];

        for(int i = 0; i < 10; i++){
            System.out.printf("Digite o %d° elemento: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        int aux; //auxiliar para ajudar na ordenação
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 9; j++){
                //se o elemento atual for maior que o proximo elemento
                if (vetor[j] > vetor[j + 1]){
                    //traoca os elementos de posição
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        System.out.println("Vetor ordenado de forma crescente:");
        for(int i = 0; i < 10; i++){
            System.out.println(vetor[i]);
        }

        sc.close();

    }
}