package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.BootAssignmentApplication;
import com.yash.accessingdatajpa.OrganizationRepository;
import com.yash.accessingdatajpa.TerminalRepository;
import com.yash.accessingdatajpa.UsersRepository;
import com.yash.entities.Organization;
import com.yash.entities.Terminal;
import com.yash.entities.User;

@RestController
public class MyController {

	@Autowired
	UsersRepository usersRepository;
	
	@Autowired
	OrganizationRepository organizationRepository;
	
	@Autowired
	TerminalRepository terminalRepository;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return usersRepository.findAll();
	}
	
	@PostMapping("/cusers")
	public String createUsers(@RequestBody User user) {
		 usersRepository.save(user);
		 return "user created successfully";
	}
	
	@GetMapping("/organizations")
	public List<Organization> getAllOrganizations() {
		return organizationRepository.findAll();
	}
	
	@PostMapping("/corga")
	public String createOrganization(@RequestBody Organization organization) {
		organizationRepository.save(organization);
		 return "organization created successfully";
	}
	
	@GetMapping("/customers/{dealer}")
	public List<Organization> getAllCustomers(@PathVariable("dealer") int dealerId){
		
		System.out.println("dealerId" + dealerId);
		return organizationRepository.getAllCustomers(dealerId);
    }
	
	@GetMapping("/terminals")
	public List<Terminal> getAllterminals() {
		return terminalRepository.findAll();
	}
	
	@PostMapping("/cterminal")
	public String createTerminal(@RequestBody Terminal terminal) {
		terminalRepository.save(terminal);
		 return "terminal created successfully";
	}
	
	@GetMapping("/terminals/{oid}")
	public List<Terminal> getAllTerminalsForOrganization(@PathVariable("oid") int orgId){
		
		System.out.println("organization Id" + orgId);
		return terminalRepository.getAllTerminalsForOrganization(orgId);
    }
	
}
