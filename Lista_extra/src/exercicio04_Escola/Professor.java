package exercicio04_Escola;

import java.util.Scanner;

public class Professor {

    Scanner sc = new Scanner(System.in);

    private String nome;
    private String departamento;
    private String titulacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Professor (){
        System.out.println("Nome: ");
        this.nome = sc.nextLine();
        System.out.println("Departamento: ");
        this.departamento = sc.nextLine();
        System.out.println("Titulação: ");
        this.titulacao = sc.nextLine();
    }

    public void ImprimirProfessor() {
        System.out.println("Nome: " + getNome());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Titulação: " + getTitulacao());
    }

}


