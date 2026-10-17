public class Main3 {

    public static void main(String[] args){

        // Criando um objeto da classe Produto
        Produto p1 = new Produto("Notebook", 3500.00, 10);


        Produto p2 = new Produto("Televisão", 2300.00, 5);

        Produto p3 = new Produto("Iphone", 13000.00, 20);
        

        // 2. Exibir dados iniciais

        System.out.println("PRODUTOS : ");
        System.out.println("----------------------------------");

        p1.exibirDados();

        System.out.println("----------------------------------");

        p2.exibirDados();

        System.out.println("----------------------------------");

        p3.exibirDados();


         // 3. Vender 3 unidades
        p1.vender(3);
        p2.vender(4);
        p3.vender(9);

        System.out.println("----------------------------------\n");
      


        // 4. Exibir de novo (estoque deve ser 7)
        System.out.println("VENDAS: ");
        System.out.println("------------ VENDA 1 ------------");
        p1.exibirDados();

         System.out.println("------------ VENDA 2 ------------");
        p2.exibirDados();

        System.out.println("------------ VENDA 3 -------------");
        p3.exibirDados();

         // 5. Usar getters direto

        System.out.println("-----------------------------------\n");

        System.out.println("ESTOQUES : ");
        System.out.println("-----------------------------------");
        System.out.println("Estoque atual: " + p1.getNome() + " | " + p1.getQuantidade());
        System.out.println("Estoque atual: " + p2.getNome() + " | " + p2.getQuantidade());
        System.out.println("Estoque atual: " + p3.getNome() + " | " + p3.getQuantidade());

    
    }
}
