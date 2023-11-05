package Interface;

import java.io.IOException;
import Alunos.AlunoDAO;

public class Interface {
    LerDados lerDados;
    AlunoDAO ad;

    public Interface(String caminho) throws IOException{
        this.lerDados = new LerDados();
        this.ad = new AlunoDAO(caminho);
    }
    public void eOpcoes(){
        System.out.println("Escolha a opção desejada ou digite qualquer outro valor para sair!");
        System.out.println("[1] - Cadastrar um aluno novo");
        System.out.println("[2] - Atualizar um aluno");
        System.out.println("[3] - Remover um aluno cadastrado");
        System.out.println("[4] - Listar aluno por matricula");
        System.out.println("[5] - Listar os alunos");
    }

    public String processaOpcoes() throws IOException{
        String opcao = this.lerDados.lerTexto();
        switch(opcao) {
            case "1":
                ad.adcionarAluno(lerDados.lerNovoAluno());
                break;
            case "2":
                System.out.print("Digite a matricula do aluno a ser alterado: ");
                String matriculaAlterar = lerDados.lerTexto();
                if (ad.buscarAluno(matriculaAlterar) != null) {
                    ad.AtualizarCurso(lerDados.lerClienteAlteracao(matriculaAlterar));
                } else {
                    System.out.println("A matricula inserida não foi localizada!");
                }
                break;
            case "3":
                System.out.print("Digite a matricula do aluno a ser excluído: ");
                String removerMatricula = lerDados.lerTexto();
                if (ad.buscarAluno(removerMatricula) != null) {
                    ad.removerAluno(removerMatricula);
                    System.out.println("Aluno excluído com sucesso!");
                } else {
                    System.out.println("Matricula não encontrada!");
                }
                break;
            case "4":
                System.out.print("Digite a matricula do aluno: ");
                String matricula = lerDados.lerTexto();
                if (ad.buscarAluno(matricula) != null) {
                    System.out.println(ad.buscarAluno(matricula));
                } else {
                    System.out.println("matricula não encontrada!");
                }
                break;
            case "5":
                System.out.println(ad);
                break;
            default:
                ad.exportar();
                System.out.println("Volte sempre!");
                opcao = "";
        }

        return opcao;
    }     
    
}
