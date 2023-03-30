package com.nineleaps.foodtechapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.nineleaps.foodtechapp.entity.User;
@Repository

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
