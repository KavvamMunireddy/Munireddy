/**
 * 
 */
package com.muni.reddy;

import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


/**
 * @author Muni
 *
 */
@Document(collection = "user")
@Component
public class User {
	@Id
	@Indexed
	private String userId;
	private  String firstName;
	private  String lastName;
	private  String emailName;
	private  int areaPincode;
	private  Date dateOfBirth;
	private  boolean isActive;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailName="
				+ emailName + ", areaPincode=" + areaPincode + ", dateOfBirth=" + dateOfBirth + ", isActive=" + isActive
				+ "]";
	}
	
	
}
