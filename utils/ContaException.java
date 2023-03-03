package utils;

public class ContaException extends Exception{
    private String mensagem;
    //Regra para o saque - preciso ter saldo
    public ContaException(int codigoErro){
        switch (codigoErro){
            case 1:
                mensagem = "Sem saldo para o saque";
                break;
            default:
                mensagem = "Aconteceu um erro inesperado, código: "+codigoErro;
                break;
        }
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}
