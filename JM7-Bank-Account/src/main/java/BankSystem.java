import java.util.HashMap;

public class BankSystem {
    private HashMap<String, BankAccount> accounts;

    // Constructor to initialize the bank system
    public BankSystem() {
        accounts = new HashMap<>();
    }

    // Check if a username already exists
    public boolean usernameExists(String username)     {
        return accounts.containsKey(username);
    }

    // Register a new account with the given details
    public void register(String firstName, String lastName, String username, String password) {
        accounts.put(username, new BankAccount(firstName, lastName, username, password));
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
