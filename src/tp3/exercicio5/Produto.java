package tp3.exercicio5;

public class Produto {

    String nome;
    double preco;
    int quantidadeEmEstoque;

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
}