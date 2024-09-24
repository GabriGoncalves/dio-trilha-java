package Desafio_ContaTerminal;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner escreva = new Scanner(System.in);

        int agencia;
        int conta;
        String nome;
        String sobrenome;
        BigDecimal saldo;

        System.out.println("Olá, você está acessando nosso sistema para acessar sua conta");

        System.out.println("Por favor, nos diga seu nome e sobrenome: ");
        nome = escreva.next();
        sobrenome = escreva.next();

        System.out.println("Digite sua conta: ");
        conta = escreva.nextInt();

        System.out.println("Digite sua agencia: ");
        agencia = escreva.nextInt();

        System.out.println("Quanto você irá depositar na sua conta: ");
        saldo = escreva.nextBigDecimal();

        System.out.println("Obrigado pelas informações, conta acessada com Sucesso");
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Conta: " + conta + "\n" + "Agencia: " + agencia);
        System.out.println("Saldo: R$ " + saldo);

    }
}
