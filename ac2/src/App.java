import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        double num1;
        double num2;
        double memoria = 0.0;
        double resultado = 0.0;
        int op;
        int op2;
        boolean encerrarPrograma = false;

        while (true){
            if (encerrarPrograma == true){
                break;
            }
          
            System.out.println("Informe um valor: ");
            num1 = leitor.nextDouble();
            memoria = num1;

            while (true){
            System.out.println("Resultado na memoria: "+ memoria);
            System.out.println("Selecione a operação: \n [1]Soma \n [2]Subtração \n [3]Multiplicação \n [4]Divisão ");
            op = leitor.nextInt();

            System.out.println("Informe o segundo valor: ");
            num2 = leitor.nextDouble();

            switch (op){
                case 1:
                resultado = num1 + num2;
                break;
                case 2: 
                resultado = num1 - num2;
                break;
                case 3:
                resultado = num1 * num2;
                break;
                case 4: 
                if (num2 != 0){
                    resultado = num1 / num2;
                    
                    }
                else{
                    System.out.println("Nenhum numero é divisivel por 0! faça a operação novamente");
                    continue;
                }
                break;

                default:
                System.out.println("Opção invalida!");
                continue;
                                            
            }
            System.out.println("Resultado: "+ resultado);
            System.out.println("Digite uma opção: \n [1]Limpar a memoria e realizar um novo calculo \n [2]Continuar uma conta com o resultado obtido \n [3]Sair");
            op2 = leitor.nextInt();

            if (op2 == 1){
                break;}
            if(op2 == 2){
                num1 = resultado;
                memoria = resultado;
                continue;

            }
             else{
                leitor.close();
                System.out.println("Obrigado por usar a calculadora!");
                encerrarPrograma = true;
                break;


            }
            



        }
    }

    
    }
}
