package ejercicio01;

public class PuzzleFactory extends GameFactory {
    @Override
    public Game MetodoFabrica(String name) {
        return new RPGGame(name);
    }
}
