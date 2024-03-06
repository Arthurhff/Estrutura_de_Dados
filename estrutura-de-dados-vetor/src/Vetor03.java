//3. Escreva um programa que carregue dois vetores inteiros com 5 posições, sendo um com números pares e o outro com
// números ímpares. O usuário pode digitar os números em qualquer sequência e o programa deverá armazená-los no
// vetor correto na ordem em que foram informados pelo usuário

import java.util.Scanner;

public class Vetor03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];
        int contPar = 0;
        int contImpar = 0;

        System.out.println("Digite 5 números pares e 5 números ímpares:");

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) { // Se o número for par
                if (contPar < 5) {
                    par[contPar] = numero;
                    contPar++;
                } else {
                    System.out.println("Número inválido.");
                }
            } else { // Se o número for ímpar
                if (contImpar < 5) {
                    impar[contImpar] = numero;
                    contImpar++;
                } else {
                    System.out.println("Número inválido.");
                }
            }
        }

        System.out.println("Números pares digitados:");
        for (int i = 0; i < contPar; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println("\nNúmeros ímpares digitados:");
        for (int i = 0; i < contImpar; i++) {
            System.out.print(impar[i] + " ");
        }

        scanner.close();
    }
}
