package com.mydomain.QueryandJoin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mydomain.QueryandJoin.models.City;
import com.mydomain.QueryandJoin.models.Country;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
	List<City> findAll();
	
	@Query("SELECT ci.name, ci.population FROM Country c Join c.cities ci  WHERE  c.name = ?1 and ci.population>=500000  order by ci.population DESC")
	List<Object[]> findAllCitiesgreaterThan5byCountry(String country);

	@Query("select c.name,ci.name,ci.district,ci.population "
			+ "from Country c "
			+ "join c.cities  ci "
			+ "where c.name= ?1 and  ci.district= ?2 and ci.population >= 500000 ")
	List<Object[]> findallCitiesInCountryAndDistrict(String country,String district );

}
