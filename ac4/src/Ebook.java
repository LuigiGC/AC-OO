public class Ebook extends Livro{
    String tipoDeArquivo;


    Ebook(String autor,String titulo,String tipoDeAquivo){
        super(autor, titulo);
        this.tipoDeArquivo = tipoDeAquivo;
    }
    @Override
    public void reservar(){
        if (reservado == false){
            System.out.println("Ebook reservado com sucesso!");
            reservado = true;
        }else{
            System.out.println("Ebook já reservado!");

        }
    }
        @Override
        public void cancelarReserva(){
            if(reservado == true){
                System.out.println("Reserva feita com sucesso!");
                reservado = false;

            } else{
                System.out.println("Este livro não foi reservado!");
            }
        
    }
}
