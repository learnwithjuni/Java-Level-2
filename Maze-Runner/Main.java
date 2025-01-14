import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    System.out.println("How wide is your maze?");
    int width = Integer.parseInt(console.nextLine());

    System.out.println("How tall is your maze?");
    int height = Integer.parseInt(console.nextLine());

    System.out.println("Please enter your maze. Use '*' for the walls, ' ' for open space, 'I' for your input, and 'O' for your output. There should be only one correct path, and no dead ends!");
    char[][] maze = new char[height][width];
    for(int i=0; i< height; i++) {
      String line = console.nextLine();
      for(int j=0; j< width; j++) {
        maze[i][j] = line.charAt(j);
      }
    }
    //printMaze(maze, height, width);
    System.out.println("Solution: "+solveMaze(maze,height,width));

  }

  public static void printMaze(char[][] maze, int height, int width) {
    for(int i=0; i<height; i++) {
      for(int j=0; j<width; j++) {
        System.out.print(maze[i][j]);
      }
      System.out.println();
    }
  }

  public static String solveMaze(char[][] maze, int height, int width) {
    // Find the start!
    int startX = -1;
    int startY = -1;
    for(int i=0; i<height; i++) {
      for(int j=0; j<width; j++) {
        if (maze[i][j] == 'I') {
          startX = j;
          startY = i;
        }
      }
    }

    if (startX < 0 || startY < 0){
      System.out.println("No start found!");
      return "no solution.";
    }

    int currentX = startX;
    int currentY = startY;
    String path = "";
    while (maze[currentY][currentX] != 'O') {
      if (currentY+1 < height && maze[currentY+1][currentX] != '*'){
        currentY = currentY+1;
        path += 'D';
      }else if (currentX+1 < width && maze[currentY][currentX+1] != '*'){
        currentX = currentX+1;
        path += 'R';
      }else if (currentX-1 >= 0 && maze[currentY][currentX-1] != '*'){
        currentX = currentX-1;
        path += 'L';
      }else if (currentY-1 >= 0 && maze[currentY-1][currentX] != '*'){
        currentY = currentY-1;
        path += 'U';
      }else{
        return "no solution";
      }
    }
    return path;

  }
}