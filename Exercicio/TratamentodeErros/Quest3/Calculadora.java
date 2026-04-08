package Exercicio.TratamentodeErros.Quest3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    static void main(String[] args) {

        try{
            var sc = new Scanner(System.in);

            System.out.print("Digite o primeiro numero: ");
            var num1 = sc.nextInt();
            System.out.print("Digite o segundo numero: ");
            var num2 = sc.next();
            var resultado = Integer.parseInt(num2);




            System.out.println("Digite a operação: ");
            System.out.println(" + , - , * , / ");
            var operacao = sc.next();


            switch (operacao){

                case "+" -> System.out.println(num1 + resultado);
                case "-" -> System.out.println(num1 - resultado);
                case "*" -> System.out.println(num1 * resultado);
                case "/" -> System.out.println(num1 / resultado);


            }
        }catch (NumberFormatException ex){
            System.out.println("Valor digitado inválido.");
        }catch (ArithmeticException ex){
            System.out.println("Numero não pode ser dividido por 0.");
        }catch (NullPointerException ex){
            System.out.println(ex.getCause());
        }catch (InputMismatchException ex){
            System.out.println("O número não é inteiro. " + ex.getMessage());
        }

        finally {
            System.out.println("Operação Finalizada.");
        }




    }


}
