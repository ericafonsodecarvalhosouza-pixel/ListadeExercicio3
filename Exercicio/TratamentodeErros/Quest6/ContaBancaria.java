package Exercicio.TratamentodeErros.Quest6;

public class ContaBancaria {

    private String nome;
    private double saldo;
    private String numeroDaConta;

    public ContaBancaria(String nome, double saldo, String numeroDaConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double sacar(double valor){
        if (valor > this.saldo){
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        return this.saldo -= valor;
    }

    public double depositar(double valor){
        return this.saldo += valor;
    }
}
