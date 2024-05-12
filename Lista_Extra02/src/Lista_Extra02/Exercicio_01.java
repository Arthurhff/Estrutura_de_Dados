package Lista_Extra02;

        /*1. Faça um programa que carregue dois vetores com 10 posições.
        O primeiro vetor deverá conter o nome dos alunos de uma turma e o segundo suas respectivas notas.
        Após a leitura, calcule a média geral da turma e imprima o nome de todos os alunos com nota superior a média da turma.*/


import java.util.Scanner;
import java.util.Locale;

public class Exercicio_01 {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String [] vetorNome = new String[10];
        double [] vetorNota = new double[10];
        double soma = 0;

        for(int i = 0; i < 10; i++){
            System.out.printf("Digite o nome do %d° aluno: ", i + 1);
            vetorNome[i] = sc.next();
            System.out.printf("Digite a nota do %d° aluno: ", i + 1);
            vetorNota[i] = sc.nextDouble();
            soma += vetorNota[i];
        }

        double media = soma / 10;

        System.out.printf("Alunos com nota superior à %.2f\n", media);
        for(int i = 0; i < 10; i++){
            if(vetorNota[i] > media){
                System.out.println(vetorNome[i]);
            }
        }

        sc.close();
    }
}