package SingleResponsabilityPrinciple;

public class Main {
    public static void main(String[] args) {
        FrontEndDeveloper employee = new FrontEndDeveloper("Popescu Mihai", 10000, 200, 4000 );
        Calculator salaryCalculator = new Calculator();
        System.out.println(employee.getName() + " salary is: " + salaryCalculator.calculateSalary(employee));
    }
}
