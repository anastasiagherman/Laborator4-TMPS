package OpenClosedPrinciple;

public class BackEndSalary implements Calculator{
    private double salary;
    @Override
    public void calculateSalary() {
        this.salary = 30000;
    }

    @Override
    public double getSalary() {

        return this.salary;
    }
}
