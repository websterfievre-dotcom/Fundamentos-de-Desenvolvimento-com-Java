package tp3.exercicio3;

public class Produto {

    String nome;
    double preco;
    int quantidadeEmEstoque;

    // Altera o preço do produto
    void alterarPreco(double novoPreco) {
        preco = novoPreco;
    }

    // Altera a quantidade disponível no estoque
    void alterarQuantidade(int novaQuantidade) {
        quantidadeEmEstoque = novaQuantidade;
    }

    // Exibe as informações atuais do produto
    void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }
}