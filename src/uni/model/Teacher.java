package uni.model;

import java.util.List;
import java.util.Objects;

public class Teacher extends Person{

    private List<Course> courses;

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Teacher(String firstName, String lastName, List<Course> courses) {
        super(firstName, lastName);
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher teacher)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(courses, teacher.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), courses);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses=" + courses +
                '}';
    }
}
