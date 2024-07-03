package com.mydomain.bookclub.ProductandCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mydomain.bookclub.ProductandCategories.models.Category;
import com.mydomain.bookclub.ProductandCategories.models.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
	
	
	List<Product> findAll();
    

}
