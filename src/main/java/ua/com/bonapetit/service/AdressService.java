package ua.com.bonapetit.service;

import java.util.List;

import ua.com.bonapetit.entity.Adress;


public interface AdressService {

	
	
	void save(Adress adress);
	List<Adress> findAll();
	Adress findOne (int id);
	void delete (int id);

	
	Adress findByStreat(String streat);
	
}
