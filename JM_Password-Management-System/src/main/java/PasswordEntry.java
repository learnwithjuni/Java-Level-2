public class PasswordEntry {
    private String serviceName;
    private String username;
    private String password; // Store encrypted password
    private String notes;

    public PasswordEntry(String serviceName, String username, String password, String notes) {
        this.serviceName = serviceName;
        this.username = username;
        this.password = password; // You might want to encrypt this
        this.notes = notes;
    }

    // Overloaded constructor
    public PasswordEntry(String serviceName, String username, String password) {
        this(serviceName, username, password, "");
    }

    // Getters and setters
    public String getServiceName() { return serviceName; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getNotes() { return notes; }
}
