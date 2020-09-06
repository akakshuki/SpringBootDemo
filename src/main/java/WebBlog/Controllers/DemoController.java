package WebBlog.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import WebBlog.Models.Blog;
import WebBlog.Repositories.IBlog;

@RestController
@RequestMapping("/Demo")
// abbismous mapping
public class DemoController {
	@Autowired
	IBlog _blog;

	@RequestMapping("/login")
		public ResponseEntity<Collection<Blog>> Demo() {
		return new ResponseEntity<>(_blog.anotherFindAllBlog(1, 2), HttpStatus.OK);
	}
}
