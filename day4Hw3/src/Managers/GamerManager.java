package Managers;

import java.time.LocalDate;

import Abstracts.GamerCheckService;
import Abstracts.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.check(gamer)) {
			System.out.println(gamer.getFirstName() + " �simli kullan�c� eklendi.");
		}else {
			System.out.println("Ge�ersiz kullan�c�!");
		}
		
		
	}

	@Override
	public void update(Gamer gamer, String firstName, String lastName, LocalDate dateOfBirth) {
		gamer.setFirstName(firstName);
		gamer.setLastName(lastName);
		gamer.setDateOfBirth(dateOfBirth);
		System.out.println("Bilgiler g�ncellendi. Yeni bilgiler :");
		System.out.println("�sim : " + gamer.getFirstName());
		System.out.println("Soy isim : " + gamer.getLastName());
		System.out.println("Do�um tarihi (Y�l/Ay/G�n) : " + gamer.getDateOfBirth());
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " �simli kullan�c� silindi.");
		
	}

}
