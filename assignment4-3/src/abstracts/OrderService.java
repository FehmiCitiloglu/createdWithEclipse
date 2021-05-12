package abstracts;

import java.util.List;

import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;
import entities.concretes.Order;

public interface OrderService {
	void addToPasket(Order order, Game game, Campaign campaign);
	
	void completeOrder(Customer customer);
	
	List<Order> getAll();
}
