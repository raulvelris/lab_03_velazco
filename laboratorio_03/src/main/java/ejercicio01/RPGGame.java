package ejercicio01;

public class RPGGame extends Game {

    public RPGGame(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Iniciando aventura mágica en RPG: " + name);
    }
}
