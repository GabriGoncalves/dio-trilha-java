package Desafio2.iPhone;

public interface NavegadorWeb {
    void exibirPagina(String url);
    // System.out.println("A exibida é: " + url);

    public void atualizarPagina();

    public void adicionarNovaPagina(String urlNovaPagina);

}
