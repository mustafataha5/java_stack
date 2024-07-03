package com.mydomain.bookclub.ProductandCategories.services;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.openssl.openssl_h;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydomain.bookclub.ProductandCategories.models.Category;
import com.mydomain.bookclub.ProductandCategories.models.Product;
import com.mydomain.bookclub.ProductandCategories.repositories.CategoryReository;


@Service
public class CategoryService {
	
	@Autowired
	CategoryReository categoryReository ; 
	
	
	public Category createCategory(Category c) {
		return categoryReository.save(c);
	}
	
	public List<Category> allCategories(){
		return categoryReository.findAll();
	}
	
	public Category findCategory(Long id) {
		Optional<Category> optional = categoryReository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null ;
	}
	public List<Product> excluderProducts(Long id){
		try {
		 return  categoryReository.findProductsNotInCategory(id);}
		catch (Exception e) {
			// TODO: handle exception
			
		}
		return null;
	} 
	
	public Category updaeCategory(Category c) {
		Optional<Category> optional = categoryReository.findById(c.getId());
		if(optional.isPresent()) {
			return categoryReository.save(c);
		}
		return null ;
		
	}

	public List<Category> excludeCategories(Product p){
		return categoryReository.findByProductsNotContains(p);
	}
	
}

