package Alunos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import Alunos.Aluno;
import Arquivo.Arquivo;

public class AlunoDAO {
    String caminho;
    HashMap <String, Aluno> alunos;
    
    public AlunoDAO(){
        alunos = new HashMap<>();
    }

    public void adcionarAluno(String matricula, String nome, String curso){
        Aluno aluno = new Aluno(matricula,nome,curso);
        alunos.put(matricula,aluno);
        
    }
    public void removerAluno(String matricula){
        alunos.remove(matricula);
    }

    public void AtualizarCurso(String matricula,String novoCurso){
        if (alunos.containsKey(matricula)){
            Aluno aluno = alunos.get(matricula);
            aluno.setCurso(novoCurso);

        }else{
            System.out.println("Aluno não cadastrado!");
        }
    }

    public Aluno buscarAluno(String matricula){
        return alunos.get(matricula);
    }

    public List<Aluno> listar() {
        return Collections.unmodifiableList(this.listaAlunos);
    }

    public void exportar() throws IOException {
        List<String> linhas = new ArrayList<>();

        for (Aluno alunos : this.listar()) {
            linhas.add(listaAlunos.toString());
        }

        Arquivo.escrever(this.caminho, linhas);
    }

    public void importar() throws IOException {
        List<String> linhas = Arquivo.ler(this.caminho);
    }

    

    //Collection<String> values = alunos.values();
    Collection<Aluno> listaAlunos = alunos.values().stream().collect(Collectors.toCollection(ArrayList::new));



    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Aluno aluno : alunos.values()) {
            sb.append(aluno.toString()).append("\n");
        }
        return sb.toString();
    }
}