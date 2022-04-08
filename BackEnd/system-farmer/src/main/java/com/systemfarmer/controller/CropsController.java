package com.systemfarmer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.systemfarmer.model.CropsDetails;
import com.systemfarmer.repo.CropsRepository;

@CrossOrigin(origins="http://localhost:3000")
//enables cross-origin resource sharing only for this specific method
@RestController
//to create RESTful web services using Spring MVC.
@RequestMapping("/api")
//it is used to map web requests onto specific handler classes and/or handler methods.
public class CropsController {
	
	

	@Autowired
    CropsRepository repo;
	
	@RequestMapping(value="/crop",method=RequestMethod.GET)
	public List<CropsDetails> getAllCropsDetails(){
		return repo.findAll();
	}
	
	@RequestMapping(value="/crop/{id}",method=RequestMethod.GET)
	  public Optional<CropsDetails> getCropsDetails(@PathVariable String id) {
		return repo.findById(id);
	  }
	
	@RequestMapping(value="/farmerCrop/{farmerId}",method=RequestMethod.GET)
	  public List<CropsDetails> getByFarmerId(@PathVariable String farmerId) {
		return repo.findByFarmerId(farmerId);
	  }
	


	  @RequestMapping(value="/crop",method=RequestMethod.POST)
	  public void addCropsDetails(@RequestBody CropsDetails crops) {
		  repo.insert(crops);
	  }

	  @RequestMapping(value="/crop/{id}",method=RequestMethod.PUT)
	  public void updateCropsDetails(@PathVariable String id, @RequestBody CropsDetails crops) {
		  repo.save(crops);
	  }
//RequestBody maps the HttpRequest body to a transfer or domain object,
// enabling automatic deserialization of the inbound HttpRequest body onto a Java object
	  @RequestMapping(value="/crop/{id}",method=RequestMethod.DELETE)
	  public void deleteCropsDetails(@PathVariable String id) {
	    repo.deleteById(id);
	  }

}
