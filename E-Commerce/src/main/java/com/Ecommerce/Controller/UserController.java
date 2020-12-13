package com.Ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Entity.Country;
import com.Ecommerce.Entity.State;
import com.Ecommerce.Entity.User;
import com.Ecommerce.Repository.CountryRepository;
import com.Ecommerce.Repository.StateRepository;
import com.Ecommerce.Repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	
	@Autowired
	UserRepository userRepository;
	
	
	@Autowired
	CountryRepository countryRepository;
	
	@Autowired
	StateRepository stateRepository;
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllUser()
	{
	User user1=new User();
	user1.setName("Shivam Singh");
	user1.setAddress("Pratapgarh");
	user1.setPassword("12345");
	user1.setPhoneno(9793);
	user1.setRole("ROLE_USER");
	userRepository.save(user1);
	User user2=new User();
	user2.setName("Pankaj Singh");
	user2.setAddress("Kushinagar");
	user2.setPassword("1234567");
	user2.setPhoneno(343434);
	user2.setRole("ROLE_USER");
	userRepository.save(user2);
	User user3=new User();
	user3.setName("Anurag Soni");
	user3.setAddress("Kanpur");
	user3.setPassword("12345");
	user3.setPhoneno(976453);
	user3.setRole("ROLE_USER");
	userRepository.save(user3);
	List<User>userlist=userRepository.findAll();
	return ResponseEntity.ok(userlist);
	
	
	}
	
	
	@GetMapping("/countries")
	public List<Country> getAllCountries()
	{
		List<Country>CountryList=countryRepository.findAll();
		return CountryList;
	}
	
	@GetMapping("/states")
	public List<State> getAllStates()
	{
		List<State> StateList=stateRepository.findAll();
		return StateList;
	}
	
	
	@GetMapping("/getStatesByCode/{country_code}")
	public List<State> getStatesByCountry(@PathVariable("country_code") String country_code )
	{
		Country country=countryRepository.findCountryByCode(country_code);
		int country_id=country.getId();
		List<State> StateList=stateRepository.findAllById(country_id);
		return StateList;
	}
	
	
	

}
