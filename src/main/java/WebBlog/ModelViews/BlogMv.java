package WebBlog.ModelViews;

import java.util.Date;

import WebBlog.Models.Category;
import WebBlog.Models.User;
import lombok.Data;
@Data
public class BlogMv {

    private int Id;

    private String Name;

    private int CategoryId;

    private int UserId;

    private String Content;

    private Date DateCreate;

    private Category Category;

    private User User;

    public int getId() {
        return Id;
    }

    public User getUser() {
        return User;
    }

    public void setUser(final User user) {
        this.User = user;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(final int userId) {
        this.UserId = userId;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(final String content) {
        this.Content = content;
    }

    public Date getDateCreate() {
        return DateCreate;
    }

    public void setDateCreate(final Date dateCreate) {
        this.DateCreate = dateCreate;
    }

    public Category getCategory() {
        return Category;
    }

    public void setCategory(final Category category) {
        this.Category = category;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(final int categoryId) {
        this.CategoryId = categoryId;
    }

    public String getName() {
        return Name;
    }

    public void setName(final String name) {
        this.Name = name;
    }

    public void setId(final int id) {
        this.Id = id;
    }

    public BlogMv(int id, String name, int categoryId, int userId, String content, Date dateCreate) {
        this.Id = id;
        this.Name = name;
        this.CategoryId = categoryId;
        this.UserId = userId;
        this.Content = content;
        this.DateCreate = dateCreate;
    }
}