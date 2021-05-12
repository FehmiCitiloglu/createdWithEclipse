package entities.concretes;

import java.time.LocalDate;

import entities.abstracts.Entities;

public class Order implements Entities{
	private int id;
	private int gameId;
	private int customerId;
	private LocalDate orderDate;

	
	public Order() {
		
	}
	
	public Order(int id, int customerId, int gameId, LocalDate orderDate, double orderPrice) {
		this.id = id;
		this.orderDate = orderDate;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId(Customer customer) {
		return customerId;
	}
	
	public void setCustomerId(Customer customer) {
		this.customerId = customer.getId();
	}

	public int getGameId() {
		return gameId;
	}
	public void setGameId(Game game) {
		this.gameId = game.getId();
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderPrice(Game game, Campaign campaign) {
		if(game.getIsCampaign()) {
			return campaign.getCampaignPrice(game, campaign);
		} else {
			return game.getPrice();
		}
	}

}
