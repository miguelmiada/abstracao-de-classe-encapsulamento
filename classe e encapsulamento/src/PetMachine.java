public class PetMachine {

    private boolean clean; // está limpo ou não // criando propriedade para a máquina de pet
    private int water; // criando propriedade para a quantidade de água na máquina
    private int shampoo; // criando propriedade para a quantidade de shampoo na máquina
    private Pet pet; // maquina de pet

    public void takeAShower() { // função para dar banho no pet

        if (this.pet == null) { // verifica se o pet está presente na máquina
            System.out.println("Coloque o pet  na máquina para começar o banho");
            return;
        }

        this.water -= 10; // diminui a quantidade de água na máquina
        this.shampoo -= 2; // diminui a quantidade de shampoo na máquina
        pet.setClean (true);
        System.out.println("O pet " + pet.getName() + " está limpo!");
    }

    public void addWater() {

        if (water == 30) {
            System.out.println("A capacidade de água está no máximo");
            return;
        }

        water += 2;
    }

    public void addShampoo() {

        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo está no máximo");
            return;
        }

        shampoo += 2;
    }

    public int getWater() { // retorna a quantidade de água na máquina
        return water;
    }

    public int getShampoo() { // retorna a quantidade de shampoo na máquina
        return shampoo;
    }

    public boolean hasPet() { // verifica se há um pet na máquina
        return pet != null;
    }

    public void setPet(Pet pet) { // define o pet na máquina

        if (!this.clean) {
            System.out.println("A máquina não está limpa, limpe a máquina antes de colocar o pet");
            return;
        }

        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " já está na máquina neste momento");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        this.clean = this.pet.isClean(); // atualiza o estado da máquina de acordo com o estado do pet
        System.out.println("O pet" + this.pet.getName() + " está limpo");
        this.pet = null; // remove o pet da máquina
    }

    public void wash() {
        this.water -= 10; // diminui a quantidade de água na máquina
        this.shampoo -= 2; // diminui a quantidade de shampoo na máquina

        this.clean = true; // define a máquina como limpa
        System.out.println("A máquina está limpa");
    }
}