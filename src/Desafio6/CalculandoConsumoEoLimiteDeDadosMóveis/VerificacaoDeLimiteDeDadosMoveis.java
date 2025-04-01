package Desafio6.CalculandoConsumoEoLimiteDeDadosMóveis;

import java.util.Scanner;

public class VerificacaoDeLimiteDeDadosMoveis {
    // Função para converter GB para MB
    public static int gbParaMb(double gb) {
        // TODO: Faça o calculo de conversão GB para MB, sabendo que 1 GB = 1024 MB

        double conversor = gb * 1024;

        return (int) conversor;
    }

    // Função principal para verificar o limite de dados móveis
    public static void verificarLimiteDeDados(double limiteGb, int consumoTotalMb) {
        // Convertendo o limite de GB para MB
        int limiteMb = gbParaMb(limiteGb);

        // TODO: Verifique se o consumo total excede o limite mensal em MB
        if (consumoTotalMb > limiteMb) {
            System.out.println("Limite de dados excedido. Compre ou renove seu pacote.");
        } else {
            int dadosDisponiveis = limiteMb - consumoTotalMb;
            System.out.println("Voce ainda possui " + dadosDisponiveis + " MB disponiveis.");
        }
    }
}