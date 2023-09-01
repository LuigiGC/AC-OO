public abstract class Pessoa {
    String nome;
    String corpo;
    double posX, posY;
    public Pessoa(String nome, String corpo) {
        this.nome = nome;
        this.corpo = corpo;
        this.posX = 0.0;
        this.posY = 0.0;

    }
    public void movimenta(double novPosX, double novPosY){
        this.posX = novPosX;
        this.posY = novPosY;
    }
   
    public abstract void falar();
    }

    
