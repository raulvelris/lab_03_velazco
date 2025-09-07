package ejercicio01;

public class Cliente {
    public static void main(String[] args) {
        Game game1 = GameFactory.createGame("AAA", "RPG");
        System.out.println(game1.getInfo());
        game1.start();
        Game game2 = GameFactory.createGame("BBB", "FPS");
        System.out.println(game2.getInfo());
        game2.start();
    }
}
