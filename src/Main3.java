public class Main3 {

    public static void main(String[] args){

        // Criando um objeto da classe Produto
        Produto p1 = new Produto("Notebook", 3500.00, 10);

        // 2. Exibir dados iniciais
        p1.exibirDados();

         // 3. Vender 3 unidades
        p1.vender(3);


        // 4. Exibir de novo (estoque deve ser 7)
        System.out.println("--- Após a venda ---");
        p1.exibirDados();

         // 5. Usar getters direto

        System.out.println("Estoque atual: " + p1.getQuantidade());
    }
}
