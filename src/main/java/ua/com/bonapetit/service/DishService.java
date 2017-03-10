package ua.com.bonapetit.service;

import java.util.List;



import ua.com.bonapetit.entity.Dish;

public interface DishService {

	
	
	void save(Dish dish);
	List<Dish> findAll();
	Dish findOne (int id);
	void delete (int id);

	
}
