import java.util.Scanner;

public class MazeGame {
    private Maze maze;
    private Player player;
    private boolean running;

    public MazeGame(String mazeFilePath) {
        maze = new Maze(mazeFilePath);
        player = new Player(maze.getPlayerStartX(), maze.getPlayerStartY());
        running = true;
    }

    public void runGame() {
        Scanner scanner = new Scanner(System.in);

        // game play loop
        while (running) {
            // clear the console screen 
            System.out.print("\033[H\033[2J"); 
            // print maze and player location
            maze.print(player);

            // get move from the user 
            System.out.print("Enter your move (WASD): ");
            char move = scanner.next().toUpperCase().charAt(0);

            // check if move is valid and execute 
            if (isValidMove(move)) {
                performMove(move);

                if (maze.isExit(player.getX(), player.getY())) {
                    maze.print(player);
                    System.out.println("Congratulations! You've reached the exit!");
                    running = false;
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    // check if the next move at the given direction will be valid
    private boolean isValidMove(char direction) {
        if (direction == 'W') {
            return maze.isValidMove(player.getX(), player.getY() - 1);
        } else if (direction == 'A') {
            return maze.isValidMove(player.getX() - 1, player.getY());
        } else if (direction == 'S') {
            return maze.isValidMove(player.getX(), player.getY() + 1);
        } else if (direction == 'D') {
            return maze.isValidMove(player.getX() + 1, player.getY());
        }
        return false;
    }

    // execute the next move 
    private void performMove(char direction) {
        if (direction == 'W') {
            player.move(player.getX(), player.getY() - 1);
        } else if (direction == 'A') {
            player.move(player.getX() - 1, player.getY());
        } else if (direction == 'S') {
            player.move(player.getX(), player.getY() + 1);
        } else if (direction == 'D') {
            player.move(player.getX() + 1, player.getY());
        }
    }
    }
