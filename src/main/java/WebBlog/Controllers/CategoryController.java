package WebBlog.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import WebBlog.Models.Category;
import WebBlog.Repositories.ICategoryRes;

@Controller
public class CategoryController {
	@Autowired
	ICategoryRes _category;

	@RequestMapping("/Category")
	public String CategoryMrg(Model model) {
		List<Category> ls = _category.findAll();
		model.addAttribute("categories", ls);
		return "categoryMrg";
	}

	@RequestMapping("/Category_frm")
	public String CategoryFrm(Model model) {
		return "categoryFrm";
	}

	@RequestMapping(value = "/Category_Add", method = RequestMethod.POST)
	public String Category_Add(Category std) {
		_category.save(std);
		return "redirect:/Category";
	}

	@RequestMapping(value = "/Category_Del", method = RequestMethod.GET)
	public String Category_Del(@RequestParam int id) {
		_category.deleteById(id);
		return "redirect:/Category";
	}
}
