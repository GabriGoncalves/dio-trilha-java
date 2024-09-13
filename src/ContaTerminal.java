import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner escreva = new Scanner(System.in);

        int agencia;
        int conta;
        String nome;
        String sobrenome;
        double saldo;

        System.out.println("Olá, você está acessando nosso sistema para acessar sua conta");

        System.out.println("Por favor, nos diga seu nome: ");
        nome = escreva.next();
        sobrenome = escreva.next();

        System.out.println("Digite sua conta: ");
        conta = escreva.nextInt();

        System.out.println("Digite sua agencia: ");
        agencia = escreva.nextInt();

        System.out.println("Digite o saldo que havia na sua conta: ");
        saldo = escreva.nextDouble();

        System.out.println("Obrigado pelas informações, conta acessada com Sucesso");
        System.out.println("Nome: " + nome + sobrenome);
        System.out.println("Conta: " + conta + "\n" + "Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);

    }
}
