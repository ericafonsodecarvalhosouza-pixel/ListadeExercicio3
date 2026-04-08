package Exercicio.TratamentodeErros.Quest2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite um número que será convertido: ");
        var numero = scanner.nextLine();
        try{
            int resultado = Integer.parseInt(numero);
            System.out.println("Numero" + resultado);
        }catch (NumberFormatException e){
            System.out.println("Valor inválido. " + e.getMessage());
        }
    }

}
