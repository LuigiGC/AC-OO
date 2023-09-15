package transmissao;
public interface ITransmiteDados {

    // Métodos em interface são abstratos por padrão
    // Então não é preciso explicitar.
    void enviaJson();
    String recebeMensagem(String protocolo);
}
