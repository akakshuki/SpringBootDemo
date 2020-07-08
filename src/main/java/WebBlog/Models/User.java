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
	private int Id;
	private String UserName;
	private String Password;
	private String Name;
	private String Address;
	private Date DoB;
	private boolean Gender;

	@Id
	@GeneratedValue
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Column(name = "UserName", nullable = false)
	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	@Column(name = "Password", nullable = false)
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Column(name = "Name", nullable = false)
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Column(name = "Adress", nullable = true)
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Column(name = "DoB", nullable = false)
	public Date getDoB() {
		return DoB;
	}

	public void setDoB(Date doB) {
		DoB = doB;
	}

	@Column(name = "Gender", nullable = false)
	public boolean isGender() {
		return Gender;
	}

	public void setGender(boolean gender) {
		Gender = gender;
	}

}
