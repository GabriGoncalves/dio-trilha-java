package Desafio3.BancoDigitalDIO;

public class main {
    public static void main(String[] args) {

        Cliente clienteGabriel = new Cliente("Gabriel");

        Conta cc = new ContaCorrente(clienteGabriel);
        Conta cp = new ContaPoupanca(clienteGabriel);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.Depositar(1000);
        cc.Transferir(cp, 500);

        cp.imprimirExtrato();
        cc.imprimirExtrato();

        cp.Sacar(257);

        cp.imprimirExtrato();

    }
}
