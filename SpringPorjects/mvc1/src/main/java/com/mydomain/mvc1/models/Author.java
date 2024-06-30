package com.mydomain.mvc1.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="authors")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Nonnull
	@Size(min=2,max=45)
	private String firstName ; 
	
	
	@Nonnull
	@Size(min=2,max=45)
	private String lastName ; 
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date createDate ; 
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date updateDate ; 
	
	public Author() {}
	public Author(String fisrtName , String lastName ) {
		this.firstName= fisrtName ; 
		this.lastName =lastName ; 
	}

	@PrePersist
	protected  void onCreat() {
		this.createDate = new Date() ;
	}
	@PreUpdate
	protected void onUpdate() {
		this.updateDate = new Date() ; 
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
