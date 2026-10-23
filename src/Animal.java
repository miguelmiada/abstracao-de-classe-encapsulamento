public class Animal {

    protected String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void comer(){
        System.out.println("Comendo...");
    }

    public void emitirSom() {
        System.out.println("Som qualquer");
    }
}
