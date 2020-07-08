package WebBlog.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import WebBlog.Models.Category;
public interface ICategoryRes extends JpaRepository<Category, Integer> {

}
