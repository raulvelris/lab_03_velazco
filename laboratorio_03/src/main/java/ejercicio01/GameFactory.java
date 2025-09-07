package ejercicio01;

public abstract class GameFactory {
    public GameFactory() {
    }

    public abstract Game MetodoFabrica(String name);

    public static Game createGame(String name, String tipo) {
        Game game = null;
        if ("FPS".equals(tipo)) {
            game = new FPSFactory().MetodoFabrica(name);
        }
        if ("RPG".equals(tipo)) {
            game = new RPGFactory().MetodoFabrica(name);
        }
        return game;
    }
}
