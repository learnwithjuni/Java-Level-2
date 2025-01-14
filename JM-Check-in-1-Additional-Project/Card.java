public class Card implements Comparable<Card> {
  // Instance variables
  public int rank;
  public int suit;

  // Constructor
  public Card(int r, int s) {
    rank = r;
    suit = s;
  }

  // Getters
  public int getRank() {
    return rank;
  }

  public int getSuit() {
    return suit;
  }

  // toString
  public String toString() {
    /* 
    // Optionally, add this set of conditional statements to change make the correct name appear instead of the numbers 1, 11, 12, and 13
    String output = "";
    if (rank == 1) {
      output = "Ace of ";
    } else if (rank == 11) {
      output = "Jack of ";
    } else if (rank == 12) {
      output = "Queen of ";
    } else if (rank == 13) {
      output = "King of ";
    } else {
      output = rank + " of ";
    }
    */

    String output = rank + " of ";
    if (suit == 1) {
      output += "clubs";
    } else if (suit == 2) {
      output += "diamonds";
    } else if (suit == 3) {
      output += "hearts";
    } else if (suit == 4) {
      output += "spades";
    }

    return output;
  }

  // compareTo
  public int compareTo(Card other) {
    if (getSuit() < other.getSuit()) {
      return -1;
    }
    else if (getSuit() > other.getSuit()) {
      return 1;
    }
    else {
      if (getRank() < other.getRank()) {
        return -1;
      }
      else if (getRank() > other.getRank()) {
        return 1;
      }
      else {
        return 0;
      }
    }
  }
}