package ua.com.bonapetit.service;

import java.util.List;



import ua.com.bonapetit.entity.Restaurant;

public interface RestaurantService {

	
	
	void save(Restaurant restaurant);
	List<Restaurant> findAll();
	Restaurant findOne (int id);
	void delete (int id);

	
	
	
}
