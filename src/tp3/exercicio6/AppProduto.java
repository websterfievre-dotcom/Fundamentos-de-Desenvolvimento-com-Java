package tp3.exercicio6;

public class AppProduto {

    public static void main(String[] args) {

        // O construtor define os valores iniciais
        Produto produto = new Produto("Arroz", 25.50, 40);

        produto.exibirInformacoes();

        // Podemos alterar depois usando setters
        produto.setPreco(27.50);
        produto.setQuantidadeEmEstoque(35);

        // E consultar usando getters
        System.out.println("Novo preço: R$ " + produto.getPreco());
        System.out.println("Nova quantidade: " + produto.getQuantidadeEmEstoque());
    }
}