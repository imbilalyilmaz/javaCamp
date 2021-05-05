package Managers;

import Abstracts.SellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SellManager implements SellService {

	@Override
	public void buy(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Sat�n alma detaylar�: ");
		System.out.println("Sat�n alan : " + gamer.getFirstName());
		System.out.println("Sat�n al�nan oyun : " + game.getGameName());
		System.out.println("Yararlan�lan kampanya : " + campaign.getName());
		System.out.println("�ndirim oran� : %" + campaign.getDiscount());
		double fiyat = game.getPrice()-(game.getPrice()*campaign.getDiscount()/100);
		System.out.println("Fiyat : " + fiyat );
		
	}

	@Override
	public void buy(Gamer gamer, Game game) {
		System.out.println("Sat�n alma detaylar�: ");
		System.out.println("Sat�n alan : " + gamer.getFirstName());
		System.out.println("Sat�n al�nan oyun : " + game.getGameName());
		System.out.println("Fiyat : " + game.getPrice());
		
	}
	
}
