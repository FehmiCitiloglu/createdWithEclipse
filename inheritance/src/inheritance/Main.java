package inheritance;

public class Main {
	// bir class ne yapabiliyorsa sadece onları yapabilmeli bu yüzden individual ve corporate olarak ikiye ayırdık customerları
	// classlar referans tiptir ve temel sınıflar yani super sınıflar onu extend eden sınıfların referansını tutabilir ve bu da yazılımda sürdürebilirliği sağlar
	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";   
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber= "78910";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "99999";
	
		CustomerManager customerManager = new CustomerManager();
		/*
		customerManager.add(hepsiBurada);
		customerManager.add(engin);
		customerManager.add(sendikaCustomer);
		*/
		Customer[] customers = {engin, sendikaCustomer, hepsiBurada};
		customerManager.addMultiple(customers);
		
	}

}
