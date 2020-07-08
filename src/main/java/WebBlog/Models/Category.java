package WebBlog.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Category")
@EntityListeners(AuditingEntityListener.class)
public class Category {

	private int Id;
	private String Name;
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@Column(name = "Name", nullable = true, length = 20)
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
