package WebBlog.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import WebBlog.Models.Category;
import WebBlog.Repositories.ICategoryRes;

@Controller
public class CategoryController {
	@Autowired
	ICategoryRes _category;

	@RequestMapping("/Category")
	public String StudenMrg(Model model) {
		List<Category> ls = _category.findAll();
		model.addAttribute("category", ls);
		return "categoryMrg";
	}
}
