package coffeProject.abstracts;

import coffeProject.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	
	public void save(Customer customer) {
		System.out.println("Save to db: " + customer.getFirstName());
		
	}

}
