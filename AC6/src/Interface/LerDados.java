package Interface;

import java.util.Scanner;

public class LerDados {
    Scanner scanner;

    public LerDados(){
        scanner = new Scanner(System.in);
    }
    public String lerTexto(){
        return scanner.nextLine();
    }
    public String[] lerNovoAluno() {
        System.out.print("Informe a matricula: ");
        String matricula = this.lerTexto();

        System.out.print("Informe o nome: ");
        String nome = this.lerTexto();
        
        System.out.println("Informe o curso: ");
        String curso = this.lerTexto();

        return new String[] {matricula, nome,curso};
    }

    public String[] lerClienteAlteracao(String matricula) {
        System.out.print("Informe o curso: ");
        String curso = this.lerTexto();
       

        return new String[] {matricula,curso};
    }

    @Override
    protected void finalize() {
        scanner.close();
    }
}

