package Creational.singleton;

class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;

    private DatabaseConnectionManager() {
    }

    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Database connected.");
    }
}
public class Singleton{
    public static void main(String[] args) {
        DatabaseConnectionManager manager = DatabaseConnectionManager.getInstance();
        manager.connect();
    }
}
