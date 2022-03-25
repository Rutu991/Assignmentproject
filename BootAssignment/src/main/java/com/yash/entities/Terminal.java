package com.yash.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Terminal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
int tId;
String tName;
String tSerialNo;
@ManyToOne
Organization oId;
public Terminal() {
	super();
	
}
public Terminal( String tName, String tSerialNo, Organization oId) {
	super();
	
	this.tName = tName;
	this.tSerialNo = tSerialNo;
	this.oId = oId;
}
public int gettId() {
	return tId;
}
public void settId(int tId) {
	this.tId = tId;
}
public String gettName() {
	return tName;
}
public void settName(String tName) {
	this.tName = tName;
}
public String gettSerialNo() {
	return tSerialNo;
}
public void settSerialNo(String serialNo) {
	this.tSerialNo = serialNo;
}
public Organization getoId() {
	return oId;
}
public void setoId(Organization oId) {
	this.oId = oId;
}
@Override
public String toString() {
	return "Terminal [tId=" + tId + ", tName=" + tName + ", tSerialNo=" + tSerialNo + ", oId=" + oId + "]";
}

}
