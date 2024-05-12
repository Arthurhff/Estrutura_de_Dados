package Lista_Extra02;

/*4. Faça um programa que leia um vetor inteiro N[100].
 Imprima todas as posições que contém números entre 10 e 30 e os respectivos valores.*/

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int [] vetor = new int[100];

        for(int i = 0; i < 100; i++){
            System.out.printf("Digite o %d° elemento: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        System.out.println("Posições dos valores entre 10 e 30:");
        for(int i = 0; i < 100; i++){
            if(vetor[i] > 10 && vetor[i] < 30){
                System.out.printf("Posição: %d - Valor: %d\n", i, vetor[i]);
            }
        }

        sc.close();
    }
}