package nLayerdDemo.core;

import nLayerdDemo.jLogger.JLoggerManager;

// adaptasyon sınıfı => başkasının yazdığı kodu kendi projemize adapte etmek için kullanıyoruz
// ve bu kod tüm projede kullanılabilecek bir kod olduğu için core katmanına ekliyoruz
public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
	}

}
