package WebBlog.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name = "comment")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "content", nullable = false)
	private String content;
	@Column(name = "user_id", nullable = false)
	private int userId;
	@ManyToOne
	@JoinColumn(name = "blog_id", nullable = false, referencedColumnName = "id")
	private Blog blog;
}
