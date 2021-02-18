package com.ecolepratique.praticien.service;

import java.util.List;
import com.ecolepratique.praticien.entite.Praticien;

public interface PraticienServiceItf {
	Praticien create(Praticien medicament);
	List<Praticien> list();
	Praticien getById(Long id);
	Praticien deleteById(Long id);
	Praticien updateById(Long id, Praticien praticien);
}
