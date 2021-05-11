package inheritance2;

public class CustomerManager {
	// müşteri işlerini yapacak olan sınıf
	public void add(Logger logger) {
		// müşteri ekleme kodları
		System.out.println("Müşteri eklendi.");

		logger.log();
	}
}
// iş yapan sınıflar olurda başka bir iş yapacak bir sınıfı kullanırsa somut sınıflarden gidilmez