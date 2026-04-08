package Exercicio.TratamentodeErros.Quest4;

public class ExemploArray {

    private int [] numeros = new int[] {5, 4, 2, 0};

    public int getValue(int position){
        try {
            return numeros[position];
        }catch (Exception e){
            throw new ArrayIndexOutOfBoundsException("Valor do índice para o Array está inválido.");
        }
    }
}
