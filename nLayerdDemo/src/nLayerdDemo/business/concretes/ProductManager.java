package nLayerdDemo.business.concretes;

import java.util.List;

import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.core.LoggerService;
import nLayerdDemo.dataAccess.abstracts.ProductDao;
//import nLayerdDemo.dataAccess.concrete.HibernateProductDao;
import nLayerdDemo.entities.concretes.Product;
import nLayerdDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService{
	
	// dependency injection yolutla bağımlılık olmadan gerçekleştireceğiz
	
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			
			return;
		}
		// HibernateProductDao dao = new HibernateProductDao();
		// dao.add(product);
		// yukarıdaki kullanım yanlış bu bağımlı bir yapı ve dataAccess katmanına giriş sağlıyor
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi" + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
