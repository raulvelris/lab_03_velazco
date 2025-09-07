package ejercicio02;

public class PCWarrior extends Character {
    public PCWarrior() {
        this.name = "Guerrero PC";
    }

    @Override
    public void attack() {
        System.out.println("Guerrero PC ataca con efectos en HD");
    }
}
