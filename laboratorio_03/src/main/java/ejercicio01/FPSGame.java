package ejercicio01;

public class FPSGame extends Game {

    public FPSGame(String name) {
        super(name); // llama al constructor de Game con el nombre
    }

    @Override
    public void start() {
        System.out.println("Iniciando aventura épica en FPS: " + name);
    }
}
