package Domain.ValueObj;

import java.util.ArrayList;
import java.util.Objects;

public class client {
	private final int id;
	private String name;
	public static int cpt=1;
	private ArrayList<Jeux>ListJeuAcheté;
	
	
	public client(String name) {
		super();
		this.id = cpt;
		this.name = name;
		cpt++;
		ListJeuAcheté=new ArrayList<>();
	}
	
	public void Achete(Jeux jeu) {
		this.ListJeuAcheté.add(jeu);
		System.out.println("Client "+this.id+" a rajouté dans le panier : id : "+jeu.getId()+" nomJeu: " +jeu.getName());
	}
	
	public ArrayList<Jeux>ListJeuAcheté(){
		
		return this.ListJeuAcheté;
	}
	
	public int facture() {
		int price = 0;
		for (Jeux jeu : ListJeuAcheté) {
			price+=jeu.getPrix();
		}
		return price;}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		client other = (client) obj;
		return id == other.id && Objects.equals(name, other.name);
	}



	@Override
	public String toString() {
		return "client [id=" + id + ", name=" + name + "]";
	}
	
	

}
