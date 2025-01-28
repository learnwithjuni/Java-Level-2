import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        game.printBoard();
        boolean gameEnded = false;

        while (!gameEnded) {
            System.out
                    .println("Player " + game.getCurrentPlayer() + ", enter your move (row [1-3] and column [1-3]): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (game.placeMark(row, col)) {
                game.printBoard();
                if (game.checkForWin()) {
                    System.out.println("Player " + game.getCurrentPlayer() + " wins!");
                    gameEnded = true;
                } else if (game.isBoardFull()) {
                    System.out.println("The game is a tie!");
                    gameEnded = true;
                } else {
                    game.changePlayer();
                }
            } else {
                System.out.println("This move is not valid");
            }
        }

    }
}
