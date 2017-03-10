package ua.com.bonapetit.cotroller.user;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.bonapetit.entity.User;
import ua.com.bonapetit.service.UserService;

@Controller
@RequestMapping("/user/registration")
@SessionAttributes("user")
public class RegistrationController {
	@Autowired
	private UserService userService;

	public String show(Model model) {

		return "user-registration";
	}

	public String registrate(@ModelAttribute("user")@Valid User user,BindingResult br, Model model, SessionStatus status,
			@PageableDefault Pageable pageable) {
		return null;

	}
}
