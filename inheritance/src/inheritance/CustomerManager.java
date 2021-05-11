package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	// bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
}
// SOLID : O : open Closed Principle => sisteme yeni özellik eklendiğinde mevcutta bulunan hicbir kodu değiştiremezsin sadece yeni kodu eklersin