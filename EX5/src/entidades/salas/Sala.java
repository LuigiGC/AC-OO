package entidades.salas;

public class Sala {

    int numeroSala;
    int andar;
    String bloco;

    public Sala(int numeroSala, int andar,String bloco){
        this.numeroSala = numeroSala;
        this.andar = andar;
        this.bloco = bloco;
    }

    

    @Override
    public String toString() {
        return "Sala: " + this.numeroSala + "\n"  +
        "Andar: " + this.andar + "\n" + 
        "Bloco: " + this.bloco;   
}

}