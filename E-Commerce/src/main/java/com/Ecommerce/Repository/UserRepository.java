package com.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.Ecommerce.Entity.User;


@Component
public interface UserRepository extends JpaRepository<User, Integer> {

}
