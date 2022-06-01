package LiskovSSubstitutionPrinciple;

public class PostgresqlDatabase extends Database{
    @Override
    public void dbOperations() {
        System.out.println("Performing PostgreSql database operations ");
    }
}
