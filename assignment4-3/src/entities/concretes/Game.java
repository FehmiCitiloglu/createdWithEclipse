package entities.concretes;

import entities.abstracts.Entities;

public class Game implements Entities{
	private int id;
	private String gameName;
	private String description;
	private double price;
	private boolean isCampaign;

	
	public Game () {
		
	}


	public Game(int id, String gameName, String description, double price, boolean isCampaign) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.description = description;
		this.price = price;
		this.isCampaign = isCampaign;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public boolean getIsCampaign() {
		return isCampaign;
	}


	public void setCampaign(boolean isCampaign) {
		this.isCampaign = isCampaign;
	}
	
	
}
