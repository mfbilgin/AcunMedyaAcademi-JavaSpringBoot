package Week_3.Pair;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private List<Instructor> instructors;

    public InstructorManager() {
        this.instructors = new ArrayList<>();
        instructors.add(new Instructor(1, "Engin", "Demiroğ", 10000));
        instructors.add(new Instructor(2, "Kerem", "Varış", 20000));
        instructors.add(new Instructor(3, "Muhammet", "İnan", 30000));
    }

    public void add(Instructor instructor) {
        instructors.add(instructor);
    }

    public List<Instructor> getAll() {
        return instructors;
    }

    public Instructor getById(int id) {
        for (Instructor instructor : instructors) {
            if (instructor.getId() == id) {
                return instructor;
            }
        }
        return null;
    }

    public void delete(Instructor instructor) {
        instructors.remove(instructor);
    }

    public void update(Instructor instructor) {
        // update by id
        var instructorFromList = getById(instructor.getId());
        if (instructorFromList == null) return;

        instructorFromList.setName(instructor.getName());
        instructorFromList.setSurname(instructor.getSurname());
        instructorFromList.setSalary(instructor.getSalary());
    }
}
