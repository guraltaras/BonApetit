package ua.com.bonapetit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.com.bonapetit.entity.Adress;


public interface AdressDao   extends JpaRepository<Adress, Integer>,JpaSpecificationExecutor<Adress>{

	
	Adress Streat (String streat);

	
}
