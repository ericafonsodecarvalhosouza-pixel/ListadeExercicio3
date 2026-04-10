package Exercicio.TratamentodeErros.Quest10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FormatandoDatas {
    static void main(String[] args) {
        try {
            var scanner = new Scanner(System.in);
            System.out.println("Digite a data no formato (dd/MM/aaaa): ");
            String data = scanner.nextLine();

            SimpleDateFormat dataDia = new SimpleDateFormat("dd/MM/aaaa");
            dataDia.setLenient(false);
            Date dataFormatada = dataDia.parse(data);
            System.out.println("Data totalmente formatada: " + dataFormatada);

        } catch (ParseException e) {
            System.out.println("Data inválida. " + e.getMessage());

        }
    }
}
