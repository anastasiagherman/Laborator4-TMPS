package DependencyInversionPrinciple;

public class MySqlDatabase implements Database{
    @Override
    public void connect() {
        System.out.println("Connect MySql database");
    }

    @Override
    public void closeConnection() {
        System.out.println("Close MySql database connection");
    }
}
