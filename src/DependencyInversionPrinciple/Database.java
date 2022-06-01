package DependencyInversionPrinciple;

public interface Database {
    public void connect();
    public void closeConnection();
}
