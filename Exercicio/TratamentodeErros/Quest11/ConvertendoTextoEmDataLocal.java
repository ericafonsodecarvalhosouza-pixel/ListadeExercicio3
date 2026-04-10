package br.com.tratamentoexcecoes.questao11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class ConvertendoTextoEmDataLocal {
    public static void main(String[] args) {

        try {
            var sc = new Scanner(System.in);
            System.out.print("Digite uma data: dd/MM/yyyy ");
            String data = sc.nextLine();

            DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);

            LocalDate localDate = LocalDate.parse(data, formatar);

            System.out.println("Data Convertida: " + localDate);

        }catch (DateTimeParseException e){
            System.out.println("Data Impossivel,tente uma que seja posível, pls" + e.getMessage());
        }
    }
}
