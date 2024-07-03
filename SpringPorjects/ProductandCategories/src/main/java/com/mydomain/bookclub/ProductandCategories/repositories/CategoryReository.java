package com.mydomain.bookclub.ProductandCategories.repositories;

import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mydomain.bookclub.ProductandCategories.models.Category;
import com.mydomain.bookclub.ProductandCategories.models.Product;

@Repository
public interface CategoryReository extends CrudRepository<Category, Long> {
	
	List<Category> findAll();
    // Retrieves a list of all categories for a particular product
    List<Category> findAllByProducts(Product product);
    
    // Retrieves a list of any categories a particular product
    // does not belong to.
    List<Category> findByProductsNotContains(Product product);

	
	 @Query("SELECT p FROM Product p WHERE p.id NOT IN " +
	           "(SELECT p2.id FROM Product p2 JOIN p2.categories c WHERE c.id = :categoryId)")
	    List<Product> findProductsNotInCategory(Long categoryId);

	
}
