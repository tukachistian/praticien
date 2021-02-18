package com.ecolepratique.praticien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ecolepratique.praticien.dao.PraticienDaoItf;
import com.ecolepratique.praticien.entite.Praticien;
import com.ecolepratique.praticien.repository.PraticienRepositoryItf;
import com.ecolepratique.praticien.service.PraticienServiceItf;

@SpringBootApplication
public class PraticienApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PraticienApplication.class, args);
		
		PraticienDaoItf praticien =  ctx.getBean(PraticienDaoItf.class);
		
		PraticienServiceItf praticienService = ctx.getBean(PraticienServiceItf.class);
		
		Praticien praticien1 = new Praticien("Lee", "Bruce", "Marseille", "ophtalmologue");
		praticien.save(praticien1);
		Praticien praticien2 = new Praticien("Hugo", "Victor", "Aix-En-Provence", "Dentiste");
		praticien.save(praticien2);
		Praticien praticien3 = new Praticien("Mozart", "Amadeus", "Paris", "Dentiste");
		praticien.save(praticien3);
		Praticien praticien4 = new Praticien("Beethoven", "Ludwig Von", "Nantes", "ophtalmologue");
		praticien.save(praticien4);
		Praticien praticien5 = new Praticien("Proust", "Marcel", "Marseille", "Dentiste");
		praticien.save(praticien5);
		Praticien praticien6 = new Praticien("Arouet", "François-Marie", "Paris", "ophtalmologue");
		praticien.save(praticien6);
		Praticien praticien7 = new Praticien("Poquelin", "Jean-baptiste", "Lille", "Dentiste1");
		praticien.save(praticien7);
		Praticien praticien8 = new Praticien("Shakespear", "William", "Paris", "Infirmier");
		praticien.save(praticien8);
		Praticien praticien9 = new Praticien("Geldog", "Bob", "Rouen", "Infirmier");
		praticien.save(praticien9);
		Praticien praticien10 = new Praticien("Shakespear", "William", "Lille", "Dentiste");
		praticien.save(praticien10);
		System.out.println(praticienService.list());
		
	}

}
