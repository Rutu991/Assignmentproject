package com.yash.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Organization {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int oId;
private String oName;
private String oType;

private String dealer;

public int getoId() {
	return oId;
}

public void setoId(int oId) {
	this.oId = oId;
}

public String getoName() {
	return oName;
}

public void setoName(String oName) {
	this.oName = oName;
}

public String getoType() {
	return oType;
}

public void setoType(String oType) {
	this.oType = oType;
}

public String getDealer() {
	return dealer;
}

public void setDealer(String dealer) {
	this.dealer = dealer;
}

public Organization(int oId, String oName, String oType, String dealer) {
	super();
	this.oId = oId;
	this.oName = oName;
	this.oType = oType;
	this.dealer = dealer;
}

public Organization() {
	super();
	// TODO Auto-generated constructor stub
}


}



