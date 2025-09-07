package ejercicio01;

public class FPSFactory extends GameFactory {
    @Override
    public Game MetodoFabrica(String name) {
        return new FPSGame(name);
    }
}
