package concrete;

import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckService;
import entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{
	ICustomerCheckService _customerCheckService; 
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this._customerCheckService = customerCheckService;
	}
	
	public void save(Customer customer) {
		try {
		if(_customerCheckService.ChechkIfRealPerson(customer)) {
			System.out.println("Saved to db : " + customer.getFirstName());
		}
		}
		catch(Exception exception){
			System.out.println("Not a valid person-   " + exception);
		}
	}

	

			



}
