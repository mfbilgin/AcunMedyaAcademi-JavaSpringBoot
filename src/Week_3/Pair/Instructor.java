package Week_3.Pair;

public class Instructor extends User {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Instructor() {
        super();
    }

    public Instructor(int id, String name, String surname, double salary) {
        super(id, name, surname);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Instructor{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
