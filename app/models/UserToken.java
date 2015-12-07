package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
//@Table(name="USER_TOKEN", schema=SCHEMA_NAME_AUTHORIZATION)
public class UserToken {

	@Id
	@Column(name="TOKEN_ID", length=100)
	public String tokenId;
	
	@Column(name="EXPIRY_DATETIME", length=20)
	@Temporal(TemporalType.TIMESTAMP)
	public Date expiryDateTime;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	public Users user;
}
