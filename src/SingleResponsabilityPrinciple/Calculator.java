package SingleResponsabilityPrinciple;

public class Calculator {

    public double calculateSalary(FrontEndDeveloper employee){
        double netSalary = 0;
        netSalary = employee.getSalary() - employee.getPenalties()+ employee.getBonus();
        return netSalary;
    }
}
