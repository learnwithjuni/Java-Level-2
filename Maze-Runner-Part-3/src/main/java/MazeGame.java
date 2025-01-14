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

    // game play loop
    public void runGame() {
        Scanner scanner = new Scanner(System.in);
        // start timer
        Timer timer = new Timer();
        timer.init();

        while (running) {
            // clear the console screen 
            System.out.print("\033[H\033[2J"); 
            // print maze and player location
            maze.print(player);
            // print the time left before getting input
            System.out.println("Time left: " + timer.getTime() + " seconds");

            // get input from the user 
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
            } if (timer.getTime() <= 0) {
                System.out.println("Time's up! You failed to reach the exit.");
                running = false;
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
