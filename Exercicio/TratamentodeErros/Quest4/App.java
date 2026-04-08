package Exercicio.TratamentodeErros.Quest4;

public class App {
    static void main(String[] args) {
        try{
            var exemploArray = new ExemploArray();
            System.out.println(exemploArray.getValue(5));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inválida. ");
            System.out.println(e.getMessage());
        }


    }



}
