package ejercicio02;

public class MobileSword extends Weapon {
    public MobileSword() {
        this.name = "Espada Mobile";
    }

    @Override
    public void use() {
        System.out.println("Espada Mobile con gráficos simples");
    }
}
