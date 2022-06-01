package LiskovSSubstitutionPrinciple;

public class SQLLiteDatabase extends Database{
    @Override
    public void dbOperations() {
        System.out.println("performing SqlLite database operations");
    }
}
