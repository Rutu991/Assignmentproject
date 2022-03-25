package com.yash.accessingdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yash.entities.Organization;
import com.yash.entities.Terminal;

public interface TerminalRepository extends JpaRepository<Terminal, Integer>{

	@Query(value= "select * from Terminal t where t.o_id_o_id =:o",nativeQuery = true)
	public List<Terminal> getAllTerminalsForOrganization(@Param("o") int terminalId);
}
