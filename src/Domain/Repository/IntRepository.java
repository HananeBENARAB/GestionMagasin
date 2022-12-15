package Domain.Repository;

import Domain.aggregat.magasin;

public interface IntRepository {
	
	magasin FindById(int id);
	void save(magasin magasin);
	

}
