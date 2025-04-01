package Desafio3.BancoDigitalDIO;

public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 001;
    private int agencia;
    protected int conta;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    @Override
    public void Sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Seu saldo atual é de : " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void Depositar(double valor) {
        saldo += valor;
        System.out.println("Seu saldo atual é de : " + saldo);
    }

    @Override
    public void Transferir(Conta contaDestino, double valor) {
        this.Sacar(valor);
        contaDestino.Depositar(valor);
    }

    protected void imprimindoInfoConta() {
        System.out.println("Titular : " + this.cliente.getNome());
        System.out.println("Agência : " + getAgencia());
        System.out.println("Conta : " + getConta());
        System.out.println("Saldo : " + getSaldo());
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
