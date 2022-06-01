package DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {

        DatabaseManager dbManager = new DatabaseManager(new SqlLiteDatabase());

        dbManager.connect();
        dbManager.closeConnection();

    }
}
