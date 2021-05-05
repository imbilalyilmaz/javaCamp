package Adapters;

import java.rmi.RemoteException;

import Abstracts.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean check(Gamer gamer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		//return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()) , gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth().getYear());
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()) , gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	
	}

}
