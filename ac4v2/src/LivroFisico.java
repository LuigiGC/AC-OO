public class LivroFisico extends Livro{
    
    LivroFisico(String autor, String titulo){
        super(autor, titulo);
    }


    public void emprestar(){
        if (emprestado == false && reservado == true){
            System.out.println("O livro foi emprestado com sucesso!");
            emprestado = true;
        
        }else if (emprestado == true){
            System.out.println("Livro já emprestado!");

        }else{
            System.out.println("O livro deve ser reservado primeiro!");

        }
    }
@Override
public void reservar(){
    if(reservado == false){
        System.out.println("O livro foi reservado!");
        reservado = true;
    } else{
        System.out.println("O livro ja foi reservado!");
    }
}

    @Override
    public void cancelarReserva(){
        if (reservado == true){
            System.out.println("Reserva cancelada!");
            reservado = false;
        }else{
            System.out.println("Este livro não foi reservado!");
        }
    }
    public void devolver(){
        if (emprestado == false){
            System.out.println("Este livro não foi reservado para ser devolvido!");
        }else{
            System.out.println("Livro devolvido!");
            emprestado = false;
        }
    }
}
