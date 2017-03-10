package ua.com.bonapetit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.bonapetit.dao.AdressDao;
import ua.com.bonapetit.entity.Adress;
import ua.com.bonapetit.service.AdressService;

@Service
public class AdressServiceImpl   implements AdressService{

	
	@Autowired
	private AdressDao AdressService;
	
	
	public Adress findOne(int id) {
		
		return AdressService.findOne(id);              
	}

	
	public void delete(int id) {
		AdressService.delete(id);
		
	}

	public void save(Adress Adress) {
		AdressService.save(Adress);
		
	}

	public List<Adress> findAll() {
		
		return null;
	}

	public Adress findByStreat(String streat) {
		
		return null;
	}

}
