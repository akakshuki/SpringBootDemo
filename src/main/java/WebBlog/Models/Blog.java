package WebBlog.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Blog")
@EntityListeners(AuditingEntityListener.class)
public class Blog {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name = "name", nullable = true,  length = 100 )
	private String Name;
	@Column(name = "CategoryId", nullable = true)
	private int CategoryId;
	@Column(name = "UserId", nullable = true)
	private int UserId;
	@Column(name = "Content", nullable = true)
	private String Content;
	@Column(name = "DateCreate", nullable = true)
	private Date DateCreate;
	//===//
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public Date getDateCreate() {
		return DateCreate;
	}
	public void setDateCreate(Date dateCreate) {
		DateCreate = dateCreate;
	}
	
	
}
