package Adapters;

import Abstracts.GamerCheckService;
import Entities.Gamer;

public class GamerCheckAdapter implements GamerCheckService{

	@Override
	public boolean check(Gamer gamer) {
		return true;
	}

}
