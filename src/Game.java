import java.util.Scanner;

public class Game {
    private MessagePrinter messagePrinter;
    private Scanner scanner;
    private final static int SHOOTS = 10;

    private int counter;

    public Game(MessagePrinter messagePrinter, Scanner scanner) {
        this.messagePrinter = messagePrinter;
        this.scanner = scanner;
    }

    public void startGame() {
        messagePrinter.printStart();
    }

    public void start(Field field) {
        startGame();
        for (int i = 0; i < SHOOTS; i++) {
            messagePrinter.printCoordinates();
            int coordinates = scanner.nextInt();
            int row = coordinates / 10;
            int column = coordinates % 10;

            boolean result = field.checkCell(row, column);

            if (result) {
                messagePrinter.printWin();
                counter++;
            } else {
                messagePrinter.printLose();
            }
        }
        gameOver();
    }

    public void gameOver() {
        messagePrinter.printGameOver(counter);
    }
}
