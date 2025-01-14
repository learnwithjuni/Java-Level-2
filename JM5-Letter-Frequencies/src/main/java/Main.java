import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nType in a sentence: ");
    String sentence = scanner.nextLine();


    Map<Character, Integer> frequencies = new HashMap<>();

    //fill the map
    for(int i = 0; i < sentence.length(); i++){
      char letter = sentence.charAt(i);
      letter = Character.toLowerCase(letter);
      if(letter != ' '){
        int frequency = 1;
        if(frequencies.containsKey(letter)){
          frequency += frequencies.get(letter);
        }
        frequencies.put(letter, frequency);
      }
    }

    
    
    //alternative 1 fill the map
    //getOrDefault
    /*
    for(int i = 0; i < sentence.length(); i++){
      char letter = sentence.charAt(i);
      letter = Character.toLowerCase(letter);
      if(letter != ' '){
        frequencies.put(letter,frequencies.getOrDefault(letter,0)+1);
      }
    }
    */

    
    //alternative 2 fill the map
    //putIfAbsent
    /*
    for(int i = 0; i < sentence.length(); i++){
      char letter = sentence.charAt(i);
      letter = Character.toLowerCase(letter);
      if(letter != ' '){
        frequencies.putIfAbsent(letter,0);
        frequencies.put(letter,frequencies.get(letter)+1);
      }
    }
    */
    


    //print all the letters
    System.out.println("\nLetters: ");
    for(char letter : frequencies.keySet()){
      System.out.print(letter + ": ");
      System.out.print(frequencies.get(letter)+ "\n");
    }

    //find the maximum letter
    char maximumLetter = frequencies.keySet().iterator().next();
    for(char letter : frequencies.keySet()){
      if(frequencies.get(letter) > frequencies.get(maximumLetter)){
        maximumLetter = letter;
      }
    }
    System.out.print("\nThe most frequent letter is: " + maximumLetter + "\nWhich appears a whopping " + frequencies.get(maximumLetter) + " times!");
  }
}