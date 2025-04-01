package Desafio_iPhone;

public class Usuario_iPhone {
    public static void main(String[] args) {
        iPhone iphoneX = new iPhone();

        // Métodos do Telefone :
        iphoneX.atender();
        iphoneX.correioDeVoz();
        iphoneX.ligar("912345678");

        // Métodos de Navegar Web :
        iphoneX.adicionarNovaPagina("www.novaPaginaNoIphone");
        iphoneX.exibirPagina("wwww.aPaginaSeráExibida");
        iphoneX.atualizarPagina();

        // Métodos de Reproduzir Música :
        iphoneX.tocar("Tatatata...");
        iphoneX.selecionarMusica("Turururu");
        iphoneX.pausar();

    }
}
