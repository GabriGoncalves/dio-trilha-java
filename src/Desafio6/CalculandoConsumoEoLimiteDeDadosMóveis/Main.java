package Desafio6.CalculandoConsumoEoLimiteDeDadosMóveis;

import java.util.Scanner;

import static Desafio6.CalculandoConsumoEoLimiteDeDadosMóveis.ConsumoDeDadosMoveis.*;
import static Desafio6.CalculandoConsumoEoLimiteDeDadosMóveis.VerificacaoDeLimiteDeDadosMoveis.verificarLimiteDeDados;

public class Main {
    public static void main(String[] args) {

        // DESAFIO VERIFICANDO CONSUMO DE DADOS MENSAL :

        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de consumos semanais em MB
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] consumoSemanal = input.split(",");

        // Calculando o consumo total de dados móveis no mês
        int totalConsumo = calcularConsumoTotal(consumoSemanal);

        // Calculando a média semanal de consumo de dados móveis
        int mediaSemanal = calcularMediaSemanal(totalConsumo, consumoSemanal.length);

        // Identificando a semana de maior consumo
        int semanaDeMaiorConsumo = identificarSemanaDeMaiorConsumo(consumoSemanal);

        // Exibindo o consumo total de dados móveis no mês
        System.out.println("Total mensal: " + totalConsumo + " MB");

        // Exibindo a média semanal de consumo
        System.out.println("Media semanal: " + mediaSemanal + " MB");

        // Exibindo a semana de maior consumo
        System.out.println("Maior consumo: Semana " + semanaDeMaiorConsumo);



        // DESAFIO VERIFICANDO LIMITE DE DADOS:

        // Solicitando ao usuário o limite mensal de dados em GB
        double limiteGb = scanner.nextDouble();
        scanner.nextLine();  // Consumir a nova linha

        // Solicitando ao usuário o consumo total de dados em MB
        int consumoTotalMb = scanner.nextInt();

        // Verificando o limite de dados móveis
        verificarLimiteDeDados(limiteGb, consumoTotalMb);


        scanner.close();
    }
}