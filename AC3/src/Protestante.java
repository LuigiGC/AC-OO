public class Protestante {

    String nome;
    String telefone;

    Protestante(String nome){
        this.nome = nome;

    }
    Protestante(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    public static void main(String []args){
        Protestante prot1;

        prot1 = new Protestante("Luah","\n(21)95498-9819");
        System.out.println(prot1.nome + prot1.telefone);
    
}
}
