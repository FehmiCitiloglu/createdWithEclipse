package coffeProject.concretes;

import coffeProject.abstracts.BaseCustomerManager;
import coffeProject.abstracts.CustomerCheckService;
import coffeProject.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	 CustomerCheckService customerCheckService;
	 
	 public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		 this.customerCheckService = customerCheckService;
	 }
	
	@Override
	public void save(Customer customer){
		if(customerCheckService.CheckIfRealPerson(customer) == true) {
			System.out.println("Save to db: " + customer.getFirstName());
		} else {
			System.out.println("Not a valid person");
		}
	}
}