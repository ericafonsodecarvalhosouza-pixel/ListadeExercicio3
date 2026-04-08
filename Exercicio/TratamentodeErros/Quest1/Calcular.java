package Exercicio.TratamentodeErros.Quest1;

public class Calcular {

    public int dividirNumeros(int num1, int num2){
        try {
            return num1 / num2;

        }catch (Exception e){
            throw new NaoDeveriaDividirPorZeroException("Não pode dividir um numero por zero." + e.getMessage());
        }

    }
}
