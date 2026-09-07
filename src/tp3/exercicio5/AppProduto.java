package tp3.exercicio5;

public class AppProduto {

    public static void main(String[] args) {

        Produto produto = new Produto();

        // Usando os setters
        produto.setNome("Leite");
        produto.setPreco(3.75);
        produto.setQuantidadeEmEstoque(20);

        // Usando os getters
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em estoque: "
                + produto.getQuantidadeEmEstoque());
    }
}