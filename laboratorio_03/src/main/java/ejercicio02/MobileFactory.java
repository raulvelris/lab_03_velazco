package ejercicio02;

public class MobileFactory implements GameElementFactory {
    @Override
    public Character createWarrior() {
        return new MobileWarrior();
    }

    @Override
    public Weapon createWeapon() {
        return new MobileSword();
    }
}
