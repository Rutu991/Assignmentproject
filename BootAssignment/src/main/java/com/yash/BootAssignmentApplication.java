package com.yash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.yash.accessingdatajpa.OrganizationRepository;
import com.yash.accessingdatajpa.RolesRepository;
import com.yash.accessingdatajpa.TerminalRepository;
import com.yash.accessingdatajpa.UsersRepository;
import com.yash.entities.Organization;
import com.yash.entities.Roles;
import com.yash.entities.Terminal;
import com.yash.entities.User;

@SpringBootApplication
public class BootAssignmentApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootAssignmentApplication.class, args);
		RolesRepository rolesRepository = context.getBean(RolesRepository.class);
		
		//create roles
//		Roles role = new Roles();
//		role.setrName("dealer");
//		rolesRepository.save(role);
//		System.out.println(role);
//		role.setrName("dealer");
//		rolesRepository.save(role);
//		System.out.println(role);
//		role.setrName("customer");
//		rolesRepository.save(role);
//		System.out.println(role);
//		
//		UsersRepository usersRepository = context.getBean(UsersRepository.class);
//		User user = new User();
//		user.setuName("pooja");
//		user.setuPassword("pooja");
//		Roles role = new Roles();
//		role.setrId(3);
//		user.setRole(role);
////		//user.setRole(role);
////		//rolesRepository.save(role);
//		usersRepository.save(user);
		
//		OrganizationRepository organizationRepository = context.getBean(OrganizationRepository.class);
//		Organization organization = new Organization();
//		organization.setoName("kritika");
//		organization.setoType("customer");
//		Organization dealer = new Organization();
//		dealer.setoId(1);
//		organization.setDealerId(dealer);
//		organizationRepository.save(organization);
		
//		TerminalRepository terminalRepository = context.getBean(TerminalRepository.class);
//		Terminal terminal = new Terminal();
//		terminal.settName("T1");
//		terminal.settSerialNo("S124");
//		Organization organization = new Organization();
//		organization.setoId(1);
//		terminal.setoId(organization);
//		terminalRepository.save(terminal);
		
		
	}
	
	

}
