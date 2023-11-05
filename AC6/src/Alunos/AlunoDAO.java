package Alunos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import Arquivo.Arquivo;

public class AlunoDAO {
    String caminho;
    ArrayList<Aluno> alunos = new ArrayList<>();
    
    public AlunoDAO(String caminho)throws IOException{
        this.caminho = caminho;
        this.importar();  
    }

    public void adcionarAluno(String[] dadosAlunos){
        Aluno aluno = new Aluno(dadosAlunos[0],dadosAlunos[1],dadosAlunos[2]);
        if (!this.alunos.contains(aluno)) {
            this.alunos.add(aluno);
        }
        
    }
    public void removerAluno(String matricula){
        Aluno aluno = new Aluno(matricula);
        if (this.alunos.contains(aluno)){
            this.alunos.remove(aluno);
        }
    }

    public void AtualizarCurso(String[] dadosAlunos){
        Aluno aluno = new Aluno(dadosAlunos[0],dadosAlunos[1],dadosAlunos[2]);
        int posicao = this.alunos.indexOf(aluno);
        this.alunos.set(posicao, aluno);
        

    }

    public Aluno buscarAluno(String matricula){
        Aluno encontrarAluno = new Aluno(matricula);
        for(Aluno aluno : this.alunos){
            if (aluno.equals(encontrarAluno)){
                return aluno;
            }
        }
        return null;
    }


    public List<Aluno> listar() {
        return Collections.unmodifiableList(this.alunos);
    }

    public void exportar() throws IOException {
        List<String> linhas = new ArrayList<>();

        for (Aluno alunos : this.listar()) {
            linhas.add(alunos.toString());
        }

        Arquivo.escrever(this.caminho, linhas);
    }

    public void importar() throws IOException {
        List<String> linhas = Arquivo.ler(this.caminho);

        for(String linha : linhas){
            String[] dadosAlunos = linha.split(" - ");
            this.adcionarAluno(dadosAlunos);
        }
    }

    
    @Override
    public String toString() {
        String msg = "";
        for (Aluno aluno : this.listar()){
            msg += aluno + "\n";
        }return msg;
    }
}