import java.io.File;
import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {

    Map<String, String> data = new HashMap<>();

    try {
      File myFile = new File("input.txt");
      Scanner myReader = new Scanner(myFile);
      String key = null;
      boolean isKey = true;

      while (myReader.hasNextLine()) {
        String line = myReader.nextLine();
        if (isKey) {
          key = line;
          isKey = false;
        } else {
          data.put(key, line);
          isKey = true;
        }
      }
      myReader.close();
    } catch (Exception e) {
      System.out.println(e);
    }

    // Print the map to verify the content
    for (String word : data.keySet()) {
      System.out.println("Key: " + word + ", Value: " + data.get(word));
    }
  }
}
