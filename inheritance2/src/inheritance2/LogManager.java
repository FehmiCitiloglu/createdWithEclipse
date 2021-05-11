package inheritance2;

public class LogManager {
	public void log(int logType) {
		// kötü kod örneği => birbirinin alternatifi durumlar if ile yönetilmez
		// 1 - Database
		// 2- File
		// 3 - Email
		
		if(logType == 1) {
			System.out.println("Veritabanına loglandı.");
		} else if(logType == 2) {
			System.out.println("Dosyaya loglandı.");
		}else {
			System.out.println("Email loglandı.");
		}
	}
}
