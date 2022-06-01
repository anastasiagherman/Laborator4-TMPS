package DependencyInversionPrinciple;

public class SqlLiteDatabase implements Database{

    @Override
    public void connect() {
        System.out.println("Connecting SqlLite database");
    }

    @Override
    public void closeConnection() {
        System.out.println("Close SqlLite database connection");
    }
}
