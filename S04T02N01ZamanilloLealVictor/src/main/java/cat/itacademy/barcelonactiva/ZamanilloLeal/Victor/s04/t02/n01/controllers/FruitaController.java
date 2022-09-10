package cat.itacademy.barcelonactiva.ZamanilloLeal.Victor.s04.t02.n01.controllers;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.ZamanilloLeal.Victor.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.ZamanilloLeal.Victor.s04.t02.n01.model.services.FruitaService;

@CrossOrigin(origins="http://localhost:8080")
@RestController
//@RequestMapping("/model")
public class FruitaController {
	
	@Autowired
	FruitaService fruitaService;
	
	@GetMapping ("/fruita")
	public List<Fruita> getAllFruita(){
		
		return fruitaService.getAllPersons();
	}

	@GetMapping ("/fruita/{id}")
	public Fruita getFruita(@PathVariable ("id") int id){
		
		return fruitaService.getFruitaById(id);
	}
	
	@DeleteMapping ("/fruita/{id}")
	public void deleteFruita(@PathVariable ("id") int id) {
		
		fruitaService.delete(id);	
	}
	
	@PostMapping ("/fruita")
	public int addFruita(@RequestBody Fruita fruita) {
		
		fruitaService.saveOrUpdate(fruita);
		return fruita.getId();			
	}
	
	/*@PutMapping ("/fruita")
	public int updateFruita(@RequestBody Fruita fruita) {
		
		fruitaService.saveOrUpdate(fruita);
		return fruita.getId();	
	}*/
}
