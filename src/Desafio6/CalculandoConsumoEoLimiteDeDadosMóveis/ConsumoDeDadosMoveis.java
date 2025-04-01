package Desafio6.CalculandoConsumoEoLimiteDeDadosMóveis;

public class ConsumoDeDadosMoveis {

    // Função para calcular o consumo total de dados móveis
    public static int calcularConsumoTotal(String[] consumoSemanal) {
        int total = 0;

        // TODO: Calcule o consumo total de dados móveis
        for(String consumo : consumoSemanal){
            total += Integer.parseInt(consumo);
        }

        return total;
    }

    // Função para calcular a média semanal de consumo de dados móveis
    public static int calcularMediaSemanal(int totalConsumo, int numeroDeSemanas) {

     //   int mediaSemanal = totalConsumo / numeroDeSemanas;

        return totalConsumo / numeroDeSemanas; // Calcule a média semanal de consumo de dados móveis
    }

    // Função para identificar a semana de maior consumo
    public static int identificarSemanaDeMaiorConsumo(String[] consumoSemanal) {
        int semanaDeMaiorConsumo = 0;
        int maiorConsumo =  Integer.MIN_VALUE;;

        // Função para identificar a semana de maior consumo
        for (int i = 0; i < consumoSemanal.length; i++) {
            int consumo = Integer.parseInt(consumoSemanal[i].trim());
            // TODO: Estabeleça Faça o cálculo para identificar a semana de maior consumo

            if (consumo > maiorConsumo) {
                maiorConsumo = consumo; // Atualiza o maior consumo encontrado
                semanaDeMaiorConsumo = i; // Armazena o índice da semana correspondente
            }

        }
        return semanaDeMaiorConsumo + 1;
    }
}
