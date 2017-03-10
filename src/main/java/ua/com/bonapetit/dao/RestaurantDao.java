package ua.com.bonapetit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.com.bonapetit.entity.Restaurant;


public interface RestaurantDao  extends JpaRepository<Restaurant, Integer>,JpaSpecificationExecutor<Restaurant> {

}
