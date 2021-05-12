package entities.concretes;

import entities.abstracts.Entities;

public class Campaign implements Entities{
	private int id;
	private int gameId;
	private String campaignName;
	private double discount;

	
	public Campaign() {
		
	}

	public Campaign(int id, int gameId, String campaignName, double discount, double campaignPrice) {
		this.id = id;
		this.gameId = gameId;
		this.campaignName = campaignName;
		this.discount = discount;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(Game game) {
		this.gameId = game.getId();
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getCampaignPrice(Game game, Campaign campaign) {
		return game.getPrice() - (game.getPrice() * (campaign.getDiscount() / 100));
	}


}
