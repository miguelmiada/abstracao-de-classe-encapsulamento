public class Main01 {
    public static void main(String[] args) {
         Cachorro c = new Cachorro("Spike\n");
         Gato g = new Gato("Pompom\n");
        
        c.comer(); // Comendo... (veio da herança)
        c.emitirSom();

    
        g.comer();
        g.emitirSom();
    }
}