package entidades.pessoas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entidades.Endereco;

public class Pessoa {
    private String nome,cpf;
    private Endereco endereco;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String cpf, Endereco endereco, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    public String getDataNascimento(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.dataNascimento.format(formato);
    }

    @Override
    public String toString() {
        return this.nome + "\n'" +
            ", cpf: '" + this.cpf + "\n" +
            ", endereco: '" + this.endereco + "\n" +
            ", Data de Nascimento='" + this.getDataNascimento();
    }

}
