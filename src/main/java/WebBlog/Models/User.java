package WebBlog.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "User")
@EntityListeners(AuditingEntityListener.class)
public class User {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "userName", nullable = false)
	private String userName;
	@Column(name = "password", nullable = false)
	private String password;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "adress", nullable = true)
	private String address;
	@Column(name = "doB", nullable = false)
	private Date doB;
	@Column(name = "gender", nullable = false)
	private boolean gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDoB() {
		return doB;
	}
	public void setDoB(Date doB) {
		this.doB = doB;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	
}
