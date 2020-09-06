package WebBlog.ModelViews;

public class UserLogin {
    private String UserName;
    private String Password;

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }
}