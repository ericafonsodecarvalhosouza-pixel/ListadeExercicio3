package Exercicio.TratamentodeErros.Quest8;

import java.util.Scanner;

public class ConvertendoStringParaInteiro {
    static void main(String[] args) {
        var scanner = new Scanner(System.in);

        try{
            System.out.println("Digite um número em texto para ser convertido para inteiro: ");
            String texto = scanner.nextLine();
            var num = Integer.parseInt(texto);
            System.out.println("Texto convertido para inteiro: " + num);
        }catch (NumberFormatException e){
            System.out.println("Valor inválido. " + e.getMessage());
        }

    }
}
