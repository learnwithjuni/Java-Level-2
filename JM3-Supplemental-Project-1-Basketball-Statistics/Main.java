import java.util.*;

class Main {
  public static void main(String[] args) {
    // create four instances of player class 
    Player p1 = new Player("LeBron James", 61, 20, 3);
    Player p2 = new Player("Michael Jordan", 69, 18, 4);
    Player p3 = new Player("Steph Curry", 62, 14, 6);
    Player p4 = new Player("Shaquille O'Neal", 61, 28, 2);

    // create "team" array of 4 players 
    Player[] team = new Player[4];
    team[0] = p1;
    team[1] = p2;
    team[2] = p3;
    team[3] = p4;

    // sort array by player's stats
    Arrays.sort(team);

    System.out.println("Here are the top performers in our game: \n");
    // print each player in sorted order
    for (Player player : team) {
      System.out.println(player);
      // check if player is disqualified
      if (player.isDisqualified()) {
        System.out.println(player.getName() + " is disqualified! They have " + player.getFouls() +" fouls.");
      } 
      System.out.println();
    }
  }
}