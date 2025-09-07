package ejercicio01;

public class PuzzleGame extends Game {

    public PuzzleGame(String name) {
        super(name); // llama al constructor de Game con el nombre
    }

    @Override
    public void start() {
        System.out.println("Iniciando aventura épica en Puzzle: " + name);
    }
}
