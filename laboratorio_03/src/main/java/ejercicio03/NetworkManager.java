package ejercicio03;

public class NetworkManager {

    public void connect() {
        GameConfig config = GameConfig.getInstance(); // acceso directo
        config.setDebugMode(true);

        System.out.println("Conectando a: " + config.getDatabaseUrl());
        System.out.println("Debug mode: " + config.isDebugMode());
    }
}
