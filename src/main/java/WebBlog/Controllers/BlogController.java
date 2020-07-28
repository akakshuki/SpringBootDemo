package WebBlog.Controllers;

import java.util.Date;
import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import WebBlog.Models.Blog;
import WebBlog.ModelViews.BlogMv;
import WebBlog.Repositories.IBlog;
import WebBlog.Repositories.ICategoryRes;
import WebBlog.Repositories.IUserRes;

@Controller
public class BlogController {
	@Autowired
	IBlog _blog;
	@Autowired
	ICategoryRes _category;
	@Autowired
	IUserRes _user;

	@RequestMapping("/blogges")
	public String GetAllBlog(Model model) {
		var ls = _blog.findAll();
		List<BlogMv> listData = ls.stream()
				.map(element -> new BlogMv(element.getId(), element.getName(), element.getCategoryId(),
						element.getUserId(), element.getContent(), element.getDateCreate()))
				.collect(Collectors.toList());
		listData.stream().forEach(blogMv -> {
			blogMv.setUser(_user.findById(blogMv.getUserId()).get());
			blogMv.setCategory(_category.findById(blogMv.getCategoryId()).get());
		});
		model.addAttribute("listBlog", listData);
		return "blogMrg";
	}

	@RequestMapping("/blogfrm")
	public String CreateBlog(Model model) {
		var list = _category.findAll();
		model.addAttribute("listCategories", list);
		return "blogfrm";
	}

	@RequestMapping(value = "/blogcrt", method = RequestMethod.POST)
	public String CreateBlog(Blog blog) {
		var date = new Date();
		blog.setDateCreate(date);
		blog.setUserId(2);
		_blog.save(blog);
		return "redirect:/blogges";
	}

	@RequestMapping(value = "/blogDtl", method = RequestMethod.GET)
	public String GetBlogById(@RequestParam int id, Model model) {
		model.addAttribute("listCategories", _category.findAll());
		model.addAttribute("blogData", _blog.findById(id).get());
		return "blogDtl";
	}

	@RequestMapping(value = "/blogupdt", method = RequestMethod.POST)
	public String EditBlog(Blog blogData) {
		var data = _blog.findById(blogData.getId()).get();
		data.setName(blogData.getName());
		data.setContent(blogData.getContent());
		data.setCategoryId(blogData.getCategoryId());
		_blog.save(data);
		return "redirect:/blogges";
	}

	@RequestMapping(value = "/blogdlt", method = RequestMethod.GET)
	public String deleteBlog(@RequestParam int id) {
		_blog.deleteById(id);
		return "redirect:/blogges";
	}

}
