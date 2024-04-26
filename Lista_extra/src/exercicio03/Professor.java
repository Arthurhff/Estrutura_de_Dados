package exercicio03;

public class Professor {

    public String nome;
    public double salario;

    public Professor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentoSalario(double porcentagem) {
        salario += salario * porcentagem / 100;
        System.out.println("Atualuização de salário para: " + salario);
    }

    public void mostarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

}
