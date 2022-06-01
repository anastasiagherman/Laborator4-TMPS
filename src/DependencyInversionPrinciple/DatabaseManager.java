package DependencyInversionPrinciple;

public class DatabaseManager {
    private Database database;

    public DatabaseManager(Database database){
        this.database = database;
    }

    public void connect(){
        this.database.connect();
    }

    public void closeConnection(){
        this.database.closeConnection();
    }
}
