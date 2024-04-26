package exercicio02;

public class Main {
    public static void main(String[] args) {

        Contato contato1 = new Contato("José da Silva", "9999-9909");
        Contato contato2 = new Contato("Mariana da Silva", "89898-9909");
        Contato contato3 = new Contato("Joana Siqueira", "9999-8666");

        System.out.println("Contato 1: nome: " + contato1.getNome() + ", telefone: " + contato1.getTelefone());
        System.out.println("Contato 2: nome: " + contato2.getNome() + ", telefone: " + contato2.getTelefone());
        System.out.println("Contato 3: nome: " + contato3.getNome() + ", telefone: " + contato3.getTelefone());

    }
}
