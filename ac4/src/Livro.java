public abstract class Livro {
    String autor;
    String titulo;
    boolean reservado;
    boolean emprestado;

    Livro(String autor, String titulo){
    this.autor = autor;
    this.titulo = titulo;
    this.reservado = false;
    this.emprestado = false;

}
public abstract void reservar();

public abstract void cancelarReserva();
}
