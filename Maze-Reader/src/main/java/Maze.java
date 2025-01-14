import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Maze {
    private char[][] grid;
    private int playerStartX;
    private int playerStartY;

    public Maze(String filePath) {
        grid = readMazeFromFile(filePath);
    }

    // read in maze from input file and return a 2D array of chars storing the board
    private char[][] readMazeFromFile(String filePath) {
        ArrayList<String> lines = new ArrayList<>();

        try {
            File myFile = new File(filePath);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                lines.add(myReader.nextLine());
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("Error, incorrect file name!");
        }

        // set up grid 
        int height = lines.size();
        int width = lines.get(0).length();
        char[][] tempGrid = new char[height][width];

        for (int y = 0; y < height; y++) {
            String line = lines.get(y);
            for (int x = 0; x < width; x++) {
                char currentChar = line.charAt(x);
                tempGrid[y][x] = currentChar;

                if (currentChar == 'P') {
                    playerStartX = x;
                    playerStartY = y;
                }
            }
        }

        return tempGrid;
    }

    // print out the 2D grid as a square
    public void print() {
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                System.out.print(grid[y][x]);
            } 
            System.out.println();
        }
    }

    // check character at the given row and col represents a valid move 
    // a valid move cannot go past the edge of the board and cannot be a '#'
    public boolean isValidMove(int x, int y) {
        if (x >= 0 && x < grid[0].length && y >= 0 && y < grid.length && grid[y][x] != '#'){
            return true;
        } else {
            return false;
        }
    }

    // check for exit character
    public boolean isExit(int x, int y) {
        return grid[y][x] == 'E';
    }

    public int getPlayerStartX() {
        return playerStartX;
    }

    public int getPlayerStartY() {
        return playerStartY;
    }
}
