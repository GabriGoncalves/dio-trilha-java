package Desafio5.VerificarConexao;

public class VerificandoConexao {

    // Função para calcular a velocidade média de conexão de internet
    // TODO: Some todas as velocidades registradas e calcule a média
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;

        for (String velocidade : velocidades) {
            total += Integer.parseInt(velocidade.trim());
        }
        return (double) total / velocidades.length;
    }

    // Função para verificar queda de conexão da internet
    // TODO: Preencha a função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        for (String velocidade : velocidades) {
            int valor = Integer.parseInt(velocidade.trim()); // Remove espaços e converte

            if (valor == 0) {
                return "Queda de conexão detectada!";
            }
        }
        return "Sem quedas de conexão.";
    }

}