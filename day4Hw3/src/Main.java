import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Managers.CampaignManager;
import Managers.GameManager;
import Managers.GamerManager;
import Managers.SellManager;

public class Main {

	public static void main(String[] args) {
		//Kullanýcý oluþturma, silme ve güncelleme
		Gamer bilal = new Gamer(1,"Bilal","Yýlmaz","00000000000",LocalDate.of(2001, 6, 12));
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(bilal);
		gamerManager.delete(bilal);
		gamerManager.update(bilal, "Bilal2", "Yýlmaz2", LocalDate.of(2001, 3, 15));
		
		System.out.println("---------------------");
		//Oyun ekleme, silme ve güncelleme
		Game cod = new Game(1,"Call Of Duty","Activision",329);
		
		GameManager gameManager = new GameManager();
		gameManager.add(cod);
		gameManager.delete(cod);
		gameManager.update(cod, "Call Of Duty Modern Warfare");
		
		System.out.println("---------------------");
		//Kampanya oluþturma, silme ve güncelleme
		Campaign campaign1 = new Campaign(1, "Kampanya 1", 25);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
		System.out.println("---------------------");
		//Kampanyalý ve kampanyasýz satýþlar
		SellManager sellManager = new SellManager();
		sellManager.buy(bilal, cod);
		System.out.println("-----");
		sellManager.buy(bilal, cod, campaign1);
		
		
	}

}
