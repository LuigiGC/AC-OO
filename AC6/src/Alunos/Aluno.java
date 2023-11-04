package Alunos;

import java.util.Collection;
import java.util.Objects;

public class Aluno {

    private String matricula;
    private String nome;
    private String curso;


    public  Aluno (String matricula, String nome, String curso){
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;

    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getNome(){
        return this.nome; 
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    @Override
    public String toString(){
        return this.matricula +" - "+
        this.nome + " - " +
        this.curso; 
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this)
            return true;
        if (!(obj instanceof Aluno)) {
            return false;
        }
        Aluno aluno = (Aluno) obj;
        return aluno.matricula.equals(this.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome);
    }
}