package Exercicio.TratamentodeErros.Quest1;

public class NaoDeveriaDividirPorZeroException extends RuntimeException{

    public NaoDeveriaDividirPorZeroException(String msg){
        super(msg);
        //Essa mensagem é chamada da classe Runtime
    }
}
