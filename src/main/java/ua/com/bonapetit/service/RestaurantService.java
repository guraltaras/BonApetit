package ua.com.bonapetit.service;

import java.util.List;




import org.springframework.stereotype.Service;

import ua.com.bonapetit.entity.Restaurant;
@Service
public interface RestaurantService {

	
	
	void save(Restaurant restaurant);
	List<Restaurant> findAll();
	Restaurant findOne (int id);
	void delete (int id);

	
	
	
}
