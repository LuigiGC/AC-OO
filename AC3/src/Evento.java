public class Evento {

    String nome, local, data, participantes;
    int maxPar, numPar;
    
    Evento(String nome, String local, String data, int maxPar,int numPar){
        this.nome = nome;
        this.local = local;
        this.maxPar = maxPar;
        this.numPar = 0;
        this.data = data;
    }
    public static void main(String []args){
    Evento event1;
    
    event1 = new Evento("CBEU","\nVassouras","\n01/09/2023",5000,5);

    System.out.println(event1.data);

    }
}
