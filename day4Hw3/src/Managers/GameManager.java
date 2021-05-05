package Managers;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " Ýsimli oyun eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " Ýsimli oyun silindi.");
		
	}

	@Override
	public void update(Game game, String gameName) {
		game.setGameName(gameName);
		System.out.println("Oyun ismi baþarýyla güncellendi.");
		System.out.println("Yeni isim : " + game.getGameName());
		
	}


	

}
