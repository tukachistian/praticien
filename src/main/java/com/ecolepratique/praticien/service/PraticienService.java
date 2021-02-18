package com.ecolepratique.praticien.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolepratique.praticien.dao.PraticienDaoItf;
import com.ecolepratique.praticien.entite.Praticien;
import com.ecolepratique.praticien.repository.PraticienRepositoryItf;

@Service
public class PraticienService implements PraticienServiceItf {
	@Autowired
	private PraticienDaoItf praticienDao;
	
	@Override
	public List<Praticien> list() {
		return praticienDao.findAll();
	}
	@Override
	public Praticien create(Praticien praticien) {
		return praticienDao.save(praticien);
	}
	@Override
	public Praticien getById(Long id) {
		return praticienDao.findById(id).get();
	}
	@Override
	public Praticien deleteById(Long id) {
		Praticien pra = getById(id);
		praticienDao.deleteById(id);
		return pra;
	}
	@Override
	public Praticien updateById(Long id, Praticien praticien) {
		praticien.setId(id);
		return praticienDao.save(praticien);
	}
	
}
