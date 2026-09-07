package tp3.exercicio4;

public class AppProduto {

    public static void main(String[] args) {

        // Criando um objeto Produto
        Produto produto = new Produto();

        // Valores iniciais
        produto.nome = "Arroz";
        produto.preco = 20.00;
        produto.quantidadeEmEstoque = 50;

        // Alterando preço e quantidade
        produto.alterarPreco(25.00);
        produto.alterarQuantidade(40);

        // Exibindo as informações atualizadas
        produto.exibirInformacoes();
    }
}