import java.util.HashMap;

public class PasswordManager {
    private HashMap<String, PasswordEntry> passwordMap = new HashMap<>();

    public void addPasswordEntry(PasswordEntry entry) {
        passwordMap.put(entry.getServiceName(), entry);
    }

    public PasswordEntry getPasswordEntry(String serviceName) {
        return passwordMap.get(serviceName);
    }

    public void removePasswordEntry(String serviceName) {
        passwordMap.remove(serviceName);
    }

    // Additional methods for updating passwords, saving/loading from file, etc.
}
