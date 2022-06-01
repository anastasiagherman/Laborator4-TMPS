package OpenClosedPrinciple;

public class FrontEndSalary implements Calculator {
    private double salary;

    @Override
    public void calculateSalary() {
        this.salary = 20000 ;

    }

    @Override
    public double getSalary() {
        return this.salary;

    }
}
