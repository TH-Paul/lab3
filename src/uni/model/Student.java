package uni.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends Person{
    private long studentId;
    private int totalCredits;
    private List<Course> enrolledCourses;


    public Student(String firstName, String lastName, long studentId, int totalCredits, List<Course> enrolledCourses) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.totalCredits = totalCredits;
        this.enrolledCourses = enrolledCourses;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentId);
    }

    /**
     *
     * @return list with the names of the courses
     */
    public List<String> getCoursesNames(){
        List<String> coursesList = new ArrayList<>();
        for (Course c : enrolledCourses){
            String name = '\'' + c.getName() + '\'';
            coursesList.add(name);
        }
        return coursesList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId=" + studentId +
                ", totalCredits=" + totalCredits +
                ", enrolledCourses=" + getCoursesNames() +
                '}';
    }
}
