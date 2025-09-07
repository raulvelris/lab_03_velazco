package ejercicio02;

public class PCSword extends Weapon {
    public PCSword() {
        this.name = "Espada PC";
    }

    @Override
    public void use() {
        System.out.println("Espada PC con gráficos detallados");
    }
}
