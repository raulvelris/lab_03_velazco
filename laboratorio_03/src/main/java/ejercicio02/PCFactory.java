package ejercicio02;

public class PCFactory implements GameElementFactory {
    @Override
    public Character createWarrior() {
        return new PCWarrior();
    }

    @Override
    public Weapon createWeapon() {
        return new PCSword();
    }
}
