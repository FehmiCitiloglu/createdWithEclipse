package coffeProject;


import java.time.LocalDate;

import coffeProject.abstracts.BaseCustomerManager;
import coffeProject.adapter.MernisServiceAdapter;

import coffeProject.concretes.StarbucksCustomerManager;
import coffeProject.entities.Customer;


public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("FEHMİ");
		customer.setLastName("ÇİTİLOĞLU");
		customer.setBirthday(LocalDate.of(1995,10,8));
		customer.setNationalId("00000000");
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		

		 customerManager.save(customer);
		
		
	}

}
