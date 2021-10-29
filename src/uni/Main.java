package uni;

import uni.model.Course;
import uni.model.Person;
import uni.model.Student;
import uni.model.Teacher;
import uni.repository.TeacherRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Catalin", "Rusu", new ArrayList<>());

        Teacher teacher2 = new Teacher("Diana", "Cristea", new ArrayList<>());

        Course course1 = new Course("MAP", teacher1, 70, new ArrayList<>(), 6);

        teacher1.getCourses().add(course1);

        //System.out.println(teacher1.getCourses());






    }
}
