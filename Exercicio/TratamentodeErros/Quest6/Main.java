package Exercicio.TratamentodeErros.Quest6;

public class Main {
    static void main(String[] args) {
        var conta = new ContaBancaria("Eric", 2000, "2001-00");

        try {
            conta.depositar(20);
            System.out.println(conta.getSaldo());
            conta.sacar(10);
            System.out.println(conta.getSaldo());
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }

    }
}
