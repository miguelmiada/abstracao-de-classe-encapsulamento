public class Gato extends Animal {

    public Gato(String nome){
        super(nome);
    }
    
    @Override
    public void emitirSom() { // polimorfismo
        System.out.println( nome  +  "Miau Miau");
    }

}
