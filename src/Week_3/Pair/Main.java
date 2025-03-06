package Week_3.Pair;

public class Main {
    public static void main(String[] args) {
        var im = new InstructorManager();

        var instructor = new Instructor(4, "Abc", "DCE", 50000);

        im.add(instructor);

        for (var inst : im.getAll()) {
            System.out.println(inst);
        }
        System.out.println("----------------------------------");
        var newInstructor = new Instructor(2, "Abc", "DCE", 60000);

        im.update(newInstructor);
        for (var inst : im.getAll()) {
            System.out.println(inst);
        }

        System.out.println("-----------------------------------");

        im.delete(instructor);


        for (var inst : im.getAll()) {
            System.out.println(inst);
        }
    }
}
