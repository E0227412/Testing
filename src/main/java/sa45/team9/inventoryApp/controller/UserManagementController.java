package sa45.team9.inventoryApp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sa45.team9.inventoryApp.model.User;
import sa45.team9.inventoryApp.services.IUserService;

@RequestMapping(value="/admin/home")
@Controller
public class UserManagementController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView registration() {		
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();		
		modelAndView.addObject("user", user);
		modelAndView.setViewName("admin/registration");
		return modelAndView;
	}
	 @RequestMapping(value = "/registration", method = RequestMethod.POST)
	 public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
	 ModelAndView modelAndView = new ModelAndView();
	 User userExists = userService.findUserByName(user.getUsername());
	 
	 if (userExists != null) {
	 bindingResult.rejectValue("username", "error.user", "There is already a user registered with this name");
	 }
//	 if (bindingResult.hasErrors()) {
//	 modelAndView.setViewName("admin/registration");
//	 }
	 else {
	 userService.saveUser(user);
	 modelAndView.addObject("successMessage", "User has been registered successfully");
	 modelAndView.addObject("user", new User());
	 modelAndView.setViewName("admin/registration");
	 }
	 return modelAndView;
	 }
	
}
