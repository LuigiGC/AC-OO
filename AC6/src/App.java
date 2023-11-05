import Interface.Interface;

public class App {
    public static void main(String[] args) throws Exception{
        Interface seletor = new Interface("alunos.txt");
        String opcao = "0";

        while (!opcao.equals("")){
            seletor.eOpcoes();
            opcao = seletor.processaOpcoes();
        }
    }
}