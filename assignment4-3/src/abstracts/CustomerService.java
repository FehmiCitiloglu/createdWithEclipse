package abstracts;

import entities.concretes.Customer;

public interface CustomerService {
	void save(Customer customer);
	
	void delete(Customer customer);
	
	void update(Customer customer);
}
