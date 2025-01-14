import java.util.HashMap;
import java.io.*;
import java.util.*;

public class BankSystem {
    private HashMap<String, BankAccount> accounts;

    // UPDATED
    // Constructor to initialize the bank system and load accounts from a file
    public BankSystem() {
        accounts = new HashMap<>();
        loadAccounts();
    }

    // ADDED
    // Load accounts from a file
    private void loadAccounts() {
        try (Scanner scanner = new Scanner(new File("accounts.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                BankAccount account = new BankAccount(line);
                accounts.put(account.getUsername(), account);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existing accounts found.");
        }
    }

    // ADDED
    // Save accounts to a file
    public void saveAccounts() {
        try (FileWriter writer = new FileWriter("accounts.txt", true)) {
            for (BankAccount account : accounts.values()) {
                writer.write(account.toFileString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving accounts.");
        }

    }

    // Check if a username already exists
    public boolean usernameExists(String username) {
        return accounts.containsKey(username);
    }

    // UPDATED
    // Register a new account with the given details
    public void register(String firstName, String lastName, String username, String password) {

        accounts.put(username, new BankAccount(firstName, lastName, username, password));
        saveAccounts(); // Save the updated accounts list to the file

    }

    // Login with the provided username and password
    public BankAccount login(String username, String password) {
        BankAccount account = accounts.get(username);
        if (account != null && account.checkPassword(password)) {
            return account; // Login successful
        } else {
            return null; // Login failed
        }
    }

}
