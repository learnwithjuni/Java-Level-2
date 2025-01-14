public class BankAccount {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private double balance;

    // Constructor to initialize a new bank account
    public BankAccount(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.balance = 0.0;
    }

    // Get the username associated with the account
    public String getUsername() {
        return username;
    }

    // Check if the provided password matches the account password
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    // Deposit a specified amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw a specified amount from the account
    public boolean withdraw(double amount) {

        if (amount <= this.balance) {
            balance -= amount;
            return true;
        }

        return false;

    }

    // Change the account password to a new password
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    // Get the current balance of the account
    public double getBalance() {
        return balance;
    }
}
