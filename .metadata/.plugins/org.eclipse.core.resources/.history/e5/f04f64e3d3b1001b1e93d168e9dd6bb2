import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckService;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer();
		customer.setFirstName("Engin");
		customer.setLastName("Demiroğ");
		customer.setDateOfBirth(LocalDate.of(1985, 1, 6));
		customer.setNationalityId("2886149910");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.save(customer);
	}

}
