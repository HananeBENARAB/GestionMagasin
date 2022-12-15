package Domain.aggregat;

import java.util.ArrayList;
import java.util.HashMap;

import Domain.ValueObj.Jeux;
import Domain.ValueObj.client;

public class magasin {
	private static int cpt=1;
	private final int id;
	private HashMap<Integer,Jeux>MapJeu;
	private HashMap<client,ArrayList<Jeux>>Historique ;
	private client client;
	
	
	public magasin() {
		id=cpt;
		MapJeu=new HashMap<>();
		Historique=new HashMap<>();
		cpt++;
		}


	public HashMap<Integer, Jeux> getMapJeu() {
		return MapJeu;
	}


	public void setMapJeu(HashMap<Integer, Jeux> mapJeu) {
		MapJeu = mapJeu;
	}


	public int getId() {
		return id;
	}
	
	public void Add(Jeux jeux) {
		MapJeu.put(id, jeux);
		
	}
	
	public void delete(Jeux jeux) {
		MapJeu.remove(id, jeux);
		
	}
	
	public void MemoriseHistorique(client client,ArrayList<Jeux> Listjeux) {
		Historique.put(client, Listjeux);
		
		
	}
	
	public ArrayList<Jeux> afficheHistorique(client client) {
		ArrayList<Jeux> c =Historique.get(client);
		for (Jeux j : c) {
			System.out.println( client.toString()+" a acheté : " + j.getName() +"Montant de la facture "+client.facture() +"euros");
		}
		return c;
	}
	
	
	
	
			
	}
	

