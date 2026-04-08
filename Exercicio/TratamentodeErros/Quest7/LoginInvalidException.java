package Exercicio.TratamentodeErros.Quest7;

public class LoginInvalidException extends RuntimeException {
    public LoginInvalidException(String message) {
        super(message);
    }
}
