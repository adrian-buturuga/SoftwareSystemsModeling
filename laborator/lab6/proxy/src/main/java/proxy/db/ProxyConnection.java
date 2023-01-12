package proxy.db;

public class ProxyConnection implements DatabaseConnection {

    private DatabaseConnection databaseConnection;

    public ProxyConnection(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    @Override
    public void connect() {
        System.out.println("Do nothing. Take approach of lazy initialization");
    }

    @Override
    public String getConnectionDetails() {
        databaseConnection.connect();
        return databaseConnection.getConnectionDetails();
    }
}
