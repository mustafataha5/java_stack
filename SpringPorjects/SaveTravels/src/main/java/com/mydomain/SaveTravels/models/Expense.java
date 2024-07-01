package com.mydomain.SaveTravels.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="expenses")
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id; 
	
	@NotNull(message ="ExpenseName must not be blank.")
	@Size(min=3,max=128,message = "ExpenseName must be at least 3 characters.\"")
	private String expenseName; 
	
	@NotNull(message ="Vender must not be blank.")
	@Size(min=3,max=128,message = "Vender must be at least 3 characters.")
	private String vender; 
	
	@NotNull(message ="Amount must not be blank.")
	@Min(value = 1 , message = "Amount must be at least 1 ")
	private Double amount; 
	
	@NotNull(message ="Description must not be blank.")
	@Size(min=3,max=128,message = "Description at least 3-128 characters.")
	private String description; 
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date createdAt; 
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date updatedAt; 
	
	public Expense() {
		// TODO Auto-generated constructor stub
	}
	
	public Expense(String expenseName ,String vender,Double amount,String description) {
		// TODO Auto-generated constructor stub
		this.expenseName = expenseName ; 
		this.vender=vender ; 
		this.amount=amount;
		this.description=description ; 
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public String getVender() {
		return vender;
	}

	public void setVender(String vender) {
		this.vender = vender;
	}

	
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return Id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setId(Long id) {
		Id = id;
	}
	
	
	

}
