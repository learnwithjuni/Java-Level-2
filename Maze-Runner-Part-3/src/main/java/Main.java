public class Main {
    public static void main(String[] args) {
        // set up the specified maze
        // change arguement to "easy.txt" or "medium.txt" to view different mazes 
        MazeGame game = new MazeGame("hard.txt");
        game.runGame();
    }
}
