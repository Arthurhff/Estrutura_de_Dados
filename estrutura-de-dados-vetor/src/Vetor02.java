//2. Escreva um programa que carregue um vetor inteiro de cem posições com números aleatórios entre 0 e 100. Percorrendo o vetor criado
//apenas uma vez, imprima a posição onde ocorre o menor o valor, a soma dos números armazenados e preencha os valores de um novo vetor
//com metade do tamanho do vetor original onde a primeira posição do novo vetor é igual à soma da primeira e da última posição do vetor
//original. A segunda posição do novo vetor é a soma da segunda e da penúltima posição do vetor original e assim em diante.

import java.util.Random;

public class Vetor02 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] vetorCem = new int[100];
        for (int i = 0; i < vetorCem.length; i++) {
            vetorCem[i] = aleatorio.nextInt(101); // numero aleatorio de 0 a 100 / 101 PQ VETOR COMEÇA DO 0
        }

        int menorValor = vetorCem[0];
        int posicaoMenorValor = 0;
        int soma = 0;
        for (int i = 0; i < vetorCem.length; i++) {
            soma += vetorCem[i];
            if (vetorCem[i] < menorValor) {
                menorValor = vetorCem[i];
                posicaoMenorValor = i;
            }
        }

        int tamanhoNovoVetor = vetorCem.length / 2; //diminui o vetor pela metade
        int[] novoVetor = new int[tamanhoNovoVetor];

        // completando o vetor
        for (int i = 0; i < tamanhoNovoVetor; i++) {
            novoVetor[i] = vetorCem[i] + vetorCem[vetorCem.length - 1 - i];
        }

        System.out.println("Posição do menor valor: " + posicaoMenorValor);
        System.out.println("Soma dos números armazenados: " + soma);
        System.out.println("Novo vetor:");
        for (int i = 0; i < novoVetor.length; i++) {
            System.out.println("Posição " + i + ": " + novoVetor[i]);
        }
    }
}
