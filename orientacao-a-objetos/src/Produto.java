public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void exibirInformacoes() {
        System.out.printf("Produto: %s" +
                "Preço: R$ %.2f" +
                "Quantidade em estoque: %d", nome, preco, quantidade);
    }
}
