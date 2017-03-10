package ua.com.bonapetit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;



import ua.com.bonapetit.entity.Dish;

public interface DishDao    extends JpaRepository<Dish, Integer>,JpaSpecificationExecutor<Dish>{

}
