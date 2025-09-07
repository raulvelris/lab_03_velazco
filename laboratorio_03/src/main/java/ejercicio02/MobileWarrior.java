package ejercicio02;

public class MobileWarrior extends Character {
    public MobileWarrior() {
        this.name = "Guerrero Mobile";
    }

    @Override
    public void attack() {
        System.out.println("Guerrero Mobile ataca con efectos básicos");
    }
}
