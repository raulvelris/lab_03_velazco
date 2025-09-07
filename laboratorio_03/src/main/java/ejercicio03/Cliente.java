package ejercicio03;

public class Cliente {

    public static void main(String[] args) {
        // TODO code application logic here
        GameSession session = new GameSession();
        System.out.println("config1: " + GameConfig.getInstance().hashCode());
        NetworkManager network = new NetworkManager();
        System.out.println("config1: " + GameConfig.getInstance().hashCode());
        DatabaseManager database = new DatabaseManager();
        System.out.println("config1: " + GameConfig.getInstance().hashCode());

        session.startSession();    // maxPlayers = 50, debug = false
        network.connect();         // debug = true (inconsistente!)
        database.saveData();       // databaseUrl diferente (inconsistente!)

    }

}
