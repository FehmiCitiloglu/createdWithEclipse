package coffeProject.concretes;

import coffeProject.abstracts.CustomerCheckService;
import coffeProject.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	}

}