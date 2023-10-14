package com.relations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
