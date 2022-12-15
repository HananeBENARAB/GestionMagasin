package Domain.ValueObj;

import java.util.Objects;

public class Jeux {
	private final int id ;
	public static int cpt=1;
	private final String name;
	public enum TypeJeu{Puzzle,JeuSociete,enfant};
	public  TypeJeu TypeJeu;
	public final int prix;
	
	
	
	public Jeux(String name, int prix,TypeJeu TypeJeu) {
		super();
		id = cpt;
		this.name = name;
		TypeJeu = getTypeJeu();
		cpt++;
		this.prix = prix;
	}
	
	

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public TypeJeu getTypeJeu() {
		return TypeJeu;
	}
	
	public int getPrix() {
		return prix;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TypeJeu, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jeux other = (Jeux) obj;
		return TypeJeu == other.TypeJeu && id == other.id && Objects.equals(name, other.name);
	}
	
	
	

}
