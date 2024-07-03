package com.mydomain.bookclub.ProductandCategories.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.cfg.C3p0Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydomain.bookclub.ProductandCategories.models.Product;

import com.mydomain.bookclub.ProductandCategories.repositories.ProductRepository;

@Service
public class ProductSerivce {
	@Autowired
	ProductRepository productRepository;
	
	
	public List<Product> allProducts(){
		return productRepository.findAll();
	} 
	
	public Product createProduct(Product p) {
		return productRepository.save(p);
	}
	
	public Product findProduct(Long id) {
		Optional<Product> optional = productRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null ;
	}
	
	public Product updateProduct(Product p) {
		Optional<Product> optional = productRepository.findById(p.getId());
		if(optional.isPresent()) {
			return productRepository.save(p);
		}
		return null ;
	}
	
}
