import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import abstracts.BaseCustomerManager;
import adapter.MernisServiceAdapter;
import concretes.CampaignManager;
import concretes.GameCustomerManager;
import concretes.OrderManager;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;
import entities.concretes.Order;

public class Main {

	public static void main(String[] args) {
		// Türkçe karakter desteği yok o yüzden büyük harfle isim soyisim yazılmalı
		Customer customer = new Customer();
		customer.setId(0);
		customer.setFirstName("FEHMİ");
		customer.setLastName("ÇİTİLOĞLU");
		customer.setNickName("mirhurss");
		customer.setBirthday(LocalDate.of(1995, 10, 8));
		customer.setNationalId("00000000");
		
		BaseCustomerManager customerManager = new GameCustomerManager(new MernisServiceAdapter());
		
		customerManager.save(customer);
		
		Game game1 = new Game();
		game1.setId(0);
		game1.setGameName("4Stroy");
		game1.setDescription("MMORPG");
		game1.setPrice(100);
		game1.setCampaign(true);
		
		Game game2 = new Game();
		game2.setId(1);
		game2.setGameName("Pubg");
		game2.setCampaign(false);
		game2.setDescription("FPS");
		game2.setPrice(100);
		
		Campaign campaign = new Campaign();
		campaign.setId(0);
		campaign.setCampaignName("Ramadan campaign");
		campaign.setDiscount(20);
		campaign.setGameId(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		
		Order order1 = new Order();
		order1.setId(1);
		order1.setCustomerId(customer);
		order1.setGameId(game1);
		order1.setOrderDate(LocalDate.of(2021, 5, 12));
		
		Order order2 = new Order();
		order2.setId(2);
		order2.setCustomerId(customer);
		order2.setGameId(game2);
		order2.setOrderDate(LocalDate.of(2021, 5, 12));
		
		OrderManager orderManager = new OrderManager();
		
		orderManager.addToPasket(order1, game1, campaign);
		orderManager.addToPasket(order2, game2, campaign);
		orderManager.completeOrder(customer);
		
		

	}

}
