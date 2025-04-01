package Desafio3_BancoDigitalDIO;


public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Imprimindo Extrato Conta Corrente ***");
        imprimindoInfoConta();
    }

}
