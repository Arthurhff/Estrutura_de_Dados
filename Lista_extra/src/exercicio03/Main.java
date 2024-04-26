package exercicio03;

public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("Jorge Amado", 3000.0);

        professor.mostarDados();

        professor.aumentoSalario(10);

        professor.mostarDados();

    }
}
