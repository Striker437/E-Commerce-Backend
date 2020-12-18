package com.Ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Ecommerce.Entity.State;

public interface StateRepository extends JpaRepository<State, Integer> {

	@Query("select u from State u where u.country.id=:country_id")
	List<State> findAllById(@Param("country_id") int country_id);

}
