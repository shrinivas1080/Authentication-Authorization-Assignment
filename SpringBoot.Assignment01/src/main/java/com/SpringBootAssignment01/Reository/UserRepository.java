package com.SpringBootAssignment01.Reository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootAssignment01.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
