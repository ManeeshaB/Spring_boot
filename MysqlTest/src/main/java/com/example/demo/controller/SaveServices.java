package com.example.demo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@Service
public class SaveServices {
	
	@Autowired
	private AlienRepo repo;
	
	public Alien newadd(Alien alien){
		UUID uuid=UUID.randomUUID();
		alien.setAid(uuid.toString());
		return repo.save(alien);
	}
}
