package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="USERS_FRUGAL", schema=SCHEMA_NAME_AUTHORIZATION)
public class UsersFrugal {

	@Id
	@Column(name="USER_ID", length=100, nullable=false)
	public Long userId;
	
	@Column(name="NAME", length=30)
	public String name;
	
	@Column(name="PASSWORD", length=50, nullable=false)
	public String password;
	
	@Column(name="LAST_LOGIN", length=20)
	public Date lastLogin;
	
	@Column(name="CREATED_ON", length=20)
	public Date createdOn;
	
	@Column(name="EMAIL_ID", length=30, nullable=false, unique=true)
	public String emailId;
	
	@Column(name="PHONE_NO", length=15)
	public String phoneNo;
	
	@Column(name="STATUS", length=10)
	public String status;
	
}
