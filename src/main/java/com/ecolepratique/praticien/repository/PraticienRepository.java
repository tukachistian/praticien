package com.ecolepratique.praticien.repository;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.stereotype.Repository;
import com.ecolepratique.praticien.entite.Praticien;

@Repository
public class PraticienRepository implements PraticienRepositoryItf {
	private HashMap<Long, Praticien> praticiens;
	private Long createId;
	public PraticienRepository() {
		praticiens = new HashMap<Long, Praticien>();
		createId = 1L;
	}
	@Override
	public Praticien save(Praticien praticien) {
		if(praticien.getId()==null) {
			praticien.setId(createId);
			createId = createId + 1;
		}
		praticiens.put(praticien.getId(), praticien);
		return praticien;
	}
	@Override
	public ArrayList<Praticien> findAll() {
		return new ArrayList<>(praticiens.values());
	}
	@Override
	public Praticien findById(Long id) {
		return praticiens.get(id);
	}
	@Override
	public Praticien deleteById(Long id) {
		return praticiens.remove(id);
	}
}
