package com.yash.accessingdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.entities.Roles;

public interface RolesRepository extends JpaRepository<Roles,Integer>{

}
