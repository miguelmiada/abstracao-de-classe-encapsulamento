public class Cachorro extends Animal {
    // herdou comer() da herança

    public Cachorro(String nome){
        super(nome);
    }


    @Override
    public void emitirSom() { // polimorfismo
        System.out.println( nome  +  "Au au");
    }
}