package Exercicio.TratamentodeErros.Quest7;

public class Main {
    static void main(String[] args) {
        try {
            var conta = new Login();
            conta.validar("Erico", "1pobrezacc");

        }catch (LoginInvalidException ex){
            System.out.println(ex.getMessage());
        }
    }
}
