package WebBlog.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import WebBlog.Models.User;

public interface  IUserRes extends JpaRepository<User, Integer> {

}
