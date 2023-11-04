package Alunos;
import java.util.HashMap;

public class AlunoDAO {

   
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

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Aluno aluno : alunos.values()) {
            sb.append(aluno.toString()).append("\n");
        }
        return sb.toString();
    }
}
