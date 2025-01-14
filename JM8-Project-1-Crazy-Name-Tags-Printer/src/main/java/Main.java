import java.io.FileWriter;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    String filePath = "output.txt";

    // Writing name with one letter on each line
    try (FileWriter writer = new FileWriter(filePath)) {
      // Write each letter of the name on a new line
      for (int i = 0; i < name.length(); i++) {
        writer.write(name.charAt(i) + "\n");
      }
      writer.write("\n"); // Separate different parts with a newline

      // Write every other letter of the name (skipping the second, fourth, etc.)
      for (int i = 0; i < name.length(); i += 2) {
        writer.write(name.charAt(i) + "\n");
      }
      writer.write("\n"); // Separate different parts with a newline

      // Write the name backwards
      for (int i = name.length() - 1; i >= 0; i--) {
        writer.write(name.charAt(i) + "\n");
      }
      System.out.println("File written successfully!");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
