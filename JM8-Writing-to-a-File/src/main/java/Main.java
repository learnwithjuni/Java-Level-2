import java.io.FileWriter;
import java.io.File;

public class Main {
  public static void main(String[] args) {
    String filePath = "output.txt";

    try (FileWriter writer = new FileWriter(filePath)) {
      writer.write("Hello World!");

      // Solution for writing "This is line x", where x goes from 1 to 10.
      
      writer.write("\n");
       for (int i = 1; i < 11; i++){
          writer.write("This is line " + i + "\n");
        }
       

      System.out.println("File written successfully!");

    } catch (Exception e) {
      System.out.println(e);
    }

    // To delete a file:
    // File f = new File (filePath);
    // f.delete();
  }
}
