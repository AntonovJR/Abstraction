package abstraction.studentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public void create(String name, Student student) {
        if (!repo.containsKey(name)) {
            repo.put(name, student);
        }
    }

    public String toString(String name) {
        String view = "";
        if (repo.containsKey(name)) {
            var student = repo.get(name);
             view = String.format("%s is %s years old.", student.getName(), student.getAge());

            if (student.getGrade() >= 5.00) {
                view += " Excellent student.";
            } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                view += " Average student.";
            } else {
                view += " Very nice person.";
            }

        }


        return view;
    }
}

