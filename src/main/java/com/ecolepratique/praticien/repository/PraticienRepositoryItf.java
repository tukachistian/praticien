package com.ecolepratique.praticien.repository;

import java.util.ArrayList;
import java.util.List;

import com.ecolepratique.praticien.entite.Praticien;

public interface PraticienRepositoryItf {
	Praticien save(Praticien praticien);
	ArrayList<Praticien> findAll();
	Praticien findById(Long id);
	Praticien deleteById(Long id);
}
