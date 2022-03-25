package com.yash.accessingdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.entities.User;

public interface UsersRepository extends JpaRepository<User, Integer>{

}
