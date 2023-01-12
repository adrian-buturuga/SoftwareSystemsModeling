package proxy;

import proxy.db.DatabaseConnection;
import proxy.db.PostgreSQLConnection;
import proxy.db.ProxyConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Connect without proxy");
        DatabaseConnection dbConnection = new PostgreSQLConnection();
        dbConnection.connect();
        System.out.println(dbConnection.getConnectionDetails());

//        System.out.println("Connect using proxy");
//        DatabaseConnection proxyConnection = new ProxyConnection(new PostgreSQLConnection());
//        proxyConnection.connect();
//        System.out.println(proxyConnection.getConnectionDetails());
    }
}
