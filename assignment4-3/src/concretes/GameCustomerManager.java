package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class GameCustomerManager extends BaseCustomerManager{
	
	
	CustomerCheckService customerCheckService;
	
	public GameCustomerManager (CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
		
	}
	
	public void save(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			
			System.out.println("Save to db: " + customer.getFirstName());
			
		} else {
			
			System.out.println("Not a valid person");
			
		}
	}

	@Override
	public void delete(Customer customer) {
		
		System.out.println(customer.getFirstName() + "  deleted");
		
	}

	@Override
	public void update(Customer customer) {
		
		System.out.println(customer.getFirstName() + " updated");
		
	}
	
}
