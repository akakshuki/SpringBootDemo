package WebBlog.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import WebBlog.Models.Student;

public interface IStudent extends JpaRepository<Student, Integer>{

}
