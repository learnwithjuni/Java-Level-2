public class Player implements Comparable<Player> {
  private String name;
  private int points;
  private int rebounds;
  private int fouls;
  // set a static variable for the max fouls allowed in a game
  private static int max_fouls = 6;

  public Player(String n, int p, int r, int f) {
    name = n;
    points = p;
    rebounds = r;
    fouls = f;
  }

  public String getName() {
    return name;
  }
  
  public int getPoints() {
    return points;
  }

  public int getRebounds() {
    return rebounds;
  }

  public int getFouls() {
    return fouls;
  }

  public boolean isDisqualified() {
      return fouls >= max_fouls;
  }

  public String toString() {
    return name + "\nPoints: " + points + "\nRebounds: " + rebounds + "\nFouls: " + fouls;
  }

  // return -1 if current player has fewer combined points and rebounds
  public int compareTo(Player player2) {
    if ((points + rebounds) < (player2.getPoints() + player2.getRebounds())) {
      return -1;
    } else if ((points + rebounds) > (player2.getPoints() + player2.getRebounds())) {
      return 1;
    } else {
      return 0;
    }
  }
}