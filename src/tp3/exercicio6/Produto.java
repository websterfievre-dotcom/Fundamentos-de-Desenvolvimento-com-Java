package tp3.exercicio6;

public class Produto {

    String nome;
    double preco;
    int quantidadeEmEstoque;

    // Construtor
    Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Getters
    String getNome() {
        return nome;
    }

    double getPreco() {
        return preco;
    }

    int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Setters
    void setNome(String novoNome) {
        nome = novoNome;
    }

    void setPreco(double novoPreco) {
        preco = novoPreco;
    }

    void setQuantidadeEmEstoque(int novaQuantidade) {
        quantidadeEmEstoque = novaQuantidade;
    }

    // Exibir informações
    void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }
}