package com.ecolepratique.praticien.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecolepratique.praticien.entite.Praticien;
import com.ecolepratique.praticien.service.PraticienServiceItf;

@RestController
@RequestMapping("/praticien")
@CrossOrigin("*")
public class PraticienRestApi {
	@Autowired
	private PraticienServiceItf praticienService;
	
	@GetMapping("")
	public List<Praticien> list() {
		System.out.println("PraticienRestApi - list()");
		List<Praticien> praticiens = praticienService.list();
		System.out.println("medicaments=" + praticiens);
		return praticiens;
	}
	@GetMapping("/{id}")
	public Praticien get(@PathVariable("id") Long id) {
		System.out.println("PraticienRestApi - get(id) ");
		return praticienService.getById(id);
	}
	@PostMapping("")
	public Praticien create(@RequestBody Praticien praticien) {
        return praticienService.create(praticien);
	}
	@PutMapping("/{id}")
	public Praticien update(@PathVariable("id") Long id, @RequestBody Praticien praticien) {
		return praticienService.updateById(id, praticien);
	}
	@DeleteMapping("/{id}")
	public Praticien delete(@PathVariable("id") Long id) {
		return praticienService.deleteById(id);
	}
}
