package exercicio04_Escola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante estudante01 = new Estudante();
        estudante01.ImprimirEstudante();
        Professor professor01 = new Professor();
        professor01.ImprimirProfessor();

    }
}
