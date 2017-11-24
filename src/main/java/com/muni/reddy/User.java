/**
 * 
 */
package com.muni.reddy;

import java.util.Date;

/**
 * @author Muni
 *
 */
public class User {

	private String id;
	private  String firstName;
	private  String lastName;
	private  String emailName;
	private  int areaPincode;
	private  Date dateOfBirth;
	private  boolean isActive;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailName() {
		return emailName;
	}
	public void setEmailName(String emailName) {
		this.emailName = emailName;
	}
	public int getAreaPincode() {
		return areaPincode;
	}
	public void setAreaPincode(int areaPincode) {
		this.areaPincode = areaPincode;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
