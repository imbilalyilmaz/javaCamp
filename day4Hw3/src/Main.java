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
		//Kullan�c� olu�turma, silme ve g�ncelleme
		Gamer bilal = new Gamer(1,"Bilal","Y�lmaz","00000000000",LocalDate.of(2001, 6, 12));
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(bilal);
		gamerManager.delete(bilal);
		gamerManager.update(bilal, "Bilal2", "Y�lmaz2", LocalDate.of(2001, 3, 15));
		
		System.out.println("---------------------");
		//Oyun ekleme, silme ve g�ncelleme
		Game cod = new Game(1,"Call Of Duty","Activision",329);
		
		GameManager gameManager = new GameManager();
		gameManager.add(cod);
		gameManager.delete(cod);
		gameManager.update(cod, "Call Of Duty Modern Warfare");
		
		System.out.println("---------------------");
		//Kampanya olu�turma, silme ve g�ncelleme
		Campaign campaign1 = new Campaign(1, "Kampanya 1", 25);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
		System.out.println("---------------------");
		//Kampanyal� ve kampanyas�z sat��lar
		SellManager sellManager = new SellManager();
		sellManager.buy(bilal, cod);
		System.out.println("-----");
		sellManager.buy(bilal, cod, campaign1);
		
		
	}

}
