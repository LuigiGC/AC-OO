import Alunos.AlunoDAO;

public class App {
    public static void main(String[] args) throws Exception {
        
        AlunoDAO alunos = new AlunoDAO();
              
        alunos.adcionarAluno("202304419108", "Luigi", "Engenharia de Computação");
        alunos.adcionarAluno("202302532888", "Arthur", "Engenharia de Computação");
        alunos.adcionarAluno("1234", "JAO", "Desenho");

        System.out.println(alunos);

        alunos.removerAluno("1234");

        System.out.println(alunos);

        System.out.println(alunos.buscarAluno("202304419108"));

        alunos.AtualizarCurso("202304419108", "Engenheria de software");
        System.out.println(alunos);


        




       
    }

        
}
