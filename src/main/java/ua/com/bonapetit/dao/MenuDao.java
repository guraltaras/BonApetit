package ua.com.bonapetit.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;



import ua.com.bonapetit.entity.Menu;

public interface MenuDao  extends JpaRepository<Menu, Integer>,JpaSpecificationExecutor<Menu>{

}
