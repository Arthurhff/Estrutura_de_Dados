package exercicio04_Escola;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Estudante {

    Scanner sc = new Scanner(System.in);

    private String nome;
    private String curso;
    private String anoIngresso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public Estudante() {
        System.out.println("Nome: ");
        this.nome = sc.nextLine();
        System.out.println("Curso: ");
        this.curso = sc.nextLine();
        System.out.println("Ano de Ingresso: ");
        this.anoIngresso = sc.nextLine();
    }

    public void ImprimirEstudante() {
        System.out.println("Nome: " + getNome());
        System.out.println("Departamento: " + getCurso());
        System.out.println("Titulação: " + getAnoIngresso());
    }

}
