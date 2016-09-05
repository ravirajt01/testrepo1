package com.cft.entity;

import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.ss.utility.GenericVariables.ROLE;




@Entity
@Table(name= "user")  
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(nullable = false , unique = true )
	Integer userId ;
	String name;
	String contactNumber ;
	String email ;
	String password;
	
	 
	 
	 
	
	Date registrationDate;
	boolean isRegistrationConfirmed ;
	Date registrationConfirmDate;
	@Column(columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	Date lastTimeStamp;

	String roles ;
	@Transient
	public ROLE userRoles;
	
	@Transient
	String otp;
	
	/*@OneToOne( mappedBy = "user")
	UserRole userRole;
	*/
	//@OneToMany( mappedBy = "user",fetch=FetchType.EAGER)userRoles
	//List<UserRole> userRoles;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public boolean isRegistrationConfirmed() {
		return isRegistrationConfirmed;
	}

	public void setRegistrationConfirmed(boolean isRegistrationConfirmed) {
		this.isRegistrationConfirmed = isRegistrationConfirmed;
	}

	public Date getRegistrationConfirmDate() {
		return registrationConfirmDate;
	}

	public void setRegistrationConfirmDate(Date registrationConfirmDate) {
		this.registrationConfirmDate = registrationConfirmDate;
	}

	public Date getLastTimeStamp() {
		return lastTimeStamp;
	}

	public void setLastTimeStamp(Date lastTimeStamp) {
		this.lastTimeStamp = lastTimeStamp;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
		
	}

	public ROLE getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(ROLE userRoles) {
		this.userRoles = userRoles;
	}

	
	
}
