package com.yash.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roles {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int rId;
	String rName;
	
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roles(String rName) {
		
		this.rName = rName;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	@Override
	public String toString() {
		return "Roles [rId=" + rId + ", rName=" + rName + "]";
	}
	
	
	
}
