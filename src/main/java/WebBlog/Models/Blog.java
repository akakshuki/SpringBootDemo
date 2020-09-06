package WebBlog.Models;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name = "Blog")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Blog {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name = "name", nullable = true, length = 100)
	private String Name;
	@Column(name = "UserId", nullable = true)
	private int UserId;
	@Column(name = "Content", nullable = true)
	private String Content;
	@Column(name = "DateCreate", nullable = true)
	private Date DateCreate;
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false, referencedColumnName = "id")
	private Category category;
	@OneToMany(mappedBy = "blog", 
			cascade = { CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.REFRESH },
			fetch = FetchType.LAZY)
	@JsonIgnore
	private Collection<Comment> comments;

	// ===//

}
