package Desafio5_VerificarConexao;

import java.util.Scanner;

public class Main extends VerificandoConexao{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        System.out.println("Informe a velocidade de conexão a cada hora: (Período de 6 horas,5 separados por ',').");
        String entrada = scan.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = entrada.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");


        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        System.out.println("Informe a velocidade de conexão a cada hora: (Período de 6 horas, separados por ',')");
        String input = scan.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidade = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidade);

        // Exibindo o resultado da verificação
        System.out.println(resultado);


        scan.close();
    }
}
