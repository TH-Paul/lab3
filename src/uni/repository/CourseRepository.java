package uni.repository;

import uni.model.Course;


public class CourseRepository extends InMemoryRepository<Course>{

    public CourseRepository() {
        super();
    }

    public Course update(Course obj){
        Course courseToUpdate = this.repoList.stream()
                .filter(course -> course.getName().equals(obj.getName()))
                .findFirst()
                .orElseThrow();

        courseToUpdate.setName(obj.getName());

        return courseToUpdate;
    }
}
