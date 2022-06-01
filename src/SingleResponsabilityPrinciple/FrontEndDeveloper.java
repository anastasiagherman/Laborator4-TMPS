package SingleResponsabilityPrinciple;

public class FrontEndDeveloper {
    private String name;
    private double salary;
    private double penalties;
    private double bonus;

    public FrontEndDeveloper(String name, double salary, double penalties, double bonus) {
        this.name = name;
        this.salary = salary;
        this.penalties = penalties;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getPenalties() {
        return penalties;
    }

    public double getBonus() {
        return bonus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPenalties(double penalties) {
        this.penalties = penalties;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "FrontEndDeveloper{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", penalties=" + penalties +
                ", bonus=" + bonus +
                '}';
    }
}
