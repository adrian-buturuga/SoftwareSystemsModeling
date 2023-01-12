package proxy.db;

public interface DatabaseConnection {

    void connect();

    String getConnectionDetails();
}
