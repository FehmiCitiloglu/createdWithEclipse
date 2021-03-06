package oopIntro;

public class Product {
	
	// final sadece constructorda set edilir demek
	// private sadece bu class içinde erişilebilir demek
	private int id;
	private String name;
	private double unitePrice;
	private String detail;
	private double discount;

	
	public Product() {
		
	}

	
	public Product(int id, String name, double unitePrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitePrice = unitePrice;
		this.detail = detail;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name + "!";
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitePrice() {
		return unitePrice;
	}

	public void setUnitePrice(double unitePrice) {
		this.unitePrice = unitePrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitePrice - (this.unitePrice * this.discount / 100);
	}
	

	

	
	// SOLID kodlama prensiblerinin baş harfleri
	
	// classlar ikiye ayrılıyor biri özellik tutucu klasllar; iki: metod tutucu/ iş yapan classlar
}
