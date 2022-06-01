package InterfaceSegregationPrinciple;

public class Tester implements TestingTasks{
    @Override
    public void work() {
        System.out.println("Tester is working");
    }

    @Override
    public void testTasks() {
        System.out.println("Tester is testing new functionalities");
    }
}
