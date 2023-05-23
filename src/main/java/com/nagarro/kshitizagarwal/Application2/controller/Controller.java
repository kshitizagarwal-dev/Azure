package com.nagarro.kshitizagarwal.Application2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.kshitizagarwal.Application2.model.UserDetails;
import com.nagarro.kshitizagarwal.Application2.repository.Repository;


@RestController
public class Controller {

	@Autowired 
	private Repository repo;
	
	@GetMapping("/")
	public List<UserDetails> get() {
		
		List<UserDetails> ud = this.repo.findAll();
		return ud;		
	}
}
