
package ejercicio02;

public abstract class Weapon {

    protected String name;
    protected String platform;

    public abstract void use();

    public String getInfo() {
        return "Arma: " + name + " | Plataforma: " + platform;
    }
}
