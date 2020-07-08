package WebBlog.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import WebBlog.Models.Blog;

public interface IBlog extends JpaRepository<Blog,Integer> {

}
