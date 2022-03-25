package com.yash.accessingdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yash.entities.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Integer>{

	@Query(value= "select o.o_id,o.o_name,o.o_type,o.dealer from Organization o where o.dealer =:d",nativeQuery = true)
	public List<Organization> getAllCustomers(@Param("d") int dealerId);
}
