package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		// Product product1 = new Product(1, "Lonovo V14", 15000,  "16 GB Ram", 10,13500); // Örnek oluşturma, referans oluşturma, instance deniyor
	/*	product1.id = 1;
		product1.name = "Lonovo V14";
		product1.unitePrice = 15000;
		product1.detail = "16 GB Ram";
	*/
		// metodlar iş yapan kod bloklarıdır
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lonava V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitePrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		
	
		Product product3 = new Product();
	

	
/*
 * bilgi: klasslar referans tiptir...
 * steak heap kullanılıyor referansları anlatırken
 * */
		
		
		
		Product[] products = {product2, product3};
		

		
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName( "İçecek");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
	}

}
