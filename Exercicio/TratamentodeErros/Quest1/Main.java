package Exercicio.TratamentodeErros.Quest1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        var c = new Calcular();
        try {
            System.out.println(c.dividirNumeros(10, 0)); //Codigo a ser executado para evitar que o erro derrube o
//                                                         //todo o sistema

        }catch (NaoDeveriaDividirPorZeroException e) {
            System.out.println(e.getMessage());
            //Aqui exibe o erro e mostra uma mensagem para que o codigo nao pare.
        }
        System.out.println("Deveria continuar....................................");
        //Aqui para o caso do codigo nao dar erro
    }
}
