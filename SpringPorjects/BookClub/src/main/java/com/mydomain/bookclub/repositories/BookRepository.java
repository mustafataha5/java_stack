package com.mydomain.bookclub.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mydomain.bookclub.models.Book;
import com.mydomain.bookclub.models.User;
@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

	List<Book> findAll();
	
	@Query("select b \n"
			+ "from Book b "
			+ "where b.id not in (select b.id "
			+ "from User as u "
			+ "join u.borrowBooks as b  \n"
			+ "where u.id = ?1)")
	List<Book> findAllBooksnotincludebyuser(long userid);
    // Retrieves a list of all categories for a particular product
//    List<Book> findByBorrowerNotIn(User user);

	

}
