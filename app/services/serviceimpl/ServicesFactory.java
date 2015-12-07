package services.serviceimpl;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import services.service.PersonServiceI;

@Repository
public class ServicesFactory {

	@Inject
	public PersonServiceI personService;
	
}
