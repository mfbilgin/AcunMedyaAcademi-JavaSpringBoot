package Week_3.Pair;

public class Student extends User {
    private String studentNumber;


    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Student() {
        super();
    }

    public Student(int id, String name, String surname, String studentNumber) {
        super(id, name, surname);
        this.studentNumber = studentNumber;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                "} " + super.toString();
    }
}
