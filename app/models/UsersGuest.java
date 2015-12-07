package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="USERS_GUEST", schema=SCHEMA_NAME_AUTHORIZATION)
public class UsersGuest {

	@Id
	@Column(name="USER_ID", length=100, nullable=false)
	public Long userId;
	
	@Column(name="EMAIL_ID", length=30, unique=true, nullable=false)
	public String emailId;
	
	@Column(name="PHONE_NO", length=15)
	public String phoneNo;
	
	@Column(name="STATUS", length=10)
	public String status;
}
