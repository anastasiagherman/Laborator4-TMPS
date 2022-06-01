package InterfaceSegregationPrinciple;

public class FrontEndDeveloper implements FrontEndTasks{

    @Override
    public void work() {
        System.out.println("Front end developer started working");

    }

    @Override
    public void frontDevelopment() {
        System.out.println("Front end developer ");
    }
}
