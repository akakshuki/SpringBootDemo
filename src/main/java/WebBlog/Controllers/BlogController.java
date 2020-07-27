package WebBlog.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import WebBlog.Models.Blog;
import WebBlog.Repositories.IBlog;
import WebBlog.Repositories.ICategoryRes;

@Controller
@RequestMapping("/blogges")
public class BlogController {
	@Autowired
	IBlog _blog;
	ICategoryRes _category;

	@RequestMapping("")
	public String GetAllBlog(Model model) {
		var ls = _blog.findAll();
		model.addAttribute("listBlog", ls);
		return "blogMrg";
	}

	@RequestMapping("/blogFrm")
	public String CreateBlog(Model model) {

		var listCategory = _category.findAll();
		model.addAttribute("listCategories", listCategory);
		return "blogFrm";
	}

	@RequestMapping(value = "/blogges/createBlog", method = RequestMethod.POST)
	public String CreateBlog(Blog blog) {
		_blog.save(blog);
		return "redirect:/blogges";
	}

	@RequestMapping(value = "/blogges/detail/", method = RequestMethod.GET)
	public String GetBlogById(@RequestParam int id) {
		return "blogDtl";
	}

	@RequestMapping(value = "/blogges/edit/", method = RequestMethod.POST)
	public String EditBlog(Blog blogData) {
		_blog.save(blogData);

		return "redirect:/bloges/detail/";
	}

	@RequestMapping(value = "/blogges/delete/", method = RequestMethod.GET)
	public String deleteBlog(@RequestParam int id) {
		_blog.deleteById(id);
		return "redirect:/bloges";
	}
	

}
