package coffeProject.adapter;




import coffeProject.abstracts.CustomerCheckService;
import coffeProject.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean serviceResult = false;
		try 
		{
			serviceResult =  client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalId()), 
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getBirthday().getYear());
		} 
		catch (Exception e) 
		{
			
			System.out.println(e + "Not a valid person");
		} 
		return serviceResult;
	}
}