package models;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class UserIdAddressId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="USER_ID")
	public Users user;
	
	@ManyToOne
	@JoinColumn(name="ADDRESS_ID")
	public Address address;
	
}
