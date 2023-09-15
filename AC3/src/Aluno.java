public class Aluno {
    String nome,curso;
    String matricula;


    Aluno(String nome, String matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    Aluno(String nome){
        this.nome = nome;
    }

    public static void main(String []args){
        Aluno aluno1;
        aluno1 = new Aluno("Luigi","\n202304419108","\nEng. Comp");

        System.out.println(aluno1.nome + aluno1.matricula + aluno1.curso);
    }

}
