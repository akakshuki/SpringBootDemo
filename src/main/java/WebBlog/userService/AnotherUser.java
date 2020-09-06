package WebBlog.userService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import WebBlog.Models.User;
import WebBlog.Repositories.IUserRes;
@Component
public class AnotherUser implements human {

	@Autowired
	private IUserRes _userRes;

	public AnotherUser(IUserRes userRes) {
		this._userRes = userRes;
	}

	@Override
	public List<User> getAllUser() {
		
		return _userRes.findAll();


}
}