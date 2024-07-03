package com.mydomain.bookclub.ProductandCategories.models;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.util.StringBuilderFormattable;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@NotEmpty
	@Size(min = 2,message = "Product Name must be  at least 2 character ")
	private String name ;
	
	@NotEmpty
	@Size(min=5,message = "Product Description must be at least 4 character")
	private String description ;
	
	@NotNull
	@Min(value = 1,message = "Product Price must be at least 1")
	private Double price ;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date updatedAt;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	@PrePersist
	public void onCreate() {
		this.createdAt= new Date();
	}
	@PreUpdate
	public void onUpdate() {
		this.updatedAt= new Date();
	}
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name="categories_products",
			joinColumns = @JoinColumn(name="product_id"),
			inverseJoinColumns = @JoinColumn(name="category_id")
			)
	private List<Category> categories ;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	
	
}
