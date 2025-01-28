import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    public static void savePasswords(ArrayList<PasswordEntry> entries, String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(entries);
        }
    }

    public static ArrayList<PasswordEntry> loadPasswords(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (ArrayList<PasswordEntry>) ois.readObject();
        }
    }
}
