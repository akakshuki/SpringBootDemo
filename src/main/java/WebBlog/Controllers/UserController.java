package WebBlog.Controllers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import WebBlog.ModelViews.UserLogin;

import WebBlog.userService.ICoach;
import WebBlog.userService.SportConfig;


@Controller
public class UserController {
//	@Autowired
//	IUserRes _userRes;
	
	AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(SportConfig.class);
	
	

	@RequestMapping("login")
	public String LoginPage(Model model) {
		return "loginPg";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String LoginPage(UserLogin userLogin) {

		return "redirect:/mainPage ";
	}

	@RequestMapping("register")
	public String Register(Model model) {
		return "registerPg";
	}

	@RequestMapping("human")
	public void Human(Model model) {
		ICoach theCoach = context.getBean("swimCoach",ICoach.class );
		System.out.println(theCoach.getDailyWorkout());
	}

//	@RequestMapping(value = "register", method = RequestMethod.POST)
//	public String Register(User user) {
//		user.setGender(true);
//		user.setDoB(new Date());
//		user.setAddress(" ");
//		_userRes.save(user);
//		return "redirect:/category";
//	}

}