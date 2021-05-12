package concretes;


import java.util.ArrayList;
import java.util.List;

import abstracts.OrderService;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;
import entities.concretes.Order;

public class OrderManager implements OrderService{
	List<Order> orders = new ArrayList<Order>();

	@Override
	public void addToPasket(Order order, Game game, Campaign campaign) {
		
		if(game.getIsCampaign()) {
			System.out.println("Congrats! You have discount on "+ game.getGameName() +". Price down " + game.getPrice() + " to " + campaign.getCampaignPrice(game ,campaign));
		}
		
		System.out.println(game.getGameName() + " is added to basket with " + order.getOrderPrice(game, campaign) + " price.");
		orders.add(order);
	}

	@Override
	public void completeOrder(Customer customer) {
		
		System.out.println(customer.getFirstName()+ " bought ");
		for(Order _order : orders) {
			System.out.println(_order.getId());
		}

				
	}

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
