package WebBlog.Repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import WebBlog.Models.Blog;

public interface IBlog extends JpaRepository<Blog, Integer> {
    // query have parameter
    @Query(value = "SELECT * FROM bloger.blog b where b.category_id = ?1 and b.user_id = ?2", nativeQuery = true)
    Collection<Blog> findAllBlog(int categoryId, int userId);

    @Query(value = "SELECT * FROM bloger.blog b where b.category_id = :categoryId and b.user_id = :userId", nativeQuery = true)
    Collection<Blog> anotherFindAllBlog(@Param("categoryId") int categoryId, @Param("userId") int userId);
}
