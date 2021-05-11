package inheritance2;

public class Main {

	public static void main(String[] args) {
	/*	// birbirinin alternatifi olan kodlar için if yazılmaz
		LogManager logManager = new LogManager();
		
		logManager.log(1);
*/
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new EmailLogger());
	}

}
