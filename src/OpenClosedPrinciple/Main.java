package OpenClosedPrinciple;

public class Main {
    public static void main(String[] args) {

        Calculator salary = new FrontEndSalary();
        salary.calculateSalary();
        System.out.println("The salary of a Front End developer is: " + salary.getSalary());
    }
}
