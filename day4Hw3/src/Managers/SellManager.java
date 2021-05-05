package Managers;

import Abstracts.SellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SellManager implements SellService {

	@Override
	public void buy(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Satýn alma detaylarý: ");
		System.out.println("Satýn alan : " + gamer.getFirstName());
		System.out.println("Satýn alýnan oyun : " + game.getGameName());
		System.out.println("Yararlanýlan kampanya : " + campaign.getName());
		System.out.println("Ýndirim oraný : %" + campaign.getDiscount());
		double fiyat = game.getPrice()-(game.getPrice()*campaign.getDiscount()/100);
		System.out.println("Fiyat : " + fiyat );
		
	}

	@Override
	public void buy(Gamer gamer, Game game) {
		System.out.println("Satýn alma detaylarý: ");
		System.out.println("Satýn alan : " + gamer.getFirstName());
		System.out.println("Satýn alýnan oyun : " + game.getGameName());
		System.out.println("Fiyat : " + game.getPrice());
		
	}
	
}
