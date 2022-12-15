package Infra;

import java.util.HashMap;

import Domain.Repository.IntRepository;
import Domain.aggregat.magasin;

	public class ImpRepository implements IntRepository{
		HashMap<Integer,magasin>MapMagasin;

	public ImpRepository() {
		MapMagasin=new HashMap<>();
	}
	
	public magasin FindById(int id) {

		return MapMagasin.get(id);
	}

	
	public void save(magasin magasin) {
		MapMagasin.put(magasin.getId(), magasin);
		
	}

}
