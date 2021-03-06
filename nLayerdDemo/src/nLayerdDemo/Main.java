package nLayerdDemo;

import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.business.concretes.ProductManager;
import nLayerdDemo.core.JLoggerManagerAdapter;
import nLayerdDemo.dataAccess.concrete.AbcProduxtDao;
// import nLayerdDemo.dataAccess.concrete.HibernateProductDao;
import nLayerdDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// test ortamı
		// bir projede entitiler haric new'liyorsak anlamalıyız ki ileride problem yaşayacağız
		
		
		// ToDo: Spring IoC ile çözülecek
		ProductService productService = new ProductManager(new AbcProduxtDao(), new JLoggerManagerAdapter());// kötü kod
		
		
		Product product = new Product(1,2,"Elma",12,50);
		
		productService.add(product);
	}

}
