package Application;

import java.util.ArrayList;

import Domain.Repository.IntRepository;
import Domain.ValueObj.Jeux;
import Domain.ValueObj.client;
import Domain.aggregat.magasin;
import Infra.ImpRepository;

public class AggService {
	private final IntRepository rep;
	
 	
	public AggService() {
		this.rep=new ImpRepository();
	}
	
	public int CreateMagasin() {
		magasin mag = new magasin();
		this.rep.save(mag);
		return mag.getId();
		
	}
	
	public void AddJeu(int id,Jeux jeu) {
		magasin mag = this.rep.FindById(id);
		mag.Add(jeu);
		this.rep.save(mag);
	}
	
	public void DeleteJeu(int id,Jeux jeu) {
		magasin mag = this.rep.FindById(id);
		mag.delete(jeu);
		this.rep.save(mag);
	}
	
	public void Historique(int id,client client) {
		magasin mag = this.rep.FindById(id);
		mag.MemoriseHistorique(client, client.ListJeuAcheté());
		mag.afficheHistorique(client);
		this.rep.save(mag);
	}
	
	
}
