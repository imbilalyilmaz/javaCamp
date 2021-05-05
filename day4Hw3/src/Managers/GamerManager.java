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
			System.out.println(gamer.getFirstName() + " Ýsimli kullanýcý eklendi.");
		}else {
			System.out.println("Geçersiz kullanýcý!");
		}
		
		
	}

	@Override
	public void update(Gamer gamer, String firstName, String lastName, LocalDate dateOfBirth) {
		gamer.setFirstName(firstName);
		gamer.setLastName(lastName);
		gamer.setDateOfBirth(dateOfBirth);
		System.out.println("Bilgiler güncellendi. Yeni bilgiler :");
		System.out.println("Ýsim : " + gamer.getFirstName());
		System.out.println("Soy isim : " + gamer.getLastName());
		System.out.println("Doðum tarihi (Yýl/Ay/Gün) : " + gamer.getDateOfBirth());
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " Ýsimli kullanýcý silindi.");
		
	}

}
