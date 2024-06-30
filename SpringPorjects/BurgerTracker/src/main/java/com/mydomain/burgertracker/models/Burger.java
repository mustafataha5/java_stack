package com.mydomain.burgertracker.models;

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
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="burgers")
public class Burger {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
	
	@NotNull
	@Size(min=5,max=45)
	private String burgerName ; 
	
	@NotNull
	@Size(min=5,max=255)
	private String restaurantName ; 
	
	@NotNull(message ="Must be number from 0-5")
	@Min(value=0)
	@Max(value=5)
	private Integer rating ; 
	
	@NotNull
	@Size(min=4,max=255,message = "must be at least 4 characters")
	private String note ; 
	
	@Column(updatable =false)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date createAt;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date updatedAt; 
	
	public Burger() {
		// TODO Auto-generated constructor stub
	}

	public Burger( String burgerName,String restaurantName,Integer rating,String note) {
		this.burgerName = burgerName;
		this.restaurantName = restaurantName;
		this.rating = rating;
		this.note = note;
	}
	
	@PrePersist
	public void onCreate() {
		this.createAt = new Date() ;  
	}
	@PreUpdate
	public void onUpdate() {
		this.updatedAt= new Date();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getBurgerName() {
		return burgerName;
	}

	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String resturantName) {
		this.restaurantName = resturantName;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	
		
	
}
