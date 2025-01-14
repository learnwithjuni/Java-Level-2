import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BankSystem bankSystem = new BankSystem();
    BankAccount loggedInAccount = null;

    while (true) {
      if (loggedInAccount == null) {
        // Display options for registration, login, or exit
        System.out.println("\n1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
          // Register a new user
          System.out.print("Enter first name: ");
          String firstName = scanner.nextLine();
          System.out.print("Enter last name: ");
          String lastName = scanner.nextLine();
          System.out.print("Enter username: ");
          String username = scanner.nextLine();
          System.out.print("Enter password: ");
          String password = scanner.nextLine();

          if (bankSystem.usernameExists(username) == false) {
            bankSystem.register(firstName, lastName, username, password);
            System.out.println("Registration successful.");
          } else {
            System.out.println("Username already exists.");
          }
        } else if (choice == 2) {
          // Login an existing user
          System.out.print("Enter username: ");
          String username = scanner.nextLine();
          System.out.print("Enter password: ");
          String password = scanner.nextLine();
          loggedInAccount = bankSystem.login(username, password);
          if (loggedInAccount != null) {
            System.out.println("Login successful.");
          } else {
            System.out.println("Invalid username or password.");
          }
        } else if (choice == 3) {
          // Exit the application
          System.out.println("Exiting...");
          break;
        } else {
          System.out.println("Invalid choice. Please try again.");
        }
      } else {
        // Display options for logged-in users
        System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Change Password");
        System.out.println("4. Logout");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
          // Deposit money into the account
          System.out.print("Enter amount to deposit: ");
          double amount = scanner.nextDouble();
          loggedInAccount.deposit(amount);
          System.out.println("Deposit successful. Current balance: " + loggedInAccount.getBalance());
        } else if (choice == 2) {
          // Withdraw money from the account
          System.out.print("Enter amount to withdraw: ");
          double amount = scanner.nextDouble();
          //if (amount > 0 && amount <= loggedInAccount.getBalance()) {
          if (loggedInAccount.withdraw(amount)){
            System.out.println("Withdrawal successful. Current balance: " + loggedInAccount.getBalance());
          } else {
            System.out.println("Insufficient balance.");
          }
        } else if (choice == 3) {
          // Change the account password
          System.out.print("Enter new password: ");
          String newPassword = scanner.nextLine();
          loggedInAccount.changePassword(newPassword);
          System.out.println("Password changed successfully.");
        } else if (choice == 4) {
          // Logout the current user
          loggedInAccount = null;
          System.out.println("Logged out successfully.");
        } else {
          System.out.println("Invalid choice. Please try again.");
        }
      }
    }

  }
}
