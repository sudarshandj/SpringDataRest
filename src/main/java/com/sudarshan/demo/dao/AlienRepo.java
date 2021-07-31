package com.sudarshan.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.sudarshan.demo.model.Alien;

@RepositoryRestResource(collectionResourceRel="aliens",path="aliens")//base path and path variable
public interface AlienRepo extends JpaRepository<Alien, Integer>{
	
}
