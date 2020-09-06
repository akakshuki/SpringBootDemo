package WebBlog.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import WebBlog.Models.Course;

public interface ICourse extends JpaRepository<Course, Integer> {

}
