package ejercicio03;

public class GameSession {

    public void startSession() {
        GameConfig config = GameConfig.getInstance(); // acceso directo
        config.setMaxPlayers(50);

        System.out.println("Iniciando sesión...");
        System.out.println("Máximo jugadores: " + config.getMaxPlayers());
        System.out.println("Debug mode: " + config.isDebugMode());
    }
}
