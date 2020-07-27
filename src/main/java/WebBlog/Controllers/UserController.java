package WebBlog.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import WebBlog.Repositories.IUserRes;

@Controller
public class UserController {
	@Autowired
	IUserRes userRes;
	
	public void GetAll() {
		
	}
}
