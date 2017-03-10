package ua.com.bonapetit.service;

import java.util.List;




import org.springframework.stereotype.Service;

import ua.com.bonapetit.entity.Dish;
@Service
public interface DishService {

	
	
	void save(Dish dish);
	List<Dish> findAll();
	Dish findOne (int id);
	void delete (int id);

	
}
