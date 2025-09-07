package ejercicio02;

public class Cliente {
    public static void main(String[] args) {
        
        // ---- FAMILIA PC ----
        GameElementFactory pcFactory = new PCFactory();
        Character pcWarrior = pcFactory.createWarrior();
        Weapon pcSword = pcFactory.createWeapon();

        System.out.println("=== Juego en PC ===");
        pcWarrior.attack();
        pcSword.use();

        // ---- FAMILIA MOBILE ----
        GameElementFactory mobileFactory = new MobileFactory();
        Character mobileWarrior = mobileFactory.createWarrior();
        Weapon mobileSword = mobileFactory.createWeapon();

        System.out.println("\n=== Juego en Mobile ===");
        mobileWarrior.attack();
        mobileSword.use();
    }
}
