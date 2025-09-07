package ejercicio01;

public abstract class Game {
    protected String name;
    
    public Game(String name) {
        this.name = name;
    }

    public abstract void start();

    public String getInfo() {
        return "Juego: " + name;
    }
}