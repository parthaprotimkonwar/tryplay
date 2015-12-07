package models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
//@Table(name="ADDRESS", schema=SCHEMA_NAME_AUTHORIZATION)
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ADDRESS_ID")
	public Long addressId;
	
	@Column(name="ADDRESS_HEADING", length=30, nullable=false)
	public String addressHeading;
	
	@Column(name="PINCODE", length=10, nullable=false)
	public String pincode;
	
	@Column(name="ADDRESS", length=255, nullable=false)
	public String address;
	
	@Column(name="LANDMARK", length=100)
	public String landmark;
	
	@Column(name="PHONE_NO", length=15)
	public String phoneNo;
	
	@Column(name="CITY", length=20)
	public String city;
	
	@Column(name="STATE", length=20)
	public String state;
	
	@Column(name="COUNTRY", length=20)
	public String country;
	
	@OneToMany(mappedBy="userIdAddressId.address", cascade=CascadeType.ALL)
	public Set<UserAddress> userAddress;
	
}
