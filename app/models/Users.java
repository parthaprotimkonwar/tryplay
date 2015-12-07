package models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
//@Table(name="USERS", schema=SCHEMA_NAME_AUTHORIZATION)
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	public Long userId;
	
	@Column(name="USER_TYPE", length=15)
	public String userType;
	
	@OneToOne(mappedBy="user", cascade=CascadeType.ALL)
	public UserToken userToken;
	
	@OneToMany(mappedBy="userIdAddressId.user")
	public Set<UserAddress> userAddress;
	
}
