package com.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;




import com.Ecommerce.Entity.Country;

public interface  CountryRepository extends JpaRepository<Country,Integer> {

	Country findCountryByCode(@Param("country_code")String country_code);

}
