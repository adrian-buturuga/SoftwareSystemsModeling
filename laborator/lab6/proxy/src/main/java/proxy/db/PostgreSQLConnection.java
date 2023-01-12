package proxy.db;

public class PostgreSQLConnection implements DatabaseConnection {

    private Connection connection;

    @Override
    public void connect() {
        System.out.println("Creating an expensive connection... ");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connected!");
        this.connection = new Connection();
    }

    @Override
    public String getConnectionDetails() {
        return this.connection.getConnectionDetails();
    }

}
