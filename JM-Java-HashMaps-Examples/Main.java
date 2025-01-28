import java.util.*;

class Main {
  public static void main(String[] args) {

    // create a HashMap where the keys are 1-100 and the values are the perfect squares
    HashMap<Integer, Integer> squares = new HashMap<Integer, Integer>();
    for (int i = 1; i <= 100; i++) {
      squares.put(i, i*i);
    }
    for (int key : squares.keySet()) {
      System.out.println(key + ": " + squares.get(key));
    }

    // create a HashMap where the keys are each letter of a word and the values are the number of times each word appears
    String word = "bumblebee";
    HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
    for (int i = 0; i < word.length(); i++) {
      Character letter = word.charAt(i);
      if (letters.get(letter) != null) {
        letters.put(letter, letters.get(letter)+1);
      } else {
        letters.put(letter, 1);
      }
    }
    System.out.println(letters);
  }
}