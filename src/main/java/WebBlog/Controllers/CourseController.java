package WebBlog.Controllers;


import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import WebBlog.Models.Course;
import WebBlog.Models.Student;
import WebBlog.Repositories.ICourse;
import WebBlog.Repositories.IStudent;


@RestController
public class CourseController {
	@Autowired
	ICourse _course;
	@Autowired
	IStudent _studen;

	@RequestMapping(value = "/course")
	public Course getCourses() {
		Course list = _course.findAll().get(0);
		list.getStudents().forEach(x -> System.out.println(x.getName()));
		return list;
	}

	@RequestMapping(value = "addNewCourse")
	public String addNew() {
		var course = new Course();
		Collection<Student> list =(Collection<Student>)_studen.findAll();
		
		course.setName("C#");
		course.setDateCreate(new Date());
		course.setStudents(list);
		return _course.save(course).getId() != 0 ? "True" : "False";
	}
	@RequestMapping(value = "deleteNewCourse")
	public String deleteNew() {
		var course = _course.findById(8).get();
		 _course.delete(course);
		 return "true";
	}


}
