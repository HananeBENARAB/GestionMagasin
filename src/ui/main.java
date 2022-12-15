package ui;

import Application.AggService;
import Domain.ValueObj.Jeux;
import Domain.ValueObj.Jeux.TypeJeu;
import Domain.ValueObj.client;

public class main {

	public static void main(String[] args) {
		
		AggService ag = new AggService();
		
		int id = ag.CreateMagasin();
				
		client client1 = new client("John");
		Jeux j1 = new Jeux("puzzle", 230,TypeJeu.enfant);
		Jeux j2 = new Jeux("Game1", 250,TypeJeu.enfant);

		
		client1.Achete(j1);
		client1.Achete(j2);
		client1.ListJeuAcheté();
		
		ag.Historique(id, client1);
		
		//ag.facture(id, cl);
		
	}

}

