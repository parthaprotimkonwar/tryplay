package models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
//@Table(name="USER_ADDRESS", schema=SCHEMA_NAME_AUTHORIZATION)
public class UserAddress {

	@EmbeddedId
	public UserIdAddressId userIdAddressId;
}
