package ejercicio01;

public class RPGFactory extends GameFactory {
    @Override
    public Game MetodoFabrica(String name) {
        return new RPGGame(name);
    }
}
