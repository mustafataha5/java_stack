package com.mydomain.DojoOverflow.models;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="questions")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty( message = "Question is required")
	private String text;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date createAt ;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date updateAt;
	
	@OneToMany(mappedBy = "question",fetch = FetchType.LAZY)
	private List<Answer> answers ;  
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
				name = "tags_questions",
				joinColumns = @JoinColumn(name="question_id"),
				inverseJoinColumns = @JoinColumn(name="tag_id")
			)
	private List<Tag> tags ; 
	
	
	
	@PrePersist
	public void onCreate() {
		this.createAt = new Date();
	}
	
	@PreUpdate
	public void onUpdate() {
		this.updateAt = new Date();
	}
	
	
	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
}
