package logistica.classes;

import java.time.LocalDate;

public class Condutor implements Comparable<Condutor> {

    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private double salario;

    public Condutor(String nome, String cpf, LocalDate nascimento, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n  -Condutor: " + nome +
                "\n  -CPF: " + cpf +
                "\n  -Data de nascimento: " + nascimento +
                "\n  -Salário: R$ " + String.format("%.2f", salario);
    }

    @Override
    public int compareTo(Condutor condutor) {
        return this.getCpf().compareToIgnoreCase(condutor.getCpf());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}