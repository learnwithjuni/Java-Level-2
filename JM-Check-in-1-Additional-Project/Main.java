import java.util.*;

class Main {
  public static void main(String[] args) {
    // make empty deck
    Card[] deck = new Card[10];

    // fill deck with random cards
    for (int i = 0; i < deck.length; ++i) {
      int rank = (int)(Math.random()*13 + 1);
      int suit = (int)(Math.random()*4 + 1);
      deck[i] = new Card(rank, suit);
    }

    /*
    // An alternate way to select the cards so that there are no duplicates
    boolean[] used = new boolean[52];
    int numChosen = 0;
    while (numChosen < deck.length) {
      // Keep selecting a random index until you find one that has a value of false
      int card = (int)(Math.random()*52);
      while (used[card]) {
        card = (int)(Math.random()*52);
      }
      used[card] = true;

      // Each group of 13 in cards makes up a suit; you can use that fact to calculate the rank and suit
      int rank = (card % 13) + 1;
      int suit = (card / 13) + 1;
      deck[numChosen] = new Card(rank, suit);
      numChosen++;
    }
    */

    // Print the deck
    System.out.println("\nunsorted deck:");
    for (Card c : deck) {
      System.out.println(c);
    }

    // Sort the deck
    Arrays.sort(deck);

    // Print the deck again
    System.out.println("\nsorted deck:");
    for (Card c : deck) {
      System.out.println(c);
    }
  }
}