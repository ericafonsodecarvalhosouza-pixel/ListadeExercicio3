package Exercicio.TratamentodeErros.Quest5;

public class ExemploIdade {

    public void maiorDeIdade(int idade){
        if (idade < 18){
            throw new MenorDeIdadeException("Idade menor que a idaide minima permitida - Menor de idade.");
        }
        System.out.println("Maior de idade");
    }

}
