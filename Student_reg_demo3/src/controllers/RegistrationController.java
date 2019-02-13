package controllers;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import beans.Student;

@Controller
public class RegistrationController {

	@ModelAttribute
	public void addCommonObject(Model model) {
		model.addAttribute("headMessage", "PR COLLEGE OF ENGINEERING,ODISHA");

	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
		
		webDataBinder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
		
	}
	


	

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public ModelAndView register() {

		ModelAndView modelAndView = new ModelAndView("Registration");
		return modelAndView;
	}

	// using @ModelAttribute
	@RequestMapping(value = "/submitRegistationForm", method = RequestMethod.POST)
	public ModelAndView submit(@Valid @ModelAttribute("student1") Student student , BindingResult bindingResult) {

		if(bindingResult.hasErrors()){
			
			ModelAndView modelAndView = new ModelAndView("Registration");
			return modelAndView;
		}
		
		
		ModelAndView modelAndView = new ModelAndView("success");

		return modelAndView;

	}
}