package services.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import models.Person;
import repository.PersonRepository;
import services.service.PersonServiceI;

@Service
public class PersonServiceImpl implements PersonServiceI{

	@Inject
	PersonRepository personRepository;
	
	@Override
	public Person savePerson(Person aPerson) {
		return personRepository.save(aPerson);
	}

	@Override
	public Person findOnePerson(Long id) {
		return personRepository.findOne(id);
	}

	@Override
	public List<Person> persons() {
		return personRepository.findAll();
	}
	
}
