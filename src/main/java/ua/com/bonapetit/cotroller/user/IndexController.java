package ua.com.bonapetit.cotroller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.com.bonapetit.service.AdressService;

@Controller
@RequestMapping("/")
public class IndexController {


	public String index(Model model) {

		return "user-index";
	}

	@RequestMapping("/user/registration")
	public String registration() {
		return "user-registration";
	}

	@RequestMapping("/user/login")
	public String login() {
		return "user-login";
	}

	@RequestMapping("/user/restaurants")
	public String restaurants() {
		return "user-restaurants";
	}

	@RequestMapping("/user/contacts")
	public String contacts() {
		return "user-contacts";
	}

}
