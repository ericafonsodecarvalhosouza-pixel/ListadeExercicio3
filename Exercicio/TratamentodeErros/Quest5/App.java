package Exercicio.TratamentodeErros.Quest5;

public class App {
    static void main(String[] args) {
        var testeIdade = new ExemploIdade();
        try {
            testeIdade.maiorDeIdade(17);
        }catch (MenorDeIdadeException ex){
            System.out.println(ex.getMessage());
        }

    }
}
