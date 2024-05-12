package Lista_Extra02;

/*3. Faça um programa que leia um número x. Insira x na primeira posição do vetor real N[10].
 Em cada posição subsequente (1 a 9) insira o próximo número par maior que o número na posição anterior.*/

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.print("Digite o 1° elemento: ");
        vetor[0] = sc.nextInt();

        // Loop pra adicionar os próximos números pares maiores que o número na posição anterior
        for (int i = 1; i < 10; i++) {
            if (vetor[0] % 2 == 0) {
                vetor[i] = i * 2 + vetor[0];
            } else {
                // caso for impar adiciona o proximo par maior que o anterior e subtrai 1
                vetor[i] = i * 2 + vetor[0] - 1;
            }
        }

        // Imprime o vetor resultante
        System.out.println("O vetor é:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }

        sc.close(); // Fecha o Scanner
    }
}
