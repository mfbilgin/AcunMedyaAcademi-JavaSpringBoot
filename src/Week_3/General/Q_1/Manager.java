package Week_3.General.Q_1;

public class Manager extends Employee {

    private int teamSize;

    public Manager() {
        super();
    }

    public Manager(int id, String name, double salary, String department, int teamSize) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public double CalculateBonus() {
        return getSalary() * 0.2;
    }
}
