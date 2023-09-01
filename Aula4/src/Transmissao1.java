public class Transmissao1 implements ItransmiteDados {
    @Override
    public void enviaJson(){
        System.out.println("Enviando .json");
}
@Override
public String recebeMensagem(String protocolo){
    return "Recebida mensagem usando protocolo" + protocolo;
 

}
}