package ua.com.bonapetit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.bonapetit.dao.MenuDao;
import ua.com.bonapetit.entity.Menu;
import ua.com.bonapetit.service.MenuService;
@Service
public class MenuServiceImpl  implements MenuService{

	
	@Autowired 
	private MenuDao MenuService;

	public void save(Menu menu) {
		MenuService.save(menu);
		
	}

	public List<Menu> findAll() {
		return MenuService.findAll();
	}

	public Menu findOne(int id) {
		return MenuService.findOne(id);
	}

	public void delete(int id) {
		MenuService.delete(id);
	}
	
	
	
}
