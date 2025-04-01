package Desafio3.BancoDigitalDIO;

public interface iConta {

    void Sacar(double valor);
    void  Depositar(double valor);
    void Transferir(Conta conta, double valor);
    void imprimirExtrato();

}
