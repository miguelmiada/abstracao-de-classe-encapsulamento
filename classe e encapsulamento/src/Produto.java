public class Produto {

    // 1. ATRIBUTOS: informações que o produto guarda
    private String nome;
    private double preco;
    private int quantidade;

    // 2. CONSTRUTOR: inicializa o produto quando usamos new
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // 3. GETTER: devolve o nome do produto
    public String getNome() {
        return nome;
    }

    // 4. GETTER: devolve o preço do produto
    public double getPreco() {
        return preco;
    }

    // 5. GETTER: devolve a quantidade em estoque
    public int getQuantidade() {
        return quantidade;
    }

    // 6. MÉTODO: vende uma quantidade de produtos
    public void vender(int quantidade) {

        // Não permite quantidade zero ou negativa
        if (quantidade <= 0) {
            return;
        }

        // Não permite vender mais do que existe no estoque
        if (quantidade > this.quantidade) {
            return;
        }

        // Diminui o estoque pela quantidade vendida
        this.quantidade -= quantidade;
    }

    // 7. MÉTODO: exibe as informações do produto
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
    }
}