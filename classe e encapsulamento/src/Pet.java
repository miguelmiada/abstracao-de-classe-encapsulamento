public class Pet {

    private final String name;
    private boolean clean; // informar se está limpo ou não

    public Pet(String name) { // construtor
        this.name = name;
        this.clean = false; // inicialmente o pet não está limpo
    }

    public String getName() { // retorna o nome do pet
        return name;
    }

    public boolean isClean() { // retorna se o pet está limpo ou não
        return clean;
    }

    public void setClenan(boolean clean) { // define se o pet está limpo ou não
        this.clean = clean;
    }
}