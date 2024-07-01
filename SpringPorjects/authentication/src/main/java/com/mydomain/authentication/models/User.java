package com.mydomain.authentication.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name ="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Username is required!")
    @Size(min=3, max=30, message="Username must be between 3 and 30 characters")
    private String userName;
	
	@NotEmpty(message="Email is required!")
    @Email(message="Please enter a valid email!")
	private String email; 
	
	@NotEmpty(message="Password is required!")
    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
    private String password;
	
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date createsAt;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date updatedAt;
	
	@Transient
	@NotEmpty(message="Confirm Password is required!")
    @Size(min=8, max=128, message="Confirm Password must be between 8 and 128 characters")
	private String confirmPassword;
	
	@PrePersist
	public void onCreate() {
		this.createsAt=new Date() ; 
	}
	
	@PreUpdate
	public void onUpdate() {
		this.updatedAt=new Date() ; 
	}
 	
	public User() {}
	
	
	
	public User(
			 String userName,
			 String email,
			 String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public Long getId() {
		return id;
	}

	public Date getCreatesAt() {
		return createsAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	
}
