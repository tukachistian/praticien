package com.ecolepratique.praticien.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecolepratique.praticien.entite.Praticien;

public interface PraticienDaoItf extends JpaRepository <Praticien, Long>{
	
}
