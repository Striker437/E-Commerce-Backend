package com.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.Ecommerce.Entity.Category;


@Component
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
