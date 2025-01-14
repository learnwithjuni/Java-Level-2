import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Reading the entire file as a single string
    try {
      File myFile = new File("numbers.txt");
      Scanner myReader = new Scanner(myFile);
      String text = "";
      while (myReader.hasNextLine()) {
        text += myReader.nextLine() + "\n";
      }
      myReader.close();
      System.out.println(text);
    } catch (Exception e) {
      System.out.println("An error occurred.");
    }

    // Reading the file line by line into a list
    try {
      File myFile = new File("numbers.txt");
      Scanner myReader = new Scanner(myFile);
      ArrayList<String> lines = new ArrayList<>();
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        lines.add(data);
      }
      myReader.close();
      System.out.println(lines);

    } catch (Exception e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
