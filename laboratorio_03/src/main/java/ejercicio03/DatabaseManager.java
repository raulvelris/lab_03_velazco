package ejercicio03;

public class DatabaseManager {

    public void saveData() {
        GameConfig config = GameConfig.getInstance(); // acceso directo
        config.setDatabaseUrl("jdbc:mysql://production:3306/gamedb");

        System.out.println("Guardando en: " + config.getDatabaseUrl());
        System.out.println("Máximo jugadores permitidos: " + config.getMaxPlayers());
    }
}
